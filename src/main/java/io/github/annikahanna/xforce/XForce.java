package io.github.annikahanna.xforce;

import io.github.annikahanna.xforce.core.init.*;
import io.github.annikahanna.xforce.core.world.structure.ModStructures;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.javafmlmod.FMLModContainer;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Mod(XForce.MODID)
public class XForce {
    public static final String MODID ="xforce";

    public static final List<SoundEvent> DJ_LIST = new ArrayList<>();
    public static final List<SoundEvent> BARKEEPER_LIST = new ArrayList<>();
    public static final List<SoundEvent> BREEDER_LIST = new ArrayList<>();

    public XForce(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        EntityInit.ENTITIES.register(bus);
        SoundInit.SOUND_EVENTS.register(bus);
        VillagerInit.register(bus);
        ModStructures.register(bus);



    }

    public static final SoundEvent RANDOM_DJ(){
        DJ_LIST.add(SoundInit.DJ.get());
        DJ_LIST.add(SoundInit.DJ2.get());
        DJ_LIST.add(SoundInit.DJ3.get());
        DJ_LIST.add(SoundInit.DJ4.get());
        DJ_LIST.add(SoundInit.DJ5.get());

        Random rand = new Random();

        return DJ_LIST.get(rand.nextInt(DJ_LIST.size()));

    }

    public static final SoundEvent RANDOM_BARKEEPER(){
        BARKEEPER_LIST.add(SoundInit.BARKEEPER.get());
        BARKEEPER_LIST.add(SoundInit.BARKEEPER2.get());
        BARKEEPER_LIST.add(SoundInit.BARKEEPER3.get());

        Random rand = new Random();

        return BARKEEPER_LIST.get(rand.nextInt(BARKEEPER_LIST.size()));

    }

    public static final SoundEvent RANDOM_BREEDER(){
        BREEDER_LIST.add(SoundInit.BREEDER.get());
        BREEDER_LIST.add(SoundInit.BREEDER2.get());
        BREEDER_LIST.add(SoundInit.BREEDER3.get());

        Random rand = new Random();

        return BREEDER_LIST.get(rand.nextInt(BREEDER_LIST.size()));

    }

    private void commonSetup(final FMLCommonSetupEvent event){
        event.enqueueWork(() -> {
            VillagerInit.registerPOIs();
        });
    }

    public static final CreativeModeTab TAB = new CreativeModeTab(MODID ) {
        @Override
        public @NotNull ItemStack makeIcon() {
            return ItemInit.HOLY_GRENADE.get().getDefaultInstance();
        }


    };
}
