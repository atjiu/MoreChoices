package com.tomoya42.morechoices;

import com.tomoya42.morechoices.block.ModBlocks;
import com.tomoya42.morechoices.item.ModItems;
import com.tomoya42.morechoices.util.ModLootTableModifiers;
import com.tomoya42.morechoices.util.ModRegistries;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreChoicesMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("morechoices");

    public static final String MOD_ID = "morechoices";

    @Override
    public void onInitialize() {
        LOGGER.info("Hello Fabric world!");

        ModItems.init();
        ModBlocks.init();

        ModLootTableModifiers.modifyLootTables();
        ModRegistries.registerCustomTraders();

    }
}