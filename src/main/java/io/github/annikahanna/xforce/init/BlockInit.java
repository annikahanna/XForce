package io.github.annikahanna.xforce.init;

import io.github.annikahanna.xforce.XForce;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static io.github.annikahanna.xforce.init.ItemInit.ITEMS;

import java.util.function.Supplier;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, XForce.MODID);
 /*   public static final RegistryObject<Block> EXAMPLE_BLOCK = register(
            "example_block", () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(3f, 3f ).requiresCorrectToolForDrops()),
            new Item.Properties().tab(XForce.TAB));

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> supplier, Item.Properties properties){
        RegistryObject<T> block = BLOCKS.register(name, supplier);
        ITEMS.register(name, ()-> new BlockItem(block.get(), properties));
        return block;
    }*/
}
