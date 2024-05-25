package net.bluethedude.woodnfungus.block.entities.client;

import net.bluethedude.woodnfungus.WoodNFungus;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
    public static final EntityModelLayer MUSHER =
            new EntityModelLayer(new Identifier(WoodNFungus.MOD_ID, "musher"), "main");
}
