package io.github.annikahanna.xforce.core.world.biome;

import com.mojang.datafixers.util.Pair;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.Climate;
import terrablender.api.Region;
import terrablender.api.RegionType;

import java.util.function.Consumer;

public class ModRegions extends Region{
    public ModRegions(ResourceLocation name, int weight)
    {
        super(name, RegionType.OVERWORLD, weight);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper)
    {

        this.addModifiedVanillaOverworldBiomes(mapper, builder -> {
            // Simple example:
            // Replace the Vanilla desert with our candy biome
            builder.replaceBiome(Biomes.BADLANDS, ModBiomes.CANDY);
            builder.replaceBiome(Biomes.BAMBOO_JUNGLE, ModBiomes.CANDY);
            builder.replaceBiome(Biomes.DESERT, ModBiomes.CANDY);
            builder.replaceBiome(Biomes.BIRCH_FOREST, ModBiomes.CANDY);
            builder.replaceBiome(Biomes.FOREST, ModBiomes.CANDY);

        });
    }
}
