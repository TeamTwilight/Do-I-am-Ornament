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

	public static final RegistryObject<OrnamentTFFence> ironwood_fence = makeFence(TFOrnamentBuilders.IRONWOOD);
	public static final RegistryObject<OrnamentTFFence> fiery_fence = makeFence(TFOrnamentBuilders.FIERY);
	public static final RegistryObject<OrnamentTFFence> steeleaf_fence = makeFence(TFOrnamentBuilders.STEELEAF);
	public static final RegistryObject<OrnamentTFFence> arctic_fur_fence = makeFence(TFOrnamentBuilders.ARCTIC_FUR);
	public static final RegistryObject<OrnamentTFFence> carminite_fence = makeFence(TFOrnamentBuilders.CARMINITE);
	public static final RegistryObject<OrnamentTFFence> twilight_oak_log_fence = makeFence(TFOrnamentBuilders.TWILIGHT_OAK_LOG);
	public static final RegistryObject<OrnamentTFFence> canopy_log_fence = makeFence(TFOrnamentBuilders.CANOPY_LOG);
	public static final RegistryObject<OrnamentTFFence> mangrove_log_fence = makeFence(TFOrnamentBuilders.MANGROVE_LOG);
	public static final RegistryObject<OrnamentTFFence> dark_oak_log_fence = makeFence(TFOrnamentBuilders.DARK_OAK_LOG);
	public static final RegistryObject<OrnamentTFFence> time_log_fence = makeFence(TFOrnamentBuilders.TIME_LOG);
	public static final RegistryObject<OrnamentTFFence> transformation_log_fence = makeFence(TFOrnamentBuilders.TRANSFORMATION_LOG);
	public static final RegistryObject<OrnamentTFFence> mining_log_fence = makeFence(TFOrnamentBuilders.MINING_LOG);
	public static final RegistryObject<OrnamentTFFence> sorting_log_fence = makeFence(TFOrnamentBuilders.SORTING_LOG);

	public static final RegistryObject<OrnamentTFTrapdoor> ironwood_trapdoor = makeTrapdoor(TFOrnamentBuilders.IRONWOOD);
	public static final RegistryObject<OrnamentTFTrapdoor> fiery_trapdoor = makeTrapdoor(TFOrnamentBuilders.FIERY);
	public static final RegistryObject<OrnamentTFTrapdoor> steeleaf_trapdoor = makeTrapdoor(TFOrnamentBuilders.STEELEAF);
	public static final RegistryObject<OrnamentTFTrapdoor> arctic_fur_trapdoor = makeTrapdoor(TFOrnamentBuilders.ARCTIC_FUR);
	public static final RegistryObject<OrnamentTFTrapdoor> carminite_trapdoor = makeTrapdoor(TFOrnamentBuilders.CARMINITE);
	public static final RegistryObject<OrnamentTFTrapdoor> twilight_oak_log_trapdoor = makeTrapdoor(TFOrnamentBuilders.TWILIGHT_OAK_LOG);
	public static final RegistryObject<OrnamentTFTrapdoor> canopy_log_trapdoor = makeTrapdoor(TFOrnamentBuilders.CANOPY_LOG);
	public static final RegistryObject<OrnamentTFTrapdoor> mangrove_log_trapdoor = makeTrapdoor(TFOrnamentBuilders.MANGROVE_LOG);
	public static final RegistryObject<OrnamentTFTrapdoor> dark_oak_log_trapdoor = makeTrapdoor(TFOrnamentBuilders.DARK_OAK_LOG);
	public static final RegistryObject<OrnamentTFTrapdoor> time_log_trapdoor = makeTrapdoor(TFOrnamentBuilders.TIME_LOG);
	public static final RegistryObject<OrnamentTFTrapdoor> transformation_log_trapdoor = makeTrapdoor(TFOrnamentBuilders.TRANSFORMATION_LOG);
	public static final RegistryObject<OrnamentTFTrapdoor> mining_log_trapdoor = makeTrapdoor(TFOrnamentBuilders.MINING_LOG);
	public static final RegistryObject<OrnamentTFTrapdoor> sorting_log_trapdoor = makeTrapdoor(TFOrnamentBuilders.SORTING_LOG);
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

	private static RegistryObject<OrnamentTFFence> makeFence(TFOrnamentBuilder builder) {
		BlockBehaviour.Properties props = PropertiesHelper.createProps(builder.getBuilder());
		if (!builder.occlusion) props.noOcclusion();
		if (builder.emissive) props.emissiveRendering((state, world, pos) -> true);

		return registerBlock(builder.name + "_fence", () -> new OrnamentTFFence(props, builder),
				(item) -> registerBlockItem(item, CreativeModeTab.TAB_DECORATIONS, builder, 1));
	}

	private static RegistryObject<OrnamentTFTrapdoor> makeTrapdoor(TFOrnamentBuilder builder) {
		BlockBehaviour.Properties props = PropertiesHelper.createProps(builder.getBuilder())
				.noOcclusion()
				.isValidSpawn((state, reader, pos, type) -> false);
		if (builder.emissive) props.emissiveRendering((state, world, pos) -> true);

		return registerBlock(builder.name + "_trapdoor", () -> new OrnamentTFTrapdoor(props, builder),
				(item) -> registerBlockItem(item, CreativeModeTab.TAB_REDSTONE, builder, 5));
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
