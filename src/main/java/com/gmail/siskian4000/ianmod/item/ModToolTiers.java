package com.gmail.siskian4000.ianmod.item;

import com.gmail.siskian4000.ianmod.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier ABALONE = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_ABALONE_TOOL,
            33, 2f, 4, 28, () -> Ingredient.of(ModItems.ABALONEGEM));
}
