package com.gtnewhorizon.randomboubles.recipes.rings;

import net.minecraft.item.ItemStack;

import com.gtnewhorizon.randomboubles.BaubleItems;
import com.gtnewhorizon.randomboubles.research.RingResearch;

import cpw.mods.fml.common.Loader;
import tb.init.TBBlocks;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.common.config.ConfigBlocks;
import thaumcraft.common.config.ConfigItems;

public class InfusionRecipes {

    public static void registerArcaneRingsInfusions() {

        ItemStack salisMundus = new ItemStack(ConfigItems.itemResource, 1, 14);

        if (Loader.isModLoaded("thaumicbases")) {
            salisMundus = new ItemStack(TBBlocks.dustBlock, 1, 0);
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
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 0), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 0), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 6), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 0), salisMundus,
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
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 3), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 3), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 6), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 3), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 3) }));
        RingResearch.recipeList.put(
            "RBArchmagesRingOfIgnis",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "RBARCHMAGESRINGOFIGNIS",
                new ItemStack(BaubleItems.ignisRing, 1, 1),
                5,
                (new AspectList()).add(Aspect.FIRE, 64)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.AURA, 48)
                    .add(Aspect.ENERGY, 32),
                new ItemStack(BaubleItems.ignisRing, 1, 0),
                new ItemStack[] { new ItemStack(ConfigBlocks.blockCrystal, 1, 6),
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 1), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 1), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 6), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 1), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 1) }));
        RingResearch.recipeList.put(
            "RBArchmagesRingOfAqua",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "RBARCHMAGESRINGOFAQUA",
                new ItemStack(BaubleItems.aquaRing, 1, 1),
                5,
                (new AspectList()).add(Aspect.WATER, 64)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.AURA, 48)
                    .add(Aspect.ENERGY, 32),
                new ItemStack(BaubleItems.aquaRing, 1, 0),
                new ItemStack[] { new ItemStack(ConfigBlocks.blockCrystal, 1, 6),
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 2), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 2), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 6), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 2), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 2) }));
        RingResearch.recipeList.put(
            "RBArchmagesRingOfOrdo",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "RBARCHMAGESRINGOFORDO",
                new ItemStack(BaubleItems.ordoRing, 1, 1),
                5,
                (new AspectList()).add(Aspect.ORDER, 64)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.AURA, 48)
                    .add(Aspect.ENERGY, 32),
                new ItemStack(BaubleItems.ordoRing, 1, 0),
                new ItemStack[] { new ItemStack(ConfigBlocks.blockCrystal, 1, 6),
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 4), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 4), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 6), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 4), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 4) }));
        RingResearch.recipeList.put(
            "RBArchmagesRingOfPerditio",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "RBARCHMAGESRINGOFPERDITIO",
                new ItemStack(BaubleItems.perditioRing, 1, 1),
                5,
                (new AspectList()).add(Aspect.ORDER, 64)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.AURA, 48)
                    .add(Aspect.ENERGY, 32),
                new ItemStack(BaubleItems.perditioRing, 1, 0),
                new ItemStack[] { new ItemStack(ConfigBlocks.blockCrystal, 1, 6),
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 5), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 5), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 6), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 5), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 5) }));

    }
}
