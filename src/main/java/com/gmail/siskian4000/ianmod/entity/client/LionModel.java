package com.gmail.siskian4000.ianmod.entity.client;

import com.gmail.siskian4000.ianmod.IanMod;
import com.gmail.siskian4000.ianmod.entity.custom.LionEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

public class LionModel<T extends LionEntity> extends HierarchicalModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(IanMod.MOD_ID, "lion"), "main");
    private final ModelPart Body;
    private final ModelPart Head;
    private final ModelPart FrontLegR;
    private final ModelPart BackLegR;
    private final ModelPart BackLegL;
    private final ModelPart FrontLegL;
    private final ModelPart Tail;

    public LionModel(ModelPart root) {
        this.Body = root.getChild("Body");
        this.Head = this.Body.getChild("Head");
        this.FrontLegR = this.Body.getChild("FrontLegR");
        this.BackLegR = this.Body.getChild("BackLegR");
        this.BackLegL = this.Body.getChild("BackLegL");
        this.FrontLegL = this.Body.getChild("FrontLegL");
        this.Tail = this.Body.getChild("Tail");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -16.0F, -9.0F, 8.0F, 8.0F, 22.0F, new CubeDeformation(0.0F))
                .texOffs(62, 17).addBox(-5.0F, -20.0F, -10.0F, 10.0F, 13.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(120, 5).addBox(-4.0F, -21.0F, -11.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(120, 0).mirror().addBox(2.0F, -21.0F, -11.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition Head = Body.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(60, 0).addBox(-4.0F, -4.0F, -12.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(92, 0).addBox(-3.0F, 0.0F, -16.0F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -14.0F, -1.0F));

        PartDefinition FrontLegR = Body.addOrReplaceChild("FrontLegR", CubeListBuilder.create().texOffs(103, 10).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, -8.0F, 0.5F));

        PartDefinition BackLegR = Body.addOrReplaceChild("BackLegR", CubeListBuilder.create().texOffs(116, 22).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, -8.0F, 11.5F));

        PartDefinition BackLegL = Body.addOrReplaceChild("BackLegL", CubeListBuilder.create().texOffs(103, 22).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, -8.0F, 11.5F));

        PartDefinition FrontLegL = Body.addOrReplaceChild("FrontLegL", CubeListBuilder.create().texOffs(116, 10).mirror().addBox(-1.5F, 0.0F, -1.5F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.5F, -8.0F, 0.5F));

        PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0F, -16.0F, 12.0F));

        PartDefinition Tail2_r1 = Tail.addOrReplaceChild("Tail2_r1", CubeListBuilder.create().texOffs(6, 0).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.0F, 4.0F, 0.9163F, 0.0F, 0.0F));

        PartDefinition Tail1_r1 = Tail.addOrReplaceChild("Tail1_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 64);
    }

    @Override
    public void setupAnim(LionEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        this.applyHeadRotation(netHeadYaw, headPitch);
        this.animateWalk(LionAnimations.WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
        this.animate(entity.idleAnimationState, LionAnimations.IDLE, ageInTicks, 1f);
    }

    private void applyHeadRotation(float headYaw, float headPitch) {
        headYaw = Mth.clamp(headYaw,-30,30);
        headPitch = Mth.clamp(headPitch,30,30);
        this.Head.yRot = headYaw * ((float)Math.PI / 180f);
        this.Head.xRot = headPitch * ((float)Math.PI / 180f);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
        Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
    }

    @Override
    public ModelPart root() {
        return Body;
    }
}


