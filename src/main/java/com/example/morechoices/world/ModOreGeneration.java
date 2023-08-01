package com.example.morechoices.world;

import com.example.morechoices.MoreChoicesMod;
import com.example.morechoices.block.ModBlocks;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.CountPlacementModifier;
import net.minecraft.world.gen.decorator.HeightRangePlacementModifier;
import net.minecraft.world.gen.decorator.SquarePlacementModifier;
import net.minecraft.world.gen.feature.*;

import java.util.Arrays;

public class ModOreGeneration {

    private final static ConfiguredFeature<?, ?> NETHER_HELLSTONE_ORE_CONFIGURED_FEATURE = new ConfiguredFeature<>
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.HELLSTONE_ORE.getDefaultState(),
                    7)); // 矿脉大小

    public static PlacedFeature NETHER_HELLSTONE_ORE_PLACED_FEATURE = new PlacedFeature(
            () -> NETHER_HELLSTONE_ORE_CONFIGURED_FEATURE,
            Arrays.asList(
                    CountPlacementModifier.of(7), // 每个区块的矿脉数量
                    SquarePlacementModifier.of(), // 水平传播
                    HeightRangePlacementModifier.uniform(YOffset.fixed(20), YOffset.fixed(61))
            )); // 高度

    public static void generateOres() {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(MoreChoicesMod.MOD_ID, "nether_hellstone_ore"), NETHER_HELLSTONE_ORE_CONFIGURED_FEATURE);

        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(MoreChoicesMod.MOD_ID, "nether_hellstone_ore"),
                NETHER_HELLSTONE_ORE_PLACED_FEATURE);

        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier(MoreChoicesMod.MOD_ID, "ore_hellstone_nether")));
    }
}
