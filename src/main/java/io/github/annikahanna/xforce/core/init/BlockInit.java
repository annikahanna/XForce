package io.github.annikahanna.xforce.core.init;

import io.github.annikahanna.xforce.XForce;
import io.github.annikahanna.xforce.common.custom.BlackberryCropBlock;
import io.github.annikahanna.xforce.common.custom.BlueberryCropBlock;
import io.github.annikahanna.xforce.common.custom.LavendelCropBlock;
import io.github.annikahanna.xforce.common.custom.RaspberryCropBlock;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static io.github.annikahanna.xforce.core.init.ItemInit.ITEMS;

import java.util.function.Supplier;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, XForce.MODID);
   /* public static final RegistryObject<Block> HERB= register(
            "herb",
            () -> new Block(BlockBehaviour.Properties.of(Material.PLANT).strength(0,0)),
            new Item.Properties().tab(XForce.TAB));*/

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




    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> supplier, Item.Properties properties){
        RegistryObject<T> block = BLOCKS.register(name, supplier);
        ITEMS.register(name, ()-> new BlockItem(block.get(), properties));
        return block;
    }
}

/*public static final RegistryObject<Block> HERB = register(
            "herb", ()-> new FlowerBlock(MobEffects.WEAKNESS, 9, BlockBehaviour.Properties.of(Material.PLANT)
                    .noCollission()
                    .instabreak()
                    .sound(SoundType.GRASS)
                    .offsetType(BlockBehaviour.OffsetType.XZ)),new Item.Properties().tab(XForce.TAB));*/