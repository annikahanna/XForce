package io.github.annikahanna.xforce.init;

import io.github.annikahanna.xforce.XForce;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, XForce.MODID);

   /* public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item", ()->new Item(
            new Item.Properties().tab(XForce.TAB)));

    public static final RegistryObject<Item> EXAMPLE_FOOD = ITEMS.register("donut", () -> new Item(
            new Item.Properties().tab(XForce.TAB).food(Foods.EXAMPLE_FOOD)));*/

   /* public static class Foods{
        public static final FoodProperties EXAMPLE_FOOD =
                new FoodProperties.Builder()
                        .nutrition(6)
                        .alwaysEat()
                        .meat()
                        .fast()
                        .effect(() -> new MobEffectInstance(MobEffects.WATER_BREATHING, 600, 2), 1)
                        .build();
    }*/
}
