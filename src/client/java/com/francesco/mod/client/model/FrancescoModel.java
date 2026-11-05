package com.francesco.mod.client.model;

import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.util.Mth;

import com.francesco.mod.FrancescoMod;

public class FrancescoModel extends EntityModel<FrancescoRenderState> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(FrancescoMod.id("francesco"), "main");

	private final ModelPart car;
	private final ModelPart frontLeft;
	private final ModelPart frontRight;
	private final ModelPart[] wheels;

	public FrancescoModel(ModelPart root) {
		super(root);
		this.car = root.getChild("car");
		this.frontLeft = this.car.getChild("wheel_fl");
		this.frontRight = this.car.getChild("wheel_fr");
		this.wheels = new ModelPart[] {
				this.frontLeft,
				this.frontRight,
				this.car.getChild("wheel_rl"),
				this.car.getChild("wheel_rr")
		};
	}

	public static LayerDefinition createBodyLayer() {
		return FrancescoLayer.create();
	}

	@Override
	public void setupAnim(FrancescoRenderState state) {
		super.setupAnim(state);

		float pos = state.walkAnimationPos;
		float speed = state.walkAnimationSpeed;

		float spin = pos * 1.8F;
		for (ModelPart wheel : this.wheels) {
			wheel.xRot = spin;
		}

		float steer = Mth.clamp(state.yRot * 0.017453292F, -0.35F, 0.35F) * Mth.clamp(speed * 3.0F, 0.0F, 1.0F);
		this.frontLeft.yRot = steer;
		this.frontRight.yRot = steer;

		float bob = Mth.sin(pos * 1.7F) * 0.14F * Mth.clamp(speed * 2.0F, 0.0F, 1.0F);
		float breathe = Mth.sin(state.ageInTicks * 1.9F) * 0.03F;
		this.car.y += bob + breathe;
		this.car.xRot = -0.04F * Mth.clamp(speed * 3.0F, 0.0F, 1.0F);
	}
}
