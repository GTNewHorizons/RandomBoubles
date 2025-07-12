package com.gtnewhorizon.randomboubles.items.rings;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

import baubles.api.BaubleType;
import baubles.api.expanded.BaubleExpandedSlots;
import baubles.common.BaubleItemBase;
import thaumcraft.api.IRunicArmor;
import thaumcraft.api.IVisDiscountGear;

public abstract class ItemBaubleRingBase extends BaubleItemBase implements IVisDiscountGear, IRunicArmor {

    public ItemBaubleRingBase() {
        super();
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
        this.setMaxStackSize(1);
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
    public void onWornTick(ItemStack itemstack, EntityLivingBase player) {}

    @Override
    public boolean hasEffect(ItemStack itemStack, int a) {
        return false;
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return super.getUnlocalizedName() + "." + stack.getItemDamage();
    }

    @Override
    public void onEquipped(ItemStack itemstack, EntityLivingBase player) {
        if (!player.worldObj.isRemote) {
            player.worldObj.playSoundAtEntity(player, "random.orb", 0.1F, 1.3f);
        }
    }
}
