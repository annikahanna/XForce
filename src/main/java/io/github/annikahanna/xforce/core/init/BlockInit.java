package io.github.annikahanna.xforce.core.init;

import io.github.annikahanna.xforce.XForce;
import io.github.annikahanna.xforce.common.custom.*;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static io.github.annikahanna.xforce.core.init.ItemInit.ITEMS;

import java.util.function.Supplier;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, XForce.MODID);

    //FLOWERS
    public static final RegistryObject<FlowerBlock> HERB= register(
            "herb",
            () -> new FlowerBlock(
                    MobEffects.GLOWING,
                    300,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION)),
            new Item.Properties().tab(XForce.TAB));

    public static final RegistryObject<FlowerBlock> LAVENDEL= register(
            "lavendel",
            () -> new FlowerBlock(
                    MobEffects.GLOWING,
                    300,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION)),
            new Item.Properties().tab(XForce.TAB));

    public static final RegistryObject<FlowerBlock> PANSY_BLUE = register(
            "pansy_blue",
            () -> new FlowerBlock(
                    MobEffects.GLOWING,
                    300,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION)),
            new Item.Properties().tab(XForce.TAB));

    public static final RegistryObject<FlowerBlock> PANSY_RED = register(
            "pansy_red",
            () -> new FlowerBlock(
                    MobEffects.GLOWING,
                    300,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION)),
            new Item.Properties().tab(XForce.TAB));

    //CROPS

    public static final RegistryObject<BlueberryCropBlock> BLUEBERRY_CROP= BLOCKS.register(
            "blueberry_crop",
            () -> new BlueberryCropBlock(
                    BlockBehaviour.Properties.copy(Blocks.WHEAT)));
    public static final RegistryObject<BlackberryCropBlock> BLACKBERRY_CROP= BLOCKS.register(
            "blackberry_crop",
            () -> new BlackberryCropBlock(
                    BlockBehaviour.Properties.copy(Blocks.WHEAT)));
    public static final RegistryObject<RaspberryCropBlock> RASPBERRY_CROP= BLOCKS.register(
            "raspberry_crop",
            () -> new RaspberryCropBlock(
                    BlockBehaviour.Properties.copy(Blocks.WHEAT)));
    public static final RegistryObject<LavendelCropBlock> LAVENDEL_CROP= BLOCKS.register(
            "lavendel_crop",
            () -> new LavendelCropBlock(
                    BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<PuffPuffCropBlock> PUFF_PUFF_CROP= BLOCKS.register(
            "puff_puff_crop",
            () -> new PuffPuffCropBlock(
                    BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    //ORE
    public static final RegistryObject<Block> ROSEQUARZ_ORE = register("rosequarz_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)), new Item.Properties().tab(XForce.TAB));

    public static final RegistryObject<Block> RUBY_ORE = register("ruby_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)), new Item.Properties().tab(XForce.TAB));

    public static final RegistryObject<Block> TURMALIN_ORE = register("turmalin_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)), new Item.Properties().tab(XForce.TAB));

    public static final RegistryObject<Block> CITRIN_ORE = register("citrin_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)), new Item.Properties().tab(XForce.TAB));

    public static final RegistryObject<Block> MALACHITE_ORE = register("malachite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)), new Item.Properties().tab(XForce.TAB));

    public static final RegistryObject<Block> FLUORITE_ORE = register("fluorite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)), new Item.Properties().tab(XForce.TAB));

    //EDELSTEIN BLOCK

    public static final RegistryObject<Block> ROSEQUARZ_BLOCK = register("rosequarz_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
            .strength(6f).requiresCorrectToolForDrops()), new Item.Properties().tab(XForce.TAB));

    public static final RegistryObject<Block> RUBY_BLOCK = register("ruby_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), new Item.Properties().tab(XForce.TAB));

    public static final RegistryObject<Block> CITRIN_BLOCK = register("citrin_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), new Item.Properties().tab(XForce.TAB));

    public static final RegistryObject<Block> TURMALIN_BLOCK = register("turmalin_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), new Item.Properties().tab(XForce.TAB));

    public static final RegistryObject<Block> FLUORITE_BLOCK = register("fluorite_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), new Item.Properties().tab(XForce.TAB));

    public static final RegistryObject<Block> MALACHITE_BLOCK = register("malachite_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), new Item.Properties().tab(XForce.TAB));

    public static final RegistryObject<Block> AMBER_BLOCK = register("amber_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), new Item.Properties().tab(XForce.TAB));


    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> supplier, Item.Properties properties){
        RegistryObject<T> block = BLOCKS.register(name, supplier);
        ITEMS.register(name, ()-> new BlockItem(block.get(), properties));
        return block;
    }
}