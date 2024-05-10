package net.dazeful.deepslate_mobs.util;

import net.dazeful.deepslate_mobs.entity.ModEntities;
import net.dazeful.deepslate_mobs.entity.custom.LurkerEntity;
import net.dazeful.deepslate_mobs.item.ModItems;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
        registerAttributes();
    }

    private static void registerFuels() {
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.MOLTEN_CORE, 20000);
    }

    private static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.LURKER, LurkerEntity.createLurkerAttributes());
    }
}
