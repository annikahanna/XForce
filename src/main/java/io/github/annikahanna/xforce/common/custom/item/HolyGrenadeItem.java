package io.github.annikahanna.xforce.common.custom.item;

import io.github.annikahanna.xforce.common.custom.item.HolyGrenade;
import io.github.annikahanna.xforce.core.init.SoundInit;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class HolyGrenadeItem extends Item {

    public HolyGrenadeItem(Properties p_41383_) {
        super(p_41383_);
    }

    public InteractionResultHolder<ItemStack> use(Level p_43142_, Player player, InteractionHand p_43144_) {
        ItemStack itemstack = player.getItemInHand(p_43144_);
        player.playSound(SoundInit.GRENADE.get());
        if (!p_43142_.isClientSide) {
            HolyGrenade grenade = new HolyGrenade(p_43142_, player);
            grenade.setItem(itemstack);
            grenade.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, 2F, 1.0F);
            p_43142_.addFreshEntity(grenade);
        }

       player.awardStat(Stats.ITEM_USED.get(this));
        if (!player.getAbilities().instabuild) {
            itemstack.shrink(1);
        }

        return InteractionResultHolder.sidedSuccess(itemstack, p_43142_.isClientSide());
    }
}
