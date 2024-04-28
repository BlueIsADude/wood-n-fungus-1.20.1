package net.bluethedude.woodnfungus.datagen;

import net.bluethedude.woodnfungus.block.ModBlocks;
import net.bluethedude.woodnfungus.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PALM_LEAVES);
        blockStateModelGenerator.registerLog(ModBlocks.PALM_LOG).log(ModBlocks.PALM_LOG).wood(ModBlocks.PALM_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_PALM_LOG).log(ModBlocks.STRIPPED_PALM_LOG).wood(ModBlocks.STRIPPED_PALM_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.PALM_CORE_LOG).log(ModBlocks.PALM_CORE_LOG).wood(ModBlocks.PALM_CORE_WOOD);
        BlockStateModelGenerator.BlockTexturePool palmPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PALM_PLANKS);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PALM_SAPLING, ModBlocks.POTTED_PALM_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        palmPool.stairs(ModBlocks.PALM_STAIRS);
        palmPool.slab(ModBlocks.PALM_SLAB);
        palmPool.button(ModBlocks.PALM_BUTTON);
        palmPool.pressurePlate(ModBlocks.PALM_PRESSURE_PLATE);
        palmPool.fence(ModBlocks.PALM_FENCE);
        palmPool.fenceGate(ModBlocks.PALM_FENCE_GATE);
        palmPool.family(BlockFamilies.register(ModBlocks.PALM_PLANKS).sign(ModBlocks.PALM_SIGN, ModBlocks.PALM_WALL_SIGN).build());

        blockStateModelGenerator.registerHangingSign(ModBlocks.STRIPPED_PALM_LOG, ModBlocks.PALM_HANGING_SIGN, ModBlocks.PALM_WALL_HANGING_SIGN);

        blockStateModelGenerator.registerDoor(ModBlocks.PALM_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.PALM_TRAPDOOR);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BOULDERBARK_LEAVES);
        blockStateModelGenerator.registerLog(ModBlocks.BOULDERBARK_LOG).log(ModBlocks.BOULDERBARK_LOG).wood(ModBlocks.BOULDERBARK_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_BOULDERBARK_LOG).log(ModBlocks.STRIPPED_BOULDERBARK_LOG).wood(ModBlocks.STRIPPED_BOULDERBARK_WOOD);
        BlockStateModelGenerator.BlockTexturePool boulderbarkPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BOULDERBARK_PLANKS);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BOULDERBARK_SAPLING, ModBlocks.POTTED_BOULDERBARK_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        boulderbarkPool.stairs(ModBlocks.BOULDERBARK_STAIRS);
        boulderbarkPool.slab(ModBlocks.BOULDERBARK_SLAB);
        boulderbarkPool.button(ModBlocks.BOULDERBARK_BUTTON);
        boulderbarkPool.pressurePlate(ModBlocks.BOULDERBARK_PRESSURE_PLATE);
        boulderbarkPool.fence(ModBlocks.BOULDERBARK_FENCE);
        boulderbarkPool.fenceGate(ModBlocks.BOULDERBARK_FENCE_GATE);
        boulderbarkPool.family(BlockFamilies.register(ModBlocks.BOULDERBARK_PLANKS).sign(ModBlocks.BOULDERBARK_SIGN, ModBlocks.BOULDERBARK_WALL_SIGN).build());

        blockStateModelGenerator.registerHangingSign(ModBlocks.STRIPPED_BOULDERBARK_LOG, ModBlocks.BOULDERBARK_HANGING_SIGN, ModBlocks.BOULDERBARK_WALL_HANGING_SIGN);

        blockStateModelGenerator.registerDoor(ModBlocks.BOULDERBARK_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.BOULDERBARK_TRAPDOOR);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_BOULDERBARK_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_GRAY_BOULDERBARK_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GRAY_BOULDERBARK_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLACK_BOULDERBARK_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BROWN_BOULDERBARK_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_BOULDERBARK_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORANGE_BOULDERBARK_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.YELLOW_BOULDERBARK_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIME_BOULDERBARK_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GREEN_BOULDERBARK_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CYAN_BOULDERBARK_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_BLUE_BOULDERBARK_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_BOULDERBARK_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPLE_BOULDERBARK_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAGENTA_BOULDERBARK_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_BOULDERBARK_LEAVES);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SAVORSHROOM_BLOCK);
        blockStateModelGenerator.registerLog(ModBlocks.SAVORSHROOM_STEM).log(ModBlocks.SAVORSHROOM_STEM).wood(ModBlocks.SAVORSHROOM_HYPHAE);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_SAVORSHROOM_STEM).log(ModBlocks.STRIPPED_SAVORSHROOM_STEM).wood(ModBlocks.STRIPPED_SAVORSHROOM_HYPHAE);
        BlockStateModelGenerator.BlockTexturePool savorshroomPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SAVORSHROOM_PLANKS);

        savorshroomPool.stairs(ModBlocks.SAVORSHROOM_STAIRS);
        savorshroomPool.slab(ModBlocks.SAVORSHROOM_SLAB);
        savorshroomPool.button(ModBlocks.SAVORSHROOM_BUTTON);
        savorshroomPool.pressurePlate(ModBlocks.SAVORSHROOM_PRESSURE_PLATE);
        savorshroomPool.fence(ModBlocks.SAVORSHROOM_FENCE);
        savorshroomPool.fenceGate(ModBlocks.SAVORSHROOM_FENCE_GATE);
        savorshroomPool.family(BlockFamilies.register(ModBlocks.SAVORSHROOM_PLANKS).sign(ModBlocks.SAVORSHROOM_SIGN, ModBlocks.SAVORSHROOM_WALL_SIGN).build());

        blockStateModelGenerator.registerHangingSign(ModBlocks.STRIPPED_SAVORSHROOM_STEM, ModBlocks.SAVORSHROOM_HANGING_SIGN, ModBlocks.SAVORSHROOM_WALL_HANGING_SIGN);

        blockStateModelGenerator.registerDoor(ModBlocks.SAVORSHROOM_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.SAVORSHROOM_TRAPDOOR);

        blockStateModelGenerator.registerLog(ModBlocks.PETRIFIED_LOG).log(ModBlocks.PETRIFIED_LOG).wood(ModBlocks.PETRIFIED_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_PETRIFIED_LOG).log(ModBlocks.STRIPPED_PETRIFIED_LOG).wood(ModBlocks.STRIPPED_PETRIFIED_WOOD);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.COCONUT, Models.GENERATED);
        itemModelGenerator.register(ModItems.COCONUT_MILK, Models.GENERATED);
        itemModelGenerator.register(ModItems.COCONUT_SHELL, Models.GENERATED);
        itemModelGenerator.register(ModBlocks.COCONUT_CAKE.asItem(), Models.GENERATED);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.COCONUT_HELMET));

        itemModelGenerator.register(ModItems.PALM_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.PALM_CHEST_BOAT, Models.GENERATED);

        itemModelGenerator.register(ModItems.BOULDERBARK_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BOULDERBARK_CHEST_BOAT, Models.GENERATED);

        itemModelGenerator.register(ModItems.ROASTED_SAVORSHROOM, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROASTED_SAVORSHROOM_CHUNKS, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROASTED_SAVORSHROOM_SCRAPS, Models.GENERATED);
    }
}
