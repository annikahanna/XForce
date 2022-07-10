package io.github.annikahanna.xforce.client.renderer;

import io.github.annikahanna.xforce.XForce;
import io.github.annikahanna.xforce.client.renderer.model.PixelModel;
import io.github.annikahanna.xforce.common.entity.Corgi;
import io.github.annikahanna.xforce.common.entity.Pixel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import io.github.annikahanna.xforce.client.renderer.model.CorgiModel;

public class CorgiRenderer<Type extends Corgi> extends MobRenderer<Type, CorgiModel<Type>> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(XForce.MODID, "textures/entities/corgi.png");

    public CorgiRenderer(EntityRendererProvider.Context context) {
        super(context, new CorgiModel<>(context.bakeLayer(CorgiModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(Type entity_) {
        return TEXTURE;
    }
}
