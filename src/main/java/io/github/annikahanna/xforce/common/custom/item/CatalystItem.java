package io.github.annikahanna.xforce.common.custom.item;

import io.github.annikahanna.xforce.XForce;
import io.github.annikahanna.xforce.common.custom.block.CandyPortalBlock;
import io.github.annikahanna.xforce.core.init.BlockInit;
import io.github.annikahanna.xforce.core.world.dimension.ModDimensions;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;

public class CatalystItem extends Item {
    public CatalystItem() {
        super(new Properties()
                .tab(XForce.CANDY_TAB)
                .stacksTo(1)
                .rarity(Rarity.RARE)
        );
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        System.out.println("hallo");
        if(context.getPlayer() != null) {
            if(context.getPlayer().level.dimension() == ModDimensions.CANDYDIM_KEY
                    || context.getPlayer().level.dimension() == Level.OVERWORLD) {
                System.out.println("olaf");
                for(Direction direction : Direction.Plane.VERTICAL) {
                    System.out.println("Schleife");
                    System.out.println(direction);
                    BlockPos framePos = context.getClickedPos().relative(direction);
                    System.out.println(framePos);
                    System.out.println(BlockInit.CANDY_PORTAL.get());
                    System.out.println(context.getLevel());
                    if(((CandyPortalBlock) BlockInit.CANDY_PORTAL.get()).trySpawnPortal(context.getLevel(), framePos)) {
                        System.out.println("passt");
                        context.getLevel().playSound(context.getPlayer(), framePos,
                                SoundEvents.PORTAL_TRIGGER, SoundSource.BLOCKS, 1.0F, 1.0F);
                        return InteractionResult.CONSUME;
                    }
                    else return InteractionResult.FAIL;
                }
            }
        }
        return InteractionResult.FAIL;
    }
}
