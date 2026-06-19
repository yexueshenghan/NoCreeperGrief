package com.nocreepergrief;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoCreeperGrief implements ModInitializer {
    public static final String MOD_ID = "nocreepergrief";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("NoCreeperGrief loaded - Creepers will no longer destroy blocks!");
    }
}
