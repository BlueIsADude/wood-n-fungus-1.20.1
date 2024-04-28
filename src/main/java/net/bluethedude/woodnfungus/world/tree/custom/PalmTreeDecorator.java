package net.bluethedude.woodnfungus.world.tree.custom;

import com.mojang.serialization.Codec;
import net.bluethedude.woodnfungus.WoodNFungus;
import net.bluethedude.woodnfungus.block.ModBlocks;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.treedecorator.TreeDecorator;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;

public class PalmTreeDecorator extends TreeDecorator {
    public static final PalmTreeDecorator INSTANCE = new PalmTreeDecorator();
    public static final Codec<PalmTreeDecorator> CODEC = Codec.unit(() -> INSTANCE);
    private PalmTreeDecorator() {}
    @Override
    protected TreeDecoratorType<?> getType() {
        return WoodNFungus.PALM;
    }
    @Override
    public void generate(Generator generator) {
        generator.getLogPositions().forEach(pos -> {
            Random random = generator.getRandom();
            int chance = random.nextInt(2);

            if(!generator.isAir(pos.up()) && chance == 0) {
                generator.replace(pos.offset(Direction.UP, 1), ModBlocks.PALM_CORE_LOG.getDefaultState());
            }
        });
    }
}