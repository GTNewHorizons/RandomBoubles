package com.gtnewhorizon.randomboubles.research;

import java.util.ArrayList;
import java.util.HashMap;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagByte;
import net.minecraft.util.ResourceLocation;

import com.gtnewhorizon.randomboubles.BaubleItems;
import com.gtnewhorizon.randomboubles.RandomBoubles;
import com.gtnewhorizon.randomboubles.util.Constants;
import com.gtnewhorizon.randomboubles.util.research.RBResearchItem;

import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.InfusionRecipe;
import thaumcraft.api.crafting.ShapedArcaneRecipe;
import thaumcraft.api.research.ResearchCategories;
import thaumcraft.api.research.ResearchPage;
import thaumcraft.common.config.ConfigBlocks;
import thaumcraft.common.config.ConfigItems;
import thaumcraft.common.lib.crafting.InfusionRunicAugmentRecipe;

public class RingResearch {

    public static HashMap<String, Object> recipeList = new HashMap<>();
    public static final ResourceLocation rbThaumRing = new ResourceLocation(
        RandomBoubles.MODID + ":textures/misc/Thaum_Ring.png");

    public static void setupResearchPage() {
        ResearchCategories.registerCategory(
            "RBRINGS",
            rbThaumRing,
            new ResourceLocation("thaumcraft", "textures/gui/gui_researchback.png"));
    }

    public static void registerResearch() {
        AspectList researchAspects;
        ResearchPage[] pages;
        ThaumcraftApi.registerObjectTag(
            new ItemStack(ConfigItems.itemBaubleBlanks, 1, 4),
            (new AspectList()).add(Aspect.MAGIC, 5));
        ThaumcraftApi.registerObjectTag(
            new ItemStack(ConfigItems.itemBaubleBlanks, 1, 5),
            (new AspectList()).add(Aspect.MAGIC, 5));
        ThaumcraftApi.registerObjectTag(
            new ItemStack(ConfigItems.itemBaubleBlanks, 1, 6),
            (new AspectList()).add(Aspect.MAGIC, 5));
        ThaumcraftApi.registerObjectTag(
            new ItemStack(ConfigItems.itemBaubleBlanks, 1, 7),
            (new AspectList()).add(Aspect.MAGIC, 5));
        ThaumcraftApi.registerObjectTag(
            new ItemStack(ConfigItems.itemBaubleBlanks, 1, 8),
            (new AspectList()).add(Aspect.MAGIC, 5));

        // Apprentice Ring of Aer
        pages = new ResearchPage[] { new ResearchPage("randomboubles_research_page.RBAPPRENTICERINGOFAER.1") };
        researchAspects = new AspectList().add(Aspect.AIR, 2)
            .add(Aspect.MAGIC, 4);
        getResearchItem(
            "RBAPPRENTICERINGOFAER",
            "RBRINGS",
            researchAspects,
            -4,
            -6,
            0,
            new ItemStack(ConfigItems.itemBaubleBlanks, 1, 3)).setRound()
                .setHidden()
                .setItemTriggers(new ItemStack(ConfigItems.itemBaubleBlanks, 1, 3))
                .setAutoUnlock()
                .setPages(pages)
                .registerResearchItem();
        // Apprentice Ring of Terra
        pages = new ResearchPage[] { new ResearchPage("randomboubles_research_page.RBAPPRENTICERINGOFTERRA.1") };
        researchAspects = new AspectList().add(Aspect.EARTH, 2)
            .add(Aspect.MAGIC, 4);
        getResearchItem(
            "RBAPPRENTICERINGOFTERRA",
            "RBRINGS",
            researchAspects,
            4,
            -6,
            0,
            new ItemStack(ConfigItems.itemBaubleBlanks, 1, 4)).setRound()
                .setHidden()
                .setItemTriggers(new ItemStack(ConfigItems.itemBaubleBlanks, 1, 4))
                .setAutoUnlock()
                .setPages(pages)
                .registerResearchItem();
        // Apprentice Ring of Ignis
        pages = new ResearchPage[] { new ResearchPage("randomboubles_research_page.RBAPPRENTICERINGOFIGNIS.1") };
        researchAspects = new AspectList().add(Aspect.FIRE, 2)
            .add(Aspect.MAGIC, 4);
        getResearchItem(
            "RBAPPRENTICERINGOFIGNIS",
            "RBRINGS",
            researchAspects,
            4,
            2,
            0,
            new ItemStack(ConfigItems.itemBaubleBlanks, 1, 5)).setRound()
                .setHidden()
                .setItemTriggers(new ItemStack(ConfigItems.itemBaubleBlanks, 1, 5))
                .setAutoUnlock()
                .setPages(pages)
                .registerResearchItem();
        // Apprentice Ring of Aqua
        researchAspects = new AspectList().add(Aspect.WATER, 2)
            .add(Aspect.MAGIC, 4);
        pages = new ResearchPage[] { new ResearchPage("randomboubles_research_page.RBAPPRENTICERINGOFAQUA.1") };
        getResearchItem(
            "RBAPPRENTICERINGOFAQUA",
            "RBRINGS",
            researchAspects,
            -4,
            2,
            0,
            new ItemStack(ConfigItems.itemBaubleBlanks, 1, 6)).setRound()
                .setHidden()
                .setItemTriggers(new ItemStack(ConfigItems.itemBaubleBlanks, 1, 6))
                .setAutoUnlock()
                .setPages(pages)
                .registerResearchItem();
        // Apprentice Ring of Ordo
        pages = new ResearchPage[] { new ResearchPage("randomboubles_research_page.RBAPPRENTICERINGOFORDO.1") };
        researchAspects = new AspectList().add(Aspect.ORDER, 2)
            .add(Aspect.MAGIC, 4);
        getResearchItem(
            "RBAPPRENTICERINGOFORDO",
            "RBRINGS",
            researchAspects,
            0,
            -7,
            0,
            new ItemStack(ConfigItems.itemBaubleBlanks, 1, 7)).setRound()
                .setHidden()
                .setItemTriggers(new ItemStack(ConfigItems.itemBaubleBlanks, 1, 7))
                .setAutoUnlock()
                .setPages(pages)
                .registerResearchItem();
        // Apprentice Ring of Perditio
        pages = new ResearchPage[] { new ResearchPage("randomboubles_research_page.RBAPPRENTICERINGOFPERDITIO.1") };
        researchAspects = new AspectList().add(Aspect.ENTROPY, 2)
            .add(Aspect.MAGIC, 4);
        getResearchItem(
            "RBAPPRENTICERINGOFPERDITIO",
            "RBRINGS",
            researchAspects,
            0,
            3,
            0,
            new ItemStack(ConfigItems.itemBaubleBlanks, 1, 8)).setRound()
                .setHidden()
                .setItemTriggers(new ItemStack(ConfigItems.itemBaubleBlanks, 1, 8))
                .setAutoUnlock()
                .setPages(pages)
                .registerResearchItem();

        // Magician's Ring of Aer
        pages = new ResearchPage[] { new ResearchPage("randomboubles_research_page.RBMAGICIANSRINGOFAER.1"),
            new ResearchPage((ShapedArcaneRecipe) recipeList.get("RBMagiciansRingOfAer")) };
        researchAspects = new AspectList().add(Aspect.AIR, 4)
            .add(Aspect.MAGIC, 8)
            .add(Aspect.AURA, 4);
        getResearchItem(
            "RBMAGICIANSRINGOFAER",
            "RBRINGS",
            researchAspects,
            -3,
            -5,
            0,
            new ItemStack(BaubleItems.aerRing, 1, 0)).setPages(pages)
                .setParents("RBAPPRENTICERINGOFAER")
                .registerResearchItem();
        // Magician's Ring of Terra
        pages = new ResearchPage[] { new ResearchPage("randomboubles_research_page.RBMAGICIANSRINGOFTERRA.1"),
            new ResearchPage((ShapedArcaneRecipe) recipeList.get("RBMagiciansRingOfTerra")) };
        researchAspects = new AspectList().add(Aspect.EARTH, 4)
            .add(Aspect.MAGIC, 8)
            .add(Aspect.AURA, 4);
        getResearchItem(
            "RBMAGICIANSRINGOFTERRA",
            "RBRINGS",
            researchAspects,
            3,
            -5,
            0,
            new ItemStack(BaubleItems.terraRing, 1, 0)).setPages(pages)
                .setParents("RBAPPRENTICERINGOFTERRA")
                .registerResearchItem();
        // Magician's Ring of Ignis
        pages = new ResearchPage[] { new ResearchPage("randomboubles_research_page.RBMAGICIANSRINGOFIGNIS.1"),
            new ResearchPage((ShapedArcaneRecipe) recipeList.get("RBMagiciansRingOfIgnis")) };
        researchAspects = new AspectList().add(Aspect.FIRE, 4)
            .add(Aspect.MAGIC, 8)
            .add(Aspect.AURA, 4);
        getResearchItem(
            "RBMAGICIANSRINGOFIGNIS",
            "RBRINGS",
            researchAspects,
            3,
            1,
            0,
            new ItemStack(BaubleItems.ignisRing, 1, 0)).setPages(pages)
                .setParents("RBAPPRENTICERINGOFIGNIS")
                .registerResearchItem();
        // Magician's Ring of Aqua
        pages = new ResearchPage[] { new ResearchPage("randomboubles_research_page.RBMAGICIANSRINGOFAQUA.1"),
            new ResearchPage((ShapedArcaneRecipe) recipeList.get("RBMagiciansRingOfAqua")) };
        researchAspects = new AspectList().add(Aspect.WATER, 4)
            .add(Aspect.MAGIC, 8)
            .add(Aspect.AURA, 4);
        getResearchItem(
            "RBMAGICIANSRINGOFAQUA",
            "RBRINGS",
            researchAspects,
            -3,
            1,
            0,
            new ItemStack(BaubleItems.aquaRing, 1, 0)).setPages(pages)
                .setParents("RBAPPRENTICERINGOFAQUA")
                .registerResearchItem();
        // Magician's Ring of Ordo
        pages = new ResearchPage[] { new ResearchPage("randomboubles_research_page.RBMAGICIANSRINGOFORDO.1"),
            new ResearchPage((ShapedArcaneRecipe) recipeList.get("RBMagiciansRingOfOrdo")) };
        researchAspects = new AspectList().add(Aspect.ORDER, 4)
            .add(Aspect.MAGIC, 8)
            .add(Aspect.AURA, 4);
        getResearchItem(
            "RBMAGICIANSRINGOFORDO",
            "RBRINGS",
            researchAspects,
            0,
            -6,
            0,
            new ItemStack(BaubleItems.ordoRing, 1, 0)).setPages(pages)
                .setParents("RBAPPRENTICERINGOFORDO")
                .registerResearchItem();
        // Magician's Ring of Perditio
        pages = new ResearchPage[] { new ResearchPage("randomboubles_research_page.RBMAGICIANSRINGOFPERDITIO.1"),
            new ResearchPage((ShapedArcaneRecipe) recipeList.get("RBMagiciansRingOfPerditio")) };
        researchAspects = new AspectList().add(Aspect.ENTROPY, 4)
            .add(Aspect.MAGIC, 8)
            .add(Aspect.AURA, 4);
        getResearchItem(
            "RBMAGICIANSRINGOFPERDITIO",
            "RBRINGS",
            researchAspects,
            0,
            2,
            0,
            new ItemStack(BaubleItems.perditioRing, 1, 0)).setPages(pages)
                .setParents("RBAPPRENTICERINGOFPERDITIO")
                .registerResearchItem();

        // Archmage's Ring of Aer
        pages = new ResearchPage[] { new ResearchPage("randomboubles_research_page.RBARCHMAGESRINGOFAER.1"),
            new ResearchPage((InfusionRecipe) recipeList.get("RBArchmagesRingOfAer")) };
        researchAspects = new AspectList().add(Aspect.AIR, 6)
            .add(Aspect.MAGIC, 12)
            .add(Aspect.AURA, 6);
        getResearchItem(
            "RBARCHMAGESRINGOFAER",
            "RBRINGS",
            researchAspects,
            -2,
            -4,
            0,
            new ItemStack(BaubleItems.aerRing, 1, 1)).setPages(pages)
                .setParents("RBMAGICIANSRINGOFAER", "INFUSION")
                .registerResearchItem();
        // Archmage's Ring of Terra
        pages = new ResearchPage[] { new ResearchPage("randomboubles_research_page.RBARCHMAGESRINGOFTERRA.1"),
            new ResearchPage((InfusionRecipe) recipeList.get("RBArchmagesRingOfTerra")) };
        researchAspects = new AspectList().add(Aspect.EARTH, 6)
            .add(Aspect.MAGIC, 12)
            .add(Aspect.AURA, 6);
        getResearchItem(
            "RBARCHMAGESRINGOFTERRA",
            "RBRINGS",
            researchAspects,
            2,
            -4,
            0,
            new ItemStack(BaubleItems.terraRing, 1, 1)).setPages(pages)
                .setParents("RBMAGICIANSRINGOFTERRA", "INFUSION")
                .registerResearchItem();
        // Archmage's Ring of Ignis
        pages = new ResearchPage[] { new ResearchPage("randomboubles_research_page.RBARCHMAGESRINGOFIGNIS.1"),
            new ResearchPage((InfusionRecipe) recipeList.get("RBArchmagesRingOfIgnis")) };
        researchAspects = new AspectList().add(Aspect.FIRE, 6)
            .add(Aspect.MAGIC, 12)
            .add(Aspect.AURA, 6);
        getResearchItem(
            "RBARCHMAGESRINGOFIGNIS",
            "RBRINGS",
            researchAspects,
            2,
            0,
            0,
            new ItemStack(BaubleItems.ignisRing, 1, 1)).setPages(pages)
                .setParents("RBMAGICIANSRINGOFIGNIS", "INFUSION")
                .registerResearchItem();
        // Archmage's Ring of Aqua
        pages = new ResearchPage[] { new ResearchPage("randomboubles_research_page.RBARCHMAGESRINGOFAQUA.1"),
            new ResearchPage((InfusionRecipe) recipeList.get("RBArchmagesRingOfAqua")) };
        researchAspects = new AspectList().add(Aspect.WATER, 6)
            .add(Aspect.MAGIC, 12)
            .add(Aspect.AURA, 6);
        getResearchItem(
            "RBARCHMAGESRINGOFAQUA",
            "RBRINGS",
            researchAspects,
            -2,
            0,
            0,
            new ItemStack(BaubleItems.aquaRing, 1, 1)).setPages(pages)
                .setParents("RBMAGICIANSRINGOFAQUA", "INFUSION")
                .registerResearchItem();
        // Archmage's Ring of Ordo
        pages = new ResearchPage[] { new ResearchPage("randomboubles_research_page.RBARCHMAGESRINGOFORDO.1"),
            new ResearchPage((InfusionRecipe) recipeList.get("RBArchmagesRingOfOrdo")) };
        researchAspects = new AspectList().add(Aspect.ORDER, 6)
            .add(Aspect.MAGIC, 12)
            .add(Aspect.AURA, 6);
        getResearchItem(
            "RBARCHMAGESRINGOFORDO",
            "RBRINGS",
            researchAspects,
            0,
            -5,
            0,
            new ItemStack(BaubleItems.ordoRing, 1, 1)).setPages(pages)
                .setParents("RBMAGICIANSRINGOFORDO", "INFUSION")
                .registerResearchItem();
        // Archmage's Ring of Perditio
        pages = new ResearchPage[] { new ResearchPage("randomboubles_research_page.RBARCHMAGESRINGOFPERDITIO.1"),
            new ResearchPage((InfusionRecipe) recipeList.get("RBArchmagesRingOfPerditio")) };
        researchAspects = new AspectList().add(Aspect.ENTROPY, 6)
            .add(Aspect.MAGIC, 12)
            .add(Aspect.AURA, 6);
        getResearchItem(
            "RBARCHMAGESRINGOFPERDITIO",
            "RBRINGS",
            researchAspects,
            0,
            1,
            0,
            new ItemStack(BaubleItems.perditioRing, 1, 1)).setPages(pages)
                .setParents("RBMAGICIANSRINGOFPERDITIO", "INFUSION")
                .registerResearchItem();

        // Master's Ring of Aer
        pages = new ResearchPage[] { new ResearchPage("randomboubles_research_page.RBMASTERSRINGOFAER.1"),
            new ResearchPage((InfusionRecipe) recipeList.get("RBMastersRingOfAer")) };
        researchAspects = new AspectList().add(Aspect.AIR, 8)
            .add(Aspect.MAGIC, 16)
            .add(Aspect.AURA, 8);
        getResearchItem(
            "RBMASTERSRINGOFAER",
            "RBRINGS",
            researchAspects,
            -1,
            -3,
            0,
            new ItemStack(BaubleItems.aerRing, 1, 2)).setPages(pages)
                .setParents("RBARCHMAGESRINGOFAER", "PRIMPEARL")
                .registerResearchItem();
        // Master's Ring of Terra
        pages = new ResearchPage[] { new ResearchPage("randomboubles_research_page.RBMASTERSRINGOFTERRA.1"),
            new ResearchPage((InfusionRecipe) recipeList.get("RBMastersRingOfTerra")) };
        researchAspects = new AspectList().add(Aspect.EARTH, 8)
            .add(Aspect.MAGIC, 16)
            .add(Aspect.AURA, 8);
        getResearchItem(
            "RBMASTERSRINGOFTERRA",
            "RBRINGS",
            researchAspects,
            1,
            -3,
            0,
            new ItemStack(BaubleItems.terraRing, 1, 2)).setPages(pages)
                .setParents("RBARCHMAGESRINGOFTERRA", "PRIMPEARL")
                .registerResearchItem();
        // Master's Ring of Ignis
        pages = new ResearchPage[] { new ResearchPage("randomboubles_research_page.RBMASTERSRINGOFIGNIS.1"),
            new ResearchPage((InfusionRecipe) recipeList.get("RBMastersRingOfIgnis")) };
        researchAspects = new AspectList().add(Aspect.FIRE, 8)
            .add(Aspect.MAGIC, 16)
            .add(Aspect.AURA, 8);
        getResearchItem(
            "RBMASTERSRINGOFIGNIS",
            "RBRINGS",
            researchAspects,
            1,
            -1,
            0,
            new ItemStack(BaubleItems.ignisRing, 1, 2)).setPages(pages)
                .setParents("RBARCHMAGESRINGOFIGNIS", "PRIMPEARL")
                .registerResearchItem();
        // Master's Ring of Aqua
        pages = new ResearchPage[] { new ResearchPage("randomboubles_research_page.RBMASTERSRINGOFAQUA.1"),
            new ResearchPage((InfusionRecipe) recipeList.get("RBMastersRingOfAqua")) };
        researchAspects = new AspectList().add(Aspect.WATER, 8)
            .add(Aspect.MAGIC, 16)
            .add(Aspect.AURA, 8);
        getResearchItem(
            "RBMASTERSRINGOFAQUA",
            "RBRINGS",
            researchAspects,
            -1,
            -1,
            0,
            new ItemStack(BaubleItems.aquaRing, 1, 2)).setPages(pages)
                .setParents("RBARCHMAGESRINGOFAQUA", "PRIMPEARL")
                .registerResearchItem();
        // Master's Ring of Ordo
        pages = new ResearchPage[] { new ResearchPage("randomboubles_research_page.RBMASTERSRINGOFORDO.1"),
            new ResearchPage((InfusionRecipe) recipeList.get("RBMastersRingOfOrdo")) };
        researchAspects = new AspectList().add(Aspect.ORDER, 8)
            .add(Aspect.MAGIC, 16)
            .add(Aspect.AURA, 8);
        getResearchItem(
            "RBMASTERSRINGOFORDO",
            "RBRINGS",
            researchAspects,
            0,
            -4,
            0,
            new ItemStack(BaubleItems.ordoRing, 1, 2)).setPages(pages)
                .setParents("RBARCHMAGESRINGOFORDO", "PRIMPEARL")
                .registerResearchItem();
        // Master's Ring of Perditio
        pages = new ResearchPage[] { new ResearchPage("randomboubles_research_page.RBMASTERSRINGOFPERDITIO.1"),
            new ResearchPage((InfusionRecipe) recipeList.get("RBMastersRingOfPerditio")) };
        researchAspects = new AspectList().add(Aspect.ENTROPY, 8)
            .add(Aspect.MAGIC, 16)
            .add(Aspect.AURA, 8);
        getResearchItem(
            "RBMASTERSRINGOFPERDITIO",
            "RBRINGS",
            researchAspects,
            0,
            0,
            0,
            new ItemStack(BaubleItems.perditioRing, 1, 2)).setPages(pages)
                .setParents("RBARCHMAGESRINGOFPERDITIO", "PRIMPEARL")
                .registerResearchItem();

        // Master of the Elemental Rings
        pages = new ResearchPage[] { new ResearchPage("randomboubles_research_page.RBMASTEROFTHEELEMENTALRINGS.1") };
        researchAspects = new AspectList().add(Aspect.AIR, 8)
            .add(Aspect.EARTH, 8)
            .add(Aspect.FIRE, 8)
            .add(Aspect.WATER, 8)
            .add(Aspect.ORDER, 8)
            .add(Aspect.ENTROPY, 8)
            .add(Aspect.MAGIC, 16)
            .add(Aspect.AURA, 8);
        getResearchItem(
            "RBMASTEROFTHEELEMENTALRINGS",
            "RBRINGS",
            researchAspects,
            0,
            -2,
            2,
            new ItemStack(ConfigBlocks.blockCrystal, 1, 6)).setRound()
                .setParents(
                    "RBMASTERSRINGOFAER",
                    "RBMASTERSRINGOFORDO",
                    "RBMASTERSRINGOFTERRA",
                    "RBMASTERSRINGOFIGNIS",
                    "RBMASTERSRINGOFPERDITIO",
                    "RBMASTERSRINGOFAQUA")
                .setPages(pages)
                .registerResearchItem();
        // Ring of Combinations
        pages = new ResearchPage[] { new ResearchPage("randomboubles_research_page.RBTHEORYRINGOFCOMBINATIONS.1") };
        researchAspects = new AspectList().add(Aspect.AIR, 8)
            .add(Aspect.EARTH, 8)
            .add(Aspect.FIRE, 8)
            .add(Aspect.WATER, 8)
            .add(Aspect.ORDER, 8)
            .add(Aspect.ENTROPY, 8)
            .add(Aspect.MAGIC, 16)
            .add(Aspect.AURA, 8);
        getResearchItem(
            "RBTHEORYRINGOFCOMBINATIONS",
            "RBRINGS",
            researchAspects,
            -4,
            -2,
            2,
            new ItemStack(BaubleItems.combinationRing, 1, 6)).setRound()
                .setParents("RBMASTEROFTHEELEMENTALRINGS")
                .setPages(pages)
                .registerResearchItem();
        // Applying Runic Shield
        ArrayList<InfusionRecipe> shieldRecipes = new ArrayList<>();
        ItemStack[] rings = { new ItemStack(BaubleItems.aerRing, 1, 2), new ItemStack(BaubleItems.terraRing, 1, 2),
            new ItemStack(BaubleItems.ignisRing, 1, 2), new ItemStack(BaubleItems.aquaRing, 1, 2),
            new ItemStack(BaubleItems.ordoRing, 1, 2), new ItemStack(BaubleItems.perditioRing, 1, 2), };
        for (ItemStack ring : rings) {
            for (int i = 0; i <= 2; i++) {
                ItemStack r = ring.copy();
                if (i > 0) {
                    r.setTagInfo("RS.HARDEN", new NBTTagByte((byte) i));
                }
                shieldRecipes.add(new InfusionRunicAugmentRecipe(r));
            }
        }
        pages = new ResearchPage[] { new ResearchPage("randomboubles_research_page.RBTHEORYRINGOFMAGICALPROTECTION.1"),
            new ResearchPage(shieldRecipes.toArray(new InfusionRecipe[0])) };
        researchAspects = new AspectList().add(Aspect.AIR, 8)
            .add(Aspect.EARTH, 8)
            .add(Aspect.FIRE, 8)
            .add(Aspect.WATER, 8)
            .add(Aspect.ORDER, 8)
            .add(Aspect.ENTROPY, 8)
            .add(Aspect.MAGIC, 16)
            .add(Aspect.AURA, 8);
        getResearchItem(
            "RBTHEORYRINGOFMAGICALPROTECTION",
            "RBRINGS",
            researchAspects,
            4,
            -2,
            2,
            new ResourceLocation("thaumcraft", "textures/misc/r_runicupg.png")).setRound()
                .setParents("RBMASTEROFTHEELEMENTALRINGS", "RUNICAUGMENTATION")
                .setPages(pages)
                .registerResearchItem();

        // Spellcaster's Ring of the Sky
        pages = new ResearchPage[] {
            new ResearchPage(
                "randomboubles_research_page.RBSPELLCASTERSRINGOFTHESKY" + (Constants.WitchingGadgets ? "WG.1" : ".1")),
            new ResearchPage((InfusionRecipe) recipeList.get("RBSpellcastersRingOfTheSky")) };
        researchAspects = new AspectList().add(Aspect.AIR, 12)
            .add(Aspect.FIRE, 12)
            .add(Aspect.ORDER, 12)
            .add(Aspect.MAGIC, 24)
            .add(Aspect.AURA, 12);
        getResearchItem(
            "RBSPELLCASTERSRINGOFTHESKY",
            "RBRINGS",
            researchAspects,
            -5,
            -3,
            2,
            new ItemStack(BaubleItems.combinationRing, 1, 0)).setParents("RBTHEORYRINGOFCOMBINATIONS")
                .setPages(pages)
                .registerResearchItem();
        // Spellslinger's Ring of the Earth
        pages = new ResearchPage[] { new ResearchPage(
            "randomboubles_research_page.RBSPELLSLINGERSRINGOFTHEEARTH" + (Constants.WitchingGadgets ? "WG.1" : ".1")),
            new ResearchPage((InfusionRecipe) recipeList.get("RBSpellslingersRingoftheEarth")) };
        researchAspects = new AspectList().add(Aspect.EARTH, 12)
            .add(Aspect.WATER, 12)
            .add(Aspect.ENTROPY, 12)
            .add(Aspect.MAGIC, 24)
            .add(Aspect.AURA, 12);
        getResearchItem(
            "RBSPELLSLINGERSRINGOFTHEEARTH",
            "RBRINGS",
            researchAspects,
            -5,
            -1,
            2,
            new ItemStack(BaubleItems.combinationRing, 1, 3)).setParents("RBTHEORYRINGOFCOMBINATIONS")
                .setPages(pages)
                .registerResearchItem();
        // Exotic Ring of the Sky
        pages = new ResearchPage[] {
            new ResearchPage(
                "randomboubles_research_page.RBEXOTICRINGOFTHESKY" + (Constants.WitchingGadgets ? "WG.1" : ".1")),
            new ResearchPage((InfusionRecipe) recipeList.get("RBExoticRingOfTheSky")) };
        researchAspects = new AspectList().add(Aspect.AIR, 14)
            .add(Aspect.FIRE, 14)
            .add(Aspect.ORDER, 14)
            .add(Aspect.MAGIC, 28)
            .add(Aspect.AURA, 14);
        getResearchItem(
            "RBEXOTICRINGOFTHESKY",
            "RBRINGS",
            researchAspects,
            -6,
            -4,
            2,
            new ItemStack(BaubleItems.combinationRing, 1, 1)).setParents("RBSPELLCASTERSRINGOFTHESKY")
                .setPages(pages)
                .registerResearchItem();
        // Exotic Ring of the Earth
        pages = new ResearchPage[] {
            new ResearchPage(
                "randomboubles_research_page.RBEXOTICRINGOFTHEEARTH" + (Constants.WitchingGadgets ? "WG.1" : ".1")),
            new ResearchPage((InfusionRecipe) recipeList.get("RBExoticRingoftheEarth")) };
        researchAspects = new AspectList().add(Aspect.EARTH, 14)
            .add(Aspect.WATER, 14)
            .add(Aspect.ENTROPY, 14)
            .add(Aspect.MAGIC, 28)
            .add(Aspect.AURA, 14);
        getResearchItem(
            "RBEXOTICRINGOFTHEEARTH",
            "RBRINGS",
            researchAspects,
            -6,
            0,
            2,
            new ItemStack(BaubleItems.combinationRing, 1, 4)).setParents("RBSPELLSLINGERSRINGOFTHEEARTH")
                .setPages(pages)
                .registerResearchItem();
        // Runeforged Ring of the Sky
        pages = new ResearchPage[] {
            new ResearchPage(
                "randomboubles_research_page.RBRUNEFORGEDRINGOFTHESKY" + (Constants.GTNH ? "GTNH.1" : ".1")),
            new ResearchPage((InfusionRecipe) recipeList.get("RBRuneforgedRingOfTheSky")) };
        researchAspects = new AspectList().add(Aspect.AIR, 16)
            .add(Aspect.FIRE, 16)
            .add(Aspect.ORDER, 16)
            .add(Aspect.MAGIC, 32)
            .add(Aspect.AURA, 16);
        getResearchItem(
            "RBRUNEFORGEDRINGOFTHESKY",
            "RBRINGS",
            researchAspects,
            -7,
            -5,
            2,
            new ItemStack(BaubleItems.combinationRing, 1, 2)).setParents("RBEXOTICRINGOFTHESKY")
                .setPages(pages)
                .registerResearchItem();
        // Runeforged Ring of the Earth
        pages = new ResearchPage[] {
            new ResearchPage(
                "randomboubles_research_page.RBRUNEFORGEDRINGOFTHEEARTH" + (Constants.GTNH ? "GTNH.1" : ".1")),
            new ResearchPage((InfusionRecipe) recipeList.get("RBRuneforgedRingoftheEarth")) };
        researchAspects = new AspectList().add(Aspect.EARTH, 16)
            .add(Aspect.WATER, 16)
            .add(Aspect.ENTROPY, 16)
            .add(Aspect.MAGIC, 32)
            .add(Aspect.AURA, 16);
        getResearchItem(
            "RBRUNEFORGEDRINGOFTHEEARTH",
            "RBRINGS",
            researchAspects,
            -7,
            1,
            2,
            new ItemStack(BaubleItems.combinationRing, 1, 5)).setParents("RBEXOTICRINGOFTHEEARTH")
                .setPages(pages)
                .registerResearchItem();

        // Thaumaturge's Ring
        pages = new ResearchPage[] {
            new ResearchPage("randomboubles_research_page.RBTHAUMATURGESRING" + (Constants.GTNH ? "GTNH.1" : ".1")),
            new ResearchPage((InfusionRecipe) recipeList.get("RBThaumaturgesRing")) };
        researchAspects = new AspectList().add(Aspect.EARTH, 16)
            .add(Aspect.AIR, 16)
            .add(Aspect.FIRE, 16)
            .add(Aspect.WATER, 16)
            .add(Aspect.ORDER, 16)
            .add(Aspect.ENTROPY, 16)
            .add(Aspect.MAGIC, 32)
            .add(Aspect.AURA, 16);
        getResearchItem(
            "RBTHAUMATURGESRING",
            "RBRINGS",
            researchAspects,
            -7,
            -2,
            2,
            new ItemStack(BaubleItems.combinationRing, 1, 6))
                .setParents("RBRUNEFORGEDRINGOFTHESKY", "RBRUNEFORGEDRINGOFTHEEARTH", "RBTHEORYRINGOFCOMBINATIONS")
                .setPages(pages)
                .registerResearchItem();
        pages = new ResearchPage[] { new ResearchPage("randomboubles_research_page.RBEXOTICTHAUMATURGESRING.1"),
            new ResearchPage((InfusionRecipe) recipeList.get("RBExoticThaumaturgesRing")) };
        researchAspects = new AspectList().add(Aspect.EARTH, 16)
            .add(Aspect.AIR, 16)
            .add(Aspect.FIRE, 16)
            .add(Aspect.WATER, 16)
            .add(Aspect.ORDER, 16)
            .add(Aspect.ENTROPY, 16)
            .add(Aspect.MAGIC, 48)
            .add(Aspect.AURA, 16);
        getResearchItem(
            "RBEXOTICTHAUMATURGESRING",
            "RBRINGS",
            researchAspects,
            -8,
            -3,
            2,
            new ItemStack(BaubleItems.combinationRing, 1, 6)).setParents("RBTHAUMATURGESRING")
                .setPages(pages)
                .registerResearchItem();
        pages = new ResearchPage[] { new ResearchPage("randomboubles_research_page.RBRUNEFORGEDTHAUMATURGESRING.1"),
            new ResearchPage((InfusionRecipe) recipeList.get("RBRuneforgedThaumaturgesRing")) };
        researchAspects = new AspectList().add(Aspect.EARTH, 16)
            .add(Aspect.AIR, 16)
            .add(Aspect.FIRE, 16)
            .add(Aspect.WATER, 16)
            .add(Aspect.ORDER, 16)
            .add(Aspect.ENTROPY, 16)
            .add(Aspect.MAGIC, 64)
            .add(Aspect.AURA, 16);
        getResearchItem(
            "RBRUNEFORGEDTHAUMATURGESRING",
            "RBRINGS",
            researchAspects,
            -8,
            -1,
            2,
            new ItemStack(BaubleItems.combinationRing, 1, 6)).setParents("RBEXOTICTHAUMATURGESRING")
                .setPages(pages)
                .registerResearchItem();
    }

    private static RBResearchItem getResearchItem(String tag, String category, AspectList researchAspects, int xPos,
        int yPos, int complexity, Object icon) {
        RBResearchItem item = null;
        if (icon instanceof ItemStack)
            item = new RBResearchItem(tag, category, researchAspects, xPos, yPos, complexity, (ItemStack) icon);
        if (icon instanceof ResourceLocation)
            item = new RBResearchItem(tag, category, researchAspects, xPos, yPos, complexity, (ResourceLocation) icon);
        return item;
    }
}
