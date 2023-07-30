package io.github.annikahanna.xforce.core.init.fluid;

import com.mojang.math.Vector3f;
import io.github.annikahanna.xforce.XForce;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.common.SoundAction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluidTypes {
    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation LEMONADE_OVERLAY_RL = new ResourceLocation(XForce.MODID, "fluids/in_lemonade");

    public static final ResourceLocation KAKAO_OVERLAY_RL = new ResourceLocation(XForce.MODID, "fluids/in_kakao");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, XForce.MODID);

    public static final RegistryObject<FluidType> LEMONADE_FLUID_TYPE = registerLemonade("lemonade_fluid",
            FluidType.Properties.create()
                    .lightLevel(2)
                    .density(15)
                    .viscosity(5)
                    .canDrown(false)
                    .canHydrate(true)
                    .canSwim(true)
                    .sound(SoundAction.get("drink"),
                    SoundEvents.HONEY_DRINK));

    public static final RegistryObject<FluidType> KAKAO_FLUID_TYPE = registerKakao("kakao_fluid",
            FluidType.Properties.create()
                    .lightLevel(1)
                    .density(1)
                    .viscosity(1)
                    .canDrown(false)
                    .canHydrate(true)
                    .canSwim(true)
                    .sound(SoundAction.get("drink"),
                            SoundEvents.COW_MILK));



    private static RegistryObject<FluidType> registerLemonade(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, LEMONADE_OVERLAY_RL,
                0xff8e7cc3, new Vector3f(142f / 255f, 124f / 255f, 195f / 255f), properties));
    }

    private static RegistryObject<FluidType> registerKakao(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, KAKAO_OVERLAY_RL,
                0xff653825, new Vector3f(101f / 255f, 56f / 255f, 37f / 255f), properties));
    }

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}
