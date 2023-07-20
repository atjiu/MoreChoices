package com.tomoya42.morechoices.block;

import com.tomoya42.morechoices.MoreChoicesMod;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block SWEET_POTATOES = Registry.register(Registry.BLOCK, new Identifier(MoreChoicesMod.MOD_ID, "sweet_potatoes"),
            new SweetPotatoesBlock(FabricBlockSettings.copyOf(Blocks.POTATOES)));
    public static final Block HELLSTONE_ORE = Registry.register(Registry.BLOCK, new Identifier(MoreChoicesMod.MOD_ID, "hellstone_ore"),
            new OreBlock(AbstractBlock.Settings.of(Material.STONE, MapColor.DARK_RED).requiresTool().strength(3.0f, 3.0f).sounds(BlockSoundGroup.NETHER_GOLD_ORE), UniformIntProvider.create(0, 1)));

    public static void init() {

    }
}
