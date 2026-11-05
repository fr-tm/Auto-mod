package com.francesco.mod.client.sound;

import net.minecraft.client.resources.sounds.AbstractSoundInstance;
import net.minecraft.client.resources.sounds.SoundInstance;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundSource;

/** A short sound played once at a fixed position (for example the gear shift). */
public class OneShotSoundInstance extends AbstractSoundInstance {
	public OneShotSoundInstance(Identifier sound, double x, double y, double z, float volume, float pitch) {
		super(sound, SoundSource.NEUTRAL, SoundInstance.createUnseededRandom());
		this.x = x;
		this.y = y;
		this.z = z;
		this.volume = volume;
		this.pitch = pitch;
	}
}
