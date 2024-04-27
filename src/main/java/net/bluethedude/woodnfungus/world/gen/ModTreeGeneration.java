package net.bluethedude.woodnfungus.world.gen;

import net.bluethedude.woodnfungus.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class ModTreeGeneration {
    public static void generateTrees() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.STONY_SHORE, BiomeKeys.STONY_PEAKS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.BOULDERBARK_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BEACH),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.PALM_PLACED_KEY);
    }
}
