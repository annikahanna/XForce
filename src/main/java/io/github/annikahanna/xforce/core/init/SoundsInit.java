package io.github.annikahanna.xforce.core.init;

import io.github.annikahanna.xforce.XForce;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class SoundsInit {

    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, XForce.MODID);

    public static final RegistryObject<SoundEvent> FANTASY_GIRL = SOUNDS.register("entity.fantasy_girl",
            () -> new SoundEvent(new ResourceLocation(XForce.MODID, "entity.fantasy_girl")));

    private SoundsInit() {
    }
}
