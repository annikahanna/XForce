package io.github.annikahanna.xforce.common.entity.client.renderer;

import io.github.annikahanna.xforce.XForce;
import io.github.annikahanna.xforce.common.entity.client.renderer.model.PixelModel;
import io.github.annikahanna.xforce.common.entity.Pixel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;


public class PixelRenderer<Type extends Pixel> extends MobRenderer<Type, PixelModel<Type>> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(XForce.MODID, "textures/entities/pixel.png");

    public PixelRenderer(EntityRendererProvider.Context context) {
        super(context, new PixelModel<>(context.bakeLayer(PixelModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(Type entity_) {
        return TEXTURE;
    }
}
