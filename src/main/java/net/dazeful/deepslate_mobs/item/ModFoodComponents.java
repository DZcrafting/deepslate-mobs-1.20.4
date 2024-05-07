package net.dazeful.deepslate_mobs.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent SHADED_FLESH = new FoodComponent.Builder().meat().hunger(4).saturationModifier(2).alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.DARKNESS, 200, 0), 0.8f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 600, 1), 1.0f).build();
}
