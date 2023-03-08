package com.joostmsoftware.creaturesundiscovered.fabric;

import com.joostmsoftware.creaturesundiscovered.ExampleMod;
import net.fabricmc.api.ModInitializer;

public class ExampleModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ExampleMod.init();
    }
}
