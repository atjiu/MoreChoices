package com.example.morechoices.util;

import com.example.morechoices.item.ModItems;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffers;
import net.minecraft.village.VillagerProfession;

public class ModRegistries {

    public static void registerCustomTraders() {
        // farmer villager
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1, factories -> {
            factories.add((entity, random) -> new TradeOffers.BuyForOneEmeraldFactory(ModItems.SWEET_POTATO, 24, 16, 2).create(entity, random));
            factories.add((entity, random) -> new TradeOffers.SellItemFactory(new ItemStack(Items.BONE_MEAL), 1, 2, 12, 1, 0.05f).create(entity, random));
        });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 5, factories -> {
            factories.add((entity, random) -> new TradeOffers.SellItemFactory(new ItemStack(Items.GOLDEN_APPLE), 7, 1, 12, 20, 0.2f).create(entity, random));
        });

        // armorer villager
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 1, factories -> {
            factories.add((entity, random) -> new TradeOffers.SellItemFactory(new ItemStack(ModItems.COPPER_HELMET), 5, 1, 12, 1, 0.2f).create(entity, random));
            factories.add((entity, random) -> new TradeOffers.SellItemFactory(new ItemStack(ModItems.COPPER_CHESTPLATE), 9, 1, 12, 1, 0.2f).create(entity, random));
            factories.add((entity, random) -> new TradeOffers.SellItemFactory(new ItemStack(ModItems.COPPER_LEGGINGS), 7, 1, 12, 1, 0.2f).create(entity, random));
            factories.add((entity, random) -> new TradeOffers.SellItemFactory(new ItemStack(ModItems.COPPER_BOOTS), 4, 1, 12, 1, 0.2f).create(entity, random));
        });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 2, factories -> {
            factories.add((entity, random) -> new TradeOffers.BuyForOneEmeraldFactory(Items.COPPER_INGOT, 4, 12, 10).create(entity, random));
            factories.add((entity, random) -> new TradeOffers.SellItemFactory(new ItemStack(ModItems.HELLSTONE_LEGGINGS), 9, 1, 12, 5, 0.2f).create(entity, random));
            factories.add((entity, random) -> new TradeOffers.SellItemFactory(new ItemStack(ModItems.HELLSTONE_BOOTS), 6, 1, 12, 5, 0.2f).create(entity, random));
        });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 3, factories -> {
            factories.add((entity, random) -> new TradeOffers.SellItemFactory(new ItemStack(ModItems.HELLSTONE_HELMET), 7, 1, 12, 10, 0.2f).create(entity, random));
            factories.add((entity, random) -> new TradeOffers.SellItemFactory(new ItemStack(ModItems.HELLSTONE_CHESTPLATE), 11, 1, 12, 10, 0.2f).create(entity, random));
        });

        // toolsmith villager
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 2, factories -> {
            factories.add((entity, random) -> new TradeOffers.BuyForOneEmeraldFactory(Items.COPPER_INGOT, 4, 12, 10).create(entity, random));
        });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 3, factories -> {
            factories.add((entity, random) -> new TradeOffers.SellEnchantedToolFactory(ModItems.COPPER_AXE, 1, 12, 10, 0.2f).create(entity, random));
            factories.add((entity, random) -> new TradeOffers.SellEnchantedToolFactory(ModItems.COPPER_SHOVEL, 2, 12, 10, 0.2f).create(entity, random));
            factories.add((entity, random) -> new TradeOffers.SellEnchantedToolFactory(ModItems.COPPER_PICKAXE, 3, 12, 10, 0.2f).create(entity, random));
        });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 4, factories -> {
            factories.add((entity, random) -> new TradeOffers.SellEnchantedToolFactory(ModItems.HELLSTONE_HOE, 2, 12, 15, 0.2f).create(entity, random));
            factories.add((entity, random) -> new TradeOffers.SellEnchantedToolFactory(ModItems.HELLSTONE_AXE, 2, 12, 15, 0.2f).create(entity, random));
            factories.add((entity, random) -> new TradeOffers.SellEnchantedToolFactory(ModItems.HELLSTONE_SHOVEL, 3, 12, 15, 0.2f).create(entity, random));
            factories.add((entity, random) -> new TradeOffers.SellEnchantedToolFactory(ModItems.HELLSTONE_PICKAXE, 4, 12, 15, 0.2f).create(entity, random));
        });

        // weaponsmith villager
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 1, factories -> {
            factories.add((entity, random) -> new TradeOffers.SellItemFactory(new ItemStack(ModItems.COPPER_AXE), 3, 1, 12, 1, 0.2f).create(entity, random));
            factories.add((entity, random) -> new TradeOffers.SellEnchantedToolFactory(ModItems.COPPER_SWORD, 2, 12, 1).create(entity, random));
        });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 2, factories -> {
            factories.add((entity, random) -> new TradeOffers.BuyForOneEmeraldFactory(Items.COPPER_INGOT, 4, 12, 10).create(entity, random));
            factories.add((entity, random) -> new TradeOffers.SellItemFactory(new ItemStack(ModItems.HELLSTONE_AXE), 4, 1, 12, 5, 0.2f).create(entity, random));
            factories.add((entity, random) -> new TradeOffers.SellEnchantedToolFactory(ModItems.HELLSTONE_SWORD, 4, 12, 5).create(entity, random));
        });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 3, factories -> {
            factories.add((entity, random) -> new TradeOffers.SellEnchantedToolFactory(ModItems.AMETHYST_SWORD, 5, 12, 10).create(entity, random));
        });

        // cleric villager
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CLERIC, 1, factories -> {
            factories.add((entity, random) -> new TradeOffers.SellItemFactory(new ItemStack(Items.GUNPOWDER), 1, 2, 12, 1, 0.05f).create(entity, random));
        });

        // fisherman villager
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FISHERMAN, 5, factories -> {
            factories.add((entity, random) -> new TradeOffers.SellItemFactory(new ItemStack(Items.NAUTILUS_SHELL), 5, 1, 12, 15, 0.05f).create(entity, random));
        });
    }
}
