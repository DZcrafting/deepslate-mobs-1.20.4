package net.dazeful.deepslate_mobs.entity;


import net.dazeful.deepslate_mobs.DeepslateMobs;
import net.dazeful.deepslate_mobs.entity.custom.LurkerEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {

    public static final EntityType<LurkerEntity> LURKER = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(DeepslateMobs.MOD_ID, "lurker"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, LurkerEntity :: new)
                    .dimensions(EntityDimensions.fixed(0.5f, 3.0f)).build());

    public static void registerModEntities() {
        DeepslateMobs.LOGGER.info("Registering Mod Entities for " + DeepslateMobs.MOD_ID);
    }
}
