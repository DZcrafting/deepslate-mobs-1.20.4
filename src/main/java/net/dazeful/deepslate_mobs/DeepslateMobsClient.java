package net.dazeful.deepslate_mobs;

import net.dazeful.deepslate_mobs.util.ModModelPredicateProvider;
import net.fabricmc.api.ClientModInitializer;

public class DeepslateMobsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModModelPredicateProvider.registerModModels();
    }
}
