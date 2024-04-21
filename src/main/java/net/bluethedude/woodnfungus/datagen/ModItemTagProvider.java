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
                .add(ModBlocks.SAVORSHROOM_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.PALM_LOG.asItem())
                .add(ModBlocks.STRIPPED_PALM_LOG.asItem())
                .add(ModBlocks.PALM_CORE_LOG.asItem())
                .add(ModBlocks.PALM_WOOD.asItem())
                .add(ModBlocks.STRIPPED_PALM_WOOD.asItem())
                .add(ModBlocks.PALM_CORE_WOOD.asItem())
                .add(ModBlocks.BOULDERBARK_LOG.asItem())
                .add(ModBlocks.BOULDERBARK_WOOD.asItem())
                .add(ModBlocks.STRIPPED_BOULDERBARK_LOG.asItem())
                .add(ModBlocks.STRIPPED_BOULDERBARK_WOOD.asItem())
                .add(ModBlocks.SAVORSHROOM_STEM.asItem())
                .add(ModBlocks.SAVORSHROOM_HYPHAE.asItem())
                .add(ModBlocks.STRIPPED_SAVORSHROOM_STEM.asItem())
                .add(ModBlocks.STRIPPED_SAVORSHROOM_HYPHAE.asItem());

        getOrCreateTagBuilder(ModTags.Items.LARGE_SAVORSHROOM_COOKABLE)
                .add(ModBlocks.SAVORSHROOM_BLOCK.asItem())
                .add(ModBlocks.SAVORSHROOM_STEM.asItem())
                .add(ModBlocks.SAVORSHROOM_HYPHAE.asItem())
                .add(ModBlocks.STRIPPED_SAVORSHROOM_STEM.asItem())
                .add(ModBlocks.STRIPPED_SAVORSHROOM_HYPHAE.asItem());

        getOrCreateTagBuilder(ModTags.Items.SMALL_SAVORSHROOM_COOKABLE)
                .add(ModBlocks.SAVORSHROOM_PLANKS.asItem())
                .add(ModBlocks.SAVORSHROOM_STAIRS.asItem())
                .add(ModBlocks.SAVORSHROOM_SLAB.asItem())
                .add(ModBlocks.SAVORSHROOM_FENCE.asItem())
                .add(ModBlocks.SAVORSHROOM_FENCE_GATE.asItem())
                .add(ModBlocks.SAVORSHROOM_BUTTON.asItem())
                .add(ModBlocks.SAVORSHROOM_PRESSURE_PLATE.asItem());
    }
}
