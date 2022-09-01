package io.github.annikahanna.xforce.core.world.feature;

import io.github.annikahanna.xforce.XForce;
import io.github.annikahanna.xforce.core.init.BlockInit;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModConfiguredFeatures {
    public static final DeferredRegister<ConfiguredFeature<?,?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, XForce.MODID);


    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_ROSEQUARZ_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.ROSEQUARZ_ORE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_RUBY_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.RUBY_ORE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_CITRIN_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.CITRIN_ORE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_TURMALIN_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.TURMALIN_ORE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_MALACHITE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.MALACHITE_ORE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_FLUORITE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.FLUORITE_ORE.get().defaultBlockState())));



    public static final RegistryObject<ConfiguredFeature<?, ?>> ROSEQUARZ_ORE = CONFIGURED_FEATURES.register("rosequarz_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_ROSEQUARZ_ORES.get(),9)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> RUBY_ORE = CONFIGURED_FEATURES.register("ruby_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_RUBY_ORES.get(),9)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> CITRIN_ORE = CONFIGURED_FEATURES.register("citrin_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_CITRIN_ORES.get(),9)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> TURMALIN_ORE = CONFIGURED_FEATURES.register("turmalin_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_TURMALIN_ORES.get(),9)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> MALACHITE_ORE = CONFIGURED_FEATURES.register("malachite_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_MALACHITE_ORES.get(),9)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> FLUORITE_ORE = CONFIGURED_FEATURES.register("fluorite_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_FLUORITE_ORES.get(),9)));


    public static void register (IEventBus eventBus){
        CONFIGURED_FEATURES.register(eventBus);
    }

}
