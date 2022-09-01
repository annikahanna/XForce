package io.github.annikahanna.xforce.core.event;

import io.github.annikahanna.xforce.XForce;
import io.github.annikahanna.xforce.common.player.PlayerRescueCoordinates;
import io.github.annikahanna.xforce.common.player.PlayerRescueCoordinatesProvider;
import io.github.annikahanna.xforce.core.init.BlockInit;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.LogicalSide;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = XForce.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModClientEvents {
    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event){
        ItemBlockRenderTypes.setRenderLayer(BlockInit.HERB.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.BLUEBERRY_CROP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.BLACKBERRY_CROP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.RASPBERRY_CROP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.LAVENDEL_CROP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.PUFF_PUFF_CROP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.LAVENDEL.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.PANSY_BLUE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.PANSY_RED.get(), RenderType.cutout());
    }

}
