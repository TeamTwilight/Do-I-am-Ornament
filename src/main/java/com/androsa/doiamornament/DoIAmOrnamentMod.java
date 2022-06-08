package com.androsa.doiamornament;

import com.androsa.doiamornament.data.BlockStateGenerator;
import com.androsa.doiamornament.data.BlockTagGenerator;
import com.androsa.doiamornament.data.ItemModelGenerator;
import com.androsa.doiamornament.data.RecipeGenerator;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
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

        bus.addListener(this::clientSetup);
        bus.addListener(this::gatherData);

        ModBlocks.BLOCKS.register(bus);
        ModBlocks.ITEMS.register(bus);
    }

    private void clientSetup(FMLClientSetupEvent event) {
		DistExecutor.safeRunWhenOn(Dist.CLIENT, () -> ClientHandler::registerRenders);
	}

    private void gatherData(GatherDataEvent event) {
    	if (event.includeClient()) {
    		event.getGenerator().addProvider(new BlockStateGenerator(event.getGenerator(), event.getExistingFileHelper()));
            event.getGenerator().addProvider(new ItemModelGenerator(event.getGenerator(), event.getExistingFileHelper()));
		}
        if (event.includeServer()) {
            event.getGenerator().addProvider(new RecipeGenerator(event.getGenerator()));
            event.getGenerator().addProvider(new BlockTagGenerator(event.getGenerator(), event.getExistingFileHelper()));
        }
	}
}
