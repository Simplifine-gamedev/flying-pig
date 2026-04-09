package com.orca.flyingpig;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FlyingPigMod implements ModInitializer {
    public static final String MOD_ID = "flying-pig";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Flying Pig mod initialized! Pigs can now fly!");
    }
}
