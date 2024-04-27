package net.bluethedude.woodnfungus.world.tree.custom;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.bluethedude.woodnfungus.world.tree.ModFoliagePlacerTypes;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;

public class PalmFoliagePlacer extends FoliagePlacer {
    public static final Codec<PalmFoliagePlacer> CODEC = RecordCodecBuilder.create(testFoliagePlacerInstance ->
            fillFoliagePlacerFields(testFoliagePlacerInstance).and(Codec.intRange(0, 12).fieldOf("height")
                    .forGetter(instance -> instance.height)).apply(testFoliagePlacerInstance, PalmFoliagePlacer::new));

    private int height;

    public PalmFoliagePlacer(IntProvider radius, IntProvider offset, int height) {
        super(radius, offset);
    }

    @Override
    protected FoliagePlacerType<?> getType() {
        return ModFoliagePlacerTypes.PALM_FOLIAGE_PLACER;
    }

    @Override
    protected void generate(TestableWorld world, BlockPlacer placer, Random random, TreeFeatureConfig config, int trunkHeight,
                            TreeNode treeNode, int foliageHeight, int radius, int offset) {

        generateSquare(world, placer, random, config, treeNode.getCenter().up(0), 1, -1, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().up(0), 0, 0, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().north(1), 0, 0, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().north(2), 0, -1, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().north(3), 0, -1, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().south(1), 0, 0, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().south(2), 0, -1, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().south(3), 0, -1, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().east(1), 0, 0, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().east(2), 0, -1, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().east(3), 0, -1, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().west(1), 0, 0, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().west(2), 0, -1, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().west(3), 0, -1, treeNode.isGiantTrunk());

    }

    @Override
    public int getRandomHeight(Random random, int trunkHeight, TreeFeatureConfig config) {
        return this.height;
    }

    @Override
    protected boolean isInvalidForLeaves(Random random, int dx, int y, int dz, int radius, boolean giantTrunk) {
        return false;
    }
}
