package net.dazeful.deepslate_mobs.entity.layer;

import net.dazeful.deepslate_mobs.DeepslateMobs;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
    public static final EntityModelLayer LURKER =
            new EntityModelLayer(new Identifier(DeepslateMobs.MOD_ID, "lurker"), "main");
}
