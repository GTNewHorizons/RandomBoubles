package com.gtnewhorizon.randomboubles.recipes.rings;

import net.minecraft.item.ItemStack;

import com.gtnewhorizon.randomboubles.BaubleItems;
import com.gtnewhorizon.randomboubles.research.RingResearch;

import cpw.mods.fml.common.Loader;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.common.config.ConfigBlocks;
import thaumcraft.common.config.ConfigItems;

public class InfusionRecipes {

    public static void registerArcaneRingsInfusions() {

        String thaumium = "ingotThaumium";

        if (Loader.isModLoaded("Gregtech")) {
            thaumium = "plateThaumium";
        }

        RingResearch.recipeList.put(
            "RBArchmagesRingOfAer",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "RBARCHMAGESRINGOFAER",
                new ItemStack(BaubleItems.aerRing, 1, 1),
                5,
                (new AspectList()).add(Aspect.AIR, 64)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.AURA, 48)
                    .add(Aspect.ENERGY, 32),
                new ItemStack(BaubleItems.aerRing, 1, 0),
                new ItemStack[] { new ItemStack(ConfigBlocks.blockCrystal, 1, 6),
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 0), new ItemStack(ConfigItems.itemResource, 1, 14),
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 0), new ItemStack(ConfigItems.itemResource, 1, 14),
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 6), new ItemStack(ConfigItems.itemResource, 1, 14),
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 0), new ItemStack(ConfigItems.itemResource, 1, 14),
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 0) }));
        RingResearch.recipeList.put(
            "RBArchmagesRingOfTerra",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "RBARCHMAGESRINGOFTERRA",
                new ItemStack(BaubleItems.terraRing, 1, 1),
                5,
                (new AspectList()).add(Aspect.EARTH, 64)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.AURA, 48)
                    .add(Aspect.ENERGY, 32),
                new ItemStack(BaubleItems.terraRing, 1, 0),
                new ItemStack[] { new ItemStack(ConfigBlocks.blockCrystal, 1, 6),
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 1), new ItemStack(ConfigItems.itemResource, 1, 14),
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 1), new ItemStack(ConfigItems.itemResource, 1, 14),
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 6), new ItemStack(ConfigItems.itemResource, 1, 14),
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 1), new ItemStack(ConfigItems.itemResource, 1, 14),
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 1) }));

    }
}
