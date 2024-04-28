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
                .add(ModBlocks.STRIPPED_BOULDERBARK_LOG)
                .add(ModBlocks.SAVORSHROOM_STEM)
                .add(ModBlocks.STRIPPED_SAVORSHROOM_STEM)
                .add(ModBlocks.STRIPPED_SAVORSHROOM_HYPHAE);

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
                .add(ModBlocks.STRIPPED_BOULDERBARK_WOOD)
                .add(ModBlocks.SAVORSHROOM_STEM)
                .add(ModBlocks.SAVORSHROOM_HYPHAE)
                .add(ModBlocks.STRIPPED_SAVORSHROOM_STEM)
                .add(ModBlocks.STRIPPED_SAVORSHROOM_HYPHAE);

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
                .add(ModBlocks.PALM_DOOR)
                .add(ModBlocks.BOULDERBARK_DOOR)
                .add(ModBlocks.SAVORSHROOM_DOOR);

        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(ModBlocks.PALM_DOOR)
                .add(ModBlocks.BOULDERBARK_DOOR)
                .add(ModBlocks.SAVORSHROOM_DOOR);

        getOrCreateTagBuilder(BlockTags.TRAPDOORS)
                .add(ModBlocks.PALM_TRAPDOOR)
                .add(ModBlocks.BOULDERBARK_TRAPDOOR)
                .add(ModBlocks.SAVORSHROOM_TRAPDOOR);

        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(ModBlocks.PALM_TRAPDOOR)
                .add(ModBlocks.BOULDERBARK_TRAPDOOR)
                .add(ModBlocks.SAVORSHROOM_TRAPDOOR);

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

        getOrCreateTagBuilder(BlockTags.STANDING_SIGNS)
                .add(ModBlocks.PALM_SIGN)
                .add(ModBlocks.BOULDERBARK_SIGN)
                .add(ModBlocks.SAVORSHROOM_SIGN);

        getOrCreateTagBuilder(BlockTags.WALL_SIGNS)
                .add(ModBlocks.PALM_WALL_SIGN)
                .add(ModBlocks.BOULDERBARK_WALL_SIGN)
                .add(ModBlocks.SAVORSHROOM_WALL_SIGN);

        getOrCreateTagBuilder(BlockTags.CEILING_HANGING_SIGNS)
                .add(ModBlocks.PALM_HANGING_SIGN)
                .add(ModBlocks.BOULDERBARK_HANGING_SIGN)
                .add(ModBlocks.SAVORSHROOM_HANGING_SIGN);

        getOrCreateTagBuilder(BlockTags.WALL_HANGING_SIGNS)
                .add(ModBlocks.PALM_WALL_HANGING_SIGN)
                .add(ModBlocks.BOULDERBARK_WALL_HANGING_SIGN)
                .add(ModBlocks.SAVORSHROOM_WALL_HANGING_SIGN);

        getOrCreateTagBuilder(ModTags.Blocks.CANDLE_COCONUT_CAKES)
                .add(ModBlocks.CANDLE_COCONUT_CAKE)
                .add(ModBlocks.WHITE_CANDLE_COCONUT_CAKE)
                .add(ModBlocks.LIGHT_GRAY_CANDLE_COCONUT_CAKE)
                .add(ModBlocks.GRAY_CANDLE_COCONUT_CAKE)
                .add(ModBlocks.BLACK_CANDLE_COCONUT_CAKE)
                .add(ModBlocks.BROWN_CANDLE_COCONUT_CAKE)
                .add(ModBlocks.RED_CANDLE_COCONUT_CAKE)
                .add(ModBlocks.ORANGE_CANDLE_COCONUT_CAKE)
                .add(ModBlocks.YELLOW_CANDLE_COCONUT_CAKE)
                .add(ModBlocks.LIME_CANDLE_COCONUT_CAKE)
                .add(ModBlocks.GREEN_CANDLE_COCONUT_CAKE)
                .add(ModBlocks.CYAN_CANDLE_COCONUT_CAKE)
                .add(ModBlocks.LIGHT_BLUE_CANDLE_COCONUT_CAKE)
                .add(ModBlocks.BLUE_CANDLE_COCONUT_CAKE)
                .add(ModBlocks.PURPLE_CANDLE_COCONUT_CAKE)
                .add(ModBlocks.MAGENTA_CANDLE_COCONUT_CAKE)
                .add(ModBlocks.PINK_CANDLE_COCONUT_CAKE);

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
