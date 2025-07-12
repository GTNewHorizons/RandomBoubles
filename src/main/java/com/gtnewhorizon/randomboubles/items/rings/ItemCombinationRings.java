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

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import thaumcraft.api.aspects.Aspect;

public class ItemCombinationRings extends ItemBaubleRingBase {

    static final int RING_COUNT = 9;
    private IIcon[] icons;

    public ItemCombinationRings() {
        super();
        this.setUnlocalizedName("combinationRing");
        this.setTextureName("combinationRing");
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List tooltip, boolean debug) {
        Aspect aspect;
        if (stack.getItemDamage() <= 2) {
            aspect = Aspect.getPrimalAspects()
                .get(0);
            tooltip.add(
                EnumChatFormatting.YELLOW + aspect.getName()
                    + " "
                    + StatCollector.translateToLocal("tc.discount")
                    + ": "
                    + StatCollector.translateToLocal(getUnlocalizedName(stack) + ".discount")
                    + "%");
            aspect = Aspect.getPrimalAspects()
                .get(2);
            tooltip.add(
                EnumChatFormatting.RED + aspect.getName()
                    + " "
                    + StatCollector.translateToLocal("tc.discount")
                    + ": "
                    + StatCollector.translateToLocal(getUnlocalizedName(stack) + ".discount")
                    + "%");
            aspect = Aspect.getPrimalAspects()
                .get(4);
            tooltip.add(
                EnumChatFormatting.WHITE + aspect.getName()
                    + " "
                    + StatCollector.translateToLocal("tc.discount")
                    + ": "
                    + StatCollector.translateToLocal(getUnlocalizedName(stack) + ".discount")
                    + "%");
        } else if (stack.getItemDamage() <= 5) {
            aspect = Aspect.getPrimalAspects()
                .get(1);
            tooltip.add(
                EnumChatFormatting.DARK_GREEN + aspect.getName()
                    + " "
                    + StatCollector.translateToLocal("tc.discount")
                    + ": "
                    + StatCollector.translateToLocal(getUnlocalizedName(stack) + ".discount")
                    + "%");
            aspect = Aspect.getPrimalAspects()
                .get(3);
            tooltip.add(
                EnumChatFormatting.DARK_AQUA + aspect.getName()
                    + " "
                    + StatCollector.translateToLocal("tc.discount")
                    + ": "
                    + StatCollector.translateToLocal(getUnlocalizedName(stack) + ".discount")
                    + "%");
            aspect = Aspect.getPrimalAspects()
                .get(5);
            tooltip.add(
                EnumChatFormatting.DARK_GRAY + aspect.getName()
                    + " "
                    + StatCollector.translateToLocal("tc.discount")
                    + ": "
                    + StatCollector.translateToLocal(getUnlocalizedName(stack) + ".discount")
                    + "%");
        } else {
            aspect = Aspect.getPrimalAspects()
                .get(0);
            tooltip.add(
                EnumChatFormatting.YELLOW + aspect.getName()
                    + " "
                    + StatCollector.translateToLocal("tc.discount")
                    + ": "
                    + StatCollector.translateToLocal(getUnlocalizedName(stack) + ".discount")
                    + "%");
            aspect = Aspect.getPrimalAspects()
                .get(1);
            tooltip.add(
                EnumChatFormatting.DARK_GREEN + aspect.getName()
                    + " "
                    + StatCollector.translateToLocal("tc.discount")
                    + ": "
                    + StatCollector.translateToLocal(getUnlocalizedName(stack) + ".discount")
                    + "%");
            aspect = Aspect.getPrimalAspects()
                .get(2);
            tooltip.add(
                EnumChatFormatting.RED + aspect.getName()
                    + " "
                    + StatCollector.translateToLocal("tc.discount")
                    + ": "
                    + StatCollector.translateToLocal(getUnlocalizedName(stack) + ".discount")
                    + "%");
            aspect = Aspect.getPrimalAspects()
                .get(3);
            tooltip.add(
                EnumChatFormatting.DARK_AQUA + aspect.getName()
                    + " "
                    + StatCollector.translateToLocal("tc.discount")
                    + ": "
                    + StatCollector.translateToLocal(getUnlocalizedName(stack) + ".discount")
                    + "%");
            aspect = Aspect.getPrimalAspects()
                .get(4);
            tooltip.add(
                EnumChatFormatting.WHITE + aspect.getName()
                    + " "
                    + StatCollector.translateToLocal("tc.discount")
                    + ": "
                    + StatCollector.translateToLocal(getUnlocalizedName(stack) + ".discount")
                    + "%");
            aspect = Aspect.getPrimalAspects()
                .get(5);
            tooltip.add(
                EnumChatFormatting.DARK_GRAY + aspect.getName()
                    + " "
                    + StatCollector.translateToLocal("tc.discount")
                    + ": "
                    + StatCollector.translateToLocal(getUnlocalizedName(stack) + ".discount")
                    + "%");
        }
        tooltip.add("");
        super.addInformation(stack, player, tooltip, debug);
    }

    @Override
    public void getSubItems(Item par1, CreativeTabs tab, List<ItemStack> subItems) {
        for (int i = 0; i < RING_COUNT; i++) {
            subItems.add(new ItemStack(this, 1, i));
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
            if (i <= 2) icons[i] = register.registerIcon(RandomBoubles.MODID + ":rings/AspectRing" + "_0");
            else if (i <= 5) icons[i] = register.registerIcon(RandomBoubles.MODID + ":rings/AspectRing" + "_1");
            else icons[i] = register.registerIcon(RandomBoubles.MODID + ":rings/AspectRing" + "_2");
        }
    }

    private boolean aspectVisDiscount(ItemStack stack, Aspect aspect) {
        return switch (stack.getItemDamage()) {
            case 0, 1, 2 -> aspect.equals(Aspect.AIR) || aspect.equals(Aspect.FIRE) || aspect.equals(Aspect.ORDER);
            case 3, 4, 5 -> aspect.equals(Aspect.WATER) || aspect.equals(Aspect.EARTH) || aspect.equals(Aspect.ENTROPY);
            case 6, 7, 8 -> aspect.equals(Aspect.AIR) || aspect.equals(Aspect.FIRE)
                || aspect.equals(Aspect.ORDER)
                || aspect.equals(Aspect.WATER)
                || aspect.equals(Aspect.EARTH)
                || aspect.equals(Aspect.ENTROPY);
            default -> true;
        };
    }

    @Override
    public int getVisDiscount(ItemStack stack, EntityPlayer player, Aspect aspect) {
        return switch (stack.getItemDamage()) {
            case 0, 3, 6 -> (aspectVisDiscount(stack, aspect) ? 3 : 0);
            case 1, 4, 7 -> (aspectVisDiscount(stack, aspect) ? 5 : 0);
            case 2, 5, 8 -> (aspectVisDiscount(stack, aspect) ? 7 : 0);
            default -> 0;
        };
    }

    @Override
    public EnumRarity getRarity(ItemStack stack) {
        return switch (stack.getItemDamage()) {
            case 0, 3, 6 -> EnumRarity.uncommon;
            case 1, 4, 7 -> EnumRarity.rare;
            case 2, 5, 8 -> EnumRarity.epic;
            default -> EnumRarity.common;
        };
    }

    @Override
    public int getRunicCharge(ItemStack stack) {
        return 0;
    }
}
