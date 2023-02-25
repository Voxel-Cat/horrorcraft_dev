
package net.mcreator.horrified.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.horrified.entity.HordespawnerEntity;
import net.mcreator.horrified.client.model.Modelhorder;

public class HordespawnerRenderer extends MobRenderer<HordespawnerEntity, Modelhorder<HordespawnerEntity>> {
	public HordespawnerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhorder(context.bakeLayer(Modelhorder.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HordespawnerEntity entity) {
		return new ResourceLocation("horrified:textures/entities/hordespawn_texture.png");
	}
}
