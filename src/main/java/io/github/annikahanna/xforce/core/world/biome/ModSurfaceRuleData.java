package io.github.annikahanna.xforce.core.world.biome;

import io.github.annikahanna.xforce.core.init.BlockInit;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.SurfaceRules;

public class ModSurfaceRuleData {

    private static final SurfaceRules.RuleSource DIRT = makeStateRule(BlockInit.CANDY_DIRT.get());
    private static final SurfaceRules.RuleSource GRASS_BLOCK = makeStateRule(BlockInit.COTTON_CANDY_GRASS.get());

    private static final SurfaceRules.RuleSource COTTON_CANDY_GRASS = makeStateRule(BlockInit.COTTON_CANDY_GRASS.get());

    public static SurfaceRules.RuleSource makeRules()
    {
        SurfaceRules.ConditionSource isAtOrAboveWaterLevel = SurfaceRules.waterBlockCheck(-1, 0);
        SurfaceRules.RuleSource grassSurface = SurfaceRules.sequence(SurfaceRules.ifTrue(isAtOrAboveWaterLevel, GRASS_BLOCK), DIRT);

        return SurfaceRules.sequence(

                SurfaceRules.ifTrue(SurfaceRules.isBiome(ModBiomes.CANDY), COTTON_CANDY_GRASS),
                // Default to a grass and dirt surface
                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, grassSurface)
        );
    }

    private static SurfaceRules.RuleSource makeStateRule(Block block)
    {
        return SurfaceRules.state(block.defaultBlockState());
    }

}
