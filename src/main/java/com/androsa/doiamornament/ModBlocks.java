package com.androsa.doiamornament;

import com.androsa.doiamornament.block.*;
import com.androsa.ornamental.builder.OrnamentBuilder;
import com.androsa.ornamental.items.OrnamentBlockItem;
import com.androsa.ornamental.items.OrnamentTallBlockItem;
import com.androsa.ornamental.registry.PropertiesHelper;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import twilightforest.block.TFBlocks;

import java.util.function.Function;
import java.util.function.Supplier;

public class ModBlocks {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, DoIAmOrnamentMod.MODID);
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DoIAmOrnamentMod.MODID);

	public static final RegistryObject<OrnamentTFStairs> ironwood_stairs = makeStairs(TFBlocks.IRONWOOD_BLOCK, TFOrnamentBuilders.IRONWOOD);
	public static final RegistryObject<OrnamentTFStairs> fiery_stairs = makeStairs(TFBlocks.FIERY_BLOCK, TFOrnamentBuilders.FIERY);
	public static final RegistryObject<OrnamentTFStairs> steeleaf_stairs = makeStairs(TFBlocks.STEELEAF_BLOCK, TFOrnamentBuilders.STEELEAF);
	public static final RegistryObject<OrnamentTFStairs> arctic_fur_stairs = makeStairs(TFBlocks.ARCTIC_FUR_BLOCK, TFOrnamentBuilders.ARCTIC_FUR);
	public static final RegistryObject<OrnamentTFStairs> carminite_stairs = makeStairs(TFBlocks.CARMINITE_BLOCK, TFOrnamentBuilders.CARMINITE);
	public static final RegistryObject<OrnamentTFStairs> twilight_oak_log_stairs = makeStairs(TFBlocks.TWILIGHT_OAK_LOG, TFOrnamentBuilders.TWILIGHT_OAK_LOG);
	public static final RegistryObject<OrnamentTFStairs> canopy_log_stairs = makeStairs(TFBlocks.CANOPY_LOG, TFOrnamentBuilders.CANOPY_LOG);
	public static final RegistryObject<OrnamentTFStairs> mangrove_log_stairs = makeStairs(TFBlocks.MANGROVE_LOG, TFOrnamentBuilders.MANGROVE_LOG);
	public static final RegistryObject<OrnamentTFStairs> dark_oak_log_stairs = makeStairs(TFBlocks.DARK_LOG, TFOrnamentBuilders.DARK_OAK_LOG);
	public static final RegistryObject<OrnamentTFStairs> time_log_stairs = makeStairs(TFBlocks.TIME_LOG, TFOrnamentBuilders.TIME_LOG);
	public static final RegistryObject<OrnamentTFStairs> transformation_log_stairs = makeStairs(TFBlocks.TRANSFORMATION_LOG, TFOrnamentBuilders.TRANSFORMATION_LOG);
	public static final RegistryObject<OrnamentTFStairs> mining_log_stairs = makeStairs(TFBlocks.MINING_LOG, TFOrnamentBuilders.MINING_LOG);
	public static final RegistryObject<OrnamentTFStairs> sorting_log_stairs = makeStairs(TFBlocks.SORTING_LOG, TFOrnamentBuilders.SORTING_LOG);

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

	public static final RegistryObject<OrnamentTFFenceGate> ironwood_fence_gate = makeFenceGate(TFOrnamentBuilders.IRONWOOD);
	public static final RegistryObject<OrnamentTFFenceGate> fiery_fence_gate = makeFenceGate(TFOrnamentBuilders.FIERY);
	public static final RegistryObject<OrnamentTFFenceGate> steeleaf_fence_gate = makeFenceGate(TFOrnamentBuilders.STEELEAF);
	public static final RegistryObject<OrnamentTFFenceGate> arctic_fur_fence_gate = makeFenceGate(TFOrnamentBuilders.ARCTIC_FUR);
	public static final RegistryObject<OrnamentTFFenceGate> carminite_fence_gate = makeFenceGate(TFOrnamentBuilders.CARMINITE);
	public static final RegistryObject<OrnamentTFFenceGate> twilight_oak_log_fence_gate = makeFenceGate(TFOrnamentBuilders.TWILIGHT_OAK_LOG);
	public static final RegistryObject<OrnamentTFFenceGate> canopy_log_fence_gate = makeFenceGate(TFOrnamentBuilders.CANOPY_LOG);
	public static final RegistryObject<OrnamentTFFenceGate> mangrove_log_fence_gate = makeFenceGate(TFOrnamentBuilders.MANGROVE_LOG);
	public static final RegistryObject<OrnamentTFFenceGate> dark_oak_log_fence_gate = makeFenceGate(TFOrnamentBuilders.DARK_OAK_LOG);
	public static final RegistryObject<OrnamentTFFenceGate> time_log_fence_gate = makeFenceGate(TFOrnamentBuilders.TIME_LOG);
	public static final RegistryObject<OrnamentTFFenceGate> transformation_log_fence_gate = makeFenceGate(TFOrnamentBuilders.TRANSFORMATION_LOG);
	public static final RegistryObject<OrnamentTFFenceGate> mining_log_fence_gate = makeFenceGate(TFOrnamentBuilders.MINING_LOG);
	public static final RegistryObject<OrnamentTFFenceGate> sorting_log_fence_gate = makeFenceGate(TFOrnamentBuilders.SORTING_LOG);

	public static final RegistryObject<OrnamentTFDoor> ironwood_door = makeDoor(TFOrnamentBuilders.IRONWOOD);
	public static final RegistryObject<OrnamentTFDoor> fiery_door = makeDoor(TFOrnamentBuilders.FIERY);
	public static final RegistryObject<OrnamentTFDoor> steeleaf_door = makeDoor(TFOrnamentBuilders.STEELEAF);
	public static final RegistryObject<OrnamentTFDoor> arctic_fur_door = makeDoor(TFOrnamentBuilders.ARCTIC_FUR);
	public static final RegistryObject<OrnamentTFDoor> carminite_door = makeDoor(TFOrnamentBuilders.CARMINITE);
	public static final RegistryObject<OrnamentTFDoor> twilight_oak_log_door = makeDoor(TFOrnamentBuilders.TWILIGHT_OAK_LOG);
	public static final RegistryObject<OrnamentTFDoor> canopy_log_door = makeDoor(TFOrnamentBuilders.CANOPY_LOG);
	public static final RegistryObject<OrnamentTFDoor> mangrove_log_door = makeDoor(TFOrnamentBuilders.MANGROVE_LOG);
	public static final RegistryObject<OrnamentTFDoor> dark_oak_log_door = makeDoor(TFOrnamentBuilders.DARK_OAK_LOG);
	public static final RegistryObject<OrnamentTFDoor> time_log_door = makeDoor(TFOrnamentBuilders.TIME_LOG);
	public static final RegistryObject<OrnamentTFDoor> transformation_log_door = makeDoor(TFOrnamentBuilders.TRANSFORMATION_LOG);
	public static final RegistryObject<OrnamentTFDoor> mining_log_door = makeDoor(TFOrnamentBuilders.MINING_LOG);
	public static final RegistryObject<OrnamentTFDoor> sorting_log_door = makeDoor(TFOrnamentBuilders.SORTING_LOG);

	public static final RegistryObject<OrnamentTFPole> ironwood_pole = makePole(TFOrnamentBuilders.IRONWOOD);
	public static final RegistryObject<OrnamentTFPole> fiery_pole = makePole(TFOrnamentBuilders.FIERY);
	public static final RegistryObject<OrnamentTFPole> steeleaf_pole = makePole(TFOrnamentBuilders.STEELEAF);
	public static final RegistryObject<OrnamentTFPole> arctic_fur_pole = makePole(TFOrnamentBuilders.ARCTIC_FUR);
	public static final RegistryObject<OrnamentTFPole> carminite_pole = makePole(TFOrnamentBuilders.CARMINITE);
	public static final RegistryObject<OrnamentTFPole> twilight_oak_log_pole = makePole(TFOrnamentBuilders.TWILIGHT_OAK_LOG);
	public static final RegistryObject<OrnamentTFPole> canopy_log_pole = makePole(TFOrnamentBuilders.CANOPY_LOG);
	public static final RegistryObject<OrnamentTFPole> mangrove_log_pole = makePole(TFOrnamentBuilders.MANGROVE_LOG);
	public static final RegistryObject<OrnamentTFPole> dark_oak_log_pole = makePole(TFOrnamentBuilders.DARK_OAK_LOG);
	public static final RegistryObject<OrnamentTFPole> time_log_pole = makePole(TFOrnamentBuilders.TIME_LOG);
	public static final RegistryObject<OrnamentTFPole> transformation_log_pole = makePole(TFOrnamentBuilders.TRANSFORMATION_LOG);
	public static final RegistryObject<OrnamentTFPole> mining_log_pole = makePole(TFOrnamentBuilders.MINING_LOG);
	public static final RegistryObject<OrnamentTFPole> sorting_log_pole = makePole(TFOrnamentBuilders.SORTING_LOG);
	public static final RegistryObject<OrnamentTFPole> twilight_oak_plank_pole = makePole(TFOrnamentBuilders.TWILIGHT_OAK_PLANKS);
	public static final RegistryObject<OrnamentTFPole> canopy_plank_pole = makePole(TFOrnamentBuilders.CANOPY_PLANKS);
	public static final RegistryObject<OrnamentTFPole> mangrove_plank_pole = makePole(TFOrnamentBuilders.MANGROVE_PLANKS);
	public static final RegistryObject<OrnamentTFPole> dark_oak_plank_pole = makePole(TFOrnamentBuilders.DARK_OAK_PLANKS);
	public static final RegistryObject<OrnamentTFPole> time_plank_pole = makePole(TFOrnamentBuilders.TIME_PLANKS);
	public static final RegistryObject<OrnamentTFPole> transformation_plank_pole = makePole(TFOrnamentBuilders.TRANSFORMATION_PLANKS);
	public static final RegistryObject<OrnamentTFPole> mining_plank_pole = makePole(TFOrnamentBuilders.MINING_PLANKS);
	public static final RegistryObject<OrnamentTFPole> sorting_plank_pole = makePole(TFOrnamentBuilders.SORTING_PLANKS);

	public static final RegistryObject<OrnamentTFBeam> ironwood_beam = makeBeam(TFOrnamentBuilders.IRONWOOD);
	public static final RegistryObject<OrnamentTFBeam> fiery_beam = makeBeam(TFOrnamentBuilders.FIERY);
	public static final RegistryObject<OrnamentTFBeam> steeleaf_beam = makeBeam(TFOrnamentBuilders.STEELEAF);
	public static final RegistryObject<OrnamentTFBeam> arctic_fur_beam = makeBeam(TFOrnamentBuilders.ARCTIC_FUR);
	public static final RegistryObject<OrnamentTFBeam> carminite_beam = makeBeam(TFOrnamentBuilders.CARMINITE);
	public static final RegistryObject<OrnamentTFBeam> twilight_oak_log_beam = makeBeam(TFOrnamentBuilders.TWILIGHT_OAK_LOG);
	public static final RegistryObject<OrnamentTFBeam> canopy_log_beam = makeBeam(TFOrnamentBuilders.CANOPY_LOG);
	public static final RegistryObject<OrnamentTFBeam> mangrove_log_beam = makeBeam(TFOrnamentBuilders.MANGROVE_LOG);
	public static final RegistryObject<OrnamentTFBeam> dark_oak_log_beam = makeBeam(TFOrnamentBuilders.DARK_OAK_LOG);
	public static final RegistryObject<OrnamentTFBeam> time_log_beam = makeBeam(TFOrnamentBuilders.TIME_LOG);
	public static final RegistryObject<OrnamentTFBeam> transformation_log_beam = makeBeam(TFOrnamentBuilders.TRANSFORMATION_LOG);
	public static final RegistryObject<OrnamentTFBeam> mining_log_beam = makeBeam(TFOrnamentBuilders.MINING_LOG);
	public static final RegistryObject<OrnamentTFBeam> sorting_log_beam = makeBeam(TFOrnamentBuilders.SORTING_LOG);
	public static final RegistryObject<OrnamentTFBeam> twilight_oak_plank_beam = makeBeam(TFOrnamentBuilders.TWILIGHT_OAK_PLANKS);
	public static final RegistryObject<OrnamentTFBeam> canopy_plank_beam = makeBeam(TFOrnamentBuilders.CANOPY_PLANKS);
	public static final RegistryObject<OrnamentTFBeam> mangrove_plank_beam = makeBeam(TFOrnamentBuilders.MANGROVE_PLANKS);
	public static final RegistryObject<OrnamentTFBeam> dark_oak_plank_beam = makeBeam(TFOrnamentBuilders.DARK_OAK_PLANKS);
	public static final RegistryObject<OrnamentTFBeam> time_plank_beam = makeBeam(TFOrnamentBuilders.TIME_PLANKS);
	public static final RegistryObject<OrnamentTFBeam> transformation_plank_beam = makeBeam(TFOrnamentBuilders.TRANSFORMATION_PLANKS);
	public static final RegistryObject<OrnamentTFBeam> mining_plank_beam = makeBeam(TFOrnamentBuilders.MINING_PLANKS);
	public static final RegistryObject<OrnamentTFBeam> sorting_plank_beam = makeBeam(TFOrnamentBuilders.SORTING_PLANKS);

	public static final RegistryObject<OrnamentTFWall> ironwood_wall = makeWall(TFOrnamentBuilders.IRONWOOD);
	public static final RegistryObject<OrnamentTFWall> fiery_wall = makeWall(TFOrnamentBuilders.FIERY);
	public static final RegistryObject<OrnamentTFWall> steeleaf_wall = makeWall(TFOrnamentBuilders.STEELEAF);
	public static final RegistryObject<OrnamentTFWall> arctic_fur_wall = makeWall(TFOrnamentBuilders.ARCTIC_FUR);
	public static final RegistryObject<OrnamentTFWall> carminite_wall = makeWall(TFOrnamentBuilders.CARMINITE);
	public static final RegistryObject<OrnamentTFWall> twilight_oak_log_wall = makeWall(TFOrnamentBuilders.TWILIGHT_OAK_LOG);
	public static final RegistryObject<OrnamentTFWall> canopy_log_wall = makeWall(TFOrnamentBuilders.CANOPY_LOG);
	public static final RegistryObject<OrnamentTFWall> mangrove_log_wall = makeWall(TFOrnamentBuilders.MANGROVE_LOG);
	public static final RegistryObject<OrnamentTFWall> dark_oak_log_wall = makeWall(TFOrnamentBuilders.DARK_OAK_LOG);
	public static final RegistryObject<OrnamentTFWall> time_log_wall = makeWall(TFOrnamentBuilders.TIME_LOG);
	public static final RegistryObject<OrnamentTFWall> transformation_log_wall = makeWall(TFOrnamentBuilders.TRANSFORMATION_LOG);
	public static final RegistryObject<OrnamentTFWall> mining_log_wall = makeWall(TFOrnamentBuilders.MINING_LOG);
	public static final RegistryObject<OrnamentTFWall> sorting_log_wall = makeWall(TFOrnamentBuilders.SORTING_LOG);
	public static final RegistryObject<OrnamentTFWall> twilight_oak_planks_wall = makeWall(TFOrnamentBuilders.TWILIGHT_OAK_PLANKS);
	public static final RegistryObject<OrnamentTFWall> canopy_planks_wall = makeWall(TFOrnamentBuilders.CANOPY_PLANKS);
	public static final RegistryObject<OrnamentTFWall> mangrove_planks_wall = makeWall(TFOrnamentBuilders.MANGROVE_PLANKS);
	public static final RegistryObject<OrnamentTFWall> dark_oak_planks_wall = makeWall(TFOrnamentBuilders.DARK_OAK_PLANKS);
	public static final RegistryObject<OrnamentTFWall> time_planks_wall = makeWall(TFOrnamentBuilders.TIME_PLANKS);
	public static final RegistryObject<OrnamentTFWall> transformation_planks_wall = makeWall(TFOrnamentBuilders.TRANSFORMATION_PLANKS);
	public static final RegistryObject<OrnamentTFWall> mining_planks_wall = makeWall(TFOrnamentBuilders.MINING_PLANKS);
	public static final RegistryObject<OrnamentTFWall> sorting_planks_wall = makeWall(TFOrnamentBuilders.SORTING_PLANKS);

	public static final RegistryObject<OrnamentTFSaddleDoor> ironwood_saddle_door = makeSaddleDoor(TFOrnamentBuilders.IRONWOOD);
	public static final RegistryObject<OrnamentTFSaddleDoor> fiery_saddle_door = makeSaddleDoor(TFOrnamentBuilders.FIERY);
	public static final RegistryObject<OrnamentTFSaddleDoor> steeleaf_saddle_door = makeSaddleDoor(TFOrnamentBuilders.STEELEAF);
	public static final RegistryObject<OrnamentTFSaddleDoor> arctic_fur_saddle_door = makeSaddleDoor(TFOrnamentBuilders.ARCTIC_FUR);
	public static final RegistryObject<OrnamentTFSaddleDoor> carminite_saddle_door = makeSaddleDoor(TFOrnamentBuilders.CARMINITE);
	public static final RegistryObject<OrnamentTFSaddleDoor> twilight_oak_log_saddle_door = makeSaddleDoor(TFOrnamentBuilders.TWILIGHT_OAK_LOG);
	public static final RegistryObject<OrnamentTFSaddleDoor> canopy_log_saddle_door = makeSaddleDoor(TFOrnamentBuilders.CANOPY_LOG);
	public static final RegistryObject<OrnamentTFSaddleDoor> mangrove_log_saddle_door = makeSaddleDoor(TFOrnamentBuilders.MANGROVE_LOG);
	public static final RegistryObject<OrnamentTFSaddleDoor> dark_oak_log_saddle_door = makeSaddleDoor(TFOrnamentBuilders.DARK_OAK_LOG);
	public static final RegistryObject<OrnamentTFSaddleDoor> time_log_saddle_door = makeSaddleDoor(TFOrnamentBuilders.TIME_LOG);
	public static final RegistryObject<OrnamentTFSaddleDoor> transformation_log_saddle_door = makeSaddleDoor(TFOrnamentBuilders.TRANSFORMATION_LOG);
	public static final RegistryObject<OrnamentTFSaddleDoor> mining_log_saddle_door = makeSaddleDoor(TFOrnamentBuilders.MINING_LOG);
	public static final RegistryObject<OrnamentTFSaddleDoor> sorting_log_saddle_door = makeSaddleDoor(TFOrnamentBuilders.SORTING_LOG);
	public static final RegistryObject<OrnamentTFSaddleDoor> twilight_oak_planks_saddle_door = makeSaddleDoor(TFOrnamentBuilders.TWILIGHT_OAK_PLANKS);
	public static final RegistryObject<OrnamentTFSaddleDoor> canopy_planks_saddle_door = makeSaddleDoor(TFOrnamentBuilders.CANOPY_PLANKS);
	public static final RegistryObject<OrnamentTFSaddleDoor> mangrove_planks_saddle_door = makeSaddleDoor(TFOrnamentBuilders.MANGROVE_PLANKS);
	public static final RegistryObject<OrnamentTFSaddleDoor> dark_oak_planks_saddle_door = makeSaddleDoor(TFOrnamentBuilders.DARK_OAK_PLANKS);
	public static final RegistryObject<OrnamentTFSaddleDoor> time_planks_saddle_door = makeSaddleDoor(TFOrnamentBuilders.TIME_PLANKS);
	public static final RegistryObject<OrnamentTFSaddleDoor> transformation_planks_saddle_door = makeSaddleDoor(TFOrnamentBuilders.TRANSFORMATION_PLANKS);
	public static final RegistryObject<OrnamentTFSaddleDoor> mining_planks_saddle_door = makeSaddleDoor(TFOrnamentBuilders.MINING_PLANKS);
	public static final RegistryObject<OrnamentTFSaddleDoor> sorting_planks_saddle_door = makeSaddleDoor(TFOrnamentBuilders.SORTING_PLANKS);

	private static RegistryObject<OrnamentTFStairs> makeStairs(RegistryObject<? extends Block> base, TFOrnamentBuilder builder) {
		BlockBehaviour.Properties props = PropertiesHelper.createProps(builder.getBuilder());
		if (!builder.occlusion) props.noOcclusion();
		if (builder.emissive) props.emissiveRendering((state, world, pos) -> true);

		return registerBlock(builder.name + "_stairs", () -> new OrnamentTFStairs(() -> base.get().defaultBlockState(), props, builder),
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

	private static RegistryObject<OrnamentTFFenceGate> makeFenceGate(TFOrnamentBuilder builder) {
		BlockBehaviour.Properties props = PropertiesHelper.createProps(builder.getBuilder());
		if (!builder.occlusion) props.noOcclusion();
		if (builder.emissive) props.emissiveRendering((state, world, pos) -> true);

		return registerBlock(builder.name + "_fence_gate", () -> new OrnamentTFFenceGate(props, builder),
				(item) -> registerBlockItem(item, CreativeModeTab.TAB_REDSTONE, builder, 2));
	}

	private static RegistryObject<OrnamentTFDoor> makeDoor(TFOrnamentBuilder builder) {
		BlockBehaviour.Properties props = PropertiesHelper.createProps(builder.getBuilder())
				.noOcclusion();
		if (builder.emissive) props.emissiveRendering((state, world, pos) -> true);

		return registerBlock(builder.name + "_door", () -> new OrnamentTFDoor(props, builder),
				(item) -> registerTallBlockItem(item, CreativeModeTab.TAB_REDSTONE, builder, 0));
	}

	private static RegistryObject<OrnamentTFPole> makePole(TFOrnamentBuilder builder) {
		BlockBehaviour.Properties props = PropertiesHelper.createProps(builder.getBuilder());
		if (!builder.occlusion) props.noOcclusion();
		if (builder.emissive) props.emissiveRendering((state, world, pos) -> true);

		return registerBlock(builder.name + "_pole", () -> new OrnamentTFPole(props, builder),
				(item) -> registerBlockItem(item, CreativeModeTab.TAB_BUILDING_BLOCKS, builder, 6));
	}

	private static RegistryObject<OrnamentTFBeam> makeBeam(TFOrnamentBuilder builder) {
		BlockBehaviour.Properties props = PropertiesHelper.createProps(builder.getBuilder());
		if (!builder.occlusion) props.noOcclusion();
		if (builder.emissive) props.emissiveRendering((state, world, pos) -> true);

		return registerBlock(builder.name + "_beam", () -> new OrnamentTFBeam(props, builder),
				(item) -> registerBlockItem(item, CreativeModeTab.TAB_BUILDING_BLOCKS, builder, 7));
	}

	private static RegistryObject<OrnamentTFWall> makeWall(TFOrnamentBuilder builder) {
		BlockBehaviour.Properties props = PropertiesHelper.createProps(builder.getBuilder());
		if (!builder.occlusion) props.noOcclusion();
		if (builder.emissive) props.emissiveRendering((state, world, pos) -> true);

		return registerBlock(builder.name + "_wall", () -> new OrnamentTFWall(props, builder),
				(item) -> registerBlockItem(item, CreativeModeTab.TAB_DECORATIONS, builder, 8));
	}

	private static RegistryObject<OrnamentTFSaddleDoor> makeSaddleDoor(TFOrnamentBuilder builder) {
		BlockBehaviour.Properties props = PropertiesHelper.createProps(builder.getBuilder())
				.noOcclusion();
		if (builder.emissive) props.emissiveRendering((state, world, pos) -> true);

		return registerBlock(builder.name + "_saddle_door", () -> new OrnamentTFSaddleDoor(props, builder),
				(item) -> registerBlockItem(item, CreativeModeTab.TAB_REDSTONE, builder, 9));
	}

	private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<? extends T> block, Function<RegistryObject<T>, Supplier<? extends Item>> item) {
		RegistryObject<T> reg = BLOCKS.register(name, block);
		ITEMS.register(name, item.apply(reg));
		return reg;
	}

	private static <T extends Block> Supplier<BlockItem> registerBlockItem(RegistryObject<T> block, CreativeModeTab group, OrnamentBuilder ornament, int fuelindex) {
		return () -> new OrnamentBlockItem(block.get(), PropertiesHelper.createProps(ornament, group), ornament, fuelindex);
	}

	private static <T extends Block> Supplier<BlockItem> registerTallBlockItem(RegistryObject<T> block, CreativeModeTab group, OrnamentBuilder ornament, int fuelindex) {
		return () -> new OrnamentTallBlockItem(block.get(), PropertiesHelper.createProps(ornament, group), ornament, fuelindex);
	}
}
