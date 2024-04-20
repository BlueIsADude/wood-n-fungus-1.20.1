package net.bluethedude.woodnfungus.datagen;

import net.bluethedude.woodnfungus.block.ModBlocks;
import net.bluethedude.woodnfungus.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(BlockTags.LOGS)
                .add(ModBlocks.PALM_LOG)
                .add(ModBlocks.STRIPPED_PALM_LOG)
                .add(ModBlocks.PALM_CORE_LOG)
                .add(ModBlocks.BOULDERBARK_LOG)
                .add(ModBlocks.STRIPPED_BOULDERBARK_LOG);

        getOrCreateTagBuilder(BlockTags.LEAVES)
                .add(ModBlocks.PALM_LEAVES)
                .add(ModBlocks.BOULDERBARK_LEAVES)
                .add(ModBlocks.WHITE_BOULDERBARK_LEAVES)
                .add(ModBlocks.LIGHT_GRAY_BOULDERBARK_LEAVES)
                .add(ModBlocks.GRAY_BOULDERBARK_LEAVES)
                .add(ModBlocks.BLACK_BOULDERBARK_LEAVES)
                .add(ModBlocks.RED_BOULDERBARK_LEAVES)
                .add(ModBlocks.ORANGE_BOULDERBARK_LEAVES)
                .add(ModBlocks.YELLOW_BOULDERBARK_LEAVES)
                .add(ModBlocks.LIME_BOULDERBARK_LEAVES)
                .add(ModBlocks.GREEN_BOULDERBARK_LEAVES)
                .add(ModBlocks.CYAN_BOULDERBARK_LEAVES)
                .add(ModBlocks.LIGHT_BLUE_BOULDERBARK_LEAVES)
                .add(ModBlocks.BLUE_BOULDERBARK_LEAVES)
                .add(ModBlocks.PURPLE_BOULDERBARK_LEAVES)
                .add(ModBlocks.MAGENTA_BOULDERBARK_LEAVES)
                .add(ModBlocks.PINK_BOULDERBARK_LEAVES);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.PALM_LOG)
                .add(ModBlocks.STRIPPED_PALM_LOG)
                .add(ModBlocks.PALM_CORE_LOG)
                .add(ModBlocks.PALM_WOOD)
                .add(ModBlocks.STRIPPED_PALM_WOOD)
                .add(ModBlocks.PALM_CORE_WOOD)
                .add(ModBlocks.BOULDERBARK_LOG)
                .add(ModBlocks.BOULDERBARK_WOOD)
                .add(ModBlocks.STRIPPED_BOULDERBARK_LOG)
                .add(ModBlocks.STRIPPED_BOULDERBARK_WOOD);

        getOrCreateTagBuilder(BlockTags.PLANKS)
                .add(ModBlocks.PALM_PLANKS)
                .add(ModBlocks.BOULDERBARK_PLANKS)
                .add(ModBlocks.SAVORSHROOM_PLANKS);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.PALM_FENCE)
                .add(ModBlocks.BOULDERBARK_FENCE)
                .add(ModBlocks.SAVORSHROOM_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.PALM_FENCE_GATE)
                .add(ModBlocks.BOULDERBARK_FENCE_GATE)
                .add(ModBlocks.SAVORSHROOM_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.DOORS)
                .add(ModBlocks.PALM_DOOR);

        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(ModBlocks.PALM_DOOR);

        getOrCreateTagBuilder(BlockTags.TRAPDOORS)
                .add(ModBlocks.PALM_TRAPDOOR);

        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(ModBlocks.PALM_TRAPDOOR);

        getOrCreateTagBuilder(BlockTags.BUTTONS)
                .add(ModBlocks.PALM_BUTTON)
                .add(ModBlocks.BOULDERBARK_BUTTON)
                .add(ModBlocks.SAVORSHROOM_BUTTON);

        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                .add(ModBlocks.PALM_BUTTON)
                .add(ModBlocks.BOULDERBARK_BUTTON)
                .add(ModBlocks.SAVORSHROOM_BUTTON);

        getOrCreateTagBuilder(BlockTags.PRESSURE_PLATES)
                .add(ModBlocks.PALM_PRESSURE_PLATE)
                .add(ModBlocks.BOULDERBARK_PRESSURE_PLATE)
                .add(ModBlocks.SAVORSHROOM_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.PALM_PRESSURE_PLATE)
                .add(ModBlocks.BOULDERBARK_PRESSURE_PLATE)
                .add(ModBlocks.SAVORSHROOM_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.SLABS)
                .add(ModBlocks.PALM_SLAB)
                .add(ModBlocks.BOULDERBARK_SLAB)
                .add(ModBlocks.SAVORSHROOM_SLAB);

        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(ModBlocks.PALM_SLAB)
                .add(ModBlocks.BOULDERBARK_SLAB)
                .add(ModBlocks.SAVORSHROOM_SLAB);

        getOrCreateTagBuilder(BlockTags.STAIRS)
                .add(ModBlocks.PALM_STAIRS)
                .add(ModBlocks.BOULDERBARK_STAIRS)
                .add(ModBlocks.SAVORSHROOM_STAIRS);

        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                .add(ModBlocks.PALM_STAIRS)
                .add(ModBlocks.BOULDERBARK_STAIRS)
                .add(ModBlocks.SAVORSHROOM_STAIRS);

        getOrCreateTagBuilder(ModTags.Blocks.BOULDERBARK_PLANTABLE)
                .add(Blocks.STONE)
                .add(Blocks.DEEPSLATE)
                .add(Blocks.DIORITE)
                .add(Blocks.ANDESITE)
                .add(Blocks.GRANITE);

        getOrCreateTagBuilder(ModTags.Blocks.PALM_PLANTABLE)
                .add(Blocks.SAND);


    }
    }
