package com.gtnewhorizon.randomboubles;

import com.gtnewhorizon.randomboubles.items.rings.ItemIgnisRing;
import com.gtnewhorizon.randomboubles.items.rings.ItemTerraRing;
import net.minecraft.item.Item;

import com.gtnewhorizon.randomboubles.items.ItemBaubleRing;
import com.gtnewhorizon.randomboubles.items.rings.ItemAerRing;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;

public class BaubleItems {

    public static Item ring;
    public static Item aerRing;
    public static Item terraRing;
    public static Item ignisRing;

    public static final String THAUMCRAFT = "Thaumcraft";

    public static void init() {
        ring = new ItemBaubleRing();
        GameRegistry.registerItem(ring, "ring", RandomBoubles.MODID);
        if (Loader.isModLoaded(THAUMCRAFT)) {
            aerRing = new ItemAerRing();
            GameRegistry.registerItem(aerRing, "aerRing", RandomBoubles.MODID);
            terraRing = new ItemTerraRing();
            GameRegistry.registerItem(terraRing, "terraRing", RandomBoubles.MODID);
            ignisRing = new ItemIgnisRing();
            GameRegistry.registerItem(ignisRing, "ignisRing", RandomBoubles.MODID);
        }
    }
}
