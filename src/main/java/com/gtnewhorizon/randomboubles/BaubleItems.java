package com.gtnewhorizon.randomboubles;

import net.minecraft.item.Item;

import com.gtnewhorizon.randomboubles.items.ItemBaubleRing;
import com.gtnewhorizon.randomboubles.items.rings.ItemAerRing;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;

public class BaubleItems {

    public static Item ring;
    public static Item aerRing;

    public static final String THAUMCRAFT = "Thaumcraft";

    public static void init() {
        ring = new ItemBaubleRing();
        GameRegistry.registerItem(ring, "ring", RandomBoubles.MODID);
        if (Loader.isModLoaded(THAUMCRAFT)) {
            aerRing = new ItemAerRing();
            GameRegistry.registerItem(aerRing, "aerRing", RandomBoubles.MODID);
        }
    }
}
