package net.bluethedude.woodnfungus.world.tree.custom;

import com.mojang.serialization.Codec;
import net.bluethedude.woodnfungus.block.ModBlocks;
import net.bluethedude.woodnfungus.world.tree.ModTreeDecoratorTypes;
import net.minecraft.util.math.Direction;
import net.minecraft.world.gen.treedecorator.TreeDecorator;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;

import java.util.Random;

public class PalmTreeDecorator extends TreeDecorator {
    public static final Codec<PalmTreeDecorator> CODEC = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(PalmTreeDecorator::new, (decorator) -> decorator.probability).codec();
    private final float probability;

    public PalmTreeDecorator(float probability) {
        this.probability = probability;
    }

    protected TreeDecoratorType<?> getType() {
        return ModTreeDecoratorTypes.PALM;
    }

    public void generate(Generator generator) {
        generator.getLogPositions().forEach(pos -> {
            Random random = (Random) generator.getRandom();
            int chance = random.nextInt(2);

            if(!generator.isAir(pos.down()) && chance == 0) {
                generator.replace(pos.offset(Direction.DOWN, 1), ModBlocks.PALM_CORE_LOG.getDefaultState());
            }
        });
    }
}
