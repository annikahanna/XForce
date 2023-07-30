package io.github.annikahanna.xforce.common.custom.item;

import io.github.annikahanna.xforce.core.init.SoundInit;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentInstance;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;

public class HolyCrossItem extends SwordItem {



    public HolyCrossItem(Tier p_43269_, int p_43270_, float p_43271_, Properties p_43272_) {
        super(p_43269_, p_43270_, p_43271_, p_43272_);
    }




    @Override
    public boolean onEntitySwing(ItemStack stack, LivingEntity entity) {
        stack.enchant(Enchantments.FIRE_ASPECT,3);
        entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 300, 3));
        entity.setGlowingTag(true);
        entity.playSound(SoundInit.HOLY_CROSS.get());



        return super.onEntitySwing(stack, entity);



    }




}
