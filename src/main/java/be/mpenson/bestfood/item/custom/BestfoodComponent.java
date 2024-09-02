package be.mpenson.bestfood.item.custom;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class BestfoodComponent {
    public static final FoodComponent CRAZY_POTATO = new FoodComponent.Builder().nutrition(30).saturationModifier(10f)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 3000), 1f)
            .build();

}
