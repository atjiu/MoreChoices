package com.tomoya42.morechoices.block;

import com.tomoya42.morechoices.MoreChoicesMod;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block SWEET_POTATOES = Registry.register(Registry.BLOCK, new Identifier(MoreChoicesMod.MOD_ID, "sweet_potatoes"),
            new SweetPotatoesBlock(FabricBlockSettings.copyOf(Blocks.POTATOES)));

    public static void init() {

    }
}
