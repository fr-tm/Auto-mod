package com.francesco.mod.entity;

import java.util.UUID;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.minecraft.world.phys.Vec3;

public class FrancescoEntity extends PathfinderMob {
	private static final EntityDataAccessor<Boolean> FOLLOWING =
			SynchedEntityData.defineId(FrancescoEntity.class, EntityDataSerializers.BOOLEAN);

	/** Below this height Francesco is put back next to the nearest player (he cannot die in the void). */
	private static final double VOID_RESCUE_Y = -90.0;

	public int idleTicks = 0;
	private double lastX;
	private double lastZ;
	private UUID ownerUuid;

	public FrancescoEntity(EntityType<? extends FrancescoEntity> type, Level level) {
		super(type, level);
		this.setPersistenceRequired();
		this.setCustomName(Component.literal("Francesco"));
		this.setCustomNameVisible(true);
	}

	public static AttributeSupplier.Builder createAttributes() {
		return PathfinderMob.createMobAttributes()
				.add(Attributes.MAX_HEALTH, 40.0)
				.add(Attributes.MOVEMENT_SPEED, 0.25)
				.add(Attributes.FOLLOW_RANGE, 48.0)
				.add(Attributes.STEP_HEIGHT, 1.0)
				.add(Attributes.SAFE_FALL_DISTANCE, 16.0);
	}

	@Override
	protected void registerGoals() {
		this.goalSelector.addGoal(0, new FloatGoal(this));
		this.goalSelector.addGoal(2, new FollowPlayerGoal(this, 4.0, 2.4, 14.0));
		this.goalSelector.addGoal(5, new LookAtPlayerGoal(this, Player.class, 10.0F));
		this.goalSelector.addGoal(6, new RandomLookAroundGoal(this));
	}

	@Override
	protected void defineSynchedData(SynchedEntityData.Builder builder) {
		super.defineSynchedData(builder);
		builder.define(FOLLOWING, true);
	}

	public boolean isFollowing() {
		return this.entityData.get(FOLLOWING);
	}

	public void setFollowing(boolean following) {
		this.entityData.set(FOLLOWING, following);
	}

	public UUID getOwnerUuid() {
		return this.ownerUuid;
	}

	public void setOwnerUuid(UUID ownerUuid) {
		this.ownerUuid = ownerUuid;
	}

	/** Francesco is immortal: no damage, no knockback, not even /kill or the void can hurt him. */
	@Override
	public boolean hurtServer(ServerLevel level, DamageSource source, float damage) {
		return false;
	}

	@Override
	public InteractionResult mobInteract(Player player, InteractionHand hand) {
		if (!this.level().isClientSide()) {
			if (this.ownerUuid == null) {
				this.ownerUuid = player.getUUID();
			}
			boolean following = !this.isFollowing();
			this.setFollowing(following);
			if (!following) {
				this.getNavigation().stop();
			}
			player.sendSystemMessage(Component.translatable(following
					? "message.francesco.following"
					: "message.francesco.staying"));
			this.playSound(SoundEvents.VILLAGER_YES, 1.0F, following ? 1.6F : 1.2F);
		}
		return InteractionResult.SUCCESS;
	}

	@Override
	public void aiStep() {
		super.aiStep();

		double dx = this.getX() - this.lastX;
		double dz = this.getZ() - this.lastZ;
		this.lastX = this.getX();
		this.lastZ = this.getZ();
		if (dx * dx + dz * dz > 2.5E-5) {
			this.idleTicks = 0;
		} else if (this.idleTicks < 1_000_000) {
			this.idleTicks++;
		}

		if (!this.level().isClientSide() && this.getY() < VOID_RESCUE_Y) {
			Player player = this.level().getNearestPlayer(this, 1024.0);
			if (player != null) {
				this.setPos(player.getX(), player.getY() + 0.5, player.getZ());
				this.setDeltaMovement(Vec3.ZERO);
				this.getNavigation().stop();
			}
		}

		if (this.level().isClientSide() && this.getDeltaMovement().horizontalDistanceSqr() > 0.003) {
			double rad = Math.toRadians(this.yBodyRot);
			double px = this.getX() + Math.sin(rad) * 0.62;
			double pz = this.getZ() - Math.cos(rad) * 0.62;
			if (this.random.nextInt(2) == 0) {
				this.level().addParticle(ParticleTypes.SMOKE, px, this.getY() + 0.22, pz, 0.0, 0.02, 0.0);
			}
		}
	}

	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return SoundEvents.IRON_GOLEM_HURT;
	}

	@Override
	protected SoundEvent getDeathSound() {
		return SoundEvents.IRON_GOLEM_DEATH;
	}

	@Override
	protected void addAdditionalSaveData(ValueOutput output) {
		super.addAdditionalSaveData(output);
		output.putBoolean("Following", this.isFollowing());
		if (this.ownerUuid != null) {
			output.putString("Owner", this.ownerUuid.toString());
		}
	}

	@Override
	protected void readAdditionalSaveData(ValueInput input) {
		super.readAdditionalSaveData(input);
		this.setFollowing(input.getBooleanOr("Following", true));
		this.ownerUuid = null;
		String owner = input.getStringOr("Owner", "");
		if (!owner.isEmpty()) {
			try {
				this.ownerUuid = UUID.fromString(owner);
			} catch (IllegalArgumentException ignored) {
				// invalid data: car simply has no owner
			}
		}
	}
}
