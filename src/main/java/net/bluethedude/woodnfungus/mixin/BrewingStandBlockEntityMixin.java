package net.bluethedude.woodnfungus.mixin;

import net.bluethedude.woodnfungus.item.ModItems;
import net.minecraft.block.entity.BrewingStandBlockEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PotionItem;
import net.minecraft.potion.PotionUtil;
import net.minecraft.potion.Potions;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldEvents;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BrewingStandBlockEntity.class)
public class BrewingStandBlockEntityMixin {

    @Inject(method = "canCraft", at = @At("HEAD"), cancellable = true)
    private static void checkCraftPlant(DefaultedList<ItemStack> slots, CallbackInfoReturnable<Boolean> cir) {
        if (ModItems.PETRIFIED_SEEDS == null) return;
        if (!slots.get(3).isOf(ModItems.PETRIFIED_SEEDS)) return;

        for (int i = 0; i < 3; i++) {
            if (!(slots.get(i).getItem() instanceof PotionItem)) continue;
            if (!PotionUtil.getPotion(slots.get(i)).equals(Potions.WATER)) continue;

            cir.setReturnValue(true);
            return;
        }
    }

    @Inject(method = "canCraft", at = @At("HEAD"), cancellable = true)
    private static void checkCraftSpore(DefaultedList<ItemStack> slots, CallbackInfoReturnable<Boolean> cir) {
        if (ModItems.AMBER_FUNGUS == null) return;
        if (!slots.get(3).isOf(ModItems.AMBER_FUNGUS)) return;

        for (int i = 0; i < 3; i++) {
        if (!(slots.get(i).getItem() instanceof PotionItem)) continue;
        if (!PotionUtil.getPotion(slots.get(i)).equals(Potions.WATER)) continue;

        cir.setReturnValue(true);
        return;
    }
}

    @Inject(method = "craft", at = @At("HEAD"), cancellable = true)
    private static void doCraftPlant(World world, BlockPos pos, DefaultedList<ItemStack> slots, CallbackInfo ci) {
        var addition = slots.get(3);

        if (ModItems.PETRIFIED_SEEDS == null) return;
        if (!addition.isOf(ModItems.PETRIFIED_SEEDS)) return;

        addition.decrement(1);

        for (int i = 0; i < 3; i++) {
            if (!(slots.get(i).getItem() instanceof PotionItem)) continue;
            if (!PotionUtil.getPotion(slots.get(i)).equals(Potions.WATER)) continue;

            slots.set(i, new ItemStack(ModItems.PLANT_VIAL));
        }
        world.syncWorldEvent(WorldEvents.BREWING_STAND_BREWS, pos, 0);
        ci.cancel();
    }

    @Inject(method = "craft", at = @At("HEAD"), cancellable = true)
    private static void doCraftSpore(World world, BlockPos pos, DefaultedList<ItemStack> slots, CallbackInfo ci) {
        var addition = slots.get(3);

        if (ModItems.AMBER_FUNGUS == null) return;
        if (!addition.isOf(ModItems.AMBER_FUNGUS)) return;

        addition.decrement(1);

        for (int i = 0; i < 3; i++) {
            if (!(slots.get(i).getItem() instanceof PotionItem)) continue;
            if (!PotionUtil.getPotion(slots.get(i)).equals(Potions.WATER)) continue;

            slots.set(i, new ItemStack(ModItems.SPORE_VIAL));
        }
        world.syncWorldEvent(WorldEvents.BREWING_STAND_BREWS, pos, 0);
        ci.cancel();
    }
}
