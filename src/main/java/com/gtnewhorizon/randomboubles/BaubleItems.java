package com.gtnewhorizon.randomboubles;

import net.minecraft.item.Item;

import com.gtnewhorizon.randomboubles.items.ItemBaubleRing;
import com.gtnewhorizon.randomboubles.items.rings.ItemAerRing;
import com.gtnewhorizon.randomboubles.items.rings.ItemAquaRing;
import com.gtnewhorizon.randomboubles.items.rings.ItemIgnisRing;
import com.gtnewhorizon.randomboubles.items.rings.ItemTerraRing;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;

public class BaubleItems {

    public static Item ring;
    public static Item aerRing;
    public static Item terraRing;
    public static Item ignisRing;
    public static Item aquaRing;
    public static Item ordoRing;
    public static Item perditioRing;

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
            aquaRing = new ItemAquaRing();
            GameRegistry.registerItem(aquaRing, "aquaRing", RandomBoubles.MODID);
        }
    }
}
