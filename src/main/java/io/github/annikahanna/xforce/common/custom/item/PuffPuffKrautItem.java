package io.github.annikahanna.xforce.common.custom.item;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

import java.util.Random;

public class PuffPuffKrautItem extends Item {


    public PuffPuffKrautItem(Properties p_41383_) {
        super(p_41383_);
    }


    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {

        player.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 50, 3));
        player.setItemInHand(hand, Items.AIR.getDefaultInstance());

            Random rand = new Random();
            int randomNum = rand.nextInt((10 - 5) + 1) + 5;

            player.teleportTo(player.getX() + randomNum, player.getY(), player.getZ());

            return super.use(level, player, hand);
    }
}
