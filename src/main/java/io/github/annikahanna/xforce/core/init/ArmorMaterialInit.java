package io.github.annikahanna.xforce.core.init;

import io.github.annikahanna.xforce.core.BaseArmorMaterial;
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

    public static final ArmorMaterial ROSEQUARZ = new BaseArmorMaterial(100,
            new int[] { 100, 100, 100, 100 },
            new int[]{3, 6, 6, 3},
            0.0f,
            3f,
            XForce.MODID + ":rosequarz",
            SoundEvents.AMETHYST_BLOCK_HIT,
            () -> Ingredient.of(ItemInit.ROSEQUARZ.get()));

    public static final ArmorMaterial RUBY = new BaseArmorMaterial(100,
            new int[] { 100, 100, 100, 100 },
            new int[]{3, 6, 6, 3},
            0.0f,
            3f,
            XForce.MODID + ":ruby",
            SoundEvents.AMETHYST_BLOCK_HIT,
            () -> Ingredient.of(ItemInit.RUBY.get()));

    public static final ArmorMaterial CITRIN = new BaseArmorMaterial(100,
            new int[] { 100, 100, 100, 100 },
            new int[]{3, 6, 6, 3},
            0.0f,
            3f,
            XForce.MODID + ":citrin",
            SoundEvents.AMETHYST_BLOCK_HIT,
            () -> Ingredient.of(ItemInit.CITRIN.get()));

    public static final ArmorMaterial TURMALIN = new BaseArmorMaterial(100,
            new int[] { 100, 100, 100, 100 },
            new int[]{3, 6, 6, 3},
            0.0f,
            3f,
            XForce.MODID + ":turmalin",
            SoundEvents.AMETHYST_BLOCK_HIT,
            () -> Ingredient.of(ItemInit.TURMALIN.get()));

    public static final ArmorMaterial FLUORITE = new BaseArmorMaterial(100,
            new int[] { 100, 100, 100, 100 },
            new int[]{3, 6, 6, 3},
            0.0f,
            3f,
            XForce.MODID + ":fluorite",
            SoundEvents.AMETHYST_BLOCK_HIT,
            () -> Ingredient.of(ItemInit.FLUORITE.get()));

    public static final ArmorMaterial MALACHITE = new BaseArmorMaterial(100,
            new int[] { 100, 100, 100, 100 },
            new int[]{3, 6, 6, 3},
            0.0f,
            3f,
            XForce.MODID + ":malachite",
            SoundEvents.AMETHYST_BLOCK_HIT,
            () -> Ingredient.of(ItemInit.MALACHITE.get()));

    public static final ArmorMaterial HEADLAMP = new BaseArmorMaterial(0,
            new int[] { 5000, 5000, 5000, 5000 },
            new int[]{0, 0, 0, 0},
            0.0f,
            0.0f,
            XForce.MODID + ":headlamp",
            SoundEvents.WOOL_PLACE,
            () -> Ingredient.EMPTY);


    public static final ArmorMaterial FLOWERCROWN = new BaseArmorMaterial(0,
            new int[] { 50, 50, 50, 50 },
            new int[]{0, 0, 0, 0},
            0.0f,
            0.0f,
            XForce.MODID + ":flowercrown",
            SoundEvents.CHORUS_FLOWER_GROW,
            () -> Ingredient.EMPTY);

    public static final ArmorMaterial SUNFLOWERCROWN = new BaseArmorMaterial(0,
            new int[] { 50, 50, 50, 50 },
            new int[]{0, 0, 0, 0},
            0.0f,
            0.0f,
            XForce.MODID + ":sunflowercrown",
            SoundEvents.CHORUS_FLOWER_GROW,
            () -> Ingredient.EMPTY);

    private ArmorMaterialInit() {
    }
}
