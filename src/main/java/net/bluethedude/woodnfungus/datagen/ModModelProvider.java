package net.bluethedude.woodnfungus.datagen;

import net.bluethedude.woodnfungus.block.ModBlocks;
import net.bluethedude.woodnfungus.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PALM_LEAVES);
        blockStateModelGenerator.registerLog(ModBlocks.PALM_LOG).log(ModBlocks.PALM_LOG).wood(ModBlocks.PALM_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_PALM_LOG).log(ModBlocks.STRIPPED_PALM_LOG).wood(ModBlocks.STRIPPED_PALM_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PALM_CORE);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PALM_SAPLING, ModBlocks.POTTED_PALM_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        BlockStateModelGenerator.BlockTexturePool palmPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PALM_PLANKS);

        palmPool.stairs(ModBlocks.PALM_STAIRS);
        palmPool.slab(ModBlocks.PALM_SLAB);
        palmPool.fence(ModBlocks.PALM_FENCE);
        palmPool.fenceGate(ModBlocks.PALM_FENCE_GATE);
        palmPool.button(ModBlocks.PALM_BUTTON);
        palmPool.pressurePlate(ModBlocks.PALM_PRESSURE_PLATE);
        blockStateModelGenerator.registerDoor(ModBlocks.PALM_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.PALM_TRAPDOOR);
        blockStateModelGenerator.registerHangingSign(ModBlocks.STRIPPED_PALM_LOG, ModBlocks.PALM_HANGING_SIGN, ModBlocks.PALM_WALL_HANGING_SIGN);
        blockStateModelGenerator.registerHangingSign(ModBlocks.PALM_PLANKS, ModBlocks.PALM_SIGN, ModBlocks.PALM_WALL_SIGN);


        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BOULDERBARK_LEAVES);
        blockStateModelGenerator.registerLog(ModBlocks.BOULDERBARK_LOG).log(ModBlocks.BOULDERBARK_LOG).wood(ModBlocks.BOULDERBARK_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_BOULDERBARK_LOG).log(ModBlocks.STRIPPED_BOULDERBARK_LOG).wood(ModBlocks.STRIPPED_BOULDERBARK_WOOD);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BOULDERBARK_SAPLING, ModBlocks.POTTED_BOULDERBARK_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        BlockStateModelGenerator.BlockTexturePool boulderbarkPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BOULDERBARK_PLANKS);

        boulderbarkPool.stairs(ModBlocks.BOULDERBARK_STAIRS);
        boulderbarkPool.slab(ModBlocks.BOULDERBARK_SLAB);
        boulderbarkPool.fence(ModBlocks.BOULDERBARK_FENCE);
        boulderbarkPool.fenceGate(ModBlocks.BOULDERBARK_FENCE_GATE);
        boulderbarkPool.button(ModBlocks.BOULDERBARK_BUTTON);
        boulderbarkPool.pressurePlate(ModBlocks.BOULDERBARK_PRESSURE_PLATE);
        blockStateModelGenerator.registerDoor(ModBlocks.BOULDERBARK_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.BOULDERBARK_TRAPDOOR);
        blockStateModelGenerator.registerHangingSign(ModBlocks.STRIPPED_BOULDERBARK_LOG, ModBlocks.BOULDERBARK_HANGING_SIGN, ModBlocks.BOULDERBARK_WALL_HANGING_SIGN);
        blockStateModelGenerator.registerHangingSign(ModBlocks.BOULDERBARK_PLANKS, ModBlocks.BOULDERBARK_SIGN, ModBlocks.BOULDERBARK_WALL_SIGN);

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


        BlockStateModelGenerator.BlockTexturePool devilsToothPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEVILS_TOOTH_PLANKS);

        devilsToothPool.stairs(ModBlocks.DEVILS_TOOTH_STAIRS);
        devilsToothPool.slab(ModBlocks.DEVILS_TOOTH_SLAB);
        devilsToothPool.fence(ModBlocks.DEVILS_TOOTH_FENCE);
        devilsToothPool.fenceGate(ModBlocks.DEVILS_TOOTH_FENCE_GATE);
        devilsToothPool.button(ModBlocks.DEVILS_TOOTH_BUTTON);
        devilsToothPool.pressurePlate(ModBlocks.DEVILS_TOOTH_PRESSURE_PLATE);

        BlockStateModelGenerator.BlockTexturePool stainedDevilsToothPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.STAINED_DEVILS_TOOTH_PLANKS);

        stainedDevilsToothPool.stairs(ModBlocks.STAINED_DEVILS_TOOTH_STAIRS);
        stainedDevilsToothPool.slab(ModBlocks.STAINED_DEVILS_TOOTH_SLAB);
        stainedDevilsToothPool.fence(ModBlocks.STAINED_DEVILS_TOOTH_FENCE);
        stainedDevilsToothPool.fenceGate(ModBlocks.STAINED_DEVILS_TOOTH_FENCE_GATE);
        stainedDevilsToothPool.button(ModBlocks.STAINED_DEVILS_TOOTH_BUTTON);
        stainedDevilsToothPool.pressurePlate(ModBlocks.STAINED_DEVILS_TOOTH_PRESSURE_PLATE);


        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SAVORSHROOM_BLOCK);
        blockStateModelGenerator.registerLog(ModBlocks.SAVORSHROOM_STEM).log(ModBlocks.SAVORSHROOM_STEM).wood(ModBlocks.SAVORSHROOM_HYPHAE);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_SAVORSHROOM_STEM).log(ModBlocks.STRIPPED_SAVORSHROOM_STEM).wood(ModBlocks.STRIPPED_SAVORSHROOM_HYPHAE);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.SAVORSHROOM, ModBlocks.POTTED_SAVORSHROOM, BlockStateModelGenerator.TintType.NOT_TINTED);

        BlockStateModelGenerator.BlockTexturePool savorshroomPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SAVORSHROOM_PLANKS);

        savorshroomPool.stairs(ModBlocks.SAVORSHROOM_STAIRS);
        savorshroomPool.slab(ModBlocks.SAVORSHROOM_SLAB);
        savorshroomPool.fence(ModBlocks.SAVORSHROOM_FENCE);
        savorshroomPool.fenceGate(ModBlocks.SAVORSHROOM_FENCE_GATE);
        savorshroomPool.button(ModBlocks.SAVORSHROOM_BUTTON);
        savorshroomPool.pressurePlate(ModBlocks.SAVORSHROOM_PRESSURE_PLATE);
        blockStateModelGenerator.registerDoor(ModBlocks.SAVORSHROOM_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.SAVORSHROOM_TRAPDOOR);
        blockStateModelGenerator.registerHangingSign(ModBlocks.STRIPPED_SAVORSHROOM_STEM, ModBlocks.SAVORSHROOM_HANGING_SIGN, ModBlocks.SAVORSHROOM_WALL_HANGING_SIGN);
        blockStateModelGenerator.registerHangingSign(ModBlocks.SAVORSHROOM_PLANKS, ModBlocks.SAVORSHROOM_SIGN, ModBlocks.SAVORSHROOM_WALL_SIGN);


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.PETRIFIED_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.AMBER_FUNGUS, Models.GENERATED);

        itemModelGenerator.register(ModBlocks.COCONUT.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModItems.COCONUT_MILK, Models.GENERATED);
        itemModelGenerator.register(ModItems.COCONUT_SHELL, Models.GENERATED);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.COCONUT_HELMET));

        itemModelGenerator.register(ModItems.PALM_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.PALM_CHEST_BOAT, Models.GENERATED);

        itemModelGenerator.register(ModItems.BOULDERBARK_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BOULDERBARK_CHEST_BOAT, Models.GENERATED);

        itemModelGenerator.register(ModItems.ROASTED_SAVORSHROOM, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROASTED_SAVORSHROOM_CHUNKS, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROASTED_SAVORSHROOM_SCRAPS, Models.GENERATED);

        itemModelGenerator.register(ModItems.MUSHER_SPAWN_EGG,
                new Model(Optional.of(new Identifier("item/template_spawn_egg")), Optional.empty()));

        itemModelGenerator.register(ModItems.BLOPPO, Models.GENERATED);
    }
}
