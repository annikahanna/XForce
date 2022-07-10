package io.github.annikahanna.xforce.client.event;

import io.github.annikahanna.xforce.XForce;
import io.github.annikahanna.xforce.client.renderer.CorgiRenderer;
import io.github.annikahanna.xforce.client.renderer.PixelRenderer;
import io.github.annikahanna.xforce.client.renderer.model.CorgiModel;
import io.github.annikahanna.xforce.client.renderer.model.PixelModel;
import io.github.annikahanna.xforce.core.init.EntityInit;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = XForce.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public final class ClientModEvents {

    private ClientModEvents() {
    }

    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event){
        event.registerLayerDefinition(PixelModel.LAYER_LOCATION, PixelModel:: createBodyLayer);
        event.registerLayerDefinition(CorgiModel.LAYER_LOCATION, CorgiModel:: createBodyLayer);

    }

    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event){
        event.registerEntityRenderer(EntityInit.PIXEL.get(), PixelRenderer:: new);
        event.registerEntityRenderer(EntityInit.CORGI.get(), CorgiRenderer:: new);
    }
}
