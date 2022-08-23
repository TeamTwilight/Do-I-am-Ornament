package com.androsa.doiamornament;

import com.androsa.doiamornament.data.*;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
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
        BlockTagsProvider blocktags = new BlockTagGenerator(event.getGenerator(), event.getExistingFileHelper());
    	if (event.includeClient()) {
    		event.getGenerator().addProvider(true, new BlockStateGenerator(event.getGenerator(), event.getExistingFileHelper()));
            event.getGenerator().addProvider(true, new ItemModelGenerator(event.getGenerator(), event.getExistingFileHelper()));
		}
        if (event.includeServer()) {
            event.getGenerator().addProvider(true, new RecipeGenerator(event.getGenerator()));
            event.getGenerator().addProvider(true, blocktags);
            event.getGenerator().addProvider(true, new ItemTagGenerator(event.getGenerator(), blocktags, event.getExistingFileHelper()));
            event.getGenerator().addProvider(true, new LootTableGenerator(event.getGenerator()));
        }
	}
}
