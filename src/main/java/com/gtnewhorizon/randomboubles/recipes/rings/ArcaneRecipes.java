package com.gtnewhorizon.randomboubles.recipes.rings;

import com.gtnewhorizon.randomboubles.util.Constants;
import flaxbeard.thaumicexploration.ThaumicExploration;
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

        ItemStack airRing = new ItemStack(BaubleItems.aerRing, 1, 0);
        ItemStack terraRing = new ItemStack(BaubleItems.terraRing, 1, 0);
        ItemStack ignisRing = new ItemStack(BaubleItems.ignisRing, 1, 0);
        ItemStack aquaRing = new ItemStack(BaubleItems.aquaRing, 1, 0);
        ItemStack ordoRing = new ItemStack(BaubleItems.ordoRing, 1, 0);
        ItemStack perditioRing = new ItemStack(BaubleItems.perditioRing, 1, 0);

        if (Constants.Gregtech) {
            thaumium = "plateThaumium";
        }

        if (Constants.ThaumicExploration) {
            airRing = new ItemStack(ThaumicExploration.discountRing, 1, 0);
            terraRing = new ItemStack(ThaumicExploration.discountRing, 1, 1);
            ignisRing = new ItemStack(ThaumicExploration.discountRing, 1, 2);
            aquaRing = new ItemStack(ThaumicExploration.discountRing, 1, 3);
            ordoRing = new ItemStack(ThaumicExploration.discountRing, 1, 4);
            perditioRing = new ItemStack(ThaumicExploration.discountRing, 1, 5);
        }

        RingResearch.recipeList.put(
            "RBMagiciansRingOfAer",
            ThaumcraftApi.addArcaneCraftingRecipe(
                "RBMAGICIANSRINGOFAER",
                airRing,
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
                terraRing,
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
                new ItemStack(ConfigBlocks.blockCrystal, 1, 3)));
        RingResearch.recipeList.put(
            "RBMagiciansRingOfIgnis",
            ThaumcraftApi.addArcaneCraftingRecipe(
                "RBMAGICIANSRINGOFIGNIS",
                ignisRing,
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
                new ItemStack(ConfigBlocks.blockCrystal, 1, 1)));
        RingResearch.recipeList.put(
            "RBMagiciansRingOfAqua",
            ThaumcraftApi.addArcaneCraftingRecipe(
                "RBMAGICIANSRINGOFAQUA",
                aquaRing,
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
                new ItemStack(ConfigBlocks.blockCrystal, 1, 2)));
        RingResearch.recipeList.put(
            "RBMagiciansRingOfOrdo",
            ThaumcraftApi.addArcaneCraftingRecipe(
                "RBMAGICIANSRINGOFORDO",
                ordoRing,
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
                perditioRing,
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
