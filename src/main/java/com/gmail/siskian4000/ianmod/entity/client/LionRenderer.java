package com.gmail.siskian4000.ianmod.entity.client;

import com.gmail.siskian4000.ianmod.IanMod;
import com.gmail.siskian4000.ianmod.entity.custom.LionEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class LionRenderer extends MobRenderer<LionEntity, LionModel<LionEntity>> {
    public LionRenderer(EntityRendererProvider.Context context) {
        super(context, new LionModel<>(context.bakeLayer(LionModel.LAYER_LOCATION)), 1.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(LionEntity lionEntity) {
        return ResourceLocation.fromNamespaceAndPath(IanMod.MOD_ID, "textures/entity/lion/lion.png");
    }

    @Override
    public void render(LionEntity entity, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            poseStack.scale(1f, 1f, 1f);
        }

        super.render(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);
    }
}
