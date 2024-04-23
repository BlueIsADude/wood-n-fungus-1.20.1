package net.bluethedude.woodnfungus.mixin;

import net.bluethedude.woodnfungus.item.ModItems;
import net.bluethedude.woodnfungus.item.custom.CoconutMilkItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

@Mixin(CoconutMilkItem.class)
public abstract class CoconutMilkMixin {
    @Inject(method = "finishUsing", at = @At(value = "RETURN"), cancellable = true)
    private void finishUsing(ItemStack stack, World world, LivingEntity user, CallbackInfoReturnable<ItemStack> info) {
        if (!(user instanceof PlayerEntity playerEntity) || ((PlayerEntity)user).getAbilities().creativeMode) {
            return;
        }

        if (!info.getReturnValue().getItem().equals(ModItems.COCONUT_MILK)) {
            return;
        }

        ItemStack output = new ItemStack(ModItems.COCONUT_SHELL);
        if (!playerEntity.getInventory().insertStack(output)) {
            playerEntity.dropItem(output, false);
        }

        info.setReturnValue(stack);
    }
}