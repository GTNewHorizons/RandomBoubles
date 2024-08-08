package com.gtnewhorizon.randomboubles.items;

import java.util.List;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.util.StatCollector;

import com.gtnewhorizon.randomboubles.RandomBoubles;

import baubles.api.BaubleType;
import baubles.api.expanded.BaubleExpandedSlots;
import baubles.common.BaubleItemBase;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBaubleRing extends BaubleItemBase {

    static final int RING_COUNT = 1;
    private IIcon[] icons;

    public ItemBaubleRing() {
        super();
        this.setHasSubtypes(true);
        this.setMaxDamage(RING_COUNT - 1);
        this.setUnlocalizedName("ring");
        this.setTextureName("ring");
    }

    @Override
    public void getSubItems(Item par1, CreativeTabs par2CreativeTabs, List par3List) {
        for (int i = 0; i < RING_COUNT; i++) {
            par3List.add(new ItemStack(this, 1, i));
        }
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List tooltip, boolean debug) {
        if (GuiScreen.isShiftKeyDown()) {
            tooltip.add(StatCollector.translateToLocal(getUnlocalizedName(stack) + ".desc"));
            tooltip.add("");
        }
        super.addInformation(stack, player, tooltip, debug);
    }

    @Override
    public BaubleType getBaubleType(ItemStack itemstack) {
        return BaubleType.RING;
    }

    static final String[] BAUBLE_TYPES = { BaubleExpandedSlots.ringType };

    @Override
    public String[] getBaubleTypes(ItemStack itemstack) {
        return BAUBLE_TYPES;
    }

    @Override
    public void onWornTick(ItemStack itemstack, EntityLivingBase player) {
        int meta = itemstack.getItemDamage();
        if (meta == 0) {
            PotionEffect currentEffect = player.getActivePotionEffect(Potion.digSpeed);
            if (currentEffect == null || currentEffect.getDuration() < 20) {
                player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 120, 0, true));
            }
        }
    }

    @Override
    public EnumRarity getRarity(ItemStack p_77613_1_) {
        return EnumRarity.rare;
    }

    @Override
    public boolean hasEffect(ItemStack itemStack, int a) {
        return false;
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return super.getUnlocalizedName() + "." + stack.getItemDamage();
    }

    @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIconFromDamage(int meta) {
        int i = MathHelper.clamp_int(meta, 0, RING_COUNT);
        return this.icons[i];
    }

    @Override
    public void registerIcons(IIconRegister register) {
        icons = new IIcon[RING_COUNT];

        for (int i = 0; i < RING_COUNT; i++) {
            icons[i] = register.registerIcon(RandomBoubles.MODID + ":" + this.getIconString() + "_" + i);
        }
    }

    @Override
    public void onEquipped(ItemStack itemstack, EntityLivingBase player) {
        if (!player.worldObj.isRemote) {
            player.worldObj.playSoundAtEntity(player, "random.orb", 0.1F, 1.3f);
        }
    }
}
