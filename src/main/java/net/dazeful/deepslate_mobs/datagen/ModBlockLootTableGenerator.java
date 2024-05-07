package net.dazeful.deepslate_mobs.datagen;

import net.dazeful.deepslate_mobs.block.ModBlocks;
import net.dazeful.deepslate_mobs.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModBlockLootTableGenerator extends FabricBlockLootTableProvider {
    public ModBlockLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.LURKER_STONE);
        addDrop(ModBlocks.LURKER_TILES, oreDrops(ModBlocks.LURKER_TILES, ModItems.STRONG_BONE));

    }
}
