package com.gtnewhorizon.randomboubles.recipes.rings;

import cpw.mods.fml.common.Loader;
import net.minecraft.item.ItemStack;

import com.gtnewhorizon.randomboubles.BaubleItems;
import com.gtnewhorizon.randomboubles.research.RingResearch;

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
                new ItemStack(ConfigBlocks.blockCrystal, 1, 1)));
    }
}
