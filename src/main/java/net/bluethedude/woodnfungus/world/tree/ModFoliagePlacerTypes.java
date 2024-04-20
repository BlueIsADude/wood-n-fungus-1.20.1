package net.bluethedude.woodnfungus.world.tree;

import net.bluethedude.woodnfungus.WoodNFungus;
import net.bluethedude.woodnfungus.mixin.FoliagePlacerTypeInvoker;
import net.bluethedude.woodnfungus.world.tree.custom.TestFoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;

public class ModFoliagePlacerTypes {
    public static final FoliagePlacerType<?> TEST_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("test_foliage_placer", TestFoliagePlacer.CODEC);

    public static void register() {
        WoodNFungus.LOGGER.info("Registering Foliage Placer for " + WoodNFungus.MOD_ID);
    }
}
