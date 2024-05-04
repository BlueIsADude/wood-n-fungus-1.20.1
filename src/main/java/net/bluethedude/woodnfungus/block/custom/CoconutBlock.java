package net.bluethedude.woodnfungus.block.custom;

import net.bluethedude.woodnfungus.block.ModBlocks;
import net.minecraft.block.*;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

public class CoconutBlock extends HorizontalFacingBlock {

    private static final VoxelShape EAST_SHAPE = Block.createCuboidShape(4, 2, 8, 12, 10, 16);
    private static final VoxelShape WEST_SHAPE = Block.createCuboidShape(4, 2, 8, 12, 10, 16);
    private static final VoxelShape NORTH_SHAPE = Block.createCuboidShape(4, 2, 8, 12, 10, 16);
    private static final VoxelShape SOUTH_SHAPE = Block.createCuboidShape(4, 2, 8, 12, 10, 15);

    public CoconutBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH));
    }

    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockState blockState = world.getBlockState(pos.offset(state.get(FACING)));
        return blockState.isOf(ModBlocks.PALM_CORE);
    }

    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        return direction == state.get(FACING) && !state.canPlaceAt(world, pos) ? Blocks.AIR.getDefaultState() : super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext ePos) {
        return switch (state.get(FACING)) {
            case SOUTH -> SOUTH_SHAPE;
            default -> NORTH_SHAPE;
            case WEST -> WEST_SHAPE;
            case EAST -> EAST_SHAPE;
        };
    }
}