package net.bluethedude.woodnfungus.util;

import net.bluethedude.woodnfungus.WoodNFungus;
import net.fabricmc.fabric.api.object.builder.v1.block.type.WoodTypeRegistry;
import net.minecraft.block.WoodType;
import net.minecraft.util.Identifier;

public record ModWoodTypes() {
    public static final WoodType PALM = WoodTypeRegistry.register(new Identifier(WoodNFungus.MOD_ID, "palm"),ModBlockSetTypes.PALM);
    public static final WoodType RED_SANDALWOOD = WoodTypeRegistry.register(new Identifier(WoodNFungus.MOD_ID, "red_sandalwood"),ModBlockSetTypes.RED_SANDALWOOD);
    public static final WoodType BOULDERBARK = WoodTypeRegistry.register(new Identifier(WoodNFungus.MOD_ID, "boulderbark"),ModBlockSetTypes.BOULDERBARK);
    public static final WoodType SPLITPINE = WoodTypeRegistry.register(new Identifier(WoodNFungus.MOD_ID, "splitpine"),ModBlockSetTypes.SPLITPINE);
    public static final WoodType BLUE_MEANIE = WoodTypeRegistry.register(new Identifier(WoodNFungus.MOD_ID, "blue_meanie"),ModBlockSetTypes.BLUE_MEANIE);
    public static final WoodType DEVILS_TOOTH = WoodTypeRegistry.register(new Identifier(WoodNFungus.MOD_ID, "devils_tooth"),ModBlockSetTypes.DEVILS_TOOTH);
    public static final WoodType SAVORSHROOM = WoodTypeRegistry.register(new Identifier(WoodNFungus.MOD_ID, "savorshroom"),ModBlockSetTypes.SAVORSHROOM);
    public static final WoodType WITCHSTOOL = WoodTypeRegistry.register(new Identifier(WoodNFungus.MOD_ID, "witchstool"),ModBlockSetTypes.WITCHSTOOL);
}
