package com.example.morechoices;

import com.example.morechoices.block.ModBlockTags;
import com.example.morechoices.block.ModBlocks;
import com.example.morechoices.item.ModItemGroup;
import com.example.morechoices.item.ModItems;
import com.example.morechoices.util.ModLootTableModifiers;
import com.example.morechoices.util.ModRegistries;
import com.example.morechoices.villager.ModVillagers;
import com.example.morechoices.world.ModConfiguredFeatures;
import com.example.morechoices.world.gen.ModOreGeneration;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreChoicesMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("morechoices");

    public static final String MOD_ID = "morechoices";

    @Override
    public void onInitialize() {
        LOGGER.info("Hello Fabric world!");

        ModConfiguredFeatures.init();
        ModOreGeneration.generateOres();

        ModItems.init();
        ModBlocks.init();
        ModBlockTags.init();
        ModItemGroup.init();
        ModVillagers.init();
        ModVillagers.registerTrades();

        ModLootTableModifiers.modifyLootTables();
        ModRegistries.registerCustomTraders();

    }
}