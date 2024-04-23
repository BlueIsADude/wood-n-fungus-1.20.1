package net.bluethedude.woodnfungus.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static FoodComponent SAVORSHROOM_SCRAPS = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).snack().build();
    public static FoodComponent SAVORSHROOM_CHUNKS = new FoodComponent.Builder().hunger(5).saturationModifier(0.4f).build();
}
