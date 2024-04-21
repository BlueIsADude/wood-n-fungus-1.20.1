package net.bluethedude.woodnfungus;

import net.bluethedude.woodnfungus.block.ModBlocks;
import net.bluethedude.woodnfungus.entity.ModBoats;
import net.bluethedude.woodnfungus.item.ModItemGroups;
import net.bluethedude.woodnfungus.item.ModItems;
import net.bluethedude.woodnfungus.world.gen.ModWorldGeneration;
import net.bluethedude.woodnfungus.world.tree.ModTrunkPlacerTypes;
import net.bluethedude.woodnfungus.world.tree.ModFoliagePlacerTypes;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WoodNFungus implements ModInitializer {
	public static final String MOD_ID = "woodnfungus";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModTrunkPlacerTypes.register();
		ModFoliagePlacerTypes.register();

		StrippableBlockRegistry.register(ModBlocks.PALM_LOG, ModBlocks.STRIPPED_PALM_LOG);
		StrippableBlockRegistry.register(ModBlocks.PALM_WOOD, ModBlocks.STRIPPED_PALM_WOOD);
		StrippableBlockRegistry.register(ModBlocks.PALM_CORE_LOG, ModBlocks.STRIPPED_PALM_LOG);
		StrippableBlockRegistry.register(ModBlocks.PALM_CORE_WOOD, ModBlocks.STRIPPED_PALM_WOOD);
		StrippableBlockRegistry.register(ModBlocks.BOULDERBARK_LOG, ModBlocks.STRIPPED_BOULDERBARK_LOG);
		StrippableBlockRegistry.register(ModBlocks.BOULDERBARK_WOOD, ModBlocks.STRIPPED_BOULDERBARK_WOOD);
		StrippableBlockRegistry.register(ModBlocks.PETRIFIED_LOG, ModBlocks.STRIPPED_PETRIFIED_LOG);
		StrippableBlockRegistry.register(ModBlocks.PETRIFIED_WOOD, ModBlocks.STRIPPED_PETRIFIED_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PALM_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_PALM_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PALM_CORE_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PALM_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_PALM_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PALM_CORE_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PALM_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PALM_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PALM_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PALM_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PALM_FENCE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PALM_FENCE_GATE, 5, 20);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BOULDERBARK_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_BOULDERBARK_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BOULDERBARK_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_BOULDERBARK_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BOULDERBARK_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BOULDERBARK_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BOULDERBARK_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BOULDERBARK_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BOULDERBARK_FENCE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BOULDERBARK_FENCE_GATE, 5, 20);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WHITE_BOULDERBARK_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIGHT_GRAY_BOULDERBARK_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GRAY_BOULDERBARK_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLACK_BOULDERBARK_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BROWN_BOULDERBARK_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.RED_BOULDERBARK_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ORANGE_BOULDERBARK_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.YELLOW_BOULDERBARK_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIME_BOULDERBARK_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GREEN_BOULDERBARK_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CYAN_BOULDERBARK_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIGHT_BLUE_BOULDERBARK_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLUE_BOULDERBARK_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PURPLE_BOULDERBARK_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAGENTA_BOULDERBARK_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PINK_BOULDERBARK_LEAVES, 30, 60);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SAVORSHROOM_STEM, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_SAVORSHROOM_STEM, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SAVORSHROOM_HYPHAE, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_SAVORSHROOM_HYPHAE, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SAVORSHROOM_BLOCK, 5, 10);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SAVORSHROOM_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SAVORSHROOM_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SAVORSHROOM_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SAVORSHROOM_FENCE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SAVORSHROOM_FENCE_GATE, 5, 20);

		ModBoats.registerBoats();
		ModWorldGeneration.generateModWorldGen();
	}
}