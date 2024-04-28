package net.bluethedude.woodnfungus.util;

import net.minecraft.block.BlockSetType;

public class ModBlockSetTypes {
    public static final BlockSetType PALM = ModBlockSetTypes.register(new BlockSetType("palm"));
    public static final BlockSetType BOULDERBARK = ModBlockSetTypes.register(new BlockSetType("boulderbark"));
    public static final BlockSetType SAVORSHROOM = ModBlockSetTypes.register(new BlockSetType("savorshroom"));

    private static BlockSetType register(BlockSetType blockSetType) {
        return blockSetType;
    }
}
