package net.dazeful.deepslate_mobs.datagen;

import net.dazeful.deepslate_mobs.block.ModBlocks;
import net.dazeful.deepslate_mobs.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LURKER_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LURKER_TILES);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.SHADED_FLESH, Models.GENERATED);
        itemModelGenerator.register(ModItems.MOLTEN_CORE, Models.GENERATED);
        itemModelGenerator.register(ModItems.STRONG_BONE, Models.GENERATED);

    }
}
