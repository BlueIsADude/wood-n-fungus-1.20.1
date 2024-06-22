package net.bluethedude.woodnfungus.datagen;

import net.bluethedude.woodnfungus.block.ModBlocks;
import net.bluethedude.woodnfungus.item.ModItems;
import net.bluethedude.woodnfungus.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.COCONUT_HELMET);

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.PALM_PLANKS.asItem())
                .add(ModBlocks.BOULDERBARK_PLANKS.asItem())
                .add(ModBlocks.DEVILS_TOOTH_PLANKS.asItem())
                .add(ModBlocks.STAINED_DEVILS_TOOTH_PLANKS.asItem())
                .add(ModBlocks.SAVORSHROOM_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .addTag(ModTags.Items.PALM_LOGS)
                .addTag(ModTags.Items.BOULDERBARK_LOGS)
                .addTag(ModTags.Items.SAVORSHROOM_STEMS);

        getOrCreateTagBuilder(ItemTags.COMPLETES_FIND_TREE_TUTORIAL)
                .add(ModBlocks.PALM_LOG.asItem())
                .add(ModBlocks.PALM_WOOD.asItem())
                .add(ModBlocks.PALM_CORE.asItem())
                .add(ModBlocks.PALM_LEAVES.asItem())
                .add(ModBlocks.BOULDERBARK_LOG.asItem())
                .add(ModBlocks.BOULDERBARK_WOOD.asItem())
                .add(ModBlocks.BOULDERBARK_LEAVES.asItem())
                .add(ModBlocks.SAVORSHROOM_STEM.asItem())
                .add(ModBlocks.SAVORSHROOM_HYPHAE.asItem())
                .add(ModBlocks.SAVORSHROOM_BLOCK.asItem());

        getOrCreateTagBuilder(ModTags.Items.PALM_LOGS)
                .add(ModBlocks.PALM_LOG.asItem())
                .add(ModBlocks.STRIPPED_PALM_LOG.asItem())
                .add(ModBlocks.PALM_WOOD.asItem())
                .add(ModBlocks.STRIPPED_PALM_WOOD.asItem())
                .add(ModBlocks.PALM_CORE.asItem());

        getOrCreateTagBuilder(ModTags.Items.BOULDERBARK_LOGS)
                .add(ModBlocks.BOULDERBARK_LOG.asItem())
                .add(ModBlocks.STRIPPED_BOULDERBARK_LOG.asItem())
                .add(ModBlocks.BOULDERBARK_WOOD.asItem())
                .add(ModBlocks.STRIPPED_BOULDERBARK_WOOD.asItem());

        getOrCreateTagBuilder(ModTags.Items.SAVORSHROOM_STEMS)
                .add(ModBlocks.SAVORSHROOM_STEM.asItem())
                .add(ModBlocks.STRIPPED_SAVORSHROOM_STEM.asItem())
                .add(ModBlocks.SAVORSHROOM_HYPHAE.asItem())
                .add(ModBlocks.STRIPPED_SAVORSHROOM_HYPHAE.asItem());

        getOrCreateTagBuilder(ModTags.Items.SAVORSHROOM_CHUNK_COOKABLE)
                .add(ModBlocks.SAVORSHROOM_BLOCK.asItem())
                .add(ModBlocks.SAVORSHROOM_STEM.asItem())
                .add(ModBlocks.SAVORSHROOM_HYPHAE.asItem())
                .add(ModBlocks.STRIPPED_SAVORSHROOM_STEM.asItem())
                .add(ModBlocks.STRIPPED_SAVORSHROOM_HYPHAE.asItem());

        getOrCreateTagBuilder(ModTags.Items.SAVORSHROOM_SCRAP_COOKABLE)
                .add(ModBlocks.SAVORSHROOM_PLANKS.asItem())
                .add(ModBlocks.SAVORSHROOM_STAIRS.asItem())
                .add(ModBlocks.SAVORSHROOM_SLAB.asItem())
                .add(ModBlocks.SAVORSHROOM_FENCE.asItem())
                .add(ModBlocks.SAVORSHROOM_FENCE_GATE.asItem())
                .add(ModBlocks.SAVORSHROOM_BUTTON.asItem())
                .add(ModBlocks.SAVORSHROOM_PRESSURE_PLATE.asItem())
                .add(ModBlocks.SAVORSHROOM_DOOR.asItem())
                .add(ModBlocks.SAVORSHROOM_TRAPDOOR.asItem());
    }
}
