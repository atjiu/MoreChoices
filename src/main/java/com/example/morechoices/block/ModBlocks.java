package com.example.morechoices.block;

import com.example.morechoices.MoreChoicesMod;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public final static Block SWEET_POTATOES = register("sweet_potatoes", new SweetPotatoesBlock(FabricBlockSettings.copyOf(Blocks.POTATOES)));
    public final static Block PEPPERS = register("peppers", new SweetPotatoesBlock(FabricBlockSettings.copyOf(Blocks.CARROTS)));
    public final static Block HELLSTONE_ORE = register("hellstone_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.NETHER_GOLD_ORE), UniformIntProvider.create(0, 1)));
    public final static Block HELLSTONE_BLOCK = register("hellstone_block", new Block(AbstractBlock.Settings.create().mapColor(MapColor.BRIGHT_RED).instrument(Instrument.BELL).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL)));

    public static Block register(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(MoreChoicesMod.MOD_ID, name), block);
    }

    public static void init() {

    }

}
