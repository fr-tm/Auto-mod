package com.francesco.mod.sound;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;

import com.francesco.mod.FrancescoMod;

/**
 * Sound events of the car. The audio itself is defined in assets/francesco/sounds.json.
 * The engine loop and the gear shift are played on the client (see EngineSoundInstance),
 * start and stop are played by the server when the car is called or sent away.
 */
public final class ModSounds {
	public static final SoundEvent ENGINE_LOOP = register("engine_loop");
	public static final SoundEvent ENGINE_SHIFT = register("engine_shift");
	public static final SoundEvent ENGINE_START = register("engine_start");
	public static final SoundEvent ENGINE_STOP = register("engine_stop");

	private ModSounds() {
	}

	private static SoundEvent register(String name) {
		Identifier id = FrancescoMod.id(name);
		return Registry.register(BuiltInRegistries.SOUND_EVENT, id, SoundEvent.createVariableRangeEvent(id));
	}

	public static void initialize() {
		// Loading this class registers the sound events.
	}
}
