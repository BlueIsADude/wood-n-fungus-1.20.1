package net.bluethedude.woodnfungus.util;

import net.bluethedude.woodnfungus.WoodNFungus;
import net.fabricmc.fabric.api.object.builder.v1.block.type.BlockSetTypeBuilder;
import net.minecraft.block.BlockSetType;
import net.minecraft.util.Identifier;

public record ModBlockSetTypes() {
    public static final BlockSetType PALM = new BlockSetTypeBuilder().register(new Identifier(WoodNFungus.MOD_ID, "palm"));
    public static final BlockSetType BOULDERBARK = new BlockSetTypeBuilder().register(new Identifier(WoodNFungus.MOD_ID, "boulderbark"));
    public static final BlockSetType SAVORSHROOM = new BlockSetTypeBuilder().register(new Identifier(WoodNFungus.MOD_ID, "savorshroom"));
}
