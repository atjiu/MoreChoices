package com.example.morechoices.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {

    public static final FoodComponent SWEET_POTATO = new FoodComponent.Builder().hunger(1).saturationModifier(0.3F).build();
    public static final FoodComponent BAKED_SWEET_POTATO = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    public static final FoodComponent CATPAW_COOKIE = new FoodComponent.Builder().hunger(3).snack().saturationModifier(0.2F).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 600/*单位tick*/, 0), 1.0F).build();
    public static final FoodComponent FRIED_DUMPLING = new FoodComponent.Builder().hunger(8).meat().saturationModifier(0.6F).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 0), 1.0F).build();
}
