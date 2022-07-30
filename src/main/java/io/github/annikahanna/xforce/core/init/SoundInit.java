package io.github.annikahanna.xforce.core.init;

import io.github.annikahanna.xforce.XForce;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SoundInit {

    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, XForce.MODID);

    public static RegistryObject<SoundEvent> FANTASY_GIRL = registerSoundEvent("fantasy_girl");
    public static RegistryObject<SoundEvent> COTTON_EYE_JOE_GIRL = registerSoundEvent("cotton_eye_joe");
    public static RegistryObject<SoundEvent> COUNTRY_GIRL = registerSoundEvent("country_girl");
    public static RegistryObject<SoundEvent> RICK_ROLL = registerSoundEvent("rick_roll");
    public static RegistryObject<SoundEvent> SHANIA_TWAIN = registerSoundEvent("shania_twain");
    public static RegistryObject<SoundEvent> STRANGER_THINGS = registerSoundEvent("stranger_things");

    public static RegistryObject<SoundEvent> GOOD_BOY = registerSoundEvent("good_boy");

    public static RegistryObject<SoundEvent> ABBA = registerSoundEvent("abba");

    public static RegistryObject<SoundEvent> DJ = registerSoundEvent("dj");
    public static RegistryObject<SoundEvent> DJ2 = registerSoundEvent("dj2");
    public static RegistryObject<SoundEvent> DJ3 = registerSoundEvent("dj3");
    public static RegistryObject<SoundEvent> DJ4 = registerSoundEvent("dj4");
    public static RegistryObject<SoundEvent> DJ5 = registerSoundEvent("dj5");
    public static RegistryObject<SoundEvent> BARKEEPER = registerSoundEvent("barkeeper");
    public static RegistryObject<SoundEvent> BARKEEPER2 = registerSoundEvent("barkeeper2");
    public static RegistryObject<SoundEvent> BARKEEPER3 = registerSoundEvent("barkeeper3");
    public static RegistryObject<SoundEvent> BREEDER = registerSoundEvent("breeder");
    public static RegistryObject<SoundEvent> BREEDER2 = registerSoundEvent("breeder2");
    public static RegistryObject<SoundEvent> BREEDER3 = registerSoundEvent("breeder3");
    public static RegistryObject<SoundEvent> GRENADE = registerSoundEvent("grenade");


    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(XForce.MODID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
