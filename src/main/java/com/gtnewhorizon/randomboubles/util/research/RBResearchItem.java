package com.gtnewhorizon.randomboubles.util.research;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.research.ResearchCategories;
import thaumcraft.api.research.ResearchItem;

public class RBResearchItem extends ResearchItem {

    public RBResearchItem(String key, String category, AspectList tags, int displayX, int displayY, int complexity,
        ResourceLocation icon) {
        super(key, category, tags, displayX, displayY, complexity, icon);
    }

    public RBResearchItem(String key, String category, AspectList tags, int displayX, int displayY, int complexity,
        ItemStack icon) {
        super(key, category, tags, displayX, displayY, complexity, icon);
    }

    @Override
    public String getName() {
        return StatCollector.translateToLocal("randomboubles_research_name." + key);
    }

    @Override
    public String getText() {
        return StatCollector.translateToLocal("randomboubles_research_text." + key);
    }

    @Override
    public ResearchItem setParents(String... par) {
        for (String p : par) if (ResearchCategories.getResearch(p) == null) {
            System.out.println("Invalid Parent for Item " + this.key + ". Parent " + p + "doesn't exist!");
            return null;
        }

        this.parents = par;
        return this;
    }

    @Override
    public ResearchItem setParentsHidden(String... par) {
        for (String p : par) if (ResearchCategories.getResearch(p) == null) {
            System.out.println("Invalid HiddenParent for Item " + this.key + ". Parent " + p + "doesn't exist!");
            return null;
        }
        this.parentsHidden = par;
        return this;
    }

    public ResearchItem addWarp(int warp) {
        ThaumcraftApi.addWarpToResearch(this.key, warp);
        return this;
    }
}
