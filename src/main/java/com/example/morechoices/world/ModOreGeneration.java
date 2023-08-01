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
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;

public class ModOreGeneration {

    public static final RegistryKey<ConfiguredFeature<?, ?>> HELLSTONE_ORE_KEY = registerKey("hellstone_ore");

    public static final ConfiguredFeature<?, ?> RUBY_ORE = register(Feature.ORE.configure(
                    new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_NETHER, ModBlocks.HELLSTONE_ORE.getDefaultState(), 7))
            .range(new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.aboveBottom(20), YOffset.fixed(61))))
            .spreadHorizontally().repeat(6), HELLSTONE_ORE_KEY);

    private static ConfiguredFeature<?, ?> register(ConfiguredFeature<?, ?> configuredFeature,
                                                    RegistryKey<ConfiguredFeature<?, ?>> key) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, key.getValue(), configuredFeature);
    }

    private static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(MoreChoicesMod.MOD_ID, name));
    }

    public static void generateOres() {
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(),
                GenerationStep.Feature.UNDERGROUND_ORES, HELLSTONE_ORE_KEY);
    }
}
