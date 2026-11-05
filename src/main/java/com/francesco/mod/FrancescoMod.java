package com.francesco.mod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.Identifier;

import com.francesco.mod.entity.ModEntities;
import com.francesco.mod.item.ModItems;
import com.francesco.mod.net.CarSummoning;
import com.francesco.mod.sound.ModSounds;

public class FrancescoMod implements ModInitializer {
	public static final String MOD_ID = "francesco";

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}

	@Override
	public void onInitialize() {
		ModSounds.initialize();
		ModEntities.initialize();
		ModItems.initialize();
		CarSummoning.initialize();
	}
}
