package io.github.annikahanna.xforce.core.event;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.horse.Llama;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(Llama.class)
public class LlamaSteeds {

    /**
     * I mount my steed...
     *
     * @note Gradle wants docs before it builds the jar for...some reason?
     * @return Whether or not the llama can be saddled
     * @reason So llamas can be controlled
     * @author justinhschaaf
     */
    @Overwrite
    public boolean isSaddleable() {
        return true;
    }

    /**
     * ...and I set forth on my journey
     *
     * @note The "canBeControlledByRider" method was removed in 1.19. This
     *      replaces it going forward.
     * @return The llama's rider. This is overriden by the LlamaEntity class to
     *      return null, I'm guessing so there is no primary passenger to
     *      control the llama. Not anymore!
     * @author justinhschaaf
     */
    @Overwrite
    public LivingEntity getControllingPassenger() {

        // It would have been so much more convenient if this worked
        // --but no, since you can't, I will write out my own version as you wish, Mixin Gods
        //return ((AbstractDonkeyEntity) (Object) super).getPrimaryPassenger();

        Llama llama = (Llama) (Object) this;

        if (llama.isSaddled()) {

            Entity rider = llama.getFirstPassenger();

            if (rider instanceof LivingEntity)
                return (LivingEntity) rider;

        }

        return null;

    }

}
