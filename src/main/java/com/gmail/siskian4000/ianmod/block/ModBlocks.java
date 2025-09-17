package com.gmail.siskian4000.ianmod.block;

import com.gmail.siskian4000.ianmod.IanMod;
import com.gmail.siskian4000.ianmod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(IanMod.MOD_ID);

    public static final DeferredBlock<Block> ABALONE_BLOCK = registerBlock("abalone_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5F).requiresCorrectToolForDrops().sound(SoundType.AMETHYST).mapColor(MapColor.COLOR_CYAN)));

    public static final DeferredBlock<Block> ABALONE_PEARL_BLOCK = registerBlock("abalone_pearl_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5F).requiresCorrectToolForDrops().sound(SoundType.AMETHYST).mapColor(MapColor.COLOR_CYAN)));

    public static final DeferredBlock<Block> ABALONE_TILES = registerBlock("abalone_tiles",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5F).requiresCorrectToolForDrops().sound(SoundType.AMETHYST).mapColor(MapColor.COLOR_CYAN)));

    public static final DeferredBlock<Block> ABOMASITE_BLOCK = registerBlock("abomsite_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(5F).requiresCorrectToolForDrops().sound(SoundType.AMETHYST).mapColor(MapColor.ICE)));

    public static final DeferredBlock<Block> ABOMASITE_ORE = registerBlock("abomasite_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4.5F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE).mapColor(MapColor.DEEPSLATE)));

    public static final DeferredBlock<Block> ABALONE_SAND = registerBlock("abalone_sand",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.5F).requiresCorrectToolForDrops().sound(SoundType.SAND).mapColor(MapColor.SAND)));

    public static final DeferredBlock<Block> AMETHYST_ORE = registerBlock("amethyst_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4.5F).requiresCorrectToolForDrops().sound(SoundType.STONE).mapColor(MapColor.STONE)));

    public static final DeferredBlock<Block> BALM_MUSHROOM = registerBlock("balm_mushroom",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5F).sound(SoundType.GRASS).mapColor(MapColor.COLOR_YELLOW).noCollission().randomTicks().instabreak().pushReaction(PushReaction.DESTROY)));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block){
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;

    };

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
