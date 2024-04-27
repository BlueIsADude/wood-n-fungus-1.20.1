package net.bluethedude.woodnfungus.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent SAVORSHROOM = new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build();
    public static final FoodComponent SAVORSHROOM_CHUNKS = new FoodComponent.Builder().hunger(5).saturationModifier(0.4f).build();
    public static final FoodComponent SAVORSHROOM_SCRAPS = new FoodComponent.Builder().hunger(1).saturationModifier(0.2f).snack().build();

}
