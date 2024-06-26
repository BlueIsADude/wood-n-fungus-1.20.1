package net.bluethedude.woodnfungus.block.custom;

import net.bluethedude.woodnfungus.util.ModTags;
import net.minecraft.block.BlockState;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class PalmSaplingBlock extends SaplingBlock {

    public PalmSaplingBlock(SaplingGenerator generator, Settings settings) {
        super (generator, settings);
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isIn(ModTags.Blocks.PALM_PLANTABLE);
    }
}
