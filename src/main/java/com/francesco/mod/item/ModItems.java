package com.francesco.mod.item;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;

import com.francesco.mod.FrancescoMod;
import com.francesco.mod.entity.ModEntities;

public class ModItems {
	public static final ResourceKey<Item> SPAWN_EGG_KEY =
			ResourceKey.create(Registries.ITEM, FrancescoMod.id("francesco_spawn_egg"));

	public static final Item SPAWN_EGG = Registry.register(
			BuiltInRegistries.ITEM,
			SPAWN_EGG_KEY,
			new SpawnEggItem(new Item.Properties().setId(SPAWN_EGG_KEY).spawnEgg(ModEntities.FRANCESCO)));

	public static void initialize() {
		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.SPAWN_EGGS)
				.register(output -> output.accept(SPAWN_EGG));
	}
}
