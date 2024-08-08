package com.gtnewhorizon.randomboubles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLMissingMappingsEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(
    modid = RandomBoubles.MODID,
    name = "Random Boubles",
    version = Tags.VERSION,
    acceptedMinecraftVersions = "[1.7.10]")
public class RandomBoubles {

    public static final String MODID = "randomboubles";
    public static final Logger LOGGER = LogManager.getLogger(MODID);

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        BaubleItems.init();
    }

    @Mod.EventHandler
    public void missingMappings(FMLMissingMappingsEvent event) {
        for (FMLMissingMappingsEvent.MissingMapping mapping : event.getAll()) {
            if (mapping.name.equals("Baubles:Ring")) {
                if (mapping.type == GameRegistry.Type.ITEM) {
                    mapping.remap(BaubleItems.ring);
                }
            }
        }
    }
}
