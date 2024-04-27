package net.bluethedude.woodnfungus.world.tree;

import net.bluethedude.woodnfungus.WoodNFungus;
import net.bluethedude.woodnfungus.mixin.TrunkPlacerTypeInvoker;
import net.bluethedude.woodnfungus.world.tree.custom.PalmTrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;

public class ModTrunkPlacerTypes {
    public static final TrunkPlacerType<?> PALM_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("palm_trunk_placer", PalmTrunkPlacer.CODEC);

    public static void register() {
        WoodNFungus.LOGGER.info("Registering Trunk Placer For " + WoodNFungus.MOD_ID);
    }
}
