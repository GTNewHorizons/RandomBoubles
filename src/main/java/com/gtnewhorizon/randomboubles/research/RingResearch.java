package com.gtnewhorizon.randomboubles.research;

import java.util.HashMap;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import com.gtnewhorizon.randomboubles.BaubleItems;
import com.gtnewhorizon.randomboubles.RandomBoubles;
import com.gtnewhorizon.randomboubles.util.research.RBResearchItem;

import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.ShapedArcaneRecipe;
import thaumcraft.api.research.ResearchCategories;
import thaumcraft.api.research.ResearchPage;
import thaumcraft.common.config.ConfigItems;

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
        researchAspects = new AspectList().add(Aspect.AIR, 4)
            .add(Aspect.MAGIC, 8);
        getResearchItem(
            "RBAPPRENTICERINGOFAER",
            "RBRINGS",
            researchAspects,
            -4,
            -6,
            0,
            new ItemStack(ConfigItems.itemBaubleBlanks, 1, 3)).setRound()
                .setHidden()
                .setItemTriggers(new ItemStack[] { new ItemStack(ConfigItems.itemBaubleBlanks, 1, 3) })
                .setPages(pages)
                .registerResearchItem();
        // Apprentice Ring of Terra
        pages = new ResearchPage[] { new ResearchPage("randomboubles_research_page.RBAPPRENTICERINGOFTERRA.1") };
        researchAspects = new AspectList().add(Aspect.EARTH, 4)
            .add(Aspect.MAGIC, 8);
        getResearchItem(
            "RBAPPRENTICERINGOFTERRA",
            "RBRINGS",
            researchAspects,
            4,
            -6,
            0,
            new ItemStack(ConfigItems.itemBaubleBlanks, 1, 4)).setRound()
                .setHidden()
                .setItemTriggers(new ItemStack[] { new ItemStack(ConfigItems.itemBaubleBlanks, 1, 4) })
                .setPages(pages)
                .registerResearchItem();
        // Apprentice Ring of Ignis
        pages = new ResearchPage[] { new ResearchPage("randomboubles_research_page.RBAPPRENTICERINGOFIGNIS.1") };
        researchAspects = new AspectList().add(Aspect.FIRE, 4)
            .add(Aspect.MAGIC, 8);
        getResearchItem(
            "RBAPPRENTICERINGOFIGNIS",
            "RBRINGS",
            researchAspects,
            4,
            2,
            0,
            new ItemStack(ConfigItems.itemBaubleBlanks, 1, 5)).setRound()
                .setHidden()
                .setItemTriggers(new ItemStack[] { new ItemStack(ConfigItems.itemBaubleBlanks, 1, 5) })
                .setPages(pages)
                .registerResearchItem();
        // Apprentice Ring of Aqua
        researchAspects = new AspectList().add(Aspect.WATER, 4)
            .add(Aspect.MAGIC, 8);
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
                .setItemTriggers(new ItemStack[] { new ItemStack(ConfigItems.itemBaubleBlanks, 1, 6) })
                .setPages(pages)
                .registerResearchItem();
        // Apprentice Ring of Ordo
        pages = new ResearchPage[] { new ResearchPage("randomboubles_research_page.RBAPPRENTICERINGOFORDO.1") };
        researchAspects = new AspectList().add(Aspect.ORDER, 4)
            .add(Aspect.MAGIC, 8);
        getResearchItem(
            "RBAPPRENTICERINGOFORDO",
            "RBRINGS",
            researchAspects,
            0,
            -7,
            0,
            new ItemStack(ConfigItems.itemBaubleBlanks, 1, 7)).setRound()
                .setHidden()
                .setItemTriggers(new ItemStack[] { new ItemStack(ConfigItems.itemBaubleBlanks, 1, 7) })
                .setPages(pages)
                .registerResearchItem();
        // Apprentice Ring of Perditio
        pages = new ResearchPage[] { new ResearchPage("randomboubles_research_page.RBAPPRENTICERINGOFPERDITIO.1") };
        researchAspects = new AspectList().add(Aspect.ENTROPY, 4)
            .add(Aspect.MAGIC, 8);
        getResearchItem(
            "RBAPPRENTICERINGOFPERDITIO",
            "RBRINGS",
            researchAspects,
            0,
            3,
            0,
            new ItemStack(ConfigItems.itemBaubleBlanks, 1, 8)).setRound()
                .setHidden()
                .setItemTriggers(new ItemStack[] { new ItemStack(ConfigItems.itemBaubleBlanks, 1, 8) })
                .setPages(pages)
                .registerResearchItem();

        // Magician's Ring of Aer
        pages = new ResearchPage[] { new ResearchPage("randomboubles_research_page.RBMAGICIANSRINGOFAER.1"),
            new ResearchPage((ShapedArcaneRecipe) recipeList.get("RBMagiciansRingOfAer")), };
        researchAspects = new AspectList().add(Aspect.AIR, 8)
            .add(Aspect.MAGIC, 16)
            .add(Aspect.AURA, 16);
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
            new ResearchPage((ShapedArcaneRecipe) recipeList.get("RBMagiciansRingOfTerra")), };
        researchAspects = new AspectList().add(Aspect.EARTH, 8)
            .add(Aspect.MAGIC, 16)
            .add(Aspect.AURA, 16);
        getResearchItem(
            "RBMAGICIANSRINGOFTERRA",
            "RBRINGS",
            researchAspects,
            3,
            -5,
            0,
            new ItemStack(BaubleItems.terraRing, 1, 0)).setPages(pages)
            .setParents("RBAPPRENTICERINGOFAER")
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
