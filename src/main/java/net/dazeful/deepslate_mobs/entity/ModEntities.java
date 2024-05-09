package net.dazeful.deepslate_mobs.entity;

import net.dazeful.deepslate_mobs.DeepslateMobs;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityModelLayer LURKER =
            new EntityModelLayer(new Identifier(DeepslateMobs.MOD_ID, "lurker"), "main");
}
