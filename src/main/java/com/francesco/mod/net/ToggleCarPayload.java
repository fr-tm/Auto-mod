package com.francesco.mod.net;

import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;

import com.francesco.mod.FrancescoMod;

/** Sent from the client to the server when the player presses F + R + A. It carries no data. */
public final class ToggleCarPayload implements CustomPacketPayload {
	public static final ToggleCarPayload INSTANCE = new ToggleCarPayload();
	public static final CustomPacketPayload.Type<ToggleCarPayload> TYPE =
			new CustomPacketPayload.Type<>(FrancescoMod.id("toggle_car"));
	public static final StreamCodec<RegistryFriendlyByteBuf, ToggleCarPayload> CODEC = StreamCodec.unit(INSTANCE);

	private ToggleCarPayload() {
	}

	@Override
	public CustomPacketPayload.Type<? extends CustomPacketPayload> type() {
		return TYPE;
	}
}
