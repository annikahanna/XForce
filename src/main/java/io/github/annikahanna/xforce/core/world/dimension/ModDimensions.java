package io.github.annikahanna.xforce.core.world.dimension;

import io.github.annikahanna.xforce.XForce;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;

public class ModDimensions {

    public static final ResourceKey<Level> CANDYDIM_KEY = ResourceKey.create(Registry.DIMENSION_REGISTRY,
            new ResourceLocation(XForce.MODID, "candydim"));

    public static final ResourceKey<DimensionType> CANDYDIM_TYPE =
            ResourceKey.create(Registry.DIMENSION_TYPE_REGISTRY, CANDYDIM_KEY.registry());

    public static void register(){
        System.out.println("Registering ModDiemnsions for "+ XForce.MODID);
    }
}
