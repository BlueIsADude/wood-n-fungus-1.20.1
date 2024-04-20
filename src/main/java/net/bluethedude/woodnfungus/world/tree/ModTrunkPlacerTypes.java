package net.bluethedude.woodnfungus.world.tree;

import net.bluethedude.woodnfungus.WoodNFungus;
import net.bluethedude.woodnfungus.mixin.TrunkPlacerTypeInvoker;
import net.bluethedude.woodnfungus.world.tree.custom.TestTrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;

public class ModTrunkPlacerTypes {
    public static final TrunkPlacerType<?> TEST_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("test_trunk_placer", TestTrunkPlacer.CODEC);

    public static void register() {
        WoodNFungus.LOGGER.info("Registering Trunk Placer For " + WoodNFungus.MOD_ID);
    }
}
