package io.github.annikahanna.xforce.core.init.fluid;

import io.github.annikahanna.xforce.XForce;
import io.github.annikahanna.xforce.core.init.BlockInit;
import io.github.annikahanna.xforce.core.init.ItemInit;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, XForce.MODID);

    public static final RegistryObject<FlowingFluid> SOURCE_LEMONADE = FLUIDS.register("lemonade_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.LEMONADE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_LEMONADE = FLUIDS.register("flowing_lemonade",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.LEMONADE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_KAKAO = FLUIDS.register("kakao_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.KAKAO_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_KAKAO = FLUIDS.register("flowing_kakao",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.KAKAO_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties LEMONADE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.LEMONADE_FLUID_TYPE, SOURCE_LEMONADE, FLOWING_LEMONADE)
            .slopeFindDistance(1).levelDecreasePerBlock(1).block(BlockInit.LEMONADE_BLOCK)
            .bucket(ItemInit.LEMONADE_BUCKET);

    public static final ForgeFlowingFluid.Properties KAKAO_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.KAKAO_FLUID_TYPE, SOURCE_KAKAO, FLOWING_KAKAO)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(BlockInit.KAKAO_BLOCK)
            .bucket(ItemInit.KAKAO_BUCKET);


    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
