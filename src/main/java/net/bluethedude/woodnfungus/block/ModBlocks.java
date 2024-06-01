package net.bluethedude.woodnfungus.block;

import net.bluethedude.woodnfungus.WoodNFungus;
import net.bluethedude.woodnfungus.block.custom.*;
import net.bluethedude.woodnfungus.util.ModBlockSetTypes;
import net.bluethedude.woodnfungus.util.ModWoodTypes;
import net.bluethedude.woodnfungus.world.ModConfiguredFeatures;
import net.bluethedude.woodnfungus.world.tree.BoulderbarkSaplingGenerator;
import net.bluethedude.woodnfungus.world.tree.PalmSaplingGenerator;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block COCONUT = registerBlock("coconut",
            new CoconutBlock(FabricBlockSettings.copyOf(Blocks.COCOA)));

    public static final Block PALM_LOG = registerBlock("palm_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).mapColor(MapColor.RAW_IRON_PINK)));
    public static final Block PALM_WOOD = registerBlock("palm_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).mapColor(MapColor.RAW_IRON_PINK)));
    public static final Block PALM_CORE = registerBlock("palm_core",
            new PalmCoreBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).mapColor(MapColor.BROWN)));
    public static final Block STRIPPED_PALM_LOG = registerBlock("stripped_palm_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).mapColor(MapColor.YELLOW)));
    public static final Block STRIPPED_PALM_WOOD = registerBlock("stripped_palm_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).mapColor(MapColor.YELLOW)));

    public static final Block PALM_LEAVES = registerBlock("palm_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).mapColor(MapColor.LIME).nonOpaque()));
    public static final Block PALM_SAPLING = registerBlock("palm_sapling",
            new PalmSaplingBlock(new PalmSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).mapColor(MapColor.LIME).nonOpaque()));
    public static final Block POTTED_PALM_SAPLING = Registry.register(Registries.BLOCK, new Identifier(WoodNFungus.MOD_ID, "potted_palm_sapling"),
            new FlowerPotBlock(PALM_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING).nonOpaque()));

    public static final Block PALM_PLANKS = registerBlock("palm_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.YELLOW)));
    public static final Block PALM_STAIRS = registerBlock("palm_stairs",
            new StairsBlock(ModBlocks.PALM_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.YELLOW)));
    public static final Block PALM_SLAB = registerBlock("palm_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.YELLOW)));
    public static final Block PALM_FENCE = registerBlock("palm_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.YELLOW)));
    public static final Block PALM_FENCE_GATE = registerBlock("palm_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.YELLOW), ModWoodTypes.PALM));
    public static final Block PALM_PRESSURE_PLATE = registerBlock("palm_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.YELLOW), ModBlockSetTypes.PALM));
    public static final Block PALM_BUTTON = registerBlock("palm_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.YELLOW), ModBlockSetTypes.PALM, 15, true));
    public static final Block PALM_DOOR = registerBlock("palm_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.YELLOW).nonOpaque(), ModBlockSetTypes.PALM));
    public static final Block PALM_TRAPDOOR = registerBlock("palm_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.YELLOW).nonOpaque(), ModBlockSetTypes.PALM));

    public static final Block PALM_SIGN = Registry.register(Registries.BLOCK, new Identifier(WoodNFungus.MOD_ID, "palm_sign"),
            new ModSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).mapColor(MapColor.YELLOW), ModWoodTypes.PALM));
    public static final Block PALM_WALL_SIGN = Registry.register(Registries.BLOCK, new Identifier(WoodNFungus.MOD_ID, "palm_wall_sign"),
            new ModWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN).mapColor(MapColor.YELLOW).dropsLike(ModBlocks.PALM_SIGN), ModWoodTypes.PALM));
    public static final Block PALM_HANGING_SIGN = Registry.register(Registries.BLOCK, new Identifier(WoodNFungus.MOD_ID, "palm_hanging_sign"),
            new ModHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN).mapColor(MapColor.YELLOW), ModWoodTypes.PALM));
    public static final Block PALM_WALL_HANGING_SIGN = Registry.register(Registries.BLOCK, new Identifier(WoodNFungus.MOD_ID, "palm_wall_hanging_sign"),
            new ModWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).mapColor(MapColor.YELLOW).dropsLike(ModBlocks.PALM_HANGING_SIGN), ModWoodTypes.PALM));



    public static final Block LIGNUM_VITAE_PLANKS = registerBlock("lignum_vitae_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block LIGNUM_VITAE_STAIRS = registerBlock("lignum_vitae_stairs",
            new StairsBlock(ModBlocks.LIGNUM_VITAE_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block LIGNUM_VITAE_SLAB = registerBlock("lignum_vitae_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block LIGNUM_VITAE_FENCE = registerBlock("lignum_vitae_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block LIGNUM_VITAE_FENCE_GATE = registerBlock("lignum_vitae_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.TERRACOTTA_LIME), ModWoodTypes.LIGNUM_VITAE));
    public static final Block LIGNUM_VITAE_PRESSURE_PLATE = registerBlock("lignum_vitae_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.TERRACOTTA_LIME), ModBlockSetTypes.LIGNUM_VITAE));
    public static final Block LIGNUM_VITAE_BUTTON = registerBlock("lignum_vitae_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.TERRACOTTA_LIME), ModBlockSetTypes.LIGNUM_VITAE, 15, true));



    public static final Block BOULDERBARK_LOG = registerBlock("boulderbark_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).requiresTool().resistance(50000f).mapColor(MapColor.BLACK)));
    public static final Block BOULDERBARK_WOOD = registerBlock("boulderbark_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).requiresTool().resistance(50000f).mapColor(MapColor.BLACK)));
    public static final Block STRIPPED_BOULDERBARK_LOG = registerBlock("stripped_boulderbark_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).requiresTool().resistance(50000f).mapColor(MapColor.TERRACOTTA_BLUE)));
    public static final Block STRIPPED_BOULDERBARK_WOOD = registerBlock("stripped_boulderbark_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).requiresTool().resistance(50000f).mapColor(MapColor.TERRACOTTA_BLUE)));

    public static final Block BOULDERBARK_LEAVES = registerBlock("boulderbark_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque().resistance(1f).mapColor(MapColor.LIGHT_BLUE_GRAY)));
    public static final Block BOULDERBARK_SAPLING = registerBlock("boulderbark_sapling",
            new BoulderbarkSaplingBlock(new BoulderbarkSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).nonOpaque().resistance(5f).mapColor(MapColor.LIGHT_BLUE_GRAY)));
    public static final Block POTTED_BOULDERBARK_SAPLING = Registry.register(Registries.BLOCK, new Identifier(WoodNFungus.MOD_ID, "potted_boulderbark_sapling"),
            new FlowerPotBlock(BOULDERBARK_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING).nonOpaque()));

    public static final Block WHITE_BOULDERBARK_LEAVES = registerBlock("white_boulderbark_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque().resistance(1f).mapColor(MapColor.WHITE)));
    public static final Block LIGHT_GRAY_BOULDERBARK_LEAVES = registerBlock("light_gray_boulderbark_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque().resistance(1f).mapColor(MapColor.LIGHT_GRAY)));
    public static final Block GRAY_BOULDERBARK_LEAVES = registerBlock("gray_boulderbark_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque().resistance(1f).mapColor(MapColor.GRAY)));
    public static final Block BLACK_BOULDERBARK_LEAVES = registerBlock("black_boulderbark_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque().resistance(1f).mapColor(MapColor.BLACK)));
    public static final Block BROWN_BOULDERBARK_LEAVES = registerBlock("brown_boulderbark_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque().resistance(1f).mapColor(MapColor.BROWN)));
    public static final Block RED_BOULDERBARK_LEAVES = registerBlock("red_boulderbark_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque().resistance(1f).mapColor(MapColor.RED)));
    public static final Block ORANGE_BOULDERBARK_LEAVES = registerBlock("orange_boulderbark_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque().resistance(1f).mapColor(MapColor.ORANGE)));
    public static final Block YELLOW_BOULDERBARK_LEAVES = registerBlock("yellow_boulderbark_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque().resistance(1f).mapColor(MapColor.YELLOW)));
    public static final Block LIME_BOULDERBARK_LEAVES = registerBlock("lime_boulderbark_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque().resistance(1f).mapColor(MapColor.LIME)));
    public static final Block GREEN_BOULDERBARK_LEAVES = registerBlock("green_boulderbark_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque().resistance(1f).mapColor(MapColor.GREEN)));
    public static final Block CYAN_BOULDERBARK_LEAVES = registerBlock("cyan_boulderbark_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque().resistance(1f).mapColor(MapColor.CYAN)));
    public static final Block LIGHT_BLUE_BOULDERBARK_LEAVES = registerBlock("light_blue_boulderbark_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque().resistance(1f).mapColor(MapColor.LIGHT_BLUE)));
    public static final Block BLUE_BOULDERBARK_LEAVES = registerBlock("blue_boulderbark_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque().resistance(1f).mapColor(MapColor.BLUE)));
    public static final Block PURPLE_BOULDERBARK_LEAVES = registerBlock("purple_boulderbark_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque().resistance(1f).mapColor(MapColor.PURPLE)));
    public static final Block MAGENTA_BOULDERBARK_LEAVES = registerBlock("magenta_boulderbark_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque().resistance(1f).mapColor(MapColor.MAGENTA)));
    public static final Block PINK_BOULDERBARK_LEAVES = registerBlock("pink_boulderbark_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque().resistance(1f).mapColor(MapColor.PINK)));

    public static final Block BOULDERBARK_PLANKS = registerBlock("boulderbark_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool().resistance(50000f).mapColor(MapColor.TERRACOTTA_BLUE)));
    public static final Block BOULDERBARK_STAIRS = registerBlock("boulderbark_stairs",
            new StairsBlock(ModBlocks.BOULDERBARK_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool().resistance(50000f).mapColor(MapColor.TERRACOTTA_BLUE)));
    public static final Block BOULDERBARK_SLAB = registerBlock("boulderbark_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool().resistance(50000f).mapColor(MapColor.TERRACOTTA_BLUE)));
    public static final Block BOULDERBARK_FENCE = registerBlock("boulderbark_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool().resistance(50000f).mapColor(MapColor.TERRACOTTA_BLUE)));
    public static final Block BOULDERBARK_FENCE_GATE = registerBlock("boulderbark_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool().resistance(50000f).mapColor(MapColor.TERRACOTTA_BLUE), ModWoodTypes.BOULDERBARK));
    public static final Block BOULDERBARK_PRESSURE_PLATE = registerBlock("boulderbark_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool().resistance(50000f).mapColor(MapColor.TERRACOTTA_BLUE), ModBlockSetTypes.BOULDERBARK));
    public static final Block BOULDERBARK_BUTTON = registerBlock("boulderbark_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool().resistance(50000f).mapColor(MapColor.TERRACOTTA_BLUE), ModBlockSetTypes.BOULDERBARK, 15, true));
    public static final Block BOULDERBARK_DOOR = registerBlock("boulderbark_door",
            new DoorBlock((FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()).requiresTool().resistance(50000f).mapColor(MapColor.TERRACOTTA_BLUE), ModBlockSetTypes.BOULDERBARK));
    public static final Block BOULDERBARK_TRAPDOOR = registerBlock("boulderbark_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque().requiresTool().resistance(50000f).mapColor(MapColor.TERRACOTTA_BLUE), ModBlockSetTypes.BOULDERBARK));

    public static final Block BOULDERBARK_SIGN = Registry.register(Registries.BLOCK, new Identifier(WoodNFungus.MOD_ID, "boulderbark_sign"),
            new ModSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).requiresTool().resistance(50000f).mapColor(MapColor.TERRACOTTA_BLUE), ModWoodTypes.BOULDERBARK));
    public static final Block BOULDERBARK_WALL_SIGN = Registry.register(Registries.BLOCK, new Identifier(WoodNFungus.MOD_ID, "boulderbark_wall_sign"),
            new ModWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN).requiresTool().resistance(50000f).mapColor(MapColor.TERRACOTTA_BLUE).dropsLike(ModBlocks.BOULDERBARK_SIGN), ModWoodTypes.BOULDERBARK));
    public static final Block BOULDERBARK_HANGING_SIGN = Registry.register(Registries.BLOCK, new Identifier(WoodNFungus.MOD_ID, "boulderbark_hanging_sign"),
            new ModHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN).requiresTool().resistance(50000f).mapColor(MapColor.TERRACOTTA_BLUE), ModWoodTypes.BOULDERBARK));
    public static final Block BOULDERBARK_WALL_HANGING_SIGN = Registry.register(Registries.BLOCK, new Identifier(WoodNFungus.MOD_ID, "boulderbark_wall_hanging_sign"),
            new ModWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).requiresTool().resistance(50000f).mapColor(MapColor.TERRACOTTA_BLUE).dropsLike(ModBlocks.BOULDERBARK_HANGING_SIGN), ModWoodTypes.BOULDERBARK));



    public static final Block SPLITPINE_PLANKS = registerBlock("splitpine_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.LIGHT_BLUE)));
    public static final Block SPLITPINE_STAIRS = registerBlock("splitpine_stairs",
            new StairsBlock(ModBlocks.SPLITPINE_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.LIGHT_BLUE)));
    public static final Block SPLITPINE_SLAB = registerBlock("splitpine_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.LIGHT_BLUE)));
    public static final Block SPLITPINE_FENCE = registerBlock("splitpine_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.LIGHT_BLUE)));
    public static final Block SPLITPINE_FENCE_GATE = registerBlock("splitpine_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.LIGHT_BLUE), ModWoodTypes.SPLITPINE));
    public static final Block SPLITPINE_PRESSURE_PLATE = registerBlock("splitpine_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.LIGHT_BLUE), ModBlockSetTypes.SPLITPINE));
    public static final Block SPLITPINE_BUTTON = registerBlock("splitpine_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.LIGHT_BLUE), ModBlockSetTypes.SPLITPINE, 15, true));



    public static final Block BLUE_MEANIE_PLANKS = registerBlock("blue_meanie_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).mapColor(MapColor.BLUE)));
    public static final Block BLUE_MEANIE_STAIRS = registerBlock("blue_meanie_stairs",
            new StairsBlock(ModBlocks.BLUE_MEANIE_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).mapColor(MapColor.BLUE)));
    public static final Block BLUE_MEANIE_SLAB = registerBlock("blue_meanie_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).mapColor(MapColor.BLUE)));
    public static final Block BLUE_MEANIE_FENCE = registerBlock("blue_meanie_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).mapColor(MapColor.BLUE)));
    public static final Block BLUE_MEANIE_FENCE_GATE = registerBlock("blue_meanie_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).mapColor(MapColor.BLUE), ModWoodTypes.BLUE_MEANIE));
    public static final Block BLUE_MEANIE_PRESSURE_PLATE = registerBlock("blue_meanie_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).mapColor(MapColor.BLUE), ModBlockSetTypes.BLUE_MEANIE));
    public static final Block BLUE_MEANIE_BUTTON = registerBlock("blue_meanie_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).mapColor(MapColor.BLUE), ModBlockSetTypes.BLUE_MEANIE, 15, true));



    public static final Block DEVILS_TOOTH_PLANKS = registerBlock("devils_tooth_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).mapColor(MapColor.OFF_WHITE)));
    public static final Block DEVILS_TOOTH_STAIRS = registerBlock("devils_tooth_stairs",
            new StairsBlock(ModBlocks.DEVILS_TOOTH_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).mapColor(MapColor.OFF_WHITE)));
    public static final Block DEVILS_TOOTH_SLAB = registerBlock("devils_tooth_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).mapColor(MapColor.OFF_WHITE)));
    public static final Block DEVILS_TOOTH_FENCE = registerBlock("devils_tooth_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).mapColor(MapColor.OFF_WHITE)));
    public static final Block DEVILS_TOOTH_FENCE_GATE = registerBlock("devils_tooth_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).mapColor(MapColor.OFF_WHITE), ModWoodTypes.DEVILS_TOOTH));
    public static final Block DEVILS_TOOTH_PRESSURE_PLATE = registerBlock("devils_tooth_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).mapColor(MapColor.OFF_WHITE), ModBlockSetTypes.DEVILS_TOOTH));
    public static final Block DEVILS_TOOTH_BUTTON = registerBlock("devils_tooth_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).mapColor(MapColor.OFF_WHITE), ModBlockSetTypes.DEVILS_TOOTH, 15, true));

    public static final Block STAINED_DEVILS_TOOTH_PLANKS = registerBlock("stained_devils_tooth_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).mapColor(MapColor.BRIGHT_RED)));
    public static final Block STAINED_DEVILS_TOOTH_STAIRS = registerBlock("stained_devils_tooth_stairs",
            new StairsBlock(ModBlocks.STAINED_DEVILS_TOOTH_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).mapColor(MapColor.BRIGHT_RED)));
    public static final Block STAINED_DEVILS_TOOTH_SLAB = registerBlock("stained_devils_tooth_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).mapColor(MapColor.BRIGHT_RED)));
    public static final Block STAINED_DEVILS_TOOTH_FENCE = registerBlock("stained_devils_tooth_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).mapColor(MapColor.BRIGHT_RED)));
    public static final Block STAINED_DEVILS_TOOTH_FENCE_GATE = registerBlock("stained_devils_tooth_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).mapColor(MapColor.BRIGHT_RED), ModWoodTypes.DEVILS_TOOTH));
    public static final Block STAINED_DEVILS_TOOTH_PRESSURE_PLATE = registerBlock("stained_devils_tooth_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).mapColor(MapColor.BRIGHT_RED), ModBlockSetTypes.DEVILS_TOOTH));
    public static final Block STAINED_DEVILS_TOOTH_BUTTON = registerBlock("stained_devils_tooth_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).mapColor(MapColor.BRIGHT_RED), ModBlockSetTypes.DEVILS_TOOTH, 15, true));




    public static final Block SAVORSHROOM_STEM = registerBlock("savorshroom_stem",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.WARPED_STEM).mapColor(MapColor.LIGHT_BLUE)));
    public static final Block SAVORSHROOM_HYPHAE = registerBlock("savorshroom_hyphae",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.WARPED_HYPHAE).mapColor(MapColor.LIGHT_BLUE)));
    public static final Block STRIPPED_SAVORSHROOM_STEM = registerBlock("stripped_savorshroom_stem",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_WARPED_STEM).mapColor(MapColor.LIME)));
    public static final Block STRIPPED_SAVORSHROOM_HYPHAE = registerBlock("stripped_savorshroom_hyphae",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_WARPED_HYPHAE).mapColor(MapColor.LIME)));

    public static final Block SAVORSHROOM_BLOCK = registerBlock("savorshroom_block",
            new MushroomBlock(FabricBlockSettings.copyOf(Blocks.WARPED_WART_BLOCK).mapColor(MapColor.LIME)));
    public static final Block SAVORSHROOM = registerBlock("savorshroom",
            new MushroomPlantBlock(FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM).mapColor(MapColor.LIME), ModConfiguredFeatures.HUGE_SAVORSHROOM_KEY));
    public static final Block POTTED_SAVORSHROOM = Registry.register(Registries.BLOCK, new Identifier(WoodNFungus.MOD_ID, "potted_savorshroom"),
            new FlowerPotBlock(SAVORSHROOM, FabricBlockSettings.copyOf(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));

    public static final Block SAVORSHROOM_PLANKS = registerBlock("savorshroom_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).mapColor(MapColor.LIME)));
    public static final Block SAVORSHROOM_STAIRS = registerBlock("savorshroom_stairs",
            new StairsBlock(ModBlocks.SAVORSHROOM_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).mapColor(MapColor.LIME)));
    public static final Block SAVORSHROOM_SLAB = registerBlock("savorshroom_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).mapColor(MapColor.LIME)));
    public static final Block SAVORSHROOM_FENCE = registerBlock("savorshroom_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).mapColor(MapColor.LIME)));
    public static final Block SAVORSHROOM_FENCE_GATE = registerBlock("savorshroom_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).mapColor(MapColor.LIME), ModWoodTypes.SAVORSHROOM));
    public static final Block SAVORSHROOM_PRESSURE_PLATE = registerBlock("savorshroom_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).mapColor(MapColor.LIME), ModBlockSetTypes.SAVORSHROOM));
    public static final Block SAVORSHROOM_BUTTON = registerBlock("savorshroom_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).mapColor(MapColor.LIME), ModBlockSetTypes.SAVORSHROOM, 15, true));
    public static final Block SAVORSHROOM_DOOR = registerBlock("savorshroom_door",
            new DoorBlock((FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).mapColor(MapColor.LIME).nonOpaque()), ModBlockSetTypes.SAVORSHROOM));
    public static final Block SAVORSHROOM_TRAPDOOR = registerBlock("savorshroom_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).mapColor(MapColor.LIME).nonOpaque(), ModBlockSetTypes.SAVORSHROOM));

    public static final Block SAVORSHROOM_SIGN = Registry.register(Registries.BLOCK, new Identifier(WoodNFungus.MOD_ID, "savorshroom_sign"),
            new ModSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).mapColor(MapColor.LIME), ModWoodTypes.SAVORSHROOM));
    public static final Block SAVORSHROOM_WALL_SIGN = Registry.register(Registries.BLOCK, new Identifier(WoodNFungus.MOD_ID, "savorshroom_wall_sign"),
            new ModWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN).mapColor(MapColor.LIME).dropsLike(ModBlocks.SAVORSHROOM_SIGN), ModWoodTypes.SAVORSHROOM));
    public static final Block SAVORSHROOM_HANGING_SIGN = Registry.register(Registries.BLOCK, new Identifier(WoodNFungus.MOD_ID, "savorshroom_hanging_sign"),
            new ModHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN).mapColor(MapColor.LIME), ModWoodTypes.SAVORSHROOM));
    public static final Block SAVORSHROOM_WALL_HANGING_SIGN = Registry.register(Registries.BLOCK, new Identifier(WoodNFungus.MOD_ID, "savorshroom_wall_hanging_sign"),
            new ModWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).mapColor(MapColor.LIME).dropsLike(ModBlocks.SAVORSHROOM_HANGING_SIGN), ModWoodTypes.SAVORSHROOM));



    public static final Block WITCHSTOOL_PLANKS = registerBlock("witchstool_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).mapColor(MapColor.PALE_PURPLE)));
    public static final Block WITCHSTOOL_STAIRS = registerBlock("witchstool_stairs",
            new StairsBlock(ModBlocks.BLUE_MEANIE_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).mapColor(MapColor.PALE_PURPLE)));
    public static final Block WITCHSTOOL_SLAB = registerBlock("witchstool_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).mapColor(MapColor.PALE_PURPLE)));
    public static final Block WITCHSTOOL_FENCE = registerBlock("witchstool_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).mapColor(MapColor.PALE_PURPLE)));
    public static final Block WITCHSTOOL_FENCE_GATE = registerBlock("witchstool_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).mapColor(MapColor.PALE_PURPLE), ModWoodTypes.WITCHSTOOL));
    public static final Block WITCHSTOOL_PRESSURE_PLATE = registerBlock("witchstool_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).mapColor(MapColor.PALE_PURPLE), ModBlockSetTypes.WITCHSTOOL));
    public static final Block WITCHSTOOL_BUTTON = registerBlock("witchstool_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).mapColor(MapColor.PALE_PURPLE), ModBlockSetTypes.WITCHSTOOL, 15, true));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(WoodNFungus.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, new Identifier(WoodNFungus.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        WoodNFungus.LOGGER.info("Registering Mod Blocks for " + WoodNFungus.MOD_ID);
    }
}
