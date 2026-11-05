package com.francesco.mod.client.sound;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.sounds.AbstractSoundInstance;
import net.minecraft.client.resources.sounds.SoundInstance;
import net.minecraft.client.resources.sounds.TickableSoundInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;

import com.francesco.mod.FrancescoMod;
import com.francesco.mod.entity.FrancescoEntity;

/**
 * Quiet looping engine of one Francesco.
 *
 * <p>Standing still the engine idles in neutral. When he drives, the engine revs up in first gear
 * and shifts up through six gears while he speeds up (the revs fall back after every shift).
 * The loop is pitched with the revs and always stays far below the volume of normal game sounds.
 */
public class EngineSoundInstance extends AbstractSoundInstance implements TickableSoundInstance {
	/** Top speed of every gear in blocks per tick. */
	private static final double[] GEAR_TOP = {0.20, 0.34, 0.52, 0.74, 1.00, 1.35};
	private static final int LAST_GEAR = GEAR_TOP.length;

	/** Below this speed (blocks per tick) the car is in neutral. */
	private static final double NEUTRAL_SPEED = 0.025;
	private static final double UPSHIFT_AT = 0.94;
	private static final double DOWNSHIFT_AT = 0.42;
	private static final int SHIFT_COOLDOWN = 8;
	private static final int TORQUE_CUT_TICKS = 4;

	private static final float VOLUME_NEUTRAL = 0.09F;
	private static final float VOLUME_MIN = 0.12F;
	private static final float VOLUME_RANGE = 0.11F;
	private static final float PITCH_IDLE = 0.55F;
	private static final float PITCH_RANGE = 1.35F;

	private static final double STOP_DISTANCE_SQ = 28.0 * 28.0;

	private final FrancescoEntity car;
	private boolean stopped;

	private double lastX;
	private double lastZ;
	private double speed;
	private double rpm;
	private int gear = 1;
	private int shiftCooldown;
	private int torqueCut;
	private int age;

	public EngineSoundInstance(FrancescoEntity car) {
		super(FrancescoMod.id("engine_loop"), SoundSource.NEUTRAL, SoundInstance.createUnseededRandom());
		this.car = car;
		this.looping = true;
		this.delay = 0;
		this.volume = VOLUME_NEUTRAL;
		this.pitch = PITCH_IDLE;
		this.x = car.getX();
		this.y = car.getY();
		this.z = car.getZ();
		this.lastX = car.getX();
		this.lastZ = car.getZ();
	}

	@Override
	public boolean isStopped() {
		return this.stopped;
	}

	@Override
	public void tick() {
		Minecraft client = Minecraft.getInstance();
		if (this.car.isRemoved() || client.player == null || this.car.distanceToSqr(client.player) > STOP_DISTANCE_SQ) {
			this.stopped = true;
			return;
		}
		this.age++;

		this.x = this.car.getX();
		this.y = this.car.getY();
		this.z = this.car.getZ();

		double dx = this.x - this.lastX;
		double dz = this.z - this.lastZ;
		this.lastX = this.x;
		this.lastZ = this.z;
		double measured = Math.sqrt(dx * dx + dz * dz);
		this.speed += (measured - this.speed) * 0.35;

		if (this.shiftCooldown > 0) {
			this.shiftCooldown--;
		}

		boolean neutral = this.speed < NEUTRAL_SPEED;
		double targetRpm;
		if (neutral) {
			this.gear = 1;
			targetRpm = 0.0;
		} else {
			double ratio = this.speed / GEAR_TOP[this.gear - 1];
			if (ratio > UPSHIFT_AT && this.gear < LAST_GEAR && this.shiftCooldown == 0) {
				this.gear++;
				this.shiftCooldown = SHIFT_COOLDOWN;
				this.torqueCut = TORQUE_CUT_TICKS;
				this.playShiftSound(client);
			} else if (ratio < DOWNSHIFT_AT && this.gear > 1 && this.shiftCooldown == 0) {
				this.gear--;
				this.shiftCooldown = SHIFT_COOLDOWN;
			}
			ratio = Mth.clamp(this.speed / GEAR_TOP[this.gear - 1], 0.0, 1.0);
			targetRpm = 0.28 + 0.72 * ratio;
		}

		// The revs cannot jump: they climb quickly when accelerating and fall slowly after a shift.
		double step = targetRpm > this.rpm ? 0.10 : 0.05;
		this.rpm += Mth.clamp(targetRpm - this.rpm, -step, step);

		double volumeTarget = neutral ? VOLUME_NEUTRAL : VOLUME_MIN + VOLUME_RANGE * this.rpm;
		if (this.torqueCut > 0) {
			this.torqueCut--;
			volumeTarget *= 0.45;
		}
		this.volume += (float) (volumeTarget - this.volume) * 0.4F;

		double wobble = neutral ? Math.sin(this.age * 0.35) * 0.012 : 0.0;
		this.pitch = (float) (PITCH_IDLE + PITCH_RANGE * this.rpm + wobble);
	}

	private void playShiftSound(Minecraft client) {
		float pitchVariation = 0.95F + this.car.getRandom().nextFloat() * 0.1F;
		client.getSoundManager().play(new OneShotSoundInstance(
				FrancescoMod.id("engine_shift"), this.x, this.y, this.z, 0.16F, pitchVariation));
	}
}
