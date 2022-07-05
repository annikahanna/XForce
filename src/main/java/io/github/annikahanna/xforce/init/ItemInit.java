package io.github.annikahanna.xforce.init;

import io.github.annikahanna.xforce.XForce;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, XForce.MODID);

   /* public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item", ()->new Item(
            new Item.Properties().tab(XForce.TAB)));*/

   //Foods
    public static final RegistryObject<Item> DOGTREAT = ITEMS.register("dogtreat", () -> new Item(
            props().food(Foods.DOGTREAT)));

    public static final RegistryObject<Item> ALKOHOL = ITEMS.register("schnaps", () -> new Item(
            props().food(Foods.ALCOHOL)));

    //Tools

   public static final RegistryObject<SwordItem> COPPER_SWORD = ITEMS.register("copper_sword",
           () -> new SwordItem(Tiers.COPPER, 5,3.5f, props()));
   public static final RegistryObject<PickaxeItem> COPPER_PICKAXE = ITEMS.register("copper_pickaxe",
           () -> new PickaxeItem(Tiers.COPPER,5,3.5f, props()));
    public static final RegistryObject<ShovelItem> COPPER_SHOVEL = ITEMS.register("copper_shovel",
            () -> new ShovelItem(Tiers.COPPER,5,3.5f, props()));
    public static final RegistryObject<AxeItem> COPPER_AXE = ITEMS.register("copper_axe",
            () -> new AxeItem(Tiers.COPPER,5,3.5f, props()));
    public static final RegistryObject<HoeItem> COPPER_HOE = ITEMS.register("copper_hoe",
            () -> new HoeItem(Tiers.COPPER,5,3.5f, props()));


   private static Item.Properties props(){
       return new Item.Properties().tab(XForce.TAB);
   }

    public static class Foods{
        public static final FoodProperties DOGTREAT =
                new FoodProperties.Builder()
                        .nutrition(1)
                        .meat()
                        .effect(() -> new MobEffectInstance(MobEffects.POISON, 30, 1), 0.5f)
                        .build();


    public static final FoodProperties ALCOHOL =
            new FoodProperties.Builder()
                    .nutrition(6)
                    .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 1200, 3), 1)
                    .build();

        public static final FoodProperties HERB =
                new FoodProperties.Builder()
                        .nutrition(1)
                        .build();

   }

   public static class Tiers {
       public static final Tier COPPER = new ForgeTier(
               2,
               10,
               1.5f,
               3,
               350,
               null,
               () -> Ingredient.of(Items.COPPER_ORE));
   }
}
