package com.example.morechoices.villager;

import com.example.morechoices.MoreChoicesMod;
import com.example.morechoices.item.ModItems;
import com.example.morechoices.util.ModTradeOffers;
import com.google.common.collect.ImmutableSet;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.object.builder.v1.villager.VillagerProfessionBuilder;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class ModVillagers {

    public static final PointOfInterestType NETHER_ENVOY_POI = registerPOI("nether_envoy_poi", Blocks.MAGMA_BLOCK);
    public static final PointOfInterestType CARPENTER_POI = registerPOI("carpenter_poi", Blocks.CRAFTING_TABLE);
    public static final PointOfInterestType GARDENER_POI = registerPOI("gardener_poi", Blocks.FLOWER_POT);
    public static final PointOfInterestType END_ENVOY_POI = registerPOI("end_envoy_poi", Blocks.END_ROD);

    public static final VillagerProfession NETHER_ENVOY = registerProfession("nether_envoy",
            RegistryKey.of(Registry.POINT_OF_INTEREST_TYPE.getKey(), new Identifier(MoreChoicesMod.MOD_ID, "nether_envoy_poi")));
    public static final VillagerProfession CARPENTER = registerProfession("carpenter",
            RegistryKey.of(Registry.POINT_OF_INTEREST_TYPE.getKey(), new Identifier(MoreChoicesMod.MOD_ID, "carpenter_poi")));
    public static final VillagerProfession GARDENER = registerProfession("gardener",
            RegistryKey.of(Registry.POINT_OF_INTEREST_TYPE.getKey(), new Identifier(MoreChoicesMod.MOD_ID, "gardener_poi")));
    public static final VillagerProfession END_ENVOY = registerProfession("end_envoy",
            RegistryKey.of(Registry.POINT_OF_INTEREST_TYPE.getKey(), new Identifier(MoreChoicesMod.MOD_ID, "end_envoy_poi")));

    public static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registry.VILLAGER_PROFESSION, new Identifier(MoreChoicesMod.MOD_ID, name),
                VillagerProfessionBuilder.create().id(new Identifier(MoreChoicesMod.MOD_ID, name)).workstation(type)
                        .workSound(SoundEvents.ENTITY_VILLAGER_WORK_MASON).build());
    }

    public static PointOfInterestType registerPOI(String name, Block block) {
        return PointOfInterestHelper.register(new Identifier(MoreChoicesMod.MOD_ID, name), 1, 1, ImmutableSet.copyOf(block.getStateManager().getStates()));
    }

    public static void registerTrades() {
        // CARPENTER
        TradeOfferHelper.registerVillagerOffers(CARPENTER, 1, factories -> {
            factories.add((entity, random) -> new ModTradeOffers.BuyForOneEmeraldFactory(Items.OAK_LOG/*橡木*/, 10, 16, 2).create(entity, random));
            factories.add((entity, random) -> new ModTradeOffers.BuyForOneEmeraldFactory(Items.SPRUCE_LOG/*云杉木*/, 30, 16, 2).create(entity, random));
            factories.add((entity, random) -> new ModTradeOffers.BuyForOneEmeraldFactory(Items.BIRCH_LOG/*白桦木*/, 10, 16, 2).create(entity, random));
            factories.add((entity, random) -> new ModTradeOffers.BuyForOneEmeraldFactory(Items.JUNGLE_LOG/*丛林木*/, 30, 16, 2).create(entity, random));
            factories.add((entity, random) -> new ModTradeOffers.BuyForOneEmeraldFactory(Items.ACACIA_LOG/*金合欢木*/, 10, 16, 2).create(entity, random));
//            factories.add((entity, random) -> new ModTradeOffers.BuyForOneEmeraldFactory(Items.CHERRY_LOG/*樱花木*/, 10, 16, 2).create(entity, random));
            factories.add((entity, random) -> new ModTradeOffers.BuyForOneEmeraldFactory(Items.DARK_OAK_LOG/*深色橡木*/, 30, 16, 2).create(entity, random));
        });
        TradeOfferHelper.registerVillagerOffers(CARPENTER, 2, factories -> {
            factories.add((entity, random) -> new ModTradeOffers.SellItemFactory(new ItemStack(Items.OAK_SAPLING), 4, 1, 12, 5, 0.2f).create(entity, random));
            factories.add((entity, random) -> new ModTradeOffers.SellItemFactory(new ItemStack(Items.BIRCH_SAPLING), 5, 1, 12, 5, 0.2f).create(entity, random));
        });
        TradeOfferHelper.registerVillagerOffers(CARPENTER, 3, factories -> {
            factories.add((entity, random) -> new ModTradeOffers.SellItemFactory(new ItemStack(Items.SPRUCE_SAPLING), 7, 1, 12, 10, 0.2f).create(entity, random));
            factories.add((entity, random) -> new ModTradeOffers.SellItemFactory(new ItemStack(Items.ACACIA_SAPLING), 7, 1, 12, 10, 0.2f).create(entity, random));
        });
        TradeOfferHelper.registerVillagerOffers(CARPENTER, 4, factories -> {
            factories.add((entity, random) -> new ModTradeOffers.SellItemFactory(new ItemStack(Items.JUNGLE_SAPLING), 9, 1, 12, 15, 0.2f).create(entity, random));
            factories.add((entity, random) -> new ModTradeOffers.SellItemFactory(new ItemStack(Items.DARK_OAK_SAPLING), 11, 1, 12, 15, 0.2f).create(entity, random));
//            factories.add((entity, random) -> new ModTradeOffers.SellItemFactory(new ItemStack(Items.CHERRY_SAPLING), 13, 1, 12, 15, 0.2f).create(entity, random));
        });
        TradeOfferHelper.registerVillagerOffers(CARPENTER, 5, factories -> {
            factories.add((entity, random) -> new ModTradeOffers.SellItemFactory(new ItemStack(Items.AZALEA), 15, 1, 12, 20, 0.2f).create(entity, random));
            factories.add((entity, random) -> new ModTradeOffers.SellItemFactory(new ItemStack(Items.FLOWERING_AZALEA), 19, 1, 12, 20, 0.2f).create(entity, random));
            factories.add((entity, random) -> new ModTradeOffers.SellItemFactory(new ItemStack(Items.MANGROVE_PROPAGULE), 19, 1, 12, 20, 0.2f).create(entity, random));
            factories.add((entity, random) -> new ModTradeOffers.SellItemFactory(new ItemStack(Items.NAME_TAG), 1, 1, 12, 20, 0.2f).create(entity, random));
        });

        // NETHER ENVOY
        TradeOfferHelper.registerVillagerOffers(NETHER_ENVOY, 1, factories -> {
            factories.add((entity, random) -> new ModTradeOffers.BuyForOneEmeraldFactory(ModItems.HELLSTONE_INGOT, 4, 16, 2).create(entity, random));
            factories.add((entity, random) -> new ModTradeOffers.BuyForOneEmeraldFactory(Items.GOLD_INGOT, 4, 16, 2).create(entity, random));
        });
        TradeOfferHelper.registerVillagerOffers(NETHER_ENVOY, 2, factories -> {
            factories.add((entity, random) -> new ModTradeOffers.SellItemFactory(new ItemStack(Items.NETHER_BRICK/*下界砖*/), 1, 4, 20, 5, 0.2f).create(entity, random));
            factories.add((entity, random) -> new ModTradeOffers.SellItemFactory(new ItemStack(Blocks.WARPED_NYLIUM/*诡异菌岩*/), 1, 4, 20, 5, 0.2f).create(entity, random));
            factories.add((entity, random) -> new ModTradeOffers.SellItemFactory(new ItemStack(Blocks.CRIMSON_NYLIUM/*绯红菌岩*/), 1, 4, 20, 5, 0.2f).create(entity, random));
        });
        TradeOfferHelper.registerVillagerOffers(NETHER_ENVOY, 3, factories -> {
            factories.add((entity, random) -> new ModTradeOffers.SellItemFactory(new ItemStack(Items.QUARTZ/*石英*/), 1, 2, 20, 10, 0.2f).create(entity, random));
            factories.add((entity, random) -> new ModTradeOffers.SellItemFactory(new ItemStack(Items.GLOWSTONE_DUST/*荧石粉*/), 2, 4, 5, 10, 0.2f).create(entity, random));
        });
        TradeOfferHelper.registerVillagerOffers(NETHER_ENVOY, 4, factories -> {
            factories.add((entity, random) -> new ModTradeOffers.SellItemFactory(new ItemStack(Items.NETHER_WART/*下界疣*/), 2, 1, 16, 15, 0.2f).create(entity, random));
            factories.add((entity, random) -> new ModTradeOffers.SellItemFactory(new ItemStack(Items.BLAZE_ROD/*烈焰棒*/), 2, 4, 5, 15, 0.2f).create(entity, random));
        });
        TradeOfferHelper.registerVillagerOffers(NETHER_ENVOY, 5, factories -> {
            factories.add((entity, random) -> new ModTradeOffers.SellItemFactory(new ItemStack(Blocks.ANCIENT_DEBRIS), 64, 1, 4, 20, 0.2f).create(entity, random));
            factories.add((entity, random) -> new ModTradeOffers.SellItemFactory(new ItemStack(Items.WITHER_SKELETON_SKULL), 64, 1, 1, 20, 0.2f).create(entity, random));
        });

        // GARDENER
        TradeOfferHelper.registerVillagerOffers(GARDENER, 1, factories -> {
            factories.add((entity, random) -> new ModTradeOffers.BuyForOneEmeraldFactory(Items.DANDELION/*蒲公英*/, 4, 16, 2).create(entity, random));
            factories.add((entity, random) -> new ModTradeOffers.BuyForOneEmeraldFactory(Items.POPPY/*虞美人*/, 16, 16, 1).create(entity, random));
        });
        TradeOfferHelper.registerVillagerOffers(GARDENER, 2, factories -> {
            factories.add((entity, random) -> new ModTradeOffers.SellItemFactory(new ItemStack(Items.AZURE_BLUET/*蓝花美耳草*/), 1, 1, 20, 5, 0.2f).create(entity, random));
            factories.add((entity, random) -> new ModTradeOffers.SellItemFactory(new ItemStack(Items.OXEYE_DAISY/*滨菊*/), 1, 1, 20, 5, 0.2f).create(entity, random));
            factories.add((entity, random) -> new ModTradeOffers.SellItemFactory(new ItemStack(Items.CORNFLOWER/*矢车菊*/), 1, 1, 20, 5, 0.2f).create(entity, random));
            factories.add((entity, random) -> new ModTradeOffers.SellItemFactory(new ItemStack(Items.LILY_OF_THE_VALLEY/*铃兰*/), 1, 1, 20, 5, 0.2f).create(entity, random));
        });
        TradeOfferHelper.registerVillagerOffers(GARDENER, 3, factories -> {
            factories.add((entity, random) -> new ModTradeOffers.SellItemFactory(new ItemStack(Items.BLUE_ORCHID/*兰花*/), 2, 1, 16, 10, 0.2f).create(entity, random));
            factories.add((entity, random) -> new ModTradeOffers.SellItemFactory(new ItemStack(Items.ALLIUM/*绒球葱*/), 2, 1, 16, 10, 0.2f).create(entity, random));
            factories.add((entity, random) -> new ModTradeOffers.SellItemFactory(new ItemStack(Items.RED_TULIP/*郁金香*/), 2, 1, 16, 10, 0.2f).create(entity, random));
            factories.add((entity, random) -> new ModTradeOffers.SellItemFactory(new ItemStack(Items.ORANGE_TULIP/*郁金香*/), 2, 1, 16, 10, 0.2f).create(entity, random));
            factories.add((entity, random) -> new ModTradeOffers.SellItemFactory(new ItemStack(Items.WHITE_TULIP/*郁金香*/), 2, 1, 16, 10, 0.2f).create(entity, random));
            factories.add((entity, random) -> new ModTradeOffers.SellItemFactory(new ItemStack(Items.PINK_TULIP/*郁金香*/), 2, 1, 16, 10, 0.2f).create(entity, random));
        });
        TradeOfferHelper.registerVillagerOffers(GARDENER, 4, factories -> {
            factories.add((entity, random) -> new ModTradeOffers.SellItemFactory(new ItemStack(Items.SUNFLOWER/*向日葵*/), 3, 1, 16, 15, 0.2f).create(entity, random));
            factories.add((entity, random) -> new ModTradeOffers.SellItemFactory(new ItemStack(Items.LILAC/*丁香*/), 3, 1, 16, 15, 0.2f).create(entity, random));
            factories.add((entity, random) -> new ModTradeOffers.SellItemFactory(new ItemStack(Items.ROSE_BUSH/*玫瑰丛*/), 3, 1, 16, 15, 0.2f).create(entity, random));
            factories.add((entity, random) -> new ModTradeOffers.SellItemFactory(new ItemStack(Items.PEONY/*牡丹*/), 3, 1, 16, 15, 0.2f).create(entity, random));
        });
        TradeOfferHelper.registerVillagerOffers(GARDENER, 5, factories -> {
            factories.add((entity, random) -> new ModTradeOffers.SellItemFactory(new ItemStack(Blocks.WITHER_ROSE/*凋灵玫瑰*/), 32, 1, 1, 20, 0.2f).create(entity, random));
//            factories.add((entity, random) -> new ModTradeOffers.SellItemFactory(new ItemStack(Items.TORCHFLOWER/*火把花*/), 32, 1, 1, 20, 0.2f).create(entity, random));
//            factories.add((entity, random) -> new ModTradeOffers.SellItemFactory(new ItemStack(Items.PITCHER_PLANT/*瓶子草*/), 32, 1, 1, 20, 0.2f).create(entity, random));
        });

        // END ENVOY
        TradeOfferHelper.registerVillagerOffers(END_ENVOY, 1, factories -> {
            factories.add((entity, random) -> new ModTradeOffers.BuyForOneEmeraldFactory(Items.ENDER_PEARL/*末影珍珠*/, 4, 16, 2).create(entity, random));
            factories.add((entity, random) -> new ModTradeOffers.SellItemFactory(new ItemStack(Items.END_STONE/*末地石*/), 1, 4, 16, 1, 0.05f).create(entity, random));
        });
        TradeOfferHelper.registerVillagerOffers(END_ENVOY, 2, factories -> {
            factories.add((entity, random) -> new ModTradeOffers.SellItemFactory(new ItemStack(Items.CHORUS_FLOWER/*紫颂花*/), 4, 1, 20, 5, 0.2f).create(entity, random));
            factories.add((entity, random) -> new ModTradeOffers.SellItemFactory(new ItemStack(Items.END_ROD/*末地烛*/), 2, 1, 20, 5, 0.2f).create(entity, random));
        });
        TradeOfferHelper.registerVillagerOffers(END_ENVOY, 3, factories -> {
            factories.add((entity, random) -> new ModTradeOffers.SellItemFactory(new ItemStack(Items.DRAGON_BREATH/*龙息*/), 1, 1, 20, 10, 0.2f).create(entity, random));
            factories.add((entity, random) -> new ModTradeOffers.SellItemFactory(new ItemStack(Items.SHULKER_SHELL/*潜影壳*/), 7, 1, 16, 10, 0.2f).create(entity, random));
        });
        TradeOfferHelper.registerVillagerOffers(END_ENVOY, 4, factories -> {
            factories.add((entity, random) -> new ModTradeOffers.SellItemFactory(new ItemStack(Items.DRAGON_HEAD/*龙首*/), 32, 1, 1, 15, 0.2f).create(entity, random));
        });
        TradeOfferHelper.registerVillagerOffers(END_ENVOY, 5, factories -> {
            factories.add((entity, random) -> new ModTradeOffers.SellItemFactory(new ItemStack(Items.DRAGON_EGG/*龙蛋*/), 64, 1, 1, 20, 0.2f).create(entity, random));
            factories.add((entity, random) -> new ModTradeOffers.SellItemFactory(new ItemStack(Items.ELYTRA/*鞘翅*/), 64, 1, 1, 20, 0.2f).create(entity, random));
        });
    }

    public static void init() {

    }
}
