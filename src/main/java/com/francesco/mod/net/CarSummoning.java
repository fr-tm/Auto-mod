package com.francesco.mod.net;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.phys.AABB;

import com.francesco.mod.entity.CarPlacement;
import com.francesco.mod.entity.FrancescoEntity;
import com.francesco.mod.entity.ModEntities;
import com.francesco.mod.sound.ModSounds;

/**
 * Server side of the F + R + A key combination: calls Francesco if he is not there,
 * sends him away if he is. Works in every game mode and needs no commands or permissions.
 */
public final class CarSummoning {
	/** Minimum time between two toggles per player, in game ticks. */
	private static final long COOLDOWN_TICKS = 15L;
	private static final Map<UUID, Long> LAST_USE = new HashMap<>();

	private CarSummoning() {
	}

	public static void initialize() {
		PayloadTypeRegistry.serverboundPlay().register(ToggleCarPayload.TYPE, ToggleCarPayload.CODEC);
		ServerPlayNetworking.registerGlobalReceiver(ToggleCarPayload.TYPE, (payload, context) -> {
			ServerPlayer player = context.player();
			context.server().execute(() -> toggle(player));
		});
	}

	private static void toggle(ServerPlayer player) {
		if (player.isSpectator()) {
			return;
		}
		if (!(player.level() instanceof ServerLevel level)) {
			return;
		}

		long now = level.getGameTime();
		Long last = LAST_USE.get(player.getUUID());
		if (last != null && now >= last && now - last < COOLDOWN_TICKS) {
			return;
		}
		LAST_USE.put(player.getUUID(), now);

		List<FrancescoEntity> owned = findOwnedCars(level.getServer(), player);
		if (!owned.isEmpty()) {
			for (FrancescoEntity car : owned) {
				car.playSound(ModSounds.ENGINE_STOP, 0.6F, 1.0F);
				car.discard();
			}
			return;
		}

		spawnCar(level, player);
	}

	private static List<FrancescoEntity> findOwnedCars(MinecraftServer server, ServerPlayer player) {
		List<FrancescoEntity> result = new ArrayList<>();
		UUID owner = player.getUUID();
		AABB area = new AABB(
				player.getX() - 1024.0, -4096.0, player.getZ() - 1024.0,
				player.getX() + 1024.0, 4096.0, player.getZ() + 1024.0);
		for (ServerLevel level : server.getAllLevels()) {
			result.addAll(level.getEntitiesOfClass(FrancescoEntity.class, area, car -> owner.equals(car.getOwnerUuid())));
		}
		return result;
	}

	private static void spawnCar(ServerLevel level, ServerPlayer player) {
		FrancescoEntity car = ModEntities.FRANCESCO.create(level, EntitySpawnReason.SPAWN_ITEM_USE);
		if (car == null) {
			return;
		}

		float yaw = player.getYRot();
		double rad = Math.toRadians(yaw);
		double frontX = player.getX() - Math.sin(rad) * 3.0;
		double frontZ = player.getZ() + Math.cos(rad) * 3.0;
		float facing = yaw + 180.0F;

		car.setPos(frontX, player.getY(), frontZ);
		car.setYRot(facing);
		car.yBodyRot = facing;
		car.setYHeadRot(facing);
		car.setOwnerUuid(player.getUUID());
		car.setFollowing(true);
		level.addFreshEntity(car);

		settle(car, player, frontX, frontZ);
		car.playSound(ModSounds.ENGINE_START, 0.7F, 1.0F);
	}

	/** Puts the car on free ground, first right in front of the player, otherwise somewhere close by. */
	private static void settle(FrancescoEntity car, ServerPlayer player, double frontX, double frontZ) {
		if (CarPlacement.placeAt(car, frontX, player.getY(), frontZ)) {
			return;
		}
		RandomSource random = car.getRandom();
		for (int i = 0; i < 16; i++) {
			double dx = (random.nextDouble() - 0.5) * 8.0;
			double dz = (random.nextDouble() - 0.5) * 8.0;
			if (Math.abs(dx) < 1.8 && Math.abs(dz) < 1.8) {
				continue;
			}
			if (CarPlacement.placeAt(car, player.getX() + dx, player.getY(), player.getZ() + dz)) {
				return;
			}
		}
		car.snapTo(player.position());
	}
}
