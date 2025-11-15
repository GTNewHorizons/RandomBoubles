package com.gtnewhorizon.randomboubles.items;

import net.minecraft.item.ItemStack;

public interface IPrimordialGemCrafting {

    int getReturnedItemAmount(ItemStack stack);

    // Return null for empty.
    ItemStack getReturnItem(ItemStack stack);
}
