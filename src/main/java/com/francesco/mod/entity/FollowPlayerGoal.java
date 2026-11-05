package com.francesco.mod.entity;

import java.util.EnumSet;

import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.player.Player;

public class FollowPlayerGoal extends Goal {
	private final FrancescoEntity mob;
	private final double startDist;
	private final double stopDist;
	private final double teleportDist;
	private Player target;
	private int recalc;
	private int stuck;
	private double lastDistSq;

	public FollowPlayerGoal(FrancescoEntity mob, double startDist, double stopDist, double teleportDist) {
		this.mob = mob;
		this.startDist = startDist;
		this.stopDist = stopDist;
		this.teleportDist = teleportDist;
		this.setFlags(EnumSet.of(Goal.Flag.MOVE, Goal.Flag.LOOK));
	}

	@Override
	public boolean canUse() {
		if (!this.mob.isFollowing()) {
			return false;
		}
		Player player = this.mob.level().getNearestPlayer(this.mob, 256.0);
		if (player == null || player.isSpectator()) {
			return false;
		}
		if (this.mob.distanceToSqr(player) < this.startDist * this.startDist) {
			return false;
		}
		this.target = player;
		return true;
	}

	@Override
	public boolean canContinueToUse() {
		if (!this.mob.isFollowing() || this.target == null || !this.target.isAlive() || this.target.isSpectator()) {
			return false;
		}
		return this.mob.distanceToSqr(this.target) > this.stopDist * this.stopDist;
	}

	@Override
	public void start() {
		this.recalc = 0;
		this.stuck = 0;
		this.lastDistSq = Double.MAX_VALUE;
	}

	@Override
	public void stop() {
		this.target = null;
		this.mob.getNavigation().stop();
	}

	@Override
	public void tick() {
		this.mob.getLookControl().setLookAt(this.target, 30.0F, 30.0F);
		if (--this.recalc > 0) {
			return;
		}
		this.recalc = 5;

		double distSq = this.mob.distanceToSqr(this.target);
		double dist = Math.sqrt(distSq);
		if (dist > 6.0 && distSq > this.lastDistSq - 0.25) {
			this.stuck++;
		} else {
			this.stuck = 0;
		}
		this.lastDistSq = distSq;

		if (dist >= this.teleportDist || this.stuck >= 8) {
			this.teleportNear();
			this.stuck = 0;
			this.lastDistSq = Double.MAX_VALUE;
			return;
		}

		double dx = this.mob.getX() - this.target.getX();
		double dz = this.mob.getZ() - this.target.getZ();
		double len = Math.max(0.001, Math.sqrt(dx * dx + dz * dz));
		double standOff = 2.0;
		double tx = this.target.getX() + dx / len * standOff;
		double tz = this.target.getZ() + dz / len * standOff;
		double speed = Math.max(0.9, Math.min(2.6, 0.8 + dist * 0.12));
		this.mob.getNavigation().moveTo(tx, this.target.getY(), tz, speed);
	}

	private void teleportNear() {
		for (int i = 0; i < 16; i++) {
			double dx = (this.mob.getRandom().nextDouble() - 0.5) * 6.0;
			double dz = (this.mob.getRandom().nextDouble() - 0.5) * 6.0;
			if (Math.abs(dx) < 1.8 && Math.abs(dz) < 1.8) {
				continue;
			}
			if (CarPlacement.placeAt(this.mob, this.target.getX() + dx, this.target.getY(), this.target.getZ() + dz)) {
				return;
			}
		}
	}
}
