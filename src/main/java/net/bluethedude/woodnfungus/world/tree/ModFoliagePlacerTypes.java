package net.bluethedude.woodnfungus.world.tree;

import net.bluethedude.woodnfungus.WoodNFungus;
import net.bluethedude.woodnfungus.mixin.FoliagePlacerTypeInvoker;
import net.bluethedude.woodnfungus.world.tree.custom.PalmFoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;

public class ModFoliagePlacerTypes {
    public static final FoliagePlacerType<?> PALM_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("palm_foliage_placer", PalmFoliagePlacer.CODEC);

    public static void register() {
        WoodNFungus.LOGGER.info("Registering Foliage Placer for " + WoodNFungus.MOD_ID);
    }
}
