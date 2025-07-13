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

public class ArcaneRecipes {

    public static void registerArcaneRings() {

        String thaumium = "ingotThaumium";

        if (Loader.isModLoaded("Gregtech")) {
            thaumium = "plateThaumium";
        }

        RingResearch.recipeList.put(
            "RBMagiciansRingOfAer",
            ThaumcraftApi.addArcaneCraftingRecipe(
                "RBMAGICIANSRINGOFAER",
                new ItemStack(BaubleItems.aerRing, 1, 0),
                new AspectList().add(Aspect.AIR, 25)
                    .add(Aspect.ORDER, 10),
                "STS",
                "TAT",
                "STS",
                'T',
                thaumium,
                'A',
                new ItemStack(ConfigItems.itemBaubleBlanks, 1, 3),
                'S',
                new ItemStack(ConfigBlocks.blockCrystal, 1, 0)));
        RingResearch.recipeList.put(
            "RBMagiciansRingOfTerra",
            ThaumcraftApi.addArcaneCraftingRecipe(
                "RBMAGICIANSRINGOFTERRA",
                new ItemStack(BaubleItems.terraRing, 1, 0),
                new AspectList().add(Aspect.EARTH, 25)
                    .add(Aspect.ORDER, 10),
                "STS",
                "TAT",
                "STS",
                'T',
                thaumium,
                'A',
                new ItemStack(ConfigItems.itemBaubleBlanks, 1, 4),
                'S',
                new ItemStack(ConfigBlocks.blockCrystal, 1, 1)));
        RingResearch.recipeList.put(
            "RBMagiciansRingOfIgnis",
            ThaumcraftApi.addArcaneCraftingRecipe(
                "RBMAGICIANSRINGOFIGNIS",
                new ItemStack(BaubleItems.ignisRing, 1, 0),
                new AspectList().add(Aspect.FIRE, 25)
                    .add(Aspect.ORDER, 10),
                "STS",
                "TAT",
                "STS",
                'T',
                thaumium,
                'A',
                new ItemStack(ConfigItems.itemBaubleBlanks, 1, 5),
                'S',
                new ItemStack(ConfigBlocks.blockCrystal, 1, 2)));
        RingResearch.recipeList.put(
            "RBMagiciansRingOfAqua",
            ThaumcraftApi.addArcaneCraftingRecipe(
                "RBMAGICIANSRINGOFAQUA",
                new ItemStack(BaubleItems.aquaRing, 1, 0),
                new AspectList().add(Aspect.WATER, 25)
                    .add(Aspect.ORDER, 10),
                "STS",
                "TAT",
                "STS",
                'T',
                thaumium,
                'A',
                new ItemStack(ConfigItems.itemBaubleBlanks, 1, 6),
                'S',
                new ItemStack(ConfigBlocks.blockCrystal, 1, 3)));
        RingResearch.recipeList.put(
            "RBMagiciansRingOfOrdo",
            ThaumcraftApi.addArcaneCraftingRecipe(
                "RBMAGICIANSRINGOFORDO",
                new ItemStack(BaubleItems.ordoRing, 1, 0),
                new AspectList().add(Aspect.ORDER, 35),
                "STS",
                "TAT",
                "STS",
                'T',
                thaumium,
                'A',
                new ItemStack(ConfigItems.itemBaubleBlanks, 1, 7),
                'S',
                new ItemStack(ConfigBlocks.blockCrystal, 1, 4)));
        RingResearch.recipeList.put(
            "RBMagiciansRingOfPerditio",
            ThaumcraftApi.addArcaneCraftingRecipe(
                "RBMAGICIANSRINGOFPERDITIO",
                new ItemStack(BaubleItems.ordoRing, 1, 0),
                new AspectList().add(Aspect.ENTROPY, 25)
                    .add(Aspect.ORDER, 10),
                "STS",
                "TAT",
                "STS",
                'T',
                thaumium,
                'A',
                new ItemStack(ConfigItems.itemBaubleBlanks, 1, 8),
                'S',
                new ItemStack(ConfigBlocks.blockCrystal, 1, 5)));
    }
}
