package com.francesco.mod.client.renderer;

/** Picks the face texture: blinking, looking around while idle and smiling after a short rest. */
public final class FaceAnim {
	private static final int SMILE_AFTER = 20;
	private static final int LOOK_AFTER = 45;

	private FaceAnim() {
	}

	private static int hash(int value) {
		value *= -1640531535;
		value ^= value >>> 15;
		value *= -2048144789;
		value ^= value >>> 13;
		return Math.floorMod(value, 10);
	}

	public static String key(int tickCount, int entityId, int idleTicks) {
		int t = tickCount + entityId * 37;
		boolean smile = idleTicks >= SMILE_AFTER;

		char eyes = 'o';
		int blinkA = Math.floorMod(t, 83);
		if (blinkA < 6) {
			eyes = (blinkA < 2 || blinkA >= 4) ? 'h' : 'c';
		}
		int blinkB = Math.floorMod(t, 331) - 40;
		if (blinkB >= 0 && blinkB < 6) {
			eyes = (blinkB < 2 || blinkB >= 4) ? 'h' : 'c';
		}

		char look = 'c';
		if (idleTicks >= LOOK_AFTER && eyes == 'o') {
			int slot = Math.floorDiv(t, 70);
			int phase = Math.floorMod(t, 70);
			int h = hash(slot + entityId * 7);
			if (phase >= 8 && phase < 56) {
				if (h <= 2) {
					look = 'l';
				} else if (h <= 4) {
					look = 'r';
				}
			}
		}
		if (eyes != 'o') {
			look = 'c';
		}

		return "" + eyes + look + (smile ? 's' : 'n');
	}
}
