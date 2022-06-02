package com.androsa.doiamornament;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(DoIAmOrnamentMod.MODID)
public class DoIAmOrnamentMod {
    public static final String MODID = "doiamornament";
    private static final Logger LOGGER = LogManager.getLogger();

    public DoIAmOrnamentMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.BLOCKS.register(bus);
        ModBlocks.ITEMS.register(bus);
    }
