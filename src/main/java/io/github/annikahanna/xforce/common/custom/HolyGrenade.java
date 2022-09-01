package io.github.annikahanna.xforce.common.custom;

import io.github.annikahanna.xforce.core.init.SoundInit;
import net.minecraft.client.Minecraft;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Snowball;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;

public class HolyGrenade extends ThrowableItemProjectile {

    public HolyGrenade(EntityType<? extends HolyGrenade> p_37391_, Level p_37392_) {
        super(p_37391_, p_37392_);
    }

    public HolyGrenade(Level p_37399_, LivingEntity p_37400_) {
        super(EntityType.SNOWBALL, p_37400_, p_37399_);
    }

    public HolyGrenade(Level p_37394_, double p_37395_, double p_37396_, double p_37397_) {
        super(EntityType.SNOWBALL, p_37395_, p_37396_, p_37397_, p_37394_);
    }

    @Override
    protected void onHitBlock(BlockHitResult result) {
        super.onHitBlock(result);
        Explosion.BlockInteraction explosion$blockinteraction =Explosion.BlockInteraction.DESTROY;
        Minecraft instance = Minecraft.getInstance();
        Explosion boom = new Explosion(level,instance.player, DamageSource.GENERIC, null,result.getBlockPos().getX(),result.getBlockPos().getY(),result.getBlockPos().getZ(),2f, false, explosion$blockinteraction);
        boom.explode();
        boom.finalizeExplosion(true);
    }

    @Override
    protected void onHitEntity(EntityHitResult result) {
        super.onHitEntity(result);
        Explosion.BlockInteraction explosion$blockinteraction =Explosion.BlockInteraction.DESTROY;
        Minecraft instance = Minecraft.getInstance();
        Explosion boom = new Explosion(level,instance.player, DamageSource.GENERIC, null, result.getLocation().x(),result.getLocation().y(),result.getLocation().z(),2f, false, explosion$blockinteraction);
        boom.explode();
        boom.finalizeExplosion(true);
    }

   /* protected void onHit(HitResult p_37406_) {
        super.onHit(p_37406_);
        if (!this.level.isClientSide) {
            this.level.broadcastEntityEvent(this, (byte)3);
            this.discard();
        }
    }
*/
    @Override
    protected Item getDefaultItem() {
        return null;
    }


}
