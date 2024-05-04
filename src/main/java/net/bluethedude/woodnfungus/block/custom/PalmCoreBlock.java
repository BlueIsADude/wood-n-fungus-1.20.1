package net.bluethedude.woodnfungus.block.custom;

import net.bluethedude.woodnfungus.block.ModBlocks;
import net.minecraft.block.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;

public class PalmCoreBlock extends BuddingAmethystBlock {
    private static final Direction[] DIRECTIONS = Direction.values();

    public PalmCoreBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (random.nextInt(5) == 0) {
            Direction direction = DIRECTIONS[random.nextInt(DIRECTIONS.length)];
            BlockPos blockPos = pos.offset(direction);
            BlockState blockState = world.getBlockState(blockPos);
            Block block = null;
            if (canGrowIn(blockState)) {
                block = ModBlocks.COCONUT;
            }

            if (block != null) {
                BlockState blockState2 = block.getDefaultState().with(CoconutBlock.FACING, direction);
                world.setBlockState(blockPos, blockState2);
            }

        }
    }

    public static boolean canGrowIn(BlockState state) {
        return state.isAir();
    }
}