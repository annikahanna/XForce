package io.github.annikahanna.xforce.core.world.feature;

import io.github.annikahanna.xforce.XForce;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModPlacedFeatures {

    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, XForce.MODID);


    public static final RegistryObject<PlacedFeature> ROSEQUARZ_ORE_PLACED = PLACED_FEATURES.register("rosequarz_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.ROSEQUARZ_ORE.getHolder().get(),
                    commonOrePlacement(7, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(200)))));

    public static final RegistryObject<PlacedFeature> RUBY_ORE_PLACED = PLACED_FEATURES.register("ruby_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.RUBY_ORE.getHolder().get(),
                    commonOrePlacement(7, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(200)))));

    public static final RegistryObject<PlacedFeature> CITRIN_ORE_PLACED = PLACED_FEATURES.register("citrin_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.CITRIN_ORE.getHolder().get(),
                    commonOrePlacement(7, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(200)))));

    public static final RegistryObject<PlacedFeature> TURMALIN_ORE_PLACED = PLACED_FEATURES.register("turmalin_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.TURMALIN_ORE.getHolder().get(),
                    commonOrePlacement(7, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(200)))));

    public static final RegistryObject<PlacedFeature> MALACHITE_ORE_PLACED = PLACED_FEATURES.register("malachite_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.MALACHITE_ORE.getHolder().get(),
                    commonOrePlacement(7, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(200)))));

    public static final RegistryObject<PlacedFeature> FLUORITE_ORE_PLACED = PLACED_FEATURES.register("fluorite_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.FLUORITE_ORE.getHolder().get(),
                    commonOrePlacement(7, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(200)))));

    public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    public static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }

    public static void register (IEventBus eventBus){
        PLACED_FEATURES.register(eventBus);
    }
}
