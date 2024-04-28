package net.bluethedude.woodnfungus.block.entities;

import net.bluethedude.woodnfungus.WoodNFungus;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.bluethedude.woodnfungus.block.ModBlocks.*;

public class ModBlockEntities {

    public static final BlockEntityType<ModSignBlockEntity> MOD_SIGN_BLOCK_ENTITY = Registry.register(
            Registries.BLOCK_ENTITY_TYPE,
            new Identifier(WoodNFungus.MOD_ID, "mod_sign_entity"),
            FabricBlockEntityTypeBuilder.create(ModSignBlockEntity::new,
                    PALM_SIGN, PALM_WALL_SIGN,
                    BOULDERBARK_SIGN, BOULDERBARK_WALL_SIGN,
                    SAVORSHROOM_SIGN, SAVORSHROOM_WALL_SIGN
            ).build());

    public static final BlockEntityType<ModHangingSignBlockEntity> MOD_HANGING_SIGN_BLOCK_ENTITY = Registry.register
            (Registries.BLOCK_ENTITY_TYPE,
            new Identifier(WoodNFungus.MOD_ID, "mod_hanging_sign_entity"),
            FabricBlockEntityTypeBuilder.create(ModHangingSignBlockEntity::new,
                    PALM_HANGING_SIGN, PALM_WALL_HANGING_SIGN,
                    BOULDERBARK_HANGING_SIGN, BOULDERBARK_WALL_HANGING_SIGN,
                    SAVORSHROOM_HANGING_SIGN, SAVORSHROOM_WALL_HANGING_SIGN
            ).build());


    public static void registerBlockEntities() {
        WoodNFungus.LOGGER.info("Registering Block Entities for " + WoodNFungus.MOD_ID);
    }
}
