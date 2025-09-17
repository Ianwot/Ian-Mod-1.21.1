package com.gmail.siskian4000.ianmod.util;

import com.gmail.siskian4000.ianmod.IanMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_ABALONE_TOOL = createTag("needs_abalone_tool");
        public static final TagKey<Block> INCORRECT_FOR_ABALONE_TOOL = createTag("incorrect_for_abalone_tool");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(IanMod.MOD_ID, name));
        }
    }
}
