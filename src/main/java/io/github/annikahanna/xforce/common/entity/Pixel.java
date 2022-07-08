package io.github.annikahanna.xforce.common.entity;

import io.github.annikahanna.xforce.core.init.EntityInit;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.*;
import net.minecraft.world.entity.ai.targeting.TargetingConditions;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.Turtle;
import net.minecraft.world.entity.animal.Wolf;
import net.minecraft.world.entity.animal.horse.Llama;
import net.minecraft.world.entity.monster.AbstractSkeleton;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.EnumSet;
import java.util.UUID;


public class Pixel extends Wolf {

    public Pixel(EntityType<? extends Wolf> p_30369_, Level p_30370_) {
        super(p_30369_, p_30370_);
    }

    @Override
    public Pixel getBreedOffspring(ServerLevel p_149088_, AgeableMob p_149089_) {
        Pixel pixel = EntityInit.PIXEL.get().create(p_149088_);
        UUID uuid = this.getOwnerUUID();
        if (uuid != null) {
            pixel.setOwnerUUID(uuid);
            pixel.setTame(true);
        }

        return pixel;
    }
}
