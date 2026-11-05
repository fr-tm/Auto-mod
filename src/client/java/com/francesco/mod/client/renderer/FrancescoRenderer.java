package com.francesco.mod.client.renderer;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.Identifier;

import com.francesco.mod.FrancescoMod;
import com.francesco.mod.client.model.FrancescoModel;
import com.francesco.mod.client.model.FrancescoRenderState;
import com.francesco.mod.entity.FrancescoEntity;

public class FrancescoRenderer extends MobRenderer<FrancescoEntity, FrancescoRenderState, FrancescoModel> {
	private static final String[] KEYS = {"ocn", "oln", "orn", "ocs", "ols", "ors", "hcn", "hcs", "ccn", "ccs"};
	private static final Map<String, Identifier> TEXTURES = new HashMap<>();
	private static final Identifier DEFAULT_TEXTURE = FrancescoMod.id("textures/entity/francesco.png");

	static {
		for (String key : KEYS) {
			TEXTURES.put(key, key.equals("ocn")
					? DEFAULT_TEXTURE
					: FrancescoMod.id("textures/entity/francesco_" + key + ".png"));
		}
	}

	public FrancescoRenderer(EntityRendererProvider.Context context) {
		super(context, new FrancescoModel(context.bakeLayer(FrancescoModel.LAYER)), 0.5F);
	}

	@Override
	public FrancescoRenderState createRenderState() {
		return new FrancescoRenderState();
	}

	@Override
	public void extractRenderState(FrancescoEntity entity, FrancescoRenderState state, float partialTick) {
		super.extractRenderState(entity, state, partialTick);
		state.faceKey = FaceAnim.key(entity.tickCount, entity.getId(), entity.idleTicks);
	}

	@Override
	public Identifier getTextureLocation(FrancescoRenderState state) {
		Identifier texture = TEXTURES.get(state.faceKey);
		return texture != null ? texture : DEFAULT_TEXTURE;
	}
}
