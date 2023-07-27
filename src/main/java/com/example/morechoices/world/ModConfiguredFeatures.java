package com.example.morechoices.world;

import com.example.morechoices.MoreChoicesMod;
import com.example.morechoices.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_HELLSTONE_KEY = registerKey("ore_hellstone");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> featureRegisterable) {
        RuleTest ruleTest5 = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);

        List<OreFeatureConfig.Target> netherOres =
                List.of(OreFeatureConfig.createTarget(ruleTest5, ModBlocks.HELLSTONE_ORE.getDefaultState()));

        register(featureRegisterable, ORE_HELLSTONE_KEY, Feature.ORE, new OreFeatureConfig(netherOres, 10));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(MoreChoicesMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context, RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
