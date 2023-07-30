package io.github.annikahanna.xforce.common.custom.item;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

import java.util.Random;

public class OpiumItem extends Item {


    public OpiumItem(Properties p_41383_) {
        super(p_41383_);
    }


    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {

        player.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 600, 3));
        player.setItemInHand(hand, Items.AIR.getDefaultInstance());
        player.setNoGravity(true);

            return super.use(level, player, hand);
    }
}
