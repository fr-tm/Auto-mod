package com.francesco.mod.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.ModelLayerRegistry;

import com.francesco.mod.client.input.CarKeyHandler;
import com.francesco.mod.client.model.FrancescoModel;
import com.francesco.mod.client.renderer.FrancescoRenderer;
import com.francesco.mod.client.sound.CarSoundManager;
import com.francesco.mod.entity.ModEntities;

public class FrancescoModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		ModelLayerRegistry.registerModelLayer(FrancescoModel.LAYER, FrancescoModel::createBodyLayer);
		EntityRendererRegistry.register(ModEntities.FRANCESCO, FrancescoRenderer::new);
		CarKeyHandler.initialize();
		CarSoundManager.initialize();
	}
}
