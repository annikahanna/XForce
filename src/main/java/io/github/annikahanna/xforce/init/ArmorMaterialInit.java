package io.github.annikahanna.xforce.init;

import io.github.annikahanna.xforce.BaseArmorMaterial;
import io.github.annikahanna.xforce.XForce;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

public final class ArmorMaterialInit {
    public static final ArmorMaterial COPPER = new BaseArmorMaterial(100,
            new int[] { 100, 100, 100, 100 },
            new int[]{1, 2, 2, 1},
            0.0f,
            0.0f,
            XForce.MODID + ":copper",
            SoundEvents.COPPER_HIT,
            () -> Ingredient.of(Items.COPPER_INGOT));

    public static final ArmorMaterial HEADLAMP = new BaseArmorMaterial(100,
            new int[] { 5000, 5000, 5000, 5000 },
            new int[]{0, 0, 0, 0},
            0.0f,
            0.0f,
            XForce.MODID + ":headlamp",
            SoundEvents.WOOL_PLACE,
            () -> Ingredient.EMPTY);

    private ArmorMaterialInit() {
    }
}
