package io.github.annikahanna.xforce.common.custom;

import io.github.annikahanna.xforce.core.init.SoundInit;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;

public class HolyGrenadeItem extends Item {

    public HolyGrenadeItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        Explosion.BlockInteraction explosion$blockinteraction =Explosion.BlockInteraction.DESTROY;
        player.playSound(SoundInit.GRENADE.get());

        Explosion boom = new Explosion(level,player, DamageSource.GENERIC, null,player.getEyePosition().x(),player.getEyePosition().y(),player.getEyePosition().z(),5f, false, explosion$blockinteraction);
        boom.explode();
        boom.finalizeExplosion(true);

        return super.use(level, player, hand);
    }
}
