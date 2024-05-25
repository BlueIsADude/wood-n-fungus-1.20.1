package net.bluethedude.woodnfungus.block.entities.client;

import net.bluethedude.woodnfungus.WoodNFungus;
import net.bluethedude.woodnfungus.block.entities.custom.MusherEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class MusherRenderer extends MobEntityRenderer<MusherEntity, MusherModel<MusherEntity>> {
    private static final Identifier TEXTURE = new Identifier(WoodNFungus.MOD_ID, "textures/entity/musher.png");

    public MusherRenderer(EntityRendererFactory.Context context) {
        super(context, new MusherModel<>(context.getPart(ModModelLayers.MUSHER)), 0.8f);
    }

    @Override
    public Identifier getTexture(MusherEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(MusherEntity mobEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        if (mobEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }
        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
