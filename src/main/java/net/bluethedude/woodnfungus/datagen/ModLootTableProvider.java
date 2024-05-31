package net.bluethedude.woodnfungus.datagen;

import net.bluethedude.woodnfungus.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.COCONUT);

        addDrop(ModBlocks.PALM_LOG);
        addDrop(ModBlocks.STRIPPED_PALM_LOG);
        addDrop(ModBlocks.PALM_WOOD);
        addDrop(ModBlocks.STRIPPED_PALM_WOOD);
        addDrop(ModBlocks.PALM_CORE, ModBlocks.PALM_LOG);
        addDrop(ModBlocks.PALM_PLANKS);
        addDrop(ModBlocks.PALM_STAIRS);
        addDrop(ModBlocks.PALM_SLAB, slabDrops(ModBlocks.PALM_SLAB));
        addDrop(ModBlocks.PALM_FENCE);
        addDrop(ModBlocks.PALM_FENCE_GATE);
        addDrop(ModBlocks.PALM_BUTTON);
        addDrop(ModBlocks.PALM_PRESSURE_PLATE);
        addDrop(ModBlocks.PALM_DOOR, doorDrops(ModBlocks.PALM_DOOR));
        addDrop(ModBlocks.PALM_TRAPDOOR);
        addDrop(ModBlocks.PALM_SAPLING);
        addPottedPlantDrops(ModBlocks.POTTED_PALM_SAPLING);
        addDrop(ModBlocks.PALM_LEAVES, leavesDrops(ModBlocks.PALM_LEAVES, ModBlocks.PALM_SAPLING, SAPLING_DROP_CHANCE));

        addDrop(ModBlocks.RED_SANDALWOOD_PLANKS);
        addDrop(ModBlocks.RED_SANDALWOOD_STAIRS);
        addDrop(ModBlocks.RED_SANDALWOOD_SLAB, slabDrops(ModBlocks.RED_SANDALWOOD_SLAB));
        addDrop(ModBlocks.RED_SANDALWOOD_FENCE);
        addDrop(ModBlocks.RED_SANDALWOOD_FENCE_GATE);
        addDrop(ModBlocks.RED_SANDALWOOD_BUTTON);
        addDrop(ModBlocks.RED_SANDALWOOD_PRESSURE_PLATE);

        addDrop(ModBlocks.BOULDERBARK_LOG);
        addDrop(ModBlocks.STRIPPED_BOULDERBARK_LOG);
        addDrop(ModBlocks.BOULDERBARK_WOOD);
        addDrop(ModBlocks.STRIPPED_BOULDERBARK_WOOD);
        addDrop(ModBlocks.BOULDERBARK_PLANKS);
        addDrop(ModBlocks.BOULDERBARK_STAIRS);
        addDrop(ModBlocks.BOULDERBARK_SLAB, slabDrops(ModBlocks.BOULDERBARK_SLAB));
        addDrop(ModBlocks.BOULDERBARK_FENCE);
        addDrop(ModBlocks.BOULDERBARK_FENCE_GATE);
        addDrop(ModBlocks.BOULDERBARK_BUTTON);
        addDrop(ModBlocks.BOULDERBARK_PRESSURE_PLATE);
        addDrop(ModBlocks.BOULDERBARK_DOOR, doorDrops(ModBlocks.BOULDERBARK_DOOR));
        addDrop(ModBlocks.BOULDERBARK_TRAPDOOR);
        addDrop(ModBlocks.BOULDERBARK_SAPLING);
        addPottedPlantDrops(ModBlocks.POTTED_BOULDERBARK_SAPLING);
        addDrop(ModBlocks.BOULDERBARK_LEAVES, leavesDrops(ModBlocks.BOULDERBARK_LEAVES, ModBlocks.BOULDERBARK_SAPLING, 0.0001f));
        addDrop(ModBlocks.WHITE_BOULDERBARK_LEAVES);
        addDrop(ModBlocks.LIGHT_GRAY_BOULDERBARK_LEAVES);
        addDrop(ModBlocks.GRAY_BOULDERBARK_LEAVES);
        addDrop(ModBlocks.BLACK_BOULDERBARK_LEAVES);
        addDrop(ModBlocks.RED_BOULDERBARK_LEAVES);
        addDrop(ModBlocks.ORANGE_BOULDERBARK_LEAVES);
        addDrop(ModBlocks.YELLOW_BOULDERBARK_LEAVES);
        addDrop(ModBlocks.LIME_BOULDERBARK_LEAVES);
        addDrop(ModBlocks.GREEN_BOULDERBARK_LEAVES);
        addDrop(ModBlocks.CYAN_BOULDERBARK_LEAVES);
        addDrop(ModBlocks.LIGHT_BLUE_BOULDERBARK_LEAVES);
        addDrop(ModBlocks.BLUE_BOULDERBARK_LEAVES);
        addDrop(ModBlocks.PURPLE_BOULDERBARK_LEAVES);
        addDrop(ModBlocks.MAGENTA_BOULDERBARK_LEAVES);
        addDrop(ModBlocks.PINK_BOULDERBARK_LEAVES);

        addDrop(ModBlocks.SPLITPINE_PLANKS);
        addDrop(ModBlocks.SPLITPINE_STAIRS);
        addDrop(ModBlocks.SPLITPINE_SLAB, slabDrops(ModBlocks.SPLITPINE_SLAB));
        addDrop(ModBlocks.SPLITPINE_FENCE);
        addDrop(ModBlocks.SPLITPINE_FENCE_GATE);
        addDrop(ModBlocks.SPLITPINE_BUTTON);
        addDrop(ModBlocks.SPLITPINE_PRESSURE_PLATE);

        addDrop(ModBlocks.BLUE_MEANIE_PLANKS);
        addDrop(ModBlocks.BLUE_MEANIE_STAIRS);
        addDrop(ModBlocks.BLUE_MEANIE_SLAB, slabDrops(ModBlocks.BLUE_MEANIE_SLAB));
        addDrop(ModBlocks.BLUE_MEANIE_FENCE);
        addDrop(ModBlocks.BLUE_MEANIE_FENCE_GATE);
        addDrop(ModBlocks.BLUE_MEANIE_BUTTON);
        addDrop(ModBlocks.BLUE_MEANIE_PRESSURE_PLATE);

        addDrop(ModBlocks.DEVILS_TOOTH_PLANKS);
        addDrop(ModBlocks.DEVILS_TOOTH_STAIRS);
        addDrop(ModBlocks.DEVILS_TOOTH_SLAB, slabDrops(ModBlocks.DEVILS_TOOTH_SLAB));
        addDrop(ModBlocks.DEVILS_TOOTH_FENCE);
        addDrop(ModBlocks.DEVILS_TOOTH_FENCE_GATE);
        addDrop(ModBlocks.DEVILS_TOOTH_BUTTON);
        addDrop(ModBlocks.DEVILS_TOOTH_PRESSURE_PLATE);

        addDrop(ModBlocks.SAVORSHROOM_BLOCK, mushroomBlockDrops(ModBlocks.SAVORSHROOM_BLOCK, ModBlocks.SAVORSHROOM));
        addDrop(ModBlocks.SAVORSHROOM_STEM);
        addDrop(ModBlocks.STRIPPED_SAVORSHROOM_STEM);
        addDrop(ModBlocks.SAVORSHROOM_HYPHAE);
        addDrop(ModBlocks.STRIPPED_SAVORSHROOM_HYPHAE);
        addDrop(ModBlocks.SAVORSHROOM_PLANKS);
        addDrop(ModBlocks.SAVORSHROOM_STAIRS);
        addDrop(ModBlocks.SAVORSHROOM_SLAB, slabDrops(ModBlocks.SAVORSHROOM_SLAB));
        addDrop(ModBlocks.SAVORSHROOM_FENCE);
        addDrop(ModBlocks.SAVORSHROOM_FENCE_GATE);
        addDrop(ModBlocks.SAVORSHROOM_BUTTON);
        addDrop(ModBlocks.SAVORSHROOM_PRESSURE_PLATE);
        addDrop(ModBlocks.SAVORSHROOM_DOOR, doorDrops(ModBlocks.SAVORSHROOM_DOOR));
        addDrop(ModBlocks.SAVORSHROOM_TRAPDOOR);
        addDrop(ModBlocks.SAVORSHROOM);
        addPottedPlantDrops(ModBlocks.POTTED_SAVORSHROOM);

        addDrop(ModBlocks.WITCHSTOOL_PLANKS);
        addDrop(ModBlocks.WITCHSTOOL_STAIRS);
        addDrop(ModBlocks.WITCHSTOOL_SLAB, slabDrops(ModBlocks.WITCHSTOOL_SLAB));
        addDrop(ModBlocks.WITCHSTOOL_FENCE);
        addDrop(ModBlocks.WITCHSTOOL_FENCE_GATE);
        addDrop(ModBlocks.WITCHSTOOL_BUTTON);
        addDrop(ModBlocks.WITCHSTOOL_PRESSURE_PLATE);
    }
}
