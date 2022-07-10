package io.github.annikahanna.xforce.core.init;

import io.github.annikahanna.xforce.XForce;
import io.github.annikahanna.xforce.common.entity.Corgi;
import io.github.annikahanna.xforce.common.entity.Pixel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityInit {

    private EntityInit(){}

    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, XForce.MODID);

    public static final RegistryObject<EntityType<Pixel>> PIXEL = ENTITIES.register(
            "pixel",
            () -> EntityType.Builder.of(Pixel::new, MobCategory.CREATURE)
                    .sized(0.8f,0.6f)
                    .build(new ResourceLocation(XForce.MODID, "pixel")
                            .toString()));

    public static final RegistryObject<EntityType<Corgi>> CORGI = ENTITIES.register(
            "corgi",
            () -> EntityType.Builder.of(Corgi::new, MobCategory.CREATURE)
                    .sized(0.8f,0.6f)
                    .build(new ResourceLocation(XForce.MODID, "corgi")
                            .toString()));
}
