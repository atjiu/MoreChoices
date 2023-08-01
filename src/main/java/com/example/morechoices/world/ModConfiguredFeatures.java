package com.example.morechoices.world;

import com.example.morechoices.block.ModBlocks;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {

    public static final List<OreFeatureConfig.Target> ORE_HELLSTONES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.BASE_STONE_NETHER, ModBlocks.HELLSTONE_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ORE_HELLSTONE =
            ConfiguredFeatures.register("nether_hellstone_ore", Feature.ORE, new OreFeatureConfig(ORE_HELLSTONES, 10));

    public static void init() {
    }
}
