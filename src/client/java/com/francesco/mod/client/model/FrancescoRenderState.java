package com.francesco.mod.client.model;

import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;

public class FrancescoRenderState extends LivingEntityRenderState {
	/** Three letters: eyes (o/h/c), look direction (c/l/r), mouth (n/s). Selects the face texture. */
	public String faceKey = "ocn";
}
