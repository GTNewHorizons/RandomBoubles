package com.gtnewhorizon.randomboubles;

import net.minecraftforge.common.MinecraftForge;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.gtnewhorizon.randomboubles.handler.EventHandler;
import com.gtnewhorizon.randomboubles.recipes.rings.ArcaneRecipes;
import com.gtnewhorizon.randomboubles.recipes.rings.InfusionRecipes;
import com.gtnewhorizon.randomboubles.research.RingResearch;
import com.gtnewhorizon.randomboubles.util.Constants;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLMissingMappingsEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(
    modid = RandomBoubles.MODID,
    name = "Random Boubles",
    version = Tags.VERSION,
    dependencies = "after:Thaumcraft;",
    acceptedMinecraftVersions = "[1.7.10]")
public class RandomBoubles {

    public static final String MODID = "randomboubles";
    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public EventHandler eventHandler;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        BaubleItems.init();
        eventHandler = new EventHandler();
        MinecraftForge.EVENT_BUS.register(eventHandler);
        FMLCommonHandler.instance()
            .bus()
            .register(eventHandler);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        if (Loader.isModLoaded("ThaumicExploration")) {
            Constants.ThaumicExploration = true;
        }
        if (Loader.isModLoaded("gregtech")) {
            Constants.Gregtech = true;
        }
        if (Loader.isModLoaded("dreamcraft")) {
            Constants.GTNH = true;
        }
        if (Loader.isModLoaded("WitchingGadgets")) {
            Constants.WitchingGadgets = true;
        }
        if (Loader.isModLoaded("Thaumcraft")) {
            RingResearch.setupResearchPage();
            ArcaneRecipes.registerArcaneRings();
            InfusionRecipes.registerArcaneRingsInfusions();
            RingResearch.registerResearch();
        }
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
