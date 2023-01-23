package io.github.annikahanna.xforce.common.custom;

import io.github.annikahanna.xforce.core.init.SoundInit;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.enchantment.Enchantments;

public class UnHolyCrossItem extends SwordItem {



    public UnHolyCrossItem(Tier p_43269_, int p_43270_, float p_43271_, Properties p_43272_) {
        super(p_43269_, p_43270_, p_43271_, p_43272_);
    }


    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity enemy, LivingEntity player) {
        enemy.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 300, 3));
        stack.hurtAndBreak(1,player, (p_43296_) -> {
            p_43296_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
        });
        return true;
    }


    @Override
    public boolean onEntitySwing(ItemStack stack, LivingEntity entity) {
        entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 300, 5));
        entity.setGlowingTag(false);
        entity.setSharedFlagOnFire(true);



        return super.onEntitySwing(stack, entity);



    }




}
