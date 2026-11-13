package com.crosskai.livingfarm;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Common entrypoint for Living Farm. */
public final class LivingFarm implements ModInitializer {
    public static final String MOD_ID = "livingfarm";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Living Farm foundation loaded.");
    }
}
