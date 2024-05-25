package net.bluethedude.woodnfungus.block.entities.client;

import net.bluethedude.woodnfungus.block.entities.animation.ModAnimations;
import net.bluethedude.woodnfungus.block.entities.custom.MusherEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;

public class MusherModel <T extends MusherEntity> extends SinglePartEntityModel<T> {
	private final ModelPart musher;
	private final ModelPart head;
	public MusherModel(ModelPart root) {
		this.musher = root.getChild("musher");
		this.head = musher.getChild("body").getChild("head");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData musher = modelPartData.addChild("musher", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 10.0F, 0.0F));

		ModelPartData body = musher.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 8.0F, 0.0F));

		ModelPartData head = body.addChild("head", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -8.0F, 0.0F));

		ModelPartData cap = head.addChild("cap", ModelPartBuilder.create().uv(0, 0).cuboid(-9.0F, -8.0F, -7.0F, 18.0F, 8.0F, 14.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -8.0F, 0.0F));

		ModelPartData face = head.addChild("face", ModelPartBuilder.create().uv(0, 22).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F))
				.uv(32, 32).cuboid(2.0F, -8.0F, -5.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F))
				.uv(32, 32).cuboid(-5.0F, -3.0F, 3.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData torso = body.addChild("torso", ModelPartBuilder.create().uv(0, 38).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F))
				.uv(48, 22).cuboid(-5.0F, -5.0F, -5.0F, 4.0F, 3.0F, 4.0F, new Dilation(0.0F))
				.uv(48, 22).cuboid(1.0F, -7.0F, 1.0F, 4.0F, 3.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData legs = musher.addChild("legs", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 14.0F, 0.0F));

		ModelPartData backrightleg = legs.addChild("backrightleg", ModelPartBuilder.create().uv(32, 22).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.0F, -6.0F, 4.0F));

		ModelPartData frontrightleg = legs.addChild("frontrightleg", ModelPartBuilder.create().uv(32, 22).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-4.0F, -6.0F, -4.0F));

		ModelPartData backleftleg = legs.addChild("backleftleg", ModelPartBuilder.create().uv(32, 22).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(3.0F, -6.0F, 4.0F));

		ModelPartData frontleftleg = legs.addChild("frontleftleg", ModelPartBuilder.create().uv(32, 22).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(4.0F, -6.0F, -4.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(MusherEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);
		this.setHeadAngles(netHeadYaw, headPitch);

		this.animateMovement(ModAnimations.MUSHER_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.updateAnimation(entity.idleAnimationState, ModAnimations.MUSHER_IDLE, ageInTicks, 1f);
	}

	private void setHeadAngles(float headYaw, float headPitch) {
		headYaw = MathHelper.clamp(headYaw, -30.0f, 30.0f);
		headPitch = MathHelper.clamp(headPitch, -25.0f, 45.0f);

		this.head.yaw = headYaw * 0.017453292f;
		this.head.pitch = headPitch * 0.017453292f;
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		musher.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return musher;
	}
}