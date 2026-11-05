package com.francesco.mod.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

import com.francesco.mod.FrancescoMod;

public class ModEntities {
	public static final ResourceKey<EntityType<?>> FRANCESCO_KEY =
			ResourceKey.create(Registries.ENTITY_TYPE, FrancescoMod.id("francesco"));

	public static final EntityType<FrancescoEntity> FRANCESCO = Registry.register(
			BuiltInRegistries.ENTITY_TYPE,
			FRANCESCO_KEY,
			EntityType.Builder.of(FrancescoEntity::new, MobCategory.CREATURE)
					.sized(1.0F, 0.65F)
					.build(FRANCESCO_KEY));

	public static void initialize() {
		FabricDefaultAttributeRegistry.register(FRANCESCO, FrancescoEntity.createAttributes());
	}
}
