package net.bluethedude.woodnfungus.block.entities;

import net.bluethedude.woodnfungus.WoodNFungus;
import net.bluethedude.woodnfungus.block.entities.custom.MusherEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<MusherEntity> MUSHER = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(WoodNFungus.MOD_ID, "musher"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, MusherEntity::new)
                    .dimensions(EntityDimensions.fixed(1f, 2f)).build());
}
