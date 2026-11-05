package com.francesco.mod.client.sound;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientEntityEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.Minecraft;

import com.francesco.mod.entity.FrancescoEntity;

/** Starts the engine sound of every Francesco that comes close to the player. */
public final class CarSoundManager {
	private static final double START_DISTANCE_SQ = 20.0 * 20.0;

	private static final List<FrancescoEntity> CARS = new ArrayList<>();
	private static final Map<FrancescoEntity, EngineSoundInstance> ACTIVE = new HashMap<>();

	private CarSoundManager() {
	}

	public static void initialize() {
		ClientEntityEvents.ENTITY_LOAD.register((entity, level) -> {
			if (entity instanceof FrancescoEntity car && !CARS.contains(car)) {
				CARS.add(car);
			}
		});
		ClientEntityEvents.ENTITY_UNLOAD.register((entity, level) -> {
			if (entity instanceof FrancescoEntity car) {
				CARS.remove(car);
				ACTIVE.remove(car);
			}
		});
		ClientTickEvents.END_CLIENT_TICK.register(CarSoundManager::tick);
	}

	private static void tick(Minecraft client) {
		if (client.level == null || client.player == null) {
			CARS.clear();
			ACTIVE.clear();
			return;
		}

		for (FrancescoEntity car : new ArrayList<>(CARS)) {
			if (car.isRemoved()) {
				continue;
			}
			EngineSoundInstance running = ACTIVE.get(car);
			if (running != null && !running.isStopped()) {
				continue;
			}
			if (car.distanceToSqr(client.player) > START_DISTANCE_SQ) {
				continue;
			}
			EngineSoundInstance engine = new EngineSoundInstance(car);
			ACTIVE.put(car, engine);
			client.getSoundManager().play(engine);
		}
	}
}
