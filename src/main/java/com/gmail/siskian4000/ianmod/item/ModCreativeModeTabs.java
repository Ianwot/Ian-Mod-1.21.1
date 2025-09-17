package com.gmail.siskian4000.ianmod.item;

import com.gmail.siskian4000.ianmod.IanMod;
import com.gmail.siskian4000.ianmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, IanMod.MOD_ID);

    public static final Supplier<CreativeModeTab> GEM_BLOCKS_TAB = CREATIVE_MODE_TAB.register("gem_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ABALONE_BLOCK))
                    .title(Component.translatable("creativetab.ianmod.gem_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.ABALONE_BLOCK);
                        output.accept(ModBlocks.ABALONE_TILES);
                        output.accept(ModBlocks.ABALONE_PEARL_BLOCK);
                    })

                    .build());

    public static final Supplier<CreativeModeTab> POKEMON_BLOCKS_TAB = CREATIVE_MODE_TAB.register("pokemon_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ABOMASITE_BLOCK))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(IanMod.MOD_ID, "gem_blocks_tab"))
                    .title(Component.translatable("creativetab.ianmod.pokemon_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.ABOMASITE_BLOCK);
                        output.accept(ModBlocks.BALM_MUSHROOM);
                    })

                    .build());
    public static final Supplier<CreativeModeTab> ORES_TAB = CREATIVE_MODE_TAB.register("ores_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ABALONE_BLOCK))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(IanMod.MOD_ID, "pokemon_blocks_tab"))
                    .title(Component.translatable("creativetab.ianmod.ores"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.ABOMASITE_ORE);
                        output.accept(ModBlocks.ABALONE_SAND);
                        output.accept(ModBlocks.AMETHYST_ORE);
                    })

                    .build());

    public static final Supplier<CreativeModeTab> GEMBIOTES_TAB = CREATIVE_MODE_TAB.register("gembiotes_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ABALONEGEMBIOTE.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(IanMod.MOD_ID, "ores_tab"))
                    .title(Component.translatable("creativetab.ianmod.gembiotes"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ABALONEGEMBIOTE);
                    })

                    .build());

    public static final Supplier<CreativeModeTab> GEMS_TAB = CREATIVE_MODE_TAB.register("gems_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ABALONEGEM.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(IanMod.MOD_ID, "gembiotes_tab"))
                    .title(Component.translatable("creativetab.ianmod.gems"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ABALONESHELL);
                        output.accept(ModItems.ABALONEGEM);
                        output.accept(ModItems.ABALONEPEARL);
                        output.accept(ModItems.ABALONEPEARLGEM);
                    })

                    .build());

    public static final Supplier<CreativeModeTab> POKEMON_ITEMS_TAB = CREATIVE_MODE_TAB.register("pokemon_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CHERIBERRY.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(IanMod.MOD_ID, "gems_tab"))
                    .title(Component.translatable("creativetab.ianmod.pokemon_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ABOMASITE);
                        output.accept(ModItems.AGUAVBERRY);
                        output.accept(ModItems.APICOTBERRY);
                        output.accept(ModItems.ASPEARBERRY);
                        output.accept(ModItems.BABIRIBERRY);
                        output.accept(ModItems.CHERIBERRY);
                        output.accept(ModItems.CHESTOBERRY);
                        output.accept(ModItems.ANTIDOTE);
                    })

                    .build());

    public static final Supplier<CreativeModeTab> GEM_SHOVELS_TAB = CREATIVE_MODE_TAB.register("gem_shovels_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ABALONESHOVEL.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(IanMod.MOD_ID, "pokemon_items_tab"))
                    .title(Component.translatable("creativetab.ianmod.gem_shovels"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ABALONESHOVEL);
                    })

                    .build());

    public static final Supplier<CreativeModeTab> GEM_SWORDS_TAB = CREATIVE_MODE_TAB.register("gem_swords_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ABALONESWORD.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(IanMod.MOD_ID, "gem_shovels_tab"))
                    .title(Component.translatable("creativetab.ianmod.gem_swords_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ABALONESWORD);
                    })

                    .build());

    public static final Supplier<CreativeModeTab> MOD_MISC_TAB = CREATIVE_MODE_TAB.register("mod_misc_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TENNISBALL.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(IanMod.MOD_ID, "gem_swords_tab"))
                    .title(Component.translatable("creativetab.ianmod.mod_misc"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.PINKDIAMONDESSENCE);
                        output.accept(ModItems.BLUEDIAMONDESSENCE);
                        output.accept(ModItems.YELLOWDIAMONDESSENCE);
                        output.accept(ModItems.WHITEDIAMONDESSENCE);
                        output.accept(ModItems.RUBBERBALL);
                        output.accept(ModItems.TENNISBALL);
                    })

                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
