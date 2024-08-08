package com.gtnewhorizon.randomboubles;

import net.minecraft.item.Item;

import com.gtnewhorizon.randomboubles.items.ItemBaubleRing;

import cpw.mods.fml.common.registry.GameRegistry;

public class BaubleItems {

    public static Item ring;

    public static void init() {
        ring = new ItemBaubleRing();
        GameRegistry.registerItem(ring, "ring", RandomBoubles.MODID);
    }
}
