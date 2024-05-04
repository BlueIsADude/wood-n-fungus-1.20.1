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
    }
}
