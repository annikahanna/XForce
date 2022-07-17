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

    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(XForce.MODID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
