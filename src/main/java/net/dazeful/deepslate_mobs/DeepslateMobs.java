package net.dazeful.deepslate_mobs;

import net.dazeful.deepslate_mobs.block.ModBlocks;
import net.dazeful.deepslate_mobs.entity.ModEntities;
import net.dazeful.deepslate_mobs.item.ModItems;
import net.dazeful.deepslate_mobs.util.ModRegistries;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DeepslateMobs implements ModInitializer {
	public static final String MOD_ID = "deepslate_mobs";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModRegistries.registerModStuffs();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModEntities.registerModEntities();
	}
}