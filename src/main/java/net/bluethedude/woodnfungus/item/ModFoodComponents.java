package net.bluethedude.woodnfungus.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static FoodComponent COCONUT_MILK = new FoodComponent.Builder().hunger(3).saturationModifier(0.2f).build();
    public static FoodComponent SAVORSHROOM_SCRAPS = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).snack().build();
}
