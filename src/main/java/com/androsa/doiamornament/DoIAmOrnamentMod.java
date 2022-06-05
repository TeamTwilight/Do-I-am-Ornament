package com.androsa.doiamornament;

import com.androsa.doiamornament.data.BlockStateGenerator;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(DoIAmOrnamentMod.MODID)
public class DoIAmOrnamentMod {
    public static final String MODID = "doiamornament";
    private static final Logger LOGGER = LogManager.getLogger();

    public DoIAmOrnamentMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        bus.addListener(this::gatherData);

        ModBlocks.BLOCKS.register(bus);
        ModBlocks.ITEMS.register(bus);
    }

    private void gatherData(GatherDataEvent event) {
    	if (event.includeClient()) {
    		event.getGenerator().addProvider(new BlockStateGenerator(event.getGenerator(), event.getExistingFileHelper()));
		}
	}
