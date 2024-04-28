package net.bluethedude.woodnfungus.world.tree;

import net.bluethedude.woodnfungus.WoodNFungus;
import net.bluethedude.woodnfungus.mixin.TreeDecoratorTypeMixin;
import net.bluethedude.woodnfungus.world.tree.custom.PalmTreeDecorator;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;

public class ModTreeDecoratorTypes {
    public static final TreeDecoratorType<?> PALM = TreeDecoratorTypeMixin.callRegister("palm", PalmTreeDecorator.CODEC);

    public static void register() {
        WoodNFungus.LOGGER.info("Registering Tree Decorators For" + WoodNFungus.MOD_ID);
    }
}
