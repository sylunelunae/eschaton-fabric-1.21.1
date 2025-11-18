package net.sylune.eschaton.item;

import net.minecraft.component.type.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent WATER_ELIXIR = new FoodComponent.Builder()
            .nutrition(1)
            .saturationModifier(0.1f)
            .build();

}