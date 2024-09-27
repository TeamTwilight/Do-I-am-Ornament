package com.androsa.doiamornament;

import com.androsa.doiamornament.data.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.CompletableFuture;

@Mod(DoIAmOrnamentMod.MODID)
public class DoIAmOrnamentMod {
    public static final String MODID = "doiamornament";
    private static final Logger LOGGER = LogManager.getLogger();

    public DoIAmOrnamentMod(IEventBus bus) {
        bus.addListener(this::gatherData);

        ModBlocks.BLOCKS.register(bus);
        ModBlocks.ITEMS.register(bus);
    }

    private void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> provider = event.getLookupProvider();
        BlockTagsProvider blocktags = new BlockTagGenerator(output, provider, event.getExistingFileHelper());

    	if (event.includeClient()) {
    		generator.addProvider(true, new BlockStateGenerator(output, event.getExistingFileHelper()));
            generator.addProvider(true, new ItemModelGenerator(output, event.getExistingFileHelper()));
		}
        if (event.includeServer()) {
            generator.addProvider(true, new RecipeGenerator(output, provider));
            generator.addProvider(true, blocktags);
            generator.addProvider(true, new ItemTagGenerator(output, provider, blocktags, event.getExistingFileHelper()));
            generator.addProvider(true, new LootTableGenerator(output, provider));
        }
	}
}
