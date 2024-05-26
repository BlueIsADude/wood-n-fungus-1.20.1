package net.bluethedude.woodnfungus.block.entities.client;

import net.bluethedude.woodnfungus.WoodNFungus;
import net.bluethedude.woodnfungus.block.entities.custom.MusherEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;

@Environment(EnvType.CLIENT)
public class MusherRenderer extends MobEntityRenderer<MusherEntity, MusherModel<MusherEntity>> {
    private static final Identifier CALM_TEXTURE = new Identifier(WoodNFungus.MOD_ID, "textures/entity/musher/musher.png");
    private static final Identifier ANGRY_TEXTURE = new Identifier(WoodNFungus.MOD_ID, "textures/entity/musher/musher_angry.png");

    public MusherRenderer(EntityRendererFactory.Context context) {
        super(context, new MusherModel<>(context.getPart(ModModelLayers.MUSHER)), 0.6f);
    }

    protected void scale(MusherEntity musherEntity, MatrixStack matrixStack, float f) {
        float g = musherEntity.getClientFuseTime(f);
        float h = 1.0F + MathHelper.sin(g * 100.0F) * g * 0.01F;
        g = MathHelper.clamp(g, 0.0F, 1.0F);
        g *= g;
        g *= g;
        float i = (1.0F + g * 0.4F) * h;
        float j = (1.0F + g * 0.1F) / h;
        matrixStack.scale(i, j, i);
    }

    protected float getAnimationCounter(MusherEntity musherEntity, float f) {
        float g = musherEntity.getClientFuseTime(f);
        return (int)(g * 10.0F) % 2 == 0 ? 0.0F : MathHelper.clamp(g, 0.5F, 1.0F);
    }

    @Override
    public Identifier getTexture(MusherEntity musherEntity) {
            return musherEntity.hasAngerTime() ? ANGRY_TEXTURE : CALM_TEXTURE;
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
