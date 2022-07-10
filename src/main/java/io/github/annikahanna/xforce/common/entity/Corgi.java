package io.github.annikahanna.xforce.common.entity;

import io.github.annikahanna.xforce.core.init.EntityInit;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Wolf;
import net.minecraft.world.level.Level;

import java.util.UUID;

public class Corgi extends Wolf {

    public Corgi(EntityType<? extends Wolf> p_30369_, Level p_30370_) {
        super(p_30369_, p_30370_);
    }

    @Override
    public Corgi getBreedOffspring(ServerLevel p_149088_, AgeableMob p_149089_) {
        Corgi corgi = EntityInit.CORGI.get().create(p_149088_);
        UUID uuid = this.getOwnerUUID();
        if (uuid != null) {
            corgi.setOwnerUUID(uuid);
            corgi.setTame(true);
        }

        return corgi;
    }
}
