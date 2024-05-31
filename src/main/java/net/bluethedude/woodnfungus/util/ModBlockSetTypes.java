package net.bluethedude.woodnfungus.util;

import net.minecraft.block.BlockSetType;

public class ModBlockSetTypes {
    public static final BlockSetType PALM = ModBlockSetTypes.register(new BlockSetType("palm"));
    public static final BlockSetType RED_SANDALWOOD = ModBlockSetTypes.register(new BlockSetType("red_sandalwood"));
    public static final BlockSetType BOULDERBARK = ModBlockSetTypes.register(new BlockSetType("boulderbark"));
    public static final BlockSetType SPLITPINE = ModBlockSetTypes.register(new BlockSetType("splitpine"));
    public static final BlockSetType BLUE_MEANIE = ModBlockSetTypes.register(new BlockSetType("blue_meanie"));
    public static final BlockSetType DEVILS_TOOTH = ModBlockSetTypes.register(new BlockSetType("devils_tooth"));
    public static final BlockSetType SAVORSHROOM = ModBlockSetTypes.register(new BlockSetType("savorshroom"));
    public static final BlockSetType WITCHSTOOL = ModBlockSetTypes.register(new BlockSetType("witchstool"));

    private static BlockSetType register(BlockSetType blockSetType) {
        return blockSetType;
    }
}
