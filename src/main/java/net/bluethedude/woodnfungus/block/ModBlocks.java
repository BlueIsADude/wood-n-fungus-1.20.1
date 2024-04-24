package net.bluethedude.woodnfungus.block;

import com.terraformersmc.terraform.sign.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallSignBlock;
import net.bluethedude.woodnfungus.WoodNFungus;
import net.bluethedude.woodnfungus.block.custom.BoulderbarkSaplingBlock;
import net.bluethedude.woodnfungus.block.custom.PalmSaplingBlock;
import net.bluethedude.woodnfungus.world.tree.BoulderbarkSaplingGenerator;
import net.bluethedude.woodnfungus.world.tree.PalmSaplingGenerator;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block PALM_LOG = registerBlock("palm_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block PALM_WOOD = registerBlock("palm_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block PALM_CORE_LOG = registerBlock("palm_core_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block PALM_CORE_WOOD = registerBlock("palm_core_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_PALM_LOG = registerBlock("stripped_palm_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_PALM_WOOD = registerBlock("stripped_palm_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block PALM_LEAVES = registerBlock("palm_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block PALM_SAPLING = registerBlock("palm_sapling",
            new PalmSaplingBlock(new PalmSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).nonOpaque()));
    public static final Block POTTED_PALM_SAPLING = Registry.register(Registries.BLOCK, new Identifier(WoodNFungus.MOD_ID, "potted_palm_sapling"),
            new FlowerPotBlock(PALM_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING).nonOpaque()));


    public static final Block PALM_PLANKS = registerBlock("palm_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PALM_STAIRS = registerBlock("palm_stairs",
            new StairsBlock(ModBlocks.PALM_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PALM_SLAB = registerBlock("palm_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PALM_FENCE = registerBlock("palm_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PALM_FENCE_GATE = registerBlock("palm_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), WoodType.OAK));
    public static final Block PALM_PRESSURE_PLATE = registerBlock("palm_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), BlockSetType.OAK));
    public static final Block PALM_BUTTON = registerBlock("palm_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), BlockSetType.OAK, 15, true));
    public static final Block PALM_DOOR = registerBlock("palm_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque(), BlockSetType.OAK));
    public static final Block PALM_TRAPDOOR = registerBlock("palm_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque(), BlockSetType.OAK));

    public static final Identifier PALM_SIGN_TEXTURE = new Identifier(WoodNFungus.MOD_ID, "entity/signs/palm");
    public static final Identifier PALM_HANGING_SIGN_TEXTURE = new Identifier(WoodNFungus.MOD_ID, "entity/signs/hanging/palm");
    public static final Identifier PALM_HANGING_GUI_SIGN_TEXTURE = new Identifier(WoodNFungus.MOD_ID, "textures/gui/hanging_signs/palm");
    public static final Block STANDING_PALM_SIGN = Registry.register(Registries.BLOCK, new Identifier(WoodNFungus.MOD_ID, "palm_standing_sign"),
            new TerraformSignBlock(PALM_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_SIGN)));
    public static final Block WALL_PALM_SIGN = Registry.register(Registries.BLOCK, new Identifier(WoodNFungus.MOD_ID, "palm_wall_sign"),
            new TerraformWallSignBlock(PALM_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN)));
    public static final Block HANGING_PALM_SIGN = Registry.register(Registries.BLOCK, new Identifier(WoodNFungus.MOD_ID, "palm_hanging_sign"),
            new TerraformHangingSignBlock(PALM_HANGING_SIGN_TEXTURE, PALM_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN)));
    public static final Block WALL_HANGING_PALM_SIGN = Registry.register(Registries.BLOCK, new Identifier(WoodNFungus.MOD_ID, "palm_wall_hanging_sign"),
            new TerraformWallHangingSignBlock(PALM_HANGING_SIGN_TEXTURE, PALM_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN)));
    public static final BlockFamily PALM_FAMILY = BlockFamilies.register(ModBlocks.PALM_PLANKS)
            .sign(ModBlocks.STANDING_PALM_SIGN, ModBlocks.WALL_PALM_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();

    public static final Block COCONUT_CAKE = registerBlock("coconut_cake",
            new CakeBlock(FabricBlockSettings.copyOf(Blocks.CAKE)));
    public static final Block CANDLE_COCONUT_CAKE = Registry.register(Registries.BLOCK, new Identifier(WoodNFungus.MOD_ID,"candle_coconut_cake.json"),
            new CandleCakeBlock(Blocks.CANDLE, FabricBlockSettings.copyOf(Blocks.CANDLE_CAKE)));
    public static final Block WHITE_CANDLE_COCONUT_CAKE = Registry.register(Registries.BLOCK, new Identifier(WoodNFungus.MOD_ID,"white_candle_coconut_cake"),
            new CandleCakeBlock(Blocks.WHITE_CANDLE, FabricBlockSettings.copyOf(Blocks.WHITE_CANDLE_CAKE)));
    public static final Block LIGHT_GRAY_CANDLE_COCONUT_CAKE = Registry.register(Registries.BLOCK, new Identifier(WoodNFungus.MOD_ID,"light_gray_candle_coconut_cake"),
            new CandleCakeBlock(Blocks.LIGHT_GRAY_CANDLE, FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_CANDLE_CAKE)));
    public static final Block GRAY_CANDLE_COCONUT_CAKE = Registry.register(Registries.BLOCK, new Identifier(WoodNFungus.MOD_ID,"gray_candle_coconut_cake"),
            new CandleCakeBlock(Blocks.GRAY_CANDLE, FabricBlockSettings.copyOf(Blocks.GRAY_CANDLE_CAKE)));
    public static final Block BLACK_CANDLE_COCONUT_CAKE = Registry.register(Registries.BLOCK, new Identifier(WoodNFungus.MOD_ID,"black_candle_coconut_cake"),
            new CandleCakeBlock(Blocks.BLACK_CANDLE, FabricBlockSettings.copyOf(Blocks.BLACK_CANDLE_CAKE)));
    public static final Block BROWN_CANDLE_COCONUT_CAKE = Registry.register(Registries.BLOCK, new Identifier(WoodNFungus.MOD_ID,"brown_candle_coconut_cake"),
            new CandleCakeBlock(Blocks.BROWN_CANDLE, FabricBlockSettings.copyOf(Blocks.BROWN_CANDLE_CAKE)));
    public static final Block RED_CANDLE_COCONUT_CAKE = Registry.register(Registries.BLOCK, new Identifier(WoodNFungus.MOD_ID,"red_candle_coconut_cake"),
            new CandleCakeBlock(Blocks.RED_CANDLE, FabricBlockSettings.copyOf(Blocks.RED_CANDLE_CAKE)));
    public static final Block ORANGE_CANDLE_COCONUT_CAKE = Registry.register(Registries.BLOCK, new Identifier(WoodNFungus.MOD_ID,"orange_candle_coconut_cake"),
            new CandleCakeBlock(Blocks.ORANGE_CANDLE, FabricBlockSettings.copyOf(Blocks.ORANGE_CANDLE_CAKE)));
    public static final Block YELLOW_CANDLE_COCONUT_CAKE = Registry.register(Registries.BLOCK, new Identifier(WoodNFungus.MOD_ID,"yellow_candle_coconut_cake"),
            new CandleCakeBlock(Blocks.YELLOW_CANDLE, FabricBlockSettings.copyOf(Blocks.YELLOW_CANDLE_CAKE)));
    public static final Block LIME_CANDLE_COCONUT_CAKE = Registry.register(Registries.BLOCK, new Identifier(WoodNFungus.MOD_ID,"lime_candle_coconut_cake"),
            new CandleCakeBlock(Blocks.LIME_CANDLE, FabricBlockSettings.copyOf(Blocks.LIME_CANDLE_CAKE)));
    public static final Block GREEN_CANDLE_COCONUT_CAKE = Registry.register(Registries.BLOCK, new Identifier(WoodNFungus.MOD_ID,"green_candle_coconut_cake"),
            new CandleCakeBlock(Blocks.GREEN_CANDLE, FabricBlockSettings.copyOf(Blocks.GREEN_CANDLE_CAKE)));
    public static final Block CYAN_CANDLE_COCONUT_CAKE = Registry.register(Registries.BLOCK, new Identifier(WoodNFungus.MOD_ID,"cyan_candle_coconut_cake"),
            new CandleCakeBlock(Blocks.CYAN_CANDLE, FabricBlockSettings.copyOf(Blocks.CYAN_CANDLE_CAKE)));
    public static final Block LIGHT_BLUE_CANDLE_COCONUT_CAKE = Registry.register(Registries.BLOCK, new Identifier(WoodNFungus.MOD_ID,"light_blue_candle_coconut_cake"),
            new CandleCakeBlock(Blocks.LIGHT_BLUE_CANDLE, FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_CANDLE_CAKE)));
    public static final Block BLUE_CANDLE_COCONUT_CAKE = Registry.register(Registries.BLOCK, new Identifier(WoodNFungus.MOD_ID,"blue_candle_coconut_cake"),
            new CandleCakeBlock(Blocks.BLUE_CANDLE, FabricBlockSettings.copyOf(Blocks.BLUE_CANDLE_CAKE)));
    public static final Block PURPLE_CANDLE_COCONUT_CAKE = Registry.register(Registries.BLOCK, new Identifier(WoodNFungus.MOD_ID,"purple_candle_coconut_cake"),
            new CandleCakeBlock(Blocks.PURPLE_CANDLE, FabricBlockSettings.copyOf(Blocks.PURPLE_CANDLE_CAKE)));
    public static final Block MAGENTA_CANDLE_COCONUT_CAKE = Registry.register(Registries.BLOCK, new Identifier(WoodNFungus.MOD_ID,"magenta_candle_coconut_cake"),
            new CandleCakeBlock(Blocks.MAGENTA_CANDLE, FabricBlockSettings.copyOf(Blocks.MAGENTA_CANDLE_CAKE)));
    public static final Block PINK_CANDLE_COCONUT_CAKE = Registry.register(Registries.BLOCK, new Identifier(WoodNFungus.MOD_ID,"pink_candle_coconut_cake"),
            new CandleCakeBlock(Blocks.PINK_CANDLE, FabricBlockSettings.copyOf(Blocks.PINK_CANDLE_CAKE)));




    public static final Block BOULDERBARK_LOG = registerBlock("boulderbark_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).resistance(50000f)));
    public static final Block BOULDERBARK_WOOD = registerBlock("boulderbark_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).resistance(50000f)));
    public static final Block STRIPPED_BOULDERBARK_LOG = registerBlock("stripped_boulderbark_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).resistance(50000f)));
    public static final Block STRIPPED_BOULDERBARK_WOOD = registerBlock("stripped_boulderbark_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).resistance(50000f)));

    public static final Block BOULDERBARK_LEAVES = registerBlock("boulderbark_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque().resistance(5f)));
    public static final Block BOULDERBARK_SAPLING = registerBlock("boulderbark_sapling",
            new BoulderbarkSaplingBlock(new BoulderbarkSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).nonOpaque().resistance(50000f)));
    public static final Block POTTED_BOULDERBARK_SAPLING = Registry.register(Registries.BLOCK, new Identifier(WoodNFungus.MOD_ID, "potted_boulderbark_sapling"),
            new FlowerPotBlock(BOULDERBARK_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING).nonOpaque()));

    public static final Block WHITE_BOULDERBARK_LEAVES = registerBlock("white_boulderbark_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque().resistance(1f)));
    public static final Block LIGHT_GRAY_BOULDERBARK_LEAVES = registerBlock("light_gray_boulderbark_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque().resistance(1f)));
    public static final Block GRAY_BOULDERBARK_LEAVES = registerBlock("gray_boulderbark_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque().resistance(1f)));
    public static final Block BLACK_BOULDERBARK_LEAVES = registerBlock("black_boulderbark_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque().resistance(1f)));
    public static final Block BROWN_BOULDERBARK_LEAVES = registerBlock("brown_boulderbark_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque().resistance(1f)));
    public static final Block RED_BOULDERBARK_LEAVES = registerBlock("red_boulderbark_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque().resistance(1f)));
    public static final Block ORANGE_BOULDERBARK_LEAVES = registerBlock("orange_boulderbark_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque().resistance(1f)));
    public static final Block YELLOW_BOULDERBARK_LEAVES = registerBlock("yellow_boulderbark_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque().resistance(1f)));
    public static final Block LIME_BOULDERBARK_LEAVES = registerBlock("lime_boulderbark_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque().resistance(1f)));
    public static final Block GREEN_BOULDERBARK_LEAVES = registerBlock("green_boulderbark_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque().resistance(1f)));
    public static final Block CYAN_BOULDERBARK_LEAVES = registerBlock("cyan_boulderbark_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque().resistance(1f)));
    public static final Block LIGHT_BLUE_BOULDERBARK_LEAVES = registerBlock("light_blue_boulderbark_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque().resistance(1f)));
    public static final Block BLUE_BOULDERBARK_LEAVES = registerBlock("blue_boulderbark_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque().resistance(1f)));
    public static final Block PURPLE_BOULDERBARK_LEAVES = registerBlock("purple_boulderbark_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque().resistance(1f)));
    public static final Block MAGENTA_BOULDERBARK_LEAVES = registerBlock("magenta_boulderbark_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque().resistance(1f)));
    public static final Block PINK_BOULDERBARK_LEAVES = registerBlock("pink_boulderbark_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque().resistance(1f)));

    public static final Block BOULDERBARK_PLANKS = registerBlock("boulderbark_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).resistance(50000f)));
    public static final Block BOULDERBARK_STAIRS = registerBlock("boulderbark_stairs",
            new StairsBlock(ModBlocks.BOULDERBARK_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).resistance(50000f)));
    public static final Block BOULDERBARK_SLAB = registerBlock("boulderbark_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).resistance(50000f)));
    public static final Block BOULDERBARK_FENCE = registerBlock("boulderbark_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).resistance(50000f)));
    public static final Block BOULDERBARK_FENCE_GATE = registerBlock("boulderbark_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).resistance(50000f), WoodType.OAK));
    public static final Block BOULDERBARK_PRESSURE_PLATE = registerBlock("boulderbark_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).resistance(50000f), BlockSetType.OAK));
    public static final Block BOULDERBARK_BUTTON = registerBlock("boulderbark_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).resistance(50000f), BlockSetType.OAK, 15, true));

    public static final Identifier BOULDERBARK_SIGN_TEXTURE = new Identifier(WoodNFungus.MOD_ID, "entity/signs/boulderbark");
    public static final Identifier BOULDERBARK_HANGING_SIGN_TEXTURE = new Identifier(WoodNFungus.MOD_ID, "entity/signs/hanging/boulderbark");
    public static final Identifier BOULDERBARK_HANGING_GUI_SIGN_TEXTURE = new Identifier(WoodNFungus.MOD_ID, "textures/gui/hanging_signs/boulderbark");
    public static final Block STANDING_BOULDERBARK_SIGN = Registry.register(Registries.BLOCK, new Identifier(WoodNFungus.MOD_ID, "boulderbark_standing_sign"),
            new TerraformSignBlock(BOULDERBARK_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_SIGN).resistance(50000f)));
    public static final Block WALL_BOULDERBARK_SIGN = Registry.register(Registries.BLOCK, new Identifier(WoodNFungus.MOD_ID, "boulderbark_wall_sign"),
            new TerraformWallSignBlock(BOULDERBARK_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN).resistance(50000f)));
    public static final Block HANGING_BOULDERBARK_SIGN = Registry.register(Registries.BLOCK, new Identifier(WoodNFungus.MOD_ID, "boulderbark_hanging_sign"),
            new TerraformHangingSignBlock(BOULDERBARK_HANGING_SIGN_TEXTURE, BOULDERBARK_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN).resistance(50000f)));
    public static final Block WALL_HANGING_BOULDERBARK_SIGN = Registry.register(Registries.BLOCK, new Identifier(WoodNFungus.MOD_ID, "boulderbark_wall_hanging_sign"),
            new TerraformWallHangingSignBlock(BOULDERBARK_HANGING_SIGN_TEXTURE, BOULDERBARK_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).resistance(50000f)));
    public static final BlockFamily BOULDERBARK_FAMILY = BlockFamilies.register(ModBlocks.BOULDERBARK_PLANKS)
            .sign(ModBlocks.STANDING_BOULDERBARK_SIGN, ModBlocks.WALL_BOULDERBARK_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();

    public static final Block SAVORSHROOM_STEM = registerBlock("savorshroom_stem",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.WARPED_STEM)));
    public static final Block SAVORSHROOM_HYPHAE = registerBlock("savorshroom_hyphae",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.WARPED_HYPHAE)));
    public static final Block STRIPPED_SAVORSHROOM_STEM = registerBlock("stripped_savorshroom_stem",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_WARPED_STEM)));
    public static final Block STRIPPED_SAVORSHROOM_HYPHAE = registerBlock("stripped_savorshroom_hyphae",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_WARPED_HYPHAE)));

    public static final Block SAVORSHROOM_BLOCK = registerBlock("savorshroom_block",
            new MushroomBlock(FabricBlockSettings.copyOf(Blocks.WARPED_WART_BLOCK)));

    public static final Block SAVORSHROOM_PLANKS = registerBlock("savorshroom_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS)));
    public static final Block SAVORSHROOM_STAIRS = registerBlock("savorshroom_stairs",
            new StairsBlock(ModBlocks.SAVORSHROOM_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS)));
    public static final Block SAVORSHROOM_SLAB = registerBlock("savorshroom_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS)));
    public static final Block SAVORSHROOM_FENCE = registerBlock("savorshroom_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS)));
    public static final Block SAVORSHROOM_FENCE_GATE = registerBlock("savorshroom_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS), WoodType.WARPED));
    public static final Block SAVORSHROOM_PRESSURE_PLATE = registerBlock("savorshroom_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS), BlockSetType.WARPED));
    public static final Block SAVORSHROOM_BUTTON = registerBlock("savorshroom_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS), BlockSetType.WARPED, 15, true));

    public static final Block PETRIFIED_LOG = registerBlock("petrified_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.BLACKSTONE)));
    public static final Block PETRIFIED_WOOD = registerBlock("petrified_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.BLACKSTONE)));
    public static final Block STRIPPED_PETRIFIED_LOG = registerBlock("stripped_petrified_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.BLACKSTONE)));
    public static final Block STRIPPED_PETRIFIED_WOOD = registerBlock("stripped_petrified_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.BLACKSTONE)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(WoodNFungus.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(WoodNFungus.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        WoodNFungus.LOGGER.info("Registering Mod Blocks for " + WoodNFungus.MOD_ID);
    }
}
