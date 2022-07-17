package io.github.annikahanna.xforce.core.init;

import io.github.annikahanna.xforce.XForce;
import io.github.annikahanna.xforce.core.init.armorEffects.FlowerCrownEffect;
import io.github.annikahanna.xforce.core.init.armorEffects.HeadLampEffect;
import io.github.annikahanna.xforce.core.init.armorEffects.ModArmorItem;
import io.github.annikahanna.xforce.core.init.armorEffects.SunflowerCrownEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeSpawnEggItem;
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

    public static final RegistryObject<Item> BEER = ITEMS.register("beer", () -> new Item(
            props().food(Foods.BEER)));

    public static final RegistryObject<Item> COCKTAIL = ITEMS.register("cocktail", () -> new Item(
            props().food(Foods.COCKTAIL)));

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

//ARMOR
    public static final RegistryObject<ArmorItem> COPPER_HELMET = ITEMS.register("copper_helmet",
        () -> new ArmorItem(ArmorMaterialInit.COPPER, EquipmentSlot.HEAD, props()));
    public static final RegistryObject<ArmorItem> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate",
            () -> new ArmorItem(ArmorMaterialInit.COPPER, EquipmentSlot.CHEST, props()));
    public static final RegistryObject<ArmorItem> COPPER_LEGGINS = ITEMS.register("copper_leggins",
            () -> new ArmorItem(ArmorMaterialInit.COPPER, EquipmentSlot.LEGS, props()));
    public static final RegistryObject<ArmorItem> COPPER_BOOTS = ITEMS.register("copper_boots",
            () -> new ModArmorItem(ArmorMaterialInit.COPPER, EquipmentSlot.FEET, props()));
    public static final RegistryObject<ArmorItem> HEADLAMP = ITEMS.register("headlamp",
            () -> new HeadLampEffect(ArmorMaterialInit.HEADLAMP, EquipmentSlot.HEAD, props()));
    public static final RegistryObject<ArmorItem> FLOWERCROWN = ITEMS.register("flowercrown",
            () -> new FlowerCrownEffect(ArmorMaterialInit.FLOWERCROWN, EquipmentSlot.HEAD, props()));
    public static final RegistryObject<ArmorItem> SUNFLOWERCROWN = ITEMS.register("sunflowercrown",
            () -> new SunflowerCrownEffect(ArmorMaterialInit.SUNFLOWERCROWN, EquipmentSlot.HEAD, props()));

//SPAWN EGGS

    public static final RegistryObject<ForgeSpawnEggItem> PIXEL_SPWAN_EGG = ITEMS.register("pixel_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.PIXEL, 0x39200e, 0xffffff, props()));
    public static final RegistryObject<ForgeSpawnEggItem> CORGI_SPWAN_EGG = ITEMS.register("corgi_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.CORGI, 0x000000, 0xffffff, props()));

//MUSIC DISK

    public static final RegistryObject<Item> FANTASY_GIRL_MUSIC_DISC = ITEMS.register("fantasy_girl_music_disc",
            () -> new RecordItem(4, SoundInit.FANTASY_GIRL,
                    props().stacksTo(1)));
    public static final RegistryObject<Item> COTTON_EYE_JOE_MUSIC_DISC = ITEMS.register("cotton_eye_joe_music_disc",
            () -> new RecordItem(4, SoundInit.COTTON_EYE_JOE_GIRL,
                    props().stacksTo(1)));
    public static final RegistryObject<Item> COUNTRY_GIRL_MUSIC_DISC = ITEMS.register("country_girl_music_disc",
            () -> new RecordItem(4, SoundInit.COUNTRY_GIRL,
                    props().stacksTo(1)));
    public static final RegistryObject<Item> RICK_ROLL_MUSIC_DISC = ITEMS.register("rick_roll_music_disc",
            () -> new RecordItem(4, SoundInit.RICK_ROLL,
                    props().stacksTo(1)));
    public static final RegistryObject<Item> SHANIA_TWAIN_MUSIC_DISC = ITEMS.register("shania_twain_music_disc",
            () -> new RecordItem(4, SoundInit.SHANIA_TWAIN,
                    props().stacksTo(1)));
    public static final RegistryObject<Item> STRANGER_THINGS_MUSIC_DISC = ITEMS.register("stranger_things_music_disc",
            () -> new RecordItem(4, SoundInit.STRANGER_THINGS,
                    props().stacksTo(1)));


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

        public static final FoodProperties BEER =
                new FoodProperties.Builder()
                        .nutrition(4)
                        .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 100, 0), 1)
                        .build();

        public static final FoodProperties COCKTAIL =
                new FoodProperties.Builder()
                        .nutrition(2)
                        .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 300, 1), 1)
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
               () -> Ingredient.of(Items.COPPER_INGOT));
   }
}
