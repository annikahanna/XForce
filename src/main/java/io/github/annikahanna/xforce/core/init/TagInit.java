package io.github.annikahanna.xforce.core.init;

import io.github.annikahanna.xforce.XForce;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class TagInit {

    public static class Blocks {
        public static final TagKey<Block> PORTAL_FRAME_BLOCKS = tag("portal_frame_blocks");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(XForce.MODID, name));
        }
    }
}
