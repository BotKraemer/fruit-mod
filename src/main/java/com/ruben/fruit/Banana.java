package com.ruben.fruit;

import com.ruben.fruit.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class Banana implements ModInitializer{
    public static final String MOD_ID = "fruits";

    @Override
    public void onInitialize() {

        ModItems.registerItems();

    }
}
