package net.bluethedude.woodnfungus.mixin.signs;

import net.bluethedude.woodnfungus.WoodNFungus;
import net.bluethedude.woodnfungus.util.ModWoodTypes;
import net.minecraft.block.WoodType;
import net.minecraft.client.render.TexturedRenderLayers;
import net.minecraft.client.util.SpriteIdentifier;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(TexturedRenderLayers.class)
public abstract class TexturedRenderLayersMixin {
    @Inject(method = "getSignTextureId", at = @At("RETURN"), cancellable = true)
    private static void inject(WoodType signType, CallbackInfoReturnable<SpriteIdentifier> cir) {
        if (signType.equals(ModWoodTypes.PALM)) {
            cir.setReturnValue(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, new Identifier(WoodNFungus.MOD_ID, "entity/signs/palm")));
        }
    }

    @Inject(method = "getHangingSignTextureId", at = @At("RETURN"), cancellable = true)
    private static void injectHanging(WoodType signType, CallbackInfoReturnable<SpriteIdentifier> cir) {
        if (signType.equals(ModWoodTypes.PALM)) {
            cir.setReturnValue(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, new Identifier(WoodNFungus.MOD_ID, "entity/signs/hanging/palm")));
        }
    }
}
