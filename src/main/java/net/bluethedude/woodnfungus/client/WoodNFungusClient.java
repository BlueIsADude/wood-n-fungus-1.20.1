package net.bluethedude.woodnfungus.client;

import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import net.bluethedude.woodnfungus.block.ModBlocks;
import net.bluethedude.woodnfungus.block.entities.ModBlockEntities;
import net.bluethedude.woodnfungus.block.entities.ModEntities;
import net.bluethedude.woodnfungus.block.entities.client.ModModelLayers;
import net.bluethedude.woodnfungus.block.entities.client.MusherModel;
import net.bluethedude.woodnfungus.block.entities.client.MusherRenderer;
import net.bluethedude.woodnfungus.entity.ModBoats;
import net.bluethedude.woodnfungus.util.ModWoodTypes;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.TexturedRenderLayers;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.minecraft.client.render.block.entity.HangingSignBlockEntityRenderer;
import net.minecraft.client.render.block.entity.SignBlockEntityRenderer;

public class WoodNFungusClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PALM_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PALM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_PALM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PALM_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PALM_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BOULDERBARK_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BOULDERBARK_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_BOULDERBARK_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BOULDERBARK_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BOULDERBARK_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SAVORSHROOM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_SAVORSHROOM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SAVORSHROOM_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SAVORSHROOM_TRAPDOOR, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WHITE_BOULDERBARK_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIGHT_GRAY_BOULDERBARK_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRAY_BOULDERBARK_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLACK_BOULDERBARK_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BROWN_BOULDERBARK_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RED_BOULDERBARK_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ORANGE_BOULDERBARK_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.YELLOW_BOULDERBARK_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIME_BOULDERBARK_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GREEN_BOULDERBARK_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CYAN_BOULDERBARK_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIGHT_BLUE_BOULDERBARK_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLUE_BOULDERBARK_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PURPLE_BOULDERBARK_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MAGENTA_BOULDERBARK_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_BOULDERBARK_LEAVES, RenderLayer.getCutout());

        BlockEntityRendererFactories.register(ModBlockEntities.MOD_SIGN_BLOCK_ENTITY, SignBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.MOD_HANGING_SIGN_BLOCK_ENTITY, HangingSignBlockEntityRenderer::new);

        TexturedRenderLayers.SIGN_TYPE_TEXTURES.put(ModWoodTypes.PALM, TexturedRenderLayers.getSignTextureId(ModWoodTypes.PALM));
        TexturedRenderLayers.SIGN_TYPE_TEXTURES.put(ModWoodTypes.BOULDERBARK, TexturedRenderLayers.getSignTextureId(ModWoodTypes.BOULDERBARK));
        TexturedRenderLayers.SIGN_TYPE_TEXTURES.put(ModWoodTypes.SAVORSHROOM, TexturedRenderLayers.getSignTextureId(ModWoodTypes.SAVORSHROOM));

        TerraformBoatClientHelper.registerModelLayers(ModBoats.PALM_BOAT_ID, false);
        TerraformBoatClientHelper.registerModelLayers(ModBoats.BOULDERBARK_BOAT_ID, false);

        EntityRendererRegistry.register(ModEntities.MUSHER, MusherRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.MUSHER, MusherModel::getTexturedModelData);
    }
}
