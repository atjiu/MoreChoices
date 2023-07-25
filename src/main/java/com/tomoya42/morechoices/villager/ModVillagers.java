package com.tomoya42.morechoices.villager;

import com.google.common.collect.ImmutableSet;
import com.tomoya42.morechoices.MoreChoicesMod;
import com.tomoya42.morechoices.item.ModItems;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.object.builder.v1.villager.VillagerProfessionBuilder;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.village.TradeOffers;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class ModVillagers {

    public static final PointOfInterestType NETHER_ENVOY_POI = registerPOI("nether_envoy_poi", Blocks.CRYING_OBSIDIAN);
    public static final PointOfInterestType CARPENTER_POI = registerPOI("carpenter_poi", Blocks.CRAFTING_TABLE);

    public static final VillagerProfession NETHER_ENVOY = registerProfession("nether_envoy",
            RegistryKey.of(Registries.POINT_OF_INTEREST_TYPE.getKey(), new Identifier(MoreChoicesMod.MOD_ID, "nether_envoy_poi")));
    public static final VillagerProfession CARPENTER = registerProfession("carpenter",
            RegistryKey.of(Registries.POINT_OF_INTEREST_TYPE.getKey(), new Identifier(MoreChoicesMod.MOD_ID, "carpenter_poi")));

    public static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registries.VILLAGER_PROFESSION, new Identifier(MoreChoicesMod.MOD_ID, name),
                VillagerProfessionBuilder.create().id(new Identifier(MoreChoicesMod.MOD_ID, name)).workstation(type)
                        .workSound(SoundEvents.ENTITY_VILLAGER_WORK_MASON).build());
    }

    public static PointOfInterestType registerPOI(String name, Block block) {
        return PointOfInterestHelper.register(new Identifier(MoreChoicesMod.MOD_ID, name), 1, 1, ImmutableSet.copyOf(block.getStateManager().getStates()));
    }

    public static void registerTrades() {
        // CARPENTER
        TradeOfferHelper.registerVillagerOffers(CARPENTER, 1, factories -> {
            factories.add((entity, random) -> new TradeOffers.BuyForOneEmeraldFactory(Items.OAK_LOG/*橡木*/, 10, 16, 2).create(entity, random));
            factories.add((entity, random) -> new TradeOffers.BuyForOneEmeraldFactory(Items.SPRUCE_LOG/*云杉木*/, 30, 16, 2).create(entity, random));
            factories.add((entity, random) -> new TradeOffers.BuyForOneEmeraldFactory(Items.BIRCH_LOG/*白桦木*/, 10, 16, 2).create(entity, random));
            factories.add((entity, random) -> new TradeOffers.BuyForOneEmeraldFactory(Items.JUNGLE_LOG/*丛林木*/, 30, 16, 2).create(entity, random));
            factories.add((entity, random) -> new TradeOffers.BuyForOneEmeraldFactory(Items.ACACIA_LOG/*金合欢木*/, 10, 16, 2).create(entity, random));
            factories.add((entity, random) -> new TradeOffers.BuyForOneEmeraldFactory(Items.CHERRY_LOG/*樱花木*/, 10, 16, 2).create(entity, random));
            factories.add((entity, random) -> new TradeOffers.BuyForOneEmeraldFactory(Items.DARK_OAK_LOG/*深色橡木*/, 30, 16, 2).create(entity, random));
        });
        TradeOfferHelper.registerVillagerOffers(CARPENTER, 2, factories -> {
            factories.add((entity, random) -> new TradeOffers.SellItemFactory(new ItemStack(Items.OAK_SAPLING), 4, 1, 12, 5, 0.05f).create(entity, random));
            factories.add((entity, random) -> new TradeOffers.SellItemFactory(new ItemStack(Items.BIRCH_SAPLING), 5, 1, 12, 2, 0.05f).create(entity, random));
        });
        TradeOfferHelper.registerVillagerOffers(CARPENTER, 3, factories -> {
            factories.add((entity, random) -> new TradeOffers.SellItemFactory(new ItemStack(Items.SPRUCE_SAPLING), 7, 1, 12, 2, 0.05f).create(entity, random));
            factories.add((entity, random) -> new TradeOffers.SellItemFactory(new ItemStack(Items.ACACIA_SAPLING), 7, 1, 12, 5, 0.05f).create(entity, random));
        });
        TradeOfferHelper.registerVillagerOffers(CARPENTER, 4, factories -> {
            factories.add((entity, random) -> new TradeOffers.SellItemFactory(new ItemStack(Items.JUNGLE_SAPLING), 9, 1, 12, 2, 0.05f).create(entity, random));
            factories.add((entity, random) -> new TradeOffers.SellItemFactory(new ItemStack(Items.DARK_OAK_SAPLING), 11, 1, 12, 2, 0.05f).create(entity, random));
            factories.add((entity, random) -> new TradeOffers.SellItemFactory(new ItemStack(Items.CHERRY_SAPLING), 13, 1, 12, 5, 0.05f).create(entity, random));
        });
        TradeOfferHelper.registerVillagerOffers(CARPENTER, 5, factories -> {
            factories.add((entity, random) -> new TradeOffers.SellItemFactory(new ItemStack(Items.AZALEA), 15, 1, 12, 10, 0.05f).create(entity, random));
            factories.add((entity, random) -> new TradeOffers.SellItemFactory(new ItemStack(Items.FLOWERING_AZALEA), 19, 1, 12, 10, 0.05f).create(entity, random));
            factories.add((entity, random) -> new TradeOffers.SellItemFactory(new ItemStack(Items.MANGROVE_PROPAGULE), 19, 1, 12, 10, 0.05f).create(entity, random));
        });

        // NETHER ENVOY
        TradeOfferHelper.registerVillagerOffers(NETHER_ENVOY, 1, factories -> {
            factories.add((entity, random) -> new TradeOffers.BuyForOneEmeraldFactory(ModItems.HELLSTONE_INGOT, 4, 16, 2).create(entity, random));
            factories.add((entity, random) -> new TradeOffers.BuyForOneEmeraldFactory(Items.GOLD_INGOT, 4, 16, 2).create(entity, random));
        });
        TradeOfferHelper.registerVillagerOffers(NETHER_ENVOY, 2, factories -> {
            factories.add((entity, random) -> new TradeOffers.SellItemFactory(new ItemStack(Items.NETHER_BRICK/*下界砖*/), 1, 4, 20, 2, 0.05f).create(entity, random));
            factories.add((entity, random) -> new TradeOffers.SellItemFactory(new ItemStack(Blocks.WARPED_NYLIUM/*诡异菌岩*/), 1, 4, 20, 2, 0.05f).create(entity, random));
            factories.add((entity, random) -> new TradeOffers.SellItemFactory(new ItemStack(Blocks.CRIMSON_NYLIUM/*绯红菌岩*/), 1, 4, 20, 2, 0.05f).create(entity, random));
        });
        TradeOfferHelper.registerVillagerOffers(NETHER_ENVOY, 3, factories -> {
            factories.add((entity, random) -> new TradeOffers.SellItemFactory(new ItemStack(Items.QUARTZ/*石英*/), 1, 2, 20, 5, 0.05f).create(entity, random));
            factories.add((entity, random) -> new TradeOffers.SellItemFactory(new ItemStack(Items.GLOWSTONE_DUST/*荧石粉*/), 2, 4, 5, 2, 0.05f).create(entity, random));
        });
        TradeOfferHelper.registerVillagerOffers(NETHER_ENVOY, 4, factories -> {
            factories.add((entity, random) -> new TradeOffers.SellItemFactory(new ItemStack(Items.NETHER_WART/*下界疣*/), 2, 1, 16, 5, 0.05f).create(entity, random));
            factories.add((entity, random) -> new TradeOffers.SellItemFactory(new ItemStack(Items.BLAZE_ROD/*烈焰棒*/), 2, 4, 5, 5, 0.05f).create(entity, random));
        });
        TradeOfferHelper.registerVillagerOffers(NETHER_ENVOY, 5, factories -> {
            factories.add((entity, random) -> new TradeOffers.SellItemFactory(new ItemStack(Blocks.ANCIENT_DEBRIS), 64, 1, 4, 15, 0.05f).create(entity, random));
            factories.add((entity, random) -> new TradeOffers.SellItemFactory(new ItemStack(Items.WITHER_SKELETON_SKULL), 64, 1, 1, 15, 0.05f).create(entity, random));
        });
    }

    public static void init() {

    }
}
