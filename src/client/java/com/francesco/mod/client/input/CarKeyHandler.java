package com.francesco.mod.client.input;

import com.mojang.blaze3d.platform.InputConstants;
import org.lwjgl.sdl.SDLScancode;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.client.Minecraft;

import com.francesco.mod.net.ToggleCarPayload;

/**
 * Detects the key combination F + R + A (all three held at once) and tells the server
 * to call Francesco or send him away. The combination is only checked while no menu or chat is open,
 * so typing "far" in the chat does nothing.
 */
public final class CarKeyHandler {
	private static boolean wasDown = false;

	private CarKeyHandler() {
	}

	public static void initialize() {
		ClientTickEvents.END_CLIENT_TICK.register(CarKeyHandler::tick);
	}

	private static void tick(Minecraft client) {
		if (client.player == null || client.getConnection() == null || client.gui.screen() != null) {
			wasDown = false;
			return;
		}

		boolean down = InputConstants.isKeyDown(SDLScancode.SDL_SCANCODE_F)
				&& InputConstants.isKeyDown(SDLScancode.SDL_SCANCODE_R)
				&& InputConstants.isKeyDown(SDLScancode.SDL_SCANCODE_A);

		if (down && !wasDown && ClientPlayNetworking.canSend(ToggleCarPayload.TYPE)) {
			ClientPlayNetworking.send(ToggleCarPayload.INSTANCE);
		}
		wasDown = down;
	}
}
