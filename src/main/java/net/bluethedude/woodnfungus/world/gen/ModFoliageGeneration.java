package net.bluethedude.woodnfungus.world.gen;

import net.bluethedude.woodnfungus.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class ModFoliageGeneration {
    public static void generateFoliage() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MUSHROOM_FIELDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.SAVORSHROOM_PLACED_KEY);
    }
}
