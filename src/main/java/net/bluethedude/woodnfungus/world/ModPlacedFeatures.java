package net.bluethedude.woodnfungus.world;

import com.google.common.collect.ImmutableList;
import net.bluethedude.woodnfungus.WoodNFungus;
import net.bluethedude.woodnfungus.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModPlacedFeatures {

    public static final RegistryKey<PlacedFeature> PALM_PLACED_KEY = registerKey("palm_tree_placed");
    public static final RegistryKey<PlacedFeature> BOULDERBARK_PLACED_KEY = registerKey("boulderbark_tree_placed");

    public static final RegistryKey<PlacedFeature> SAVORSHROOM_PLACED_KEY = registerKey("savorshroom_placed");

    public static void boostrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, PALM_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PALM_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(0, 0.2f, 2),
                        ModBlocks.PALM_SAPLING));

        register(context, BOULDERBARK_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.BOULDERBARK_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(0, 0.2f, 1),
                        ModBlocks.BOULDERBARK_SAPLING));

        register(context, SAVORSHROOM_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SMALL_SAVORSHROOM_KEY),
            ModPlacedFeatures.mushroomModifiers(128, null));
    }

    private static List<PlacementModifier> mushroomModifiers(int chance, @Nullable PlacementModifier modifier) {
        ImmutableList.Builder<PlacementModifier> builder = ImmutableList.builder();
        if (modifier != null) {
            builder.add(modifier);
        }

        if (chance != 0) {
            builder.add(RarityFilterPlacementModifier.of(chance));
        }

        builder.add(SquarePlacementModifier.of());
        builder.add(PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP);
        builder.add(BiomePlacementModifier.of());
        return builder.build();
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(WoodNFungus.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
