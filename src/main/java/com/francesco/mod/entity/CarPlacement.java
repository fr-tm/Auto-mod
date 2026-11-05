package com.francesco.mod.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

/** Puts Francesco on free ground (two free blocks of air above a solid block). */
public final class CarPlacement {
	private CarPlacement() {
	}

	/**
	 * Looks for free ground at the given x/z, searching from 2 blocks above to 4 blocks below the reference height.
	 *
	 * @return true if the car was moved
	 */
	public static boolean placeAt(FrancescoEntity car, double x, double referenceY, double z) {
		Level level = car.level();
		for (int dy = 2; dy >= -4; dy--) {
			BlockPos feet = BlockPos.containing(x, referenceY + dy, z);
			if (level.getBlockState(feet).isAir()
					&& level.getBlockState(feet.above()).isAir()
					&& !level.getBlockState(feet.below()).isAir()) {
				car.snapTo(new Vec3(x, feet.getY(), z));
				car.getNavigation().stop();
				return true;
			}
		}
		return false;
	}
}
