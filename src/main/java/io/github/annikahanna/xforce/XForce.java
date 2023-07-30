package io.github.annikahanna.xforce;

import io.github.annikahanna.xforce.core.init.*;
import io.github.annikahanna.xforce.core.init.fluid.ModFluidTypes;
import io.github.annikahanna.xforce.core.init.fluid.ModFluids;
import io.github.annikahanna.xforce.core.world.biome.ModBiomes;
import io.github.annikahanna.xforce.core.world.biome.ModRegions;
import io.github.annikahanna.xforce.core.world.biome.ModSurfaceRuleData;
import io.github.annikahanna.xforce.core.world.dimension.ModDimensions;
import io.github.annikahanna.xforce.core.world.feature.ModConfiguredFeatures;
import io.github.annikahanna.xforce.core.world.feature.ModPlacedFeatures;
import io.github.annikahanna.xforce.core.world.structure.ModStructures;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.antlr.v4.runtime.misc.NotNull;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Mod(XForce.MODID)
public class XForce {
    public static final String MODID ="xforce";

    public static final List<SoundEvent> DJ_LIST = new ArrayList<>();
    public static final List<SoundEvent> BARKEEPER_LIST = new ArrayList<>();
    public static final List<SoundEvent> BREEDER_LIST = new ArrayList<>();
    public static final List<SoundEvent> GARDENER_LIST = new ArrayList<>();

    public XForce(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        EntityInit.ENTITIES.register(bus);
        SoundInit.SOUND_EVENTS.register(bus);
        ModPointOfInterest.register(bus);
        ModStructures.register(bus);
        ModConfiguredFeatures.register(bus);
        ModPlacedFeatures.register(bus);
        ModDimensions.register();
        ModBiomes.registerBiomes();
        ModFluids.register(bus);
        ModFluidTypes.register(bus);
    }

    public static SoundEvent RANDOM_DJ(){
        DJ_LIST.add(SoundInit.DJ.get());
        DJ_LIST.add(SoundInit.DJ2.get());
        DJ_LIST.add(SoundInit.DJ3.get());
        DJ_LIST.add(SoundInit.DJ4.get());
        DJ_LIST.add(SoundInit.DJ5.get());

        Random rand = new Random();

        return DJ_LIST.get(rand.nextInt(DJ_LIST.size()));

    }

    public static SoundEvent RANDOM_BARKEEPER(){
        BARKEEPER_LIST.add(SoundInit.BARKEEPER.get());
        BARKEEPER_LIST.add(SoundInit.BARKEEPER2.get());
        BARKEEPER_LIST.add(SoundInit.BARKEEPER3.get());

        Random rand = new Random();

        return BARKEEPER_LIST.get(rand.nextInt(BARKEEPER_LIST.size()));

    }

    public static SoundEvent RANDOM_BREEDER(){
        BREEDER_LIST.add(SoundInit.BREEDER.get());
        BREEDER_LIST.add(SoundInit.BREEDER2.get());
        BREEDER_LIST.add(SoundInit.BREEDER3.get());

        Random rand = new Random();

        return BREEDER_LIST.get(rand.nextInt(BREEDER_LIST.size()));

    }

    public static SoundEvent RANDOM_GARDENER(){
        GARDENER_LIST.add(SoundInit.GARDENER.get());
        GARDENER_LIST.add(SoundInit.GARDENER2.get());

        Random rand = new Random();

        return GARDENER_LIST.get(rand.nextInt(GARDENER_LIST.size()));

    }

    private void commonSetup(final FMLCommonSetupEvent event){
        event.enqueueWork(() -> {
            ModPointOfInterest.registerPOIs();
        });

        event.enqueueWork(() ->
        {
            // Given we only add two biomes, we should keep our weight relatively low.
            Regions.register(new ModRegions(new ResourceLocation(MODID, "overworld"), 1));

            // Register our surface rules
            SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, MODID, ModSurfaceRuleData.makeRules());
        });
    }

    public static final CreativeModeTab TAB = new CreativeModeTab(MODID ) {
        @Override
        public @NotNull ItemStack makeIcon() {
            return ItemInit.WRECKING_BALL.get().getDefaultInstance();
        }


    };

    public static final CreativeModeTab CANDY_TAB = new CreativeModeTab(MODID ) {
        @Override
        public @NotNull ItemStack makeIcon() {
            return ItemInit.COTTON_CANDY.get().getDefaultInstance();
        }


    };

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_LEMONADE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_LEMONADE.get(), RenderType.translucent());
        }
    }

}
