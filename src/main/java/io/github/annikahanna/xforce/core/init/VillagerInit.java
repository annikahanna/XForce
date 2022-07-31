package io.github.annikahanna.xforce.core.init;

import com.google.common.collect.ImmutableSet;
import io.github.annikahanna.xforce.XForce;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.ai.village.poi.PoiTypes;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class VillagerInit {

    public static final DeferredRegister<PoiType> POI_TYPES
            = DeferredRegister.create(ForgeRegistries.POI_TYPES, XForce.MODID);
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS
            = DeferredRegister.create(ForgeRegistries.PROFESSIONS, XForce.MODID);




    public static final RegistryObject<PoiType> HONEY_POI = POI_TYPES.register("honey_poi",
            () -> new PoiType(ImmutableSet.copyOf(Blocks.HONEY_BLOCK.getStateDefinition().getPossibleStates()),
                    1,1));

    public static final RegistryObject<VillagerProfession> BEEKEEPER =
            VILLAGER_PROFESSIONS.register("beekeeper",
            () -> new VillagerProfession("beekeeper",
                    x -> x.get() == HONEY_POI.get(),
                    x -> x.get() == HONEY_POI.get(),
                    ImmutableSet.of(),
                    ImmutableSet.of(),
                    SoundEvents.BEEHIVE_WORK));

    public static final RegistryObject<PoiType> DOG_POI = POI_TYPES.register("dog_poi",
            () -> new PoiType(ImmutableSet.copyOf(Blocks.BONE_BLOCK.getStateDefinition().getPossibleStates()),
                    1,1));

    public static final RegistryObject<VillagerProfession> DOG_BREEDER =
            VILLAGER_PROFESSIONS.register("dog_breeder",
                    () -> new VillagerProfession("dog_breeder",
                            x -> x.get() == DOG_POI.get(),
                            x -> x.get() == DOG_POI.get(),
                            ImmutableSet.of(),
                            ImmutableSet.of(),
                            XForce.RANDOM_BREEDER()));

    public static final RegistryObject<PoiType> DJ_POI = POI_TYPES.register("dj_poi",
            () -> new PoiType(ImmutableSet.copyOf(Blocks.JUKEBOX.getStateDefinition().getPossibleStates()),
                    1,1));

    public static final RegistryObject<VillagerProfession> DJ =
            VILLAGER_PROFESSIONS.register("dj",
                    () -> new VillagerProfession("dj",
                            x -> x.get() == DJ_POI.get(),
                            x -> x.get() == DJ_POI.get(),
                            ImmutableSet.of(),
                            ImmutableSet.of(),
                            XForce.RANDOM_DJ()));

    public static final RegistryObject<PoiType> HOST_POI = POI_TYPES.register("host_poi",
            () -> new PoiType(ImmutableSet.copyOf(Blocks.CRAFTING_TABLE.getStateDefinition().getPossibleStates()),
                    1,1));

    public static final RegistryObject<VillagerProfession> HOST =
            VILLAGER_PROFESSIONS.register("host",
                    () -> new VillagerProfession("host",
                            x -> x.get() == HOST_POI.get(),
                            x -> x.get() == HOST_POI.get(),
                            ImmutableSet.of(),
                            ImmutableSet.of(),
                            XForce.RANDOM_BARKEEPER()));

    public static final RegistryObject<PoiType> GARDENER_POI = POI_TYPES.register("gardener_poi",
            () -> new PoiType(ImmutableSet.copyOf(Blocks.HAY_BLOCK.getStateDefinition().getPossibleStates()),
                    1,1));

    public static final RegistryObject<VillagerProfession> GARDENER =
            VILLAGER_PROFESSIONS.register("gardener",
                    () -> new VillagerProfession("gardener",
                            x -> x.get() == GARDENER_POI.get(),
                            x -> x.get() == GARDENER_POI.get(),
                            ImmutableSet.of(),
                            ImmutableSet.of(),
                            XForce.RANDOM_GARDENER()));

    public static void registerPOIs(){
        try{
            ObfuscationReflectionHelper.findMethod(PoiType.class,
                    "registerBlockStates", PoiType.class).invoke(null, Blocks.BEEHIVE);
        } catch(InvocationTargetException | IllegalAccessException exception){
            exception.printStackTrace();
        }
    }




    public static void register(IEventBus eventBus){

        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }
}
