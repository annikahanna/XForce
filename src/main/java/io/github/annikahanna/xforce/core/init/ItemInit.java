package io.github.annikahanna.xforce.core.init;

import io.github.annikahanna.xforce.XForce;
import io.github.annikahanna.xforce.common.custom.item.*;
import io.github.annikahanna.xforce.core.init.armorEffects.*;
import io.github.annikahanna.xforce.core.init.fluid.ModFluids;
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

    public static final RegistryObject<PuffPuffKrautItem> PUFF_PUFF_KRAUT = ITEMS.register("puff_puff_kraut",
            () -> new PuffPuffKrautItem(props()));

    public static final RegistryObject<Item> JAM = ITEMS.register("jam", () -> new Item(
            props().food(Foods.JAM).craftRemainder(Items.GLASS_BOTTLE)));

    public static final RegistryObject<Item> JAM_BREAD = ITEMS.register("jam_bread", () -> new Item(
            props().food(Foods.JAM_BREAD)));

    public static final RegistryObject<CatalystItem> COTTON_CANDY = ITEMS.register("cotton_candy", CatalystItem::new);
    public static final RegistryObject<Item> COTTON_CANDY_ROSE = ITEMS.register("cotton_candy_rose", () -> new Item(
            candy_props().food(Foods.COTTON_CANDY)));
    public static final RegistryObject<Item> COTTON_CANDY_MINT = ITEMS.register("cotton_candy_mint", () -> new Item(
            candy_props().food(Foods.COTTON_CANDY)));
    public static final RegistryObject<Item> COTTON_CANDY_APRICOT = ITEMS.register("cotton_candy_apricot", () -> new Item(
            candy_props().food(Foods.COTTON_CANDY)));
    public static final RegistryObject<Item> COTTON_CANDY_BABYBLUE = ITEMS.register("cotton_candy_babyblue", () -> new Item(
            candy_props().food(Foods.COTTON_CANDY)));
    public static final RegistryObject<Item> COTTON_CANDY_CITRUS = ITEMS.register("cotton_candy_citrus", () -> new Item(
            candy_props().food(Foods.COTTON_CANDY)));
    public static final RegistryObject<Item> COTTON_CANDY_LAVENDER = ITEMS.register("cotton_candy_lavender", () -> new Item(
            candy_props().food(Foods.COTTON_CANDY)));

    //FLUIDS

    public static final RegistryObject<Item> LEMONADE_BUCKET = ITEMS.register("lemonade_bucket",
            () -> new BucketItem(ModFluids.SOURCE_LEMONADE, candy_props()
                    .food(Foods.FLUID)
                    .stacksTo(1)
                    .craftRemainder(Items.BUCKET)));

    public static final RegistryObject<Item> KAKAO_BUCKET = ITEMS.register("kakao_bucket",
            () -> new BucketItem(ModFluids.SOURCE_KAKAO, candy_props()
                    .food(Foods.FLUID)
                    .stacksTo(1)
                    .craftRemainder(Items.BUCKET)));



    //Drugs

    public static final RegistryObject<PuffPuffItem> PUFF_PUFF = ITEMS.register("puff_puff",
            () -> new PuffPuffItem(props()));
    public static final RegistryObject<PuffPuffPartItem> PUFF_PUFF_PART = ITEMS.register("puff_puff_part",
            () -> new PuffPuffPartItem(props()));

    public static final RegistryObject<OpiumItem> OPIUM = ITEMS.register("opium",
            () -> new OpiumItem(props()));
    public static final RegistryObject<BleiItem> BLEI = ITEMS.register("blei",
            () -> new BleiItem(props()));


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

    public static final RegistryObject<SwordItem> SALAMI = ITEMS.register("salami",
            () -> new SwordItem(Tiers.SALAMI, 5,3.5f, props().stacksTo(64)));

    public static final RegistryObject<HolyCrossItem> HOLY_CROSS_ITEM = ITEMS.register("holy_cross",
            () -> new HolyCrossItem(Tiers.HOLY_CROSS, 5,3.5f, props().stacksTo(64)));

    public static final RegistryObject<UnHolyCrossItem> UN_HOLY_CROSS_ITEM = ITEMS.register("unholy_cross",
            () -> new UnHolyCrossItem(Tiers.HOLY_CROSS, 5,3.5f, props().stacksTo(64)));

//ARMOR
    public static final RegistryObject<ArmorItem> COPPER_HELMET = ITEMS.register("copper_helmet",
        () -> new ArmorItem(ArmorMaterialInit.COPPER, EquipmentSlot.HEAD, props()));
    public static final RegistryObject<ArmorItem> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate",
            () -> new ArmorItem(ArmorMaterialInit.COPPER, EquipmentSlot.CHEST, props()));
    public static final RegistryObject<ArmorItem> COPPER_LEGGINS = ITEMS.register("copper_leggins",
            () -> new ArmorItem(ArmorMaterialInit.COPPER, EquipmentSlot.LEGS, props()));
    public static final RegistryObject<ArmorItem> COPPER_BOOTS = ITEMS.register("copper_boots",
            () -> new ModArmorItem(ArmorMaterialInit.COPPER, EquipmentSlot.FEET, props()));

    public static final RegistryObject<ArmorItem> ROSEQUARZ_HELMET = ITEMS.register("rosequarz_helmet",
            () -> new ArmorItem(ArmorMaterialInit.ROSEQUARZ, EquipmentSlot.HEAD, props()));
    public static final RegistryObject<ArmorItem> ROSEQUARZ_CHESTPLATE = ITEMS.register("rosequarz_chestplate",
            () -> new ArmorItem(ArmorMaterialInit.ROSEQUARZ, EquipmentSlot.CHEST, props()));
    public static final RegistryObject<ArmorItem> ROSEQUARZ_LEGGINS = ITEMS.register("rosequarz_leggins",
            () -> new ArmorItem(ArmorMaterialInit.ROSEQUARZ, EquipmentSlot.LEGS, props()));
    public static final RegistryObject<ArmorItem> ROSEQUARZ_BOOTS = ITEMS.register("rosequarz_boots",
            () -> new ModRosequarzArmorItem(ArmorMaterialInit.ROSEQUARZ, EquipmentSlot.FEET, props()));

    public static final RegistryObject<ArmorItem> RUBY_HELMET = ITEMS.register("ruby_helmet",
            () -> new ArmorItem(ArmorMaterialInit.RUBY, EquipmentSlot.HEAD, props()));
    public static final RegistryObject<ArmorItem> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate",
            () -> new ArmorItem(ArmorMaterialInit.RUBY, EquipmentSlot.CHEST, props()));
    public static final RegistryObject<ArmorItem> RUBY_LEGGINS = ITEMS.register("ruby_leggins",
            () -> new ArmorItem(ArmorMaterialInit.RUBY, EquipmentSlot.LEGS, props()));
    public static final RegistryObject<ArmorItem> RUBY_BOOTS = ITEMS.register("ruby_boots",
            () -> new ModRubyArmorItem(ArmorMaterialInit.RUBY, EquipmentSlot.FEET, props()));

    public static final RegistryObject<ArmorItem> CITRIN_HELMET = ITEMS.register("citrin_helmet",
            () -> new ArmorItem(ArmorMaterialInit.CITRIN, EquipmentSlot.HEAD, props()));
    public static final RegistryObject<ArmorItem> CITRIN_CHESTPLATE = ITEMS.register("citrin_chestplate",
            () -> new ArmorItem(ArmorMaterialInit.CITRIN, EquipmentSlot.CHEST, props()));
    public static final RegistryObject<ArmorItem> CITRIN_LEGGINS = ITEMS.register("citrin_leggins",
            () -> new ArmorItem(ArmorMaterialInit.CITRIN, EquipmentSlot.LEGS, props()));
    public static final RegistryObject<ArmorItem> CITRIN_BOOTS = ITEMS.register("citrin_boots",
            () -> new ModCitrinArmorItem(ArmorMaterialInit.CITRIN, EquipmentSlot.FEET, props()));

    public static final RegistryObject<ArmorItem> TURMALIN_HELMET = ITEMS.register("turmalin_helmet",
            () -> new ArmorItem(ArmorMaterialInit.TURMALIN, EquipmentSlot.HEAD, props()));
    public static final RegistryObject<ArmorItem> TURMALIN_CHESTPLATE = ITEMS.register("turmalin_chestplate",
            () -> new ArmorItem(ArmorMaterialInit.TURMALIN, EquipmentSlot.CHEST, props()));
    public static final RegistryObject<ArmorItem> TURMALIN_LEGGINS = ITEMS.register("turmalin_leggins",
            () -> new ArmorItem(ArmorMaterialInit.TURMALIN, EquipmentSlot.LEGS, props()));
    public static final RegistryObject<ArmorItem> TURMALIN_BOOTS = ITEMS.register("turmalin_boots",
            () -> new ModTurmalinArmorItem(ArmorMaterialInit.TURMALIN, EquipmentSlot.FEET, props()));

    public static final RegistryObject<ArmorItem> FLUORITE_HELMET = ITEMS.register("fluorite_helmet",
            () -> new ArmorItem(ArmorMaterialInit.FLUORITE, EquipmentSlot.HEAD, props()));
    public static final RegistryObject<ArmorItem> FLUORITE_CHESTPLATE = ITEMS.register("fluorite_chestplate",
            () -> new ArmorItem(ArmorMaterialInit.FLUORITE, EquipmentSlot.CHEST, props()));
    public static final RegistryObject<ArmorItem> FLUORITE_LEGGINS = ITEMS.register("fluorite_leggins",
            () -> new ArmorItem(ArmorMaterialInit.FLUORITE, EquipmentSlot.LEGS, props()));
    public static final RegistryObject<ArmorItem> FLUORITE_BOOTS = ITEMS.register("fluorite_boots",
            () -> new ModFluoriteArmorItem(ArmorMaterialInit.FLUORITE, EquipmentSlot.FEET, props()));

    public static final RegistryObject<ArmorItem> MALACHITE_HELMET = ITEMS.register("malachite_helmet",
            () -> new ArmorItem(ArmorMaterialInit.MALACHITE, EquipmentSlot.HEAD, props()));
    public static final RegistryObject<ArmorItem> MALACHITE_CHESTPLATE = ITEMS.register("malachite_chestplate",
            () -> new ArmorItem(ArmorMaterialInit.MALACHITE, EquipmentSlot.CHEST, props()));
    public static final RegistryObject<ArmorItem> MALACHITE_LEGGINS = ITEMS.register("malachite_leggins",
            () -> new ArmorItem(ArmorMaterialInit.MALACHITE, EquipmentSlot.LEGS, props()));
    public static final RegistryObject<ArmorItem> MALACHITE_BOOTS = ITEMS.register("malachite_boots",
            () -> new ModMalachiteArmorItem(ArmorMaterialInit.MALACHITE, EquipmentSlot.FEET, props()));

    public static final RegistryObject<ArmorItem> AMBER_HELMET = ITEMS.register("amber_helmet",
            () -> new ArmorItem(ArmorMaterialInit.AMBER, EquipmentSlot.HEAD, props()));
    public static final RegistryObject<ArmorItem> AMBER_CHESTPLATE = ITEMS.register("amber_chestplate",
            () -> new ArmorItem(ArmorMaterialInit.AMBER, EquipmentSlot.CHEST, props()));
    public static final RegistryObject<ArmorItem> AMBER_LEGGINS = ITEMS.register("amber_leggins",
            () -> new ArmorItem(ArmorMaterialInit.AMBER, EquipmentSlot.LEGS, props()));
    public static final RegistryObject<ArmorItem> AMBER_BOOTS = ITEMS.register("amber_boots",
            () -> new ModAmberArmorItem(ArmorMaterialInit.AMBER, EquipmentSlot.FEET, props()));

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
            () -> new RecordItem(4, SoundInit.FANTASY_GIRL, props().stacksTo(1),60000));
    public static final RegistryObject<Item> COTTON_EYE_JOE_MUSIC_DISC = ITEMS.register("cotton_eye_joe_music_disc",
            () -> new RecordItem(4, SoundInit.COTTON_EYE_JOE_GIRL,
                    props().stacksTo(1), 60000));
    public static final RegistryObject<Item> COUNTRY_GIRL_MUSIC_DISC = ITEMS.register("country_girl_music_disc",
            () -> new RecordItem(4, SoundInit.COUNTRY_GIRL,
                    props().stacksTo(1), 60000));
    public static final RegistryObject<Item> RICK_ROLL_MUSIC_DISC = ITEMS.register("rick_roll_music_disc",
            () -> new RecordItem(4, SoundInit.RICK_ROLL,
                    props().stacksTo(1), 60000));
    public static final RegistryObject<Item> SHANIA_TWAIN_MUSIC_DISC = ITEMS.register("shania_twain_music_disc",
            () -> new RecordItem(4, SoundInit.SHANIA_TWAIN,
                    props().stacksTo(1), 60000));
    public static final RegistryObject<Item> STRANGER_THINGS_MUSIC_DISC = ITEMS.register("stranger_things_music_disc",
            () -> new RecordItem(4, SoundInit.STRANGER_THINGS,
                    props().stacksTo(1), 60000));

    public static final RegistryObject<Item> GOOD_BOY_MUSIC_DISC = ITEMS.register("good_boy_music_disc",
            () -> new RecordItem(4, SoundInit.GOOD_BOY,
                    props().stacksTo(1), 60000));

    public static final RegistryObject<Item> ABBA_MUSIC_DISC = ITEMS.register("abba_music_disc",
            () -> new RecordItem(4, SoundInit.ABBA,
                    props().stacksTo(1), 60000));

    public static final RegistryObject<Item> PIRATE_MUSIC_DISC = ITEMS.register("pirate_music_disc",
            () -> new RecordItem(4, SoundInit.PIRATE,
            props().stacksTo(1), 60000));

    public static final RegistryObject<Item> ADVENTURE_MUSIC_DISC = ITEMS.register("adventure_music_disc",
            () -> new RecordItem(4, SoundInit.ADVENTURE,
                    props().stacksTo(1), 60000));

    public static final RegistryObject<Item> KOHLE_MUSIC_DISC = ITEMS.register("kohle_music_disc",
            () -> new RecordItem(4, SoundInit.KOHLE,
                    props().stacksTo(1), 60000));

    //CUSTOM

    public static final RegistryObject<HolyGrenadeItem> HOLY_GRENADE = ITEMS.register("holy_grenade",
            () -> new HolyGrenadeItem(props()));
    public static final RegistryObject<WreckingBallItem> WRECKING_BALL = ITEMS.register("wrecking_ball",
            () -> new WreckingBallItem(props()));
    public static final RegistryObject<RescueCallItem> RESCUE_PHONE = ITEMS.register("rescue_phone",
            () -> new RescueCallItem(props()));


    //CROPS & SEEDS

    public static final RegistryObject<Item> BLUEBERRY_SEEDS = ITEMS.register("blueberry_seeds",
            () -> new ItemNameBlockItem(BlockInit.BLUEBERRY_CROP.get(),props()));

    public static final RegistryObject<Item> BLUEBERRY = ITEMS.register("blueberry", () -> new Item(
            props().food(Foods.BERRY)));
    public static final RegistryObject<Item> BLACKBERRY_SEEDS = ITEMS.register("blackberry_seeds",
            () -> new ItemNameBlockItem(BlockInit.BLACKBERRY_CROP.get(),props()));

    public static final RegistryObject<Item> BLACKBERRY = ITEMS.register("blackberry", () -> new Item(
            props().food(Foods.BERRY)));
    public static final RegistryObject<Item> RASPBERRY_SEEDS = ITEMS.register("raspberry_seeds",
            () -> new ItemNameBlockItem(BlockInit.RASPBERRY_CROP.get(),props()));

    public static final RegistryObject<Item> RASPBERRY = ITEMS.register("raspberry", () -> new Item(
            props().food(Foods.BERRY)));

    public static final RegistryObject<Item> LAVENDEL_SEEDS = ITEMS.register("lavendel_seeds",
            () -> new ItemNameBlockItem(BlockInit.LAVENDEL_CROP.get(),props()));
    public static final RegistryObject<Item> PUFF_PUFF_SEEDS = ITEMS.register("puff_puff_seeds",
            () -> new ItemNameBlockItem(BlockInit.PUFF_PUFF_CROP.get(),props()));

    //STONES

    public static final RegistryObject<Item> ROSEQUARZ = ITEMS.register("rosequarz",
            () -> new Item(props()));

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(props()));

    public static final RegistryObject<Item> TURMALIN = ITEMS.register("turmalin",
            () -> new Item(props()));

    public static final RegistryObject<Item> CITRIN = ITEMS.register("citrin",
            () -> new Item(props()));

    public static final RegistryObject<Item> MALACHITE = ITEMS.register("malachite",
            () -> new Item(props()));

    public static final RegistryObject<Item> FLUORITE = ITEMS.register("fluorite",
            () -> new Item(props()));

    public static final RegistryObject<Item> AMBER = ITEMS.register("amber",
            () -> new Item(props()));


    //Colours
    public static final RegistryObject<Item> PASTEL_PARTICLE = ITEMS.register("pastel_particle",
            () -> new Item(candy_props()));
    public static final RegistryObject<Item> MINT = ITEMS.register("mint",
            () -> new Item(candy_props()));
    public static final RegistryObject<Item> ROSE = ITEMS.register("rose",
            () -> new Item(candy_props()));
    public static final RegistryObject<Item> APRICOT = ITEMS.register("apricot",
            () -> new Item(candy_props()));
    public static final RegistryObject<Item> BABYBLUE = ITEMS.register("babyblue",
            () -> new Item(candy_props()));
    public static final RegistryObject<Item> LAVENDER = ITEMS.register("lavender",
            () -> new Item(candy_props()));
    public static final RegistryObject<Item> CITRUS = ITEMS.register("citrus",
            () -> new Item(candy_props()));


   private static Item.Properties props(){
       return new Item.Properties().tab(XForce.TAB);
   }
    private static Item.Properties candy_props(){
        return new Item.Properties().tab(XForce.CANDY_TAB);
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

        public static final FoodProperties BERRY =
                new FoodProperties.Builder()
                        .nutrition(2)
                        .alwaysEat()
                        .build();

        public static final FoodProperties JAM =
                new FoodProperties.Builder()
                        .nutrition(4)
                        .build();

        public static final FoodProperties JAM_BREAD =
                new FoodProperties.Builder()
                        .nutrition(9)
                        .build();

        public static final FoodProperties COTTON_CANDY =
                new FoodProperties.Builder()
                        .nutrition(4)
                        .build();

        public static final FoodProperties SALAMI =
                new FoodProperties.Builder()
                        .nutrition(6)
                        .alwaysEat()
                        .build();

        public static final FoodProperties FLUID =
                new FoodProperties.Builder()
                        .nutrition(2)
                        .alwaysEat()
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

       public static final Tier SALAMI = new ForgeTier(
               3,
               3,
               5f,
               5,
               350,
               null,
               () -> Ingredient.of(Items.PORKCHOP));

       public static final Tier HOLY_CROSS = new ForgeTier(
               3,
               100,
               5f,
               2,
               350,
               null,
               () -> Ingredient.of(Items.GOLDEN_SWORD));

   }
}
