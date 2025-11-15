package com.gtnewhorizon.randomboubles.items.rings;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.util.StatCollector;

import com.gtnewhorizon.randomboubles.RandomBoubles;
import com.gtnewhorizon.randomboubles.items.IPrimordialGemCrafting;
import com.gtnewhorizon.randomboubles.util.Constants;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.common.config.ConfigItems;

public class ItemPerditioRing extends ItemBaubleRingBase implements IPrimordialGemCrafting {

    static final int RING_COUNT = 3;
    private IIcon[] icons;

    public ItemPerditioRing() {
        super();
        this.setUnlocalizedName("perditioRing");
        this.setTextureName("perditioRing");
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List tooltip, boolean debug) {
        Aspect aspect = Aspect.getPrimalAspects()
            .get(5);
        tooltip.add(
            EnumChatFormatting.DARK_GRAY + aspect.getName()
                + " "
                + StatCollector.translateToLocal("tc.discount")
                + ": "
                + StatCollector.translateToLocal(getUnlocalizedName(stack) + ".discount")
                + "%");
        super.addInformation(stack, player, tooltip, debug);
    }

    @Override
    public int getColorFromItemStack(ItemStack stack, int par2) {
        return Aspect.getPrimalAspects()
            .get(5)
            .getColor();
    }

    @Override
    public void getSubItems(Item par1, CreativeTabs tab, List<ItemStack> subItems) {
        for (int i = 0; i < RING_COUNT; i++) {
            if (Constants.ThaumicExploration) {
                if (i != 0) {
                    subItems.add(new ItemStack(this, 1, i));
                }
            } else {
                subItems.add(new ItemStack(this, 1, i));
            }
        }
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
            icons[i] = register.registerIcon(RandomBoubles.MODID + ":rings/baseRing");
        }
    }

    @Override
    public int getVisDiscount(ItemStack stack, EntityPlayer player, Aspect aspect) {
        return switch (stack.getItemDamage()) {
            case 0 -> (Aspect.getPrimalAspects()
                .get(5) == aspect ? 3 : 0);
            case 1 -> (Aspect.getPrimalAspects()
                .get(5) == aspect ? 5 : 0);
            case 2 -> (Aspect.getPrimalAspects()
                .get(5) == aspect ? 7 : 0);
            default -> 0;
        };
    }

    @Override
    public EnumRarity getRarity(ItemStack stack) {
        return switch (stack.getItemDamage()) {
            case 0 -> EnumRarity.uncommon;
            case 1 -> EnumRarity.rare;
            case 2 -> EnumRarity.epic;
            default -> EnumRarity.common;
        };
    }

    @Override
    public int getRunicCharge(ItemStack stack) {
        return 0;
    }

    @Override
    public ItemStack getReturnItem(ItemStack stack) {
        if (stack.getItemDamage() == 2) {
            return new ItemStack(ConfigItems.itemEldritchObject, 1, 3);
        }
        return null;
    }
}
