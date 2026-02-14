package com.gtnewhorizon.randomboubles.recipes.rings;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.ItemStack;

import com.dreammaster.item.NHItemList;
import com.gtnewhorizon.gtnhlib.api.thaumcraft.EnhancedInfusionRecipe;
import com.gtnewhorizon.randomboubles.BaubleItems;
import com.gtnewhorizon.randomboubles.research.RingResearch;
import com.gtnewhorizon.randomboubles.util.Constants;

import cpw.mods.fml.common.Loader;
import flaxbeard.thaumicexploration.ThaumicExploration;
import tb.init.TBBlocks;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.common.config.ConfigBlocks;
import thaumcraft.common.config.ConfigItems;
import witchinggadgets.common.WGContent;

public class InfusionRecipes {

    private static List<EnhancedInfusionRecipe.Replacement> returnPearl;
    private static List<EnhancedInfusionRecipe.Replacement> returnPowerlessPearl;
    private static List<EnhancedInfusionRecipe.Replacement> returnInertPearlFragment;

    public static void registerArcaneRingsInfusions() {
        InfusionRecipes.returnPearl = new ArrayList<>();
        returnPearl.add(
            new EnhancedInfusionRecipe.Replacement(
                new ItemStack(ConfigItems.itemEldritchObject, 1, 3),
                new ItemStack(ConfigItems.itemEldritchObject, 1, 3),
                true));

        InfusionRecipes.returnPowerlessPearl = new ArrayList<>(); // WG powerless pearl
        returnPowerlessPearl.add(
            new EnhancedInfusionRecipe.Replacement(
                new ItemStack(ConfigItems.itemEldritchObject, 1, 3),
                (Constants.WitchingGadgets ? // if WG is loaded, otherwise return normal pearl
                    new ItemStack(WGContent.ItemMaterial, 1, 12) : new ItemStack(ConfigItems.itemEldritchObject, 1, 3)),
                true));

        InfusionRecipes.returnInertPearlFragment = new ArrayList<>(); // gtnh core mod inert pearl fragment
        returnInertPearlFragment.add(
            new EnhancedInfusionRecipe.Replacement(
                new ItemStack(ConfigItems.itemEldritchObject, 1, 3),
                (Constants.GTNH ? // if GTNH is loaded, otherwise, normal pearl
                    NHItemList.PrimordialPearlFragment.get(1) : new ItemStack(ConfigItems.itemEldritchObject, 1, 3)),
                true));

        ItemStack salisMundus = new ItemStack(ConfigItems.itemResource, 1, 14);

        ItemStack airRingMagician = new ItemStack(BaubleItems.aerRing, 1, 0);
        ItemStack terraRingMagician = new ItemStack(BaubleItems.terraRing, 1, 0);
        ItemStack ignisRingMagician = new ItemStack(BaubleItems.ignisRing, 1, 0);
        ItemStack aquaRingMagician = new ItemStack(BaubleItems.aquaRing, 1, 0);
        ItemStack ordoRingMagician = new ItemStack(BaubleItems.ordoRing, 1, 0);
        ItemStack perditioRingMagician = new ItemStack(BaubleItems.perditioRing, 1, 0);

        if (Constants.ThaumicExploration) {
            airRingMagician = new ItemStack(ThaumicExploration.discountRing, 1, 0);
            terraRingMagician = new ItemStack(ThaumicExploration.discountRing, 1, 1);
            ignisRingMagician = new ItemStack(ThaumicExploration.discountRing, 1, 2);
            aquaRingMagician = new ItemStack(ThaumicExploration.discountRing, 1, 3);
            ordoRingMagician = new ItemStack(ThaumicExploration.discountRing, 1, 4);
            perditioRingMagician = new ItemStack(ThaumicExploration.discountRing, 1, 5);
        }

        RingResearch.recipeList.put(
            "RBArchmagesRingOfAer",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "RBARCHMAGESRINGOFAER",
                new ItemStack(BaubleItems.aerRing, 1, 1),
                5,
                (new AspectList()).add(Aspect.AIR, 32)
                    .add(Aspect.MAGIC, 32)
                    .add(Aspect.AURA, 24)
                    .add(Aspect.ENERGY, 16),
                airRingMagician,
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
                (new AspectList()).add(Aspect.EARTH, 32)
                    .add(Aspect.MAGIC, 32)
                    .add(Aspect.AURA, 24)
                    .add(Aspect.ENERGY, 16),
                terraRingMagician,
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
                (new AspectList()).add(Aspect.FIRE, 32)
                    .add(Aspect.MAGIC, 32)
                    .add(Aspect.AURA, 24)
                    .add(Aspect.ENERGY, 16),
                ignisRingMagician,
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
                (new AspectList()).add(Aspect.WATER, 32)
                    .add(Aspect.MAGIC, 32)
                    .add(Aspect.AURA, 24)
                    .add(Aspect.ENERGY, 16),
                aquaRingMagician,
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
                (new AspectList()).add(Aspect.ORDER, 32)
                    .add(Aspect.MAGIC, 32)
                    .add(Aspect.AURA, 24)
                    .add(Aspect.ENERGY, 16),
                ordoRingMagician,
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
                (new AspectList()).add(Aspect.ENTROPY, 32)
                    .add(Aspect.MAGIC, 32)
                    .add(Aspect.AURA, 24)
                    .add(Aspect.ENERGY, 16),
                perditioRingMagician,
                new ItemStack[] { new ItemStack(ConfigBlocks.blockCrystal, 1, 6),
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 5), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 5), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 6), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 5), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 5) }));

        if (Loader.isModLoaded("thaumicbases")) {
            salisMundus = new ItemStack(TBBlocks.dustBlock, 1, 0);
        }

        RingResearch.recipeList.put(
            "RBMastersRingOfAer",
            EnhancedInfusionRecipe.addEnhancedInfusionCraftingRecipe(
                "RBMASTERSRINGOFAER",
                new ItemStack(BaubleItems.aerRing, 1, 2),
                5,
                (new AspectList()).add(Aspect.AIR, 64)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.AURA, 48)
                    .add(Aspect.ENERGY, 32),
                new ItemStack(BaubleItems.aerRing, 1, 1),
                new ItemStack[] { new ItemStack(ConfigItems.itemEldritchObject, 1, 3),
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 0), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 0), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 6), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 0), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 0) },
                returnPearl));
        RingResearch.recipeList.put(
            "RBMastersRingOfTerra",
            EnhancedInfusionRecipe.addEnhancedInfusionCraftingRecipe(
                "RBMASTERSRINGOFTERRA",
                new ItemStack(BaubleItems.terraRing, 1, 2),
                5,
                (new AspectList()).add(Aspect.EARTH, 64)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.AURA, 48)
                    .add(Aspect.ENERGY, 32),
                new ItemStack(BaubleItems.terraRing, 1, 1),
                new ItemStack[] { new ItemStack(ConfigItems.itemEldritchObject, 1, 3),
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 3), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 3), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 6), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 3), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 3) },
                returnPearl));
        RingResearch.recipeList.put(
            "RBMastersRingOfIgnis",
            EnhancedInfusionRecipe.addEnhancedInfusionCraftingRecipe(
                "RBMASTERSRINGOFIGNIS",
                new ItemStack(BaubleItems.ignisRing, 1, 2),
                5,
                (new AspectList()).add(Aspect.FIRE, 64)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.AURA, 48)
                    .add(Aspect.ENERGY, 32),
                new ItemStack(BaubleItems.ignisRing, 1, 1),
                new ItemStack[] { new ItemStack(ConfigItems.itemEldritchObject, 1, 3),
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 1), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 1), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 6), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 1), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 1) },
                returnPearl));
        RingResearch.recipeList.put(
            "RBMastersRingOfAqua",
            EnhancedInfusionRecipe.addEnhancedInfusionCraftingRecipe(
                "RBMASTERSRINGOFAQUA",
                new ItemStack(BaubleItems.aquaRing, 1, 2),
                5,
                (new AspectList()).add(Aspect.WATER, 64)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.AURA, 48)
                    .add(Aspect.ENERGY, 32),
                new ItemStack(BaubleItems.aquaRing, 1, 1),
                new ItemStack[] { new ItemStack(ConfigItems.itemEldritchObject, 1, 3),
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 2), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 2), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 6), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 2), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 2) },
                returnPearl));
        RingResearch.recipeList.put(
            "RBMastersRingOfOrdo",
            EnhancedInfusionRecipe.addEnhancedInfusionCraftingRecipe(
                "RBMASTERSRINGOFORDO",
                new ItemStack(BaubleItems.ordoRing, 1, 2),
                5,
                (new AspectList()).add(Aspect.ORDER, 64)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.AURA, 48)
                    .add(Aspect.ENERGY, 32),
                new ItemStack(BaubleItems.ordoRing, 1, 1),
                new ItemStack[] { new ItemStack(ConfigItems.itemEldritchObject, 1, 3),
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 4), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 4), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 6), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 4), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 4) },
                returnPearl));
        RingResearch.recipeList.put(
            "RBMastersRingOfPerditio",
            EnhancedInfusionRecipe.addEnhancedInfusionCraftingRecipe(
                "RBMASTERSRINGOFPERDITIO",
                new ItemStack(BaubleItems.perditioRing, 1, 2),
                5,
                (new AspectList()).add(Aspect.ENTROPY, 64)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.AURA, 48)
                    .add(Aspect.ENERGY, 32),
                new ItemStack(BaubleItems.perditioRing, 1, 1),
                new ItemStack[] { new ItemStack(ConfigItems.itemEldritchObject, 1, 3),
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 5), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 5), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 6), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 5), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 5) },
                returnPearl));

        // Combination Rings
        RingResearch.recipeList.put(
            "RBSpellcastersRingOfTheSky",
            EnhancedInfusionRecipe.addEnhancedInfusionCraftingRecipe(
                "RBSPELLCASTERSRINGOFTHESKY",
                new ItemStack(BaubleItems.combinationRing, 1, 0),
                5,
                (new AspectList()).add(Aspect.AIR, 64)
                    .add(Aspect.ORDER, 64)
                    .add(Aspect.FIRE, 64)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.AURA, 48)
                    .add(Aspect.ENERGY, 32),
                new ItemStack(ConfigItems.itemEldritchObject, 1, 3),
                new ItemStack[] { new ItemStack(BaubleItems.aerRing, 1, 2),
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 0), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 4), new ItemStack(BaubleItems.ordoRing, 1, 2),
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 1), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 6), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 1), new ItemStack(BaubleItems.ignisRing, 1, 2),
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 4), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 0) },
                returnPowerlessPearl));
        RingResearch.recipeList.put(
            "RBSpellslingersRingoftheEarth",
            EnhancedInfusionRecipe.addEnhancedInfusionCraftingRecipe(
                "RBSPELLSLINGERSRINGOFTHEEARTH",
                new ItemStack(BaubleItems.combinationRing, 1, 3),
                5,
                (new AspectList()).add(Aspect.EARTH, 64)
                    .add(Aspect.ENTROPY, 64)
                    .add(Aspect.WATER, 64)
                    .add(Aspect.MAGIC, 64)
                    .add(Aspect.AURA, 48)
                    .add(Aspect.ENERGY, 32),
                new ItemStack(ConfigItems.itemEldritchObject, 1, 3),
                new ItemStack[] { new ItemStack(BaubleItems.terraRing, 1, 2),
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 3), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 5), new ItemStack(BaubleItems.perditioRing, 1, 2),
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 2), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 6), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 2), new ItemStack(BaubleItems.aquaRing, 1, 2),
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 5), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 3) },
                returnPowerlessPearl));
        RingResearch.recipeList.put(
            "RBExoticRingOfTheSky",
            EnhancedInfusionRecipe.addEnhancedInfusionCraftingRecipe(
                "RBEXOTICRINGOFTHESKY",
                new ItemStack(BaubleItems.combinationRing, 1, 1),
                5,
                (new AspectList()).add(Aspect.AIR, 128)
                    .add(Aspect.ORDER, 128)
                    .add(Aspect.FIRE, 128)
                    .add(Aspect.MAGIC, 128)
                    .add(Aspect.AURA, 96)
                    .add(Aspect.ENERGY, 64),
                new ItemStack(ConfigItems.itemEldritchObject, 1, 3),
                new ItemStack[] { new ItemStack(ConfigBlocks.blockCrystal, 1, 0), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 4), new ItemStack(BaubleItems.combinationRing, 1, 0),
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 1), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 6), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 1), new ItemStack(BaubleItems.combinationRing, 1, 0),
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 4), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 0) },
                returnPowerlessPearl));
        RingResearch.recipeList.put(
            "RBExoticRingoftheEarth",
            EnhancedInfusionRecipe.addEnhancedInfusionCraftingRecipe(
                "RBEXOTICRINGOFTHEEARTH",
                new ItemStack(BaubleItems.combinationRing, 1, 4),
                5,
                (new AspectList()).add(Aspect.EARTH, 128)
                    .add(Aspect.ENTROPY, 128)
                    .add(Aspect.WATER, 128)
                    .add(Aspect.MAGIC, 128)
                    .add(Aspect.AURA, 96)
                    .add(Aspect.ENERGY, 64),
                new ItemStack(ConfigItems.itemEldritchObject, 1, 3),
                new ItemStack[] { new ItemStack(ConfigBlocks.blockCrystal, 1, 3), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 5), new ItemStack(BaubleItems.combinationRing, 1, 3),
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 2), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 6), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 2), new ItemStack(BaubleItems.combinationRing, 1, 3),
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 5), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 3) },
                returnPowerlessPearl));
        RingResearch.recipeList.put(
            "RBRuneforgedRingOfTheSky",
            EnhancedInfusionRecipe.addEnhancedInfusionCraftingRecipe(
                "RBRUNEFORGEDRINGOFTHESKY",
                new ItemStack(BaubleItems.combinationRing, 1, 2),
                5,
                (new AspectList()).add(Aspect.AIR, 256)
                    .add(Aspect.ORDER, 256)
                    .add(Aspect.FIRE, 256)
                    .add(Aspect.MAGIC, 256)
                    .add(Aspect.AURA, 192)
                    .add(Aspect.ENERGY, 64),
                new ItemStack(ConfigItems.itemEldritchObject, 1, 3),
                new ItemStack[] { new ItemStack(ConfigBlocks.blockCrystal, 1, 0), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 4), new ItemStack(BaubleItems.combinationRing, 1, 1),
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 2), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 6), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 2), new ItemStack(BaubleItems.combinationRing, 1, 1),
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 4), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 0) },
                returnInertPearlFragment));
        RingResearch.recipeList.put(
            "RBRuneforgedRingoftheEarth",
            EnhancedInfusionRecipe.addEnhancedInfusionCraftingRecipe(
                "RBRUNEFORGEDRINGOFTHEEARTH",
                new ItemStack(BaubleItems.combinationRing, 1, 5),
                5,
                (new AspectList()).add(Aspect.EARTH, 256)
                    .add(Aspect.ENTROPY, 256)
                    .add(Aspect.WATER, 256)
                    .add(Aspect.MAGIC, 256)
                    .add(Aspect.AURA, 192)
                    .add(Aspect.ENERGY, 64),
                new ItemStack(ConfigItems.itemEldritchObject, 1, 3),
                new ItemStack[] { new ItemStack(ConfigBlocks.blockCrystal, 1, 3), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 5), new ItemStack(BaubleItems.combinationRing, 1, 4),
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 1), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 6), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 1), new ItemStack(BaubleItems.combinationRing, 1, 4),
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 5), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 3) },
                returnInertPearlFragment));

        RingResearch.recipeList.put(
            "RBThaumaturgesRing",
            EnhancedInfusionRecipe.addEnhancedInfusionCraftingRecipe(
                "RBTHAUMATURGESRING",
                new ItemStack(BaubleItems.combinationRing, 1, 6),
                5,
                (new AspectList()).add(Aspect.AIR, 512)
                    .add(Aspect.ORDER, 512)
                    .add(Aspect.FIRE, 512)
                    .add(Aspect.EARTH, 512)
                    .add(Aspect.ENTROPY, 512)
                    .add(Aspect.WATER, 512)
                    .add(Aspect.MAGIC, 512)
                    .add(Aspect.AURA, 384)
                    .add(Aspect.ENERGY, 128),
                new ItemStack(ConfigItems.itemEldritchObject, 1, 3),
                new ItemStack[] { new ItemStack(BaubleItems.combinationRing, 1, 2),
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 0), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 1), new ItemStack(ConfigBlocks.blockCrystal, 1, 2),
                    salisMundus, new ItemStack(BaubleItems.combinationRing, 1, 5), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 3), new ItemStack(ConfigBlocks.blockCrystal, 1, 4),
                    salisMundus, new ItemStack(ConfigBlocks.blockCrystal, 1, 5) },
                returnInertPearlFragment));
        RingResearch.recipeList.put(
            "RBExoticThaumaturgesRing",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "RBEXOTICTHAUMATURGESRING",
                new ItemStack(BaubleItems.combinationRing, 1, 7),
                5,
                (new AspectList()).add(Aspect.AIR, 768)
                    .add(Aspect.ORDER, 768)
                    .add(Aspect.FIRE, 768)
                    .add(Aspect.EARTH, 768)
                    .add(Aspect.ENTROPY, 768)
                    .add(Aspect.WATER, 768)
                    .add(Aspect.MAGIC, 768)
                    .add(Aspect.AURA, 384)
                    .add(Aspect.ENERGY, 256),
                new ItemStack(ConfigItems.itemEldritchObject, 1, 3),
                new ItemStack[] { new ItemStack(BaubleItems.combinationRing, 1, 6),
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 0), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 1), new ItemStack(ConfigBlocks.blockCrystal, 1, 2),
                    salisMundus, new ItemStack(BaubleItems.combinationRing, 1, 6), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 3), new ItemStack(ConfigBlocks.blockCrystal, 1, 4),
                    salisMundus, new ItemStack(ConfigBlocks.blockCrystal, 1, 5) }));
        RingResearch.recipeList.put(
            "RBRuneforgedThaumaturgesRing",
            ThaumcraftApi.addInfusionCraftingRecipe(
                "RBRUNEFORGEDTHAUMATURGESRING",
                new ItemStack(BaubleItems.combinationRing, 1, 8),
                5,
                (new AspectList()).add(Aspect.AIR, 1024)
                    .add(Aspect.ORDER, 1024)
                    .add(Aspect.FIRE, 1024)
                    .add(Aspect.EARTH, 1024)
                    .add(Aspect.ENTROPY, 1024)
                    .add(Aspect.WATER, 1024)
                    .add(Aspect.MAGIC, 1024)
                    .add(Aspect.AURA, 768)
                    .add(Aspect.ENERGY, 512),
                new ItemStack(ConfigItems.itemEldritchObject, 1, 3),
                new ItemStack[] { new ItemStack(BaubleItems.combinationRing, 1, 7),
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 0), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 1), new ItemStack(ConfigBlocks.blockCrystal, 1, 2),
                    salisMundus, new ItemStack(BaubleItems.combinationRing, 1, 7), salisMundus,
                    new ItemStack(ConfigBlocks.blockCrystal, 1, 3), new ItemStack(ConfigBlocks.blockCrystal, 1, 4),
                    salisMundus, new ItemStack(ConfigBlocks.blockCrystal, 1, 5) }));
    }
}
