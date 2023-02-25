package net.mcreator.horrified.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.6.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelhorder<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("horrified", "modelhorder"), "main");
	public final ModelPart leftarm;
	public final ModelPart rightarm;
	public final ModelPart head;
	public final ModelPart rightleg;
	public final ModelPart Leftleg;
	public final ModelPart body;

	public Modelhorder(ModelPart root) {
		this.leftarm = root.getChild("leftarm");
		this.rightarm = root.getChild("rightarm");
		this.head = root.getChild("head");
		this.rightleg = root.getChild("rightleg");
		this.Leftleg = root.getChild("Leftleg");
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offset(0.0F, 17.0F, 3.5F));
		PartDefinition cube_r1 = leftarm.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(19, 20).addBox(-0.5F, -1.5F, -2.5F, 1.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.5F, -7.0F, -3.5F, 0.6109F, 0.0F, 0.0F));
		PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offset(0.0F, 17.0F, 3.5F));
		PartDefinition cube_r2 = rightarm.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, -2.0F, -3.1F, 1.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5F, -7.0F, -2.9F, 0.6109F, 0.0F, 0.0F));
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 8.0F, -1.5F));
		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(22, 0).addBox(-4.0F, -6.0F, -3.5F, 8.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.8762F, 0.0F, 0.0F));
		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 13).addBox(-4.0F, -6.0F, -2.5F, 8.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition rightleg = partdefinition
				.addOrReplaceChild("rightleg",
						CubeListBuilder.create().texOffs(24, 15).addBox(-0.5F, -0.5F, -5.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
								.texOffs(8, 23).addBox(-0.5F, -7.4F, 0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
						PartPose.offset(-2.5F, 23.5F, 2.0F));
		PartDefinition cube_r5 = rightleg.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(27, 28).addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));
		PartDefinition cube_r6 = rightleg.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(32, 14).addBox(-0.5F, -1.5F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.0F, 0.3927F, 0.0F));
		PartDefinition cube_r7 = rightleg.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(27, 8).addBox(-0.5F, 0.0F, -4.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, -1.7453F, 0.0F, 0.0F));
		PartDefinition Leftleg = partdefinition
				.addOrReplaceChild("Leftleg",
						CubeListBuilder.create().texOffs(19, 8).addBox(-0.5F, -0.5F, -5.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
								.texOffs(22, 15).addBox(-0.5F, -7.4F, 0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
						PartPose.offset(2.5F, 23.5F, 2.0F));
		PartDefinition cube_r8 = Leftleg.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(8, 23).addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));
		PartDefinition cube_r9 = Leftleg.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(8, 28).addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));
		PartDefinition cube_r10 = Leftleg.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(27, 22).addBox(-0.5F, 0.0F, -4.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, -1.7453F, 0.0F, 0.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 17.0F, 3.5F));
		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -10.0F, -1.5F, 8.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6109F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Leftleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.Leftleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.rightleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.rightarm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.leftarm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}
