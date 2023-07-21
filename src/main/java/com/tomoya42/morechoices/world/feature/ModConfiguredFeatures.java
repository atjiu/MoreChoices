package com.tomoya42.morechoices.world.feature;

import com.tomoya42.morechoices.block.ModBlocks;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {

    public static final List<OreFeatureConfig.Target> NETHER_HELLSTONE_ORES =
            List.of(OreFeatureConfig.createTarget(OreConfiguredFeatures.BASE_STONE_NETHER, ModBlocks.HELLSTONE_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ORE_NETHER_HELLSTONE =
            ConfiguredFeatures.register("ore_nether_hellstone", Feature.ORE, new OreFeatureConfig(NETHER_HELLSTONE_ORES, 6));

    public static void init() {

    }
}
