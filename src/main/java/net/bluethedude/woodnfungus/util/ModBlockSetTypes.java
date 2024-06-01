package net.bluethedude.woodnfungus.util;

import net.minecraft.block.BlockSetType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;

public class ModBlockSetTypes {
    public static final BlockSetType PALM = ModBlockSetTypes.register(new BlockSetType("palm"));

    public static final BlockSetType LIGNUM_VITAE = ModBlockSetTypes.register(new BlockSetType("lignum_vitae"));

    public static final BlockSetType BOULDERBARK = ModBlockSetTypes.register(new BlockSetType("boulderbark"));

    public static final BlockSetType SPLITPINE = ModBlockSetTypes.register(new BlockSetType("splitpine"));

    public static final BlockSetType BLUE_MEANIE = ModBlockSetTypes.register(new BlockSetType("blue_meanie",
            true, BlockSoundGroup.NETHER_WOOD, SoundEvents.BLOCK_NETHER_WOOD_DOOR_CLOSE, SoundEvents.BLOCK_NETHER_WOOD_DOOR_OPEN, SoundEvents.BLOCK_NETHER_WOOD_TRAPDOOR_CLOSE, SoundEvents.BLOCK_NETHER_WOOD_TRAPDOOR_OPEN, SoundEvents.BLOCK_NETHER_WOOD_PRESSURE_PLATE_CLICK_OFF, SoundEvents.BLOCK_NETHER_WOOD_PRESSURE_PLATE_CLICK_ON, SoundEvents.BLOCK_NETHER_WOOD_BUTTON_CLICK_OFF, SoundEvents.BLOCK_NETHER_WOOD_BUTTON_CLICK_ON));

    public static final BlockSetType DEVILS_TOOTH = ModBlockSetTypes.register(new BlockSetType("devils_tooth",
            true, BlockSoundGroup.NETHER_WOOD, SoundEvents.BLOCK_NETHER_WOOD_DOOR_CLOSE, SoundEvents.BLOCK_NETHER_WOOD_DOOR_OPEN, SoundEvents.BLOCK_NETHER_WOOD_TRAPDOOR_CLOSE, SoundEvents.BLOCK_NETHER_WOOD_TRAPDOOR_OPEN, SoundEvents.BLOCK_NETHER_WOOD_PRESSURE_PLATE_CLICK_OFF, SoundEvents.BLOCK_NETHER_WOOD_PRESSURE_PLATE_CLICK_ON, SoundEvents.BLOCK_NETHER_WOOD_BUTTON_CLICK_OFF, SoundEvents.BLOCK_NETHER_WOOD_BUTTON_CLICK_ON));

    public static final BlockSetType SAVORSHROOM = ModBlockSetTypes.register(new BlockSetType("savorshroom",
            true, BlockSoundGroup.NETHER_WOOD, SoundEvents.BLOCK_NETHER_WOOD_DOOR_CLOSE, SoundEvents.BLOCK_NETHER_WOOD_DOOR_OPEN, SoundEvents.BLOCK_NETHER_WOOD_TRAPDOOR_CLOSE, SoundEvents.BLOCK_NETHER_WOOD_TRAPDOOR_OPEN, SoundEvents.BLOCK_NETHER_WOOD_PRESSURE_PLATE_CLICK_OFF, SoundEvents.BLOCK_NETHER_WOOD_PRESSURE_PLATE_CLICK_ON, SoundEvents.BLOCK_NETHER_WOOD_BUTTON_CLICK_OFF, SoundEvents.BLOCK_NETHER_WOOD_BUTTON_CLICK_ON));

    public static final BlockSetType WITCHSTOOL = ModBlockSetTypes.register(new BlockSetType("witchstool",
            true, BlockSoundGroup.NETHER_WOOD, SoundEvents.BLOCK_NETHER_WOOD_DOOR_CLOSE, SoundEvents.BLOCK_NETHER_WOOD_DOOR_OPEN, SoundEvents.BLOCK_NETHER_WOOD_TRAPDOOR_CLOSE, SoundEvents.BLOCK_NETHER_WOOD_TRAPDOOR_OPEN, SoundEvents.BLOCK_NETHER_WOOD_PRESSURE_PLATE_CLICK_OFF, SoundEvents.BLOCK_NETHER_WOOD_PRESSURE_PLATE_CLICK_ON, SoundEvents.BLOCK_NETHER_WOOD_BUTTON_CLICK_OFF, SoundEvents.BLOCK_NETHER_WOOD_BUTTON_CLICK_ON));

    private static BlockSetType register(BlockSetType blockSetType) {
        return blockSetType;
    }
}
