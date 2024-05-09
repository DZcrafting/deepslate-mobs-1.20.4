package net.dazeful.deepslate_mobs.item;

import net.dazeful.deepslate_mobs.DeepslateMobs;
import net.dazeful.deepslate_mobs.block.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.BowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item SHADED_FLESH = registerItem("shaded_flesh",
            new Item(new FabricItemSettings().food(ModFoodComponents.SHADED_FLESH)));
    public static final Item MOLTEN_CORE = registerItem("molten_core",
            new Item(new FabricItemSettings()));
    public static final Item LONG_BOW = registerItem("long_bow",
            new BowItem(new FabricItemSettings()));
    public static final Item STRONG_BONE = registerItem("strong_bone",
            new Item(new FabricItemSettings().maxDamage(500)));






    private static Item registerItem(String name, Item item ) {
        return Registry.register(Registries.ITEM, new Identifier(DeepslateMobs.MOD_ID, name), item);
    }

    private static void itemGroupIngredients(FabricItemGroupEntries entries) {
        entries.add(SHADED_FLESH);
        entries.add(MOLTEN_CORE);
        entries.add(STRONG_BONE);
        entries.add(LONG_BOW);

        entries.add(ModBlocks.LURKER_STONE);
        entries.add(ModBlocks.LURKER_TILES);
    }
    public static void registerModItems() {
        DeepslateMobs.LOGGER.info("Registering Mod Items for " + DeepslateMobs.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::itemGroupIngredients);
    }
}
