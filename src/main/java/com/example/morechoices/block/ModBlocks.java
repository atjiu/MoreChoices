package com.example.morechoices.block;

import com.example.morechoices.MoreChoicesMod;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public final static Block SWEET_POTATOES = register("sweet_potatoes", new SweetPotatoesBlock(FabricBlockSettings.copyOf(Blocks.POTATOES)));
    public final static Block PEPPERS = register("peppers", new PeppersBlock(FabricBlockSettings.copyOf(Blocks.CARROTS)));
    public final static Block HELLSTONE_ORE = register("hellstone_ore", new OreBlock(AbstractBlock.Settings.of(Material.STONE, MapColor.DARK_RED).requiresTool().strength(3.0F, 3.0F).sounds(BlockSoundGroup.NETHER_GOLD_ORE), UniformIntProvider.create(0, 1)));
    public final static Block HELLSTONE_BLOCK = register("hellstone_block", new Block(AbstractBlock.Settings.of(Material.METAL, MapColor.BRIGHT_RED).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL)));

    public static Block register(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(MoreChoicesMod.MOD_ID, name), block);
    }

    public static void init() {

    }

}
