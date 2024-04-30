package net.bluethedude.woodnfungus.world;

import net.bluethedude.woodnfungus.WoodNFungus;
import net.bluethedude.woodnfungus.block.ModBlocks;
import net.bluethedude.woodnfungus.world.tree.custom.PalmFoliagePlacer;
import net.bluethedude.woodnfungus.world.tree.custom.PalmTreeDecorator;
import net.bluethedude.woodnfungus.world.tree.custom.PalmTrunkPlacer;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.Collections;
import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> PETRIFIED_KEY = registerKey("petrified_log");

    public static final RegistryKey<ConfiguredFeature<?, ?>> PALM_KEY = registerKey("palm");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BOULDERBARK_KEY = registerKey("boulderbark");

    public static final RegistryKey<ConfiguredFeature<?, ?>> HUGE_SAVORSHROOM_KEY = registerKey("huge_savorshroom");



    public static void boostrap(Registerable<ConfiguredFeature<?, ?>> context) {

        register(context, PALM_KEY, Feature.TREE, new TreeFeatureConfig.Builder(

                BlockStateProvider.of(ModBlocks.PALM_LOG),
                new PalmTrunkPlacer(3, 2, 2),

                BlockStateProvider.of(ModBlocks.PALM_LEAVES),
                new PalmFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 1),

                new TwoLayersFeatureSize(1, 0, 2)).decorators(Collections.singletonList(PalmTreeDecorator.INSTANCE)).dirtProvider(BlockStateProvider.of(Blocks.SAND)).build());

        register(context, BOULDERBARK_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.BOULDERBARK_LOG),
                new StraightTrunkPlacer(3, 2, 1),

                BlockStateProvider.of(ModBlocks.BOULDERBARK_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),

                new TwoLayersFeatureSize(1, 2, 0)).dirtProvider(BlockStateProvider.of(Blocks.STONE)).build());
    }
    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(WoodNFungus.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}