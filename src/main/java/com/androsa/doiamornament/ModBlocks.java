package com.androsa.doiamornament;

import com.androsa.doiamornament.block.*;
import com.androsa.ornamental.builder.OrnamentBuilder;
import com.androsa.ornamental.items.OrnamentBlockItem;
import com.androsa.ornamental.registry.PropertiesHelper;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;
import java.util.function.Supplier;

public class ModBlocks {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, DoIAmOrnamentMod.MODID);
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DoIAmOrnamentMod.MODID);

	public static final RegistryObject<OrnamentTFStairs> ironwood_stairs = makeStairs(TFOrnamentBuilders.IRONWOOD);
	public static final RegistryObject<OrnamentTFStairs> fiery_stairs = makeStairs(TFOrnamentBuilders.FIERY);
	public static final RegistryObject<OrnamentTFStairs> steeleaf_stairs = makeStairs(TFOrnamentBuilders.STEELEAF);
	public static final RegistryObject<OrnamentTFStairs> arctic_fur_stairs = makeStairs(TFOrnamentBuilders.ARCTIC_FUR);
	public static final RegistryObject<OrnamentTFStairs> carminite_stairs = makeStairs(TFOrnamentBuilders.CARMINITE);
	public static final RegistryObject<OrnamentTFStairs> twilight_oak_log_stairs = makeStairs(TFOrnamentBuilders.TWILIGHT_OAK_LOG);
	public static final RegistryObject<OrnamentTFStairs> canopy_log_stairs = makeStairs(TFOrnamentBuilders.CANOPY_LOG);
	public static final RegistryObject<OrnamentTFStairs> mangrove_log_stairs = makeStairs(TFOrnamentBuilders.MANGROVE_LOG);
	public static final RegistryObject<OrnamentTFStairs> dark_oak_log_stairs = makeStairs(TFOrnamentBuilders.DARK_OAK_LOG);
	public static final RegistryObject<OrnamentTFStairs> time_log_stairs = makeStairs(TFOrnamentBuilders.TIME_LOG);
	public static final RegistryObject<OrnamentTFStairs> transformation_log_stairs = makeStairs(TFOrnamentBuilders.TRANSFORMATION_LOG);
	public static final RegistryObject<OrnamentTFStairs> mining_log_stairs = makeStairs(TFOrnamentBuilders.MINING_LOG);
	public static final RegistryObject<OrnamentTFStairs> sorting_log_stairs = makeStairs(TFOrnamentBuilders.SORTING_LOG);

	public static final RegistryObject<OrnamentTFSlab> ironwood_slab = makeSlab(TFOrnamentBuilders.IRONWOOD);
	public static final RegistryObject<OrnamentTFSlab> fiery_slab = makeSlab(TFOrnamentBuilders.FIERY);
	public static final RegistryObject<OrnamentTFSlab> steeleaf_slab = makeSlab(TFOrnamentBuilders.STEELEAF);
	public static final RegistryObject<OrnamentTFSlab> arctic_fur_slab = makeSlab(TFOrnamentBuilders.ARCTIC_FUR);
	public static final RegistryObject<OrnamentTFSlab> carminite_slab = makeSlab(TFOrnamentBuilders.CARMINITE);
	public static final RegistryObject<OrnamentTFSlab> twilight_oak_log_slab = makeSlab(TFOrnamentBuilders.TWILIGHT_OAK_LOG);
	public static final RegistryObject<OrnamentTFSlab> canopy_log_slab = makeSlab(TFOrnamentBuilders.CANOPY_LOG);
	public static final RegistryObject<OrnamentTFSlab> mangrove_log_slab = makeSlab(TFOrnamentBuilders.MANGROVE_LOG);
	public static final RegistryObject<OrnamentTFSlab> dark_oak_log_slab = makeSlab(TFOrnamentBuilders.DARK_OAK_LOG);
	public static final RegistryObject<OrnamentTFSlab> time_log_slab = makeSlab(TFOrnamentBuilders.TIME_LOG);
	public static final RegistryObject<OrnamentTFSlab> transformation_log_slab = makeSlab(TFOrnamentBuilders.TRANSFORMATION_LOG);
	public static final RegistryObject<OrnamentTFSlab> mining_log_slab = makeSlab(TFOrnamentBuilders.MINING_LOG);
	public static final RegistryObject<OrnamentTFSlab> sorting_log_slab = makeSlab(TFOrnamentBuilders.SORTING_LOG);

	private static RegistryObject<OrnamentTFStairs> makeStairs(TFOrnamentBuilder builder) {
		BlockBehaviour.Properties props = PropertiesHelper.createProps(builder.getBuilder());
		if (!builder.occlusion) props.noOcclusion();
		if (builder.emissive) props.emissiveRendering((state, world, pos) -> true);

		return registerBlock(builder.name + "_stairs", () -> new OrnamentTFStairs(props, builder),
				(item) -> registerBlockItem(item, CreativeModeTab.TAB_BUILDING_BLOCKS, builder, 4));
	}

	private static RegistryObject<OrnamentTFSlab> makeSlab(TFOrnamentBuilder builder) {
		BlockBehaviour.Properties props = PropertiesHelper.createProps(builder.getBuilder());
		if (!builder.occlusion) props.noOcclusion();
		if (builder.emissive) props.emissiveRendering((state, world, pos) -> true);

		return registerBlock(builder.name + "_slab", () -> new OrnamentTFSlab(props, builder),
				(item) -> registerBlockItem(item, CreativeModeTab.TAB_BUILDING_BLOCKS, builder, 3));
	}
	private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<? extends T> block, Function<RegistryObject<T>, Supplier<? extends Item>> item) {
		RegistryObject<T> reg = BLOCKS.register(name, block);
		ITEMS.register(name, item.apply(reg));
		return reg;
	}

	private static <T extends Block> Supplier<BlockItem> registerBlockItem(RegistryObject<T> block, CreativeModeTab group, OrnamentBuilder ornament, int fuelindex) {
		return () -> new OrnamentBlockItem(block.get(), PropertiesHelper.createProps(ornament, group), ornament, fuelindex);
	}
}
