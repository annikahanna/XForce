package io.github.annikahanna.xforce;

import io.github.annikahanna.xforce.init.BlockInit;
import io.github.annikahanna.xforce.init.ItemInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.antlr.v4.runtime.misc.NotNull;

@Mod(XForce.MODID)
public class XForce {
    public static final String MODID ="xforce";

    public XForce(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
    }

    public static final CreativeModeTab TAB = new CreativeModeTab(MODID ) {
        @Override
        public @NotNull ItemStack makeIcon() {
            return ItemInit.DOGTREAT.get().getDefaultInstance();
        }


    };
}
