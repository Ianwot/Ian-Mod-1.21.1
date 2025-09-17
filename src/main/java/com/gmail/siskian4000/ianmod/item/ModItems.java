package com.gmail.siskian4000.ianmod.item;

import com.gmail.siskian4000.ianmod.IanMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(IanMod.MOD_ID);

    public static final DeferredItem<Item> ABALONEGEMBIOTE = ITEMS.register("abalone_gembiote",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ABALONEGEM = ITEMS.register("abalone_gem",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ABALONEPEARL = ITEMS.register("abalone_pearl",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ABALONEPEARLGEM = ITEMS.register("abalone_pearl_gem",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ABALONESHELL = ITEMS.register("abalone_shell",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ABOMASITE = ITEMS.register("abomasite",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<SwordItem> DIAMONDBATTLEAXE = ITEMS.register("diamond_battleaxe",
            () -> new SwordItem(Tiers.DIAMOND, new Item.Properties().attributes(SwordItem.createAttributes(Tiers.DIAMOND, 6, -3f))));

    public static final DeferredItem<SwordItem> GOLDBATTLEAXE = ITEMS.register("gold_battleaxe",
            () -> new SwordItem(Tiers.GOLD, new Item.Properties().attributes(SwordItem.createAttributes(Tiers.GOLD, 6, -3f))));

    public static final DeferredItem<SwordItem> IRONBATTLEAXE = ITEMS.register("iron_battleaxe",
            () -> new SwordItem(Tiers.IRON, new Item.Properties().attributes(SwordItem.createAttributes(Tiers.IRON, 6, -3f))));

    public static final DeferredItem<SwordItem> NETHERITEBATTLEAXE = ITEMS.register("netherite_battleaxe",
            () -> new SwordItem(Tiers.NETHERITE, new Item.Properties().attributes(SwordItem.createAttributes(Tiers.NETHERITE, 6, -3f))));

    public static final DeferredItem<SwordItem> DIAMONDPIKE = ITEMS.register("diamond_pike",
            () -> new SwordItem(Tiers.DIAMOND, new Item.Properties().attributes(SwordItem.createAttributes(Tiers.DIAMOND, 2, -1f))));

    public static final DeferredItem<SwordItem> GOLDPIKE = ITEMS.register("gold_pike",
            () -> new SwordItem(Tiers.GOLD, new Item.Properties().attributes(SwordItem.createAttributes(Tiers.GOLD, 2, -1f))));

    public static final DeferredItem<SwordItem> IRONPIKE = ITEMS.register("iron_pike",
            () -> new SwordItem(Tiers.IRON, new Item.Properties().attributes(SwordItem.createAttributes(Tiers.IRON, 2, -1f))));

    public static final DeferredItem<SwordItem> NETHERITEPIKE = ITEMS.register("netherite_pike",
            () -> new SwordItem(Tiers.NETHERITE, new Item.Properties().attributes(SwordItem.createAttributes(Tiers.NETHERITE, 2, -1f))));

    public static final DeferredItem<SwordItem> STONEPIKE = ITEMS.register("stone_pike",
            () -> new SwordItem(Tiers.STONE, new Item.Properties().attributes(SwordItem.createAttributes(Tiers.STONE, 2, -1f))));

    public static final DeferredItem<SwordItem> WOODPIKE = ITEMS.register("wood_pike",
            () -> new SwordItem(Tiers.WOOD, new Item.Properties().attributes(SwordItem.createAttributes(Tiers.WOOD, 2, -1f))));

    public static final DeferredItem<Item> AGUAVBERRY = ITEMS.register("aguav_berry",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> APICOTBERRY = ITEMS.register("apicot_berry",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ASPEARBERRY = ITEMS.register("aspear_berry",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> BABIRIBERRY = ITEMS.register("babiri_berry",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> CHERIBERRY = ITEMS.register("cheri_berry",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> CHESTOBERRY = ITEMS.register("chesto_berry",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ANTIDOTE = ITEMS.register("antidote",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<ShovelItem> ABALONESHOVEL = ITEMS.register("abalone_shovel",
            () -> new ShovelItem(ModToolTiers.ABALONE, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.ABALONE, 1.5f, -3f))));

    public static final DeferredItem<SwordItem> ABALONESWORD = ITEMS.register("abalone_sword",
            () -> new SwordItem(ModToolTiers.ABALONE, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.ABALONE, 3, -2.4f))));

    public static final DeferredItem<Item> BLUEDIAMONDESSENCE = ITEMS.register("blue_diamond_essence",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> PINKDIAMONDESSENCE = ITEMS.register("pink_diamond_essence",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> WHITEDIAMONDESSENCE = ITEMS.register("white_diamond_essence",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> YELLOWDIAMONDESSENCE = ITEMS.register("yellow_diamond_essence",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RUBBERBALL = ITEMS.register("rubber_ball",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> TENNISBALL = ITEMS.register("tennis_ball",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
