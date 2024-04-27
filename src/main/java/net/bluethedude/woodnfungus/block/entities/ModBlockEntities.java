package net.bluethedude.woodnfungus.block.entities;

import net.bluethedude.woodnfungus.WoodNFungus;
import net.bluethedude.woodnfungus.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<ModSignBlockEntity> MOD_SIGN_BLOCK_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(WoodNFungus.MOD_ID, "sign"),
            FabricBlockEntityTypeBuilder.create(ModSignBlockEntity::new, ModBlocks.PALM_SIGN, ModBlocks.PALM_WALL_SIGN).build());
    public static final BlockEntityType<ModHangingSignBlockEntity> MOD_HANGING_SIGN_BLOCK_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(WoodNFungus.MOD_ID, "hanging_sign"),
            FabricBlockEntityTypeBuilder.create(ModHangingSignBlockEntity::new, ModBlocks.PALM_HANGING_SIGN, ModBlocks.PALM_WALL_HANGING_SIGN).build());


    public static void registerBlockEntities() {
        WoodNFungus.LOGGER.info("Registering Block Entities for " + WoodNFungus.MOD_ID);
    }
}
