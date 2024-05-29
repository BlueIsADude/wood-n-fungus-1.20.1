package net.bluethedude.woodnfungus.mixin;

import net.bluethedude.woodnfungus.item.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.BrewingRecipeRegistry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BrewingRecipeRegistry.class)
public class BrewingRecipeRegistryMixin {

    @Inject(method = "isValidIngredient", at = @At("HEAD"), cancellable = true)
    private static void allowFossils(ItemStack stack, CallbackInfoReturnable<Boolean> cir) {
        if (ModItems.PETRIFIED_SEEDS == null) return;
        if (stack.isOf(ModItems.PETRIFIED_SEEDS)) cir.setReturnValue(true);

        if (ModItems.AMBER_FUNGUS == null) return;
        if (stack.isOf(ModItems.AMBER_FUNGUS)) cir.setReturnValue(true);
    }
}
