package io.github.annikahanna.xforce.core.event;

import io.github.annikahanna.xforce.XForce;
import io.github.annikahanna.xforce.core.init.BlockInit;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = XForce.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModClientEvents {
    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event){
        ItemBlockRenderTypes.setRenderLayer(BlockInit.HERB.get(), RenderType.cutout());
    }
}
