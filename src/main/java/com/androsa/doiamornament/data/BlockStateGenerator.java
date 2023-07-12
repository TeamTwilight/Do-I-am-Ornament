package com.androsa.doiamornament.data;

import com.androsa.doiamornament.DoIAmOrnamentMod;
import com.androsa.doiamornament.ModBlocks;
import com.androsa.ornamental.blocks.OrnamentBeam;
import com.androsa.ornamental.blocks.OrnamentPole;
import com.androsa.ornamental.blocks.OrnamentSaddleDoor;
import com.androsa.ornamental.data.provider.OrnamentalBlockStateProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import twilightforest.TwilightForestMod;

import javax.annotation.Nonnull;

public class BlockStateGenerator extends OrnamentalBlockStateProvider {

	private final BlockModelGenerator blockModels;

	public BlockStateGenerator(PackOutput output, ExistingFileHelper helper) {
		super(output, DoIAmOrnamentMod.MODID, TwilightForestMod.ID, helper);

		blockModels = new BlockModelGenerator(output, helper) {
			@Override
			protected void registerModels() { }

			@Nonnull
			@Override
			public String getName() {
				return BlockStateGenerator.this.getName();
			}
		};
	}

	public BlockModelGenerator models() {
		return blockModels;
	}

	private ResourceLocation tfLoc(String name) {
		return new ResourceLocation(TwilightForestMod.ID, "block/" + name);
	}

	@Override
	protected void registerStatesAndModels() {
		stairsTwoLayer(ModBlocks.ironwood_stairs, "ironwood", "ironwood_pattern", "ironwood_block", 0, 0, CUTOUT);
		stairsFiery(ModBlocks.fiery_stairs);
		stairsBasic(ModBlocks.steeleaf_stairs, "steeleaf_block");
		stairsBasic(ModBlocks.arctic_fur_stairs, "arctic_fur_block");
		stairsTwoLayer(ModBlocks.carminite_stairs, "carminite", "carminite_block", "carminite_block_overlay", 4, 7, TRANSLUCENT);
		stairsColumn(ModBlocks.twilight_oak_log_stairs, "twilight_oak_log", "twilight_oak_log_top");
		stairsColumn(ModBlocks.canopy_log_stairs, "canopy_log", "canopy_log_top");
		stairsColumn(ModBlocks.mangrove_log_stairs, "mangrove_log", "mangrove_log_top");
		stairsColumn(ModBlocks.dark_oak_log_stairs, "dark_log", "dark_log_top");
		stairsColumn(ModBlocks.time_log_stairs, "time_log", "time_log_top");
		stairsColumn(ModBlocks.transformation_log_stairs, "transformation_log", "transformation_log_top");
		stairsColumn(ModBlocks.mining_log_stairs, "mining_log", "mining_log_top");
		stairsColumn(ModBlocks.sorting_log_stairs, "sorting_log", "sorting_log_top");

		slabTwoLayer(ModBlocks.ironwood_slab, "ironwood_block", "ironwood_pattern", "ironwood_block", 0, 0, CUTOUT);
		slabFiery(ModBlocks.fiery_slab, "fiery_block");
		slabBasic(ModBlocks.steeleaf_slab, "steeleaf_block");
		slabBasic(ModBlocks.arctic_fur_slab, "arctic_fur_block");
		slabTwoLayer(ModBlocks.carminite_slab, "carminite_block", "carminite_block", "carminite_block_overlay", 4, 7, TRANSLUCENT);
		slabColumn(ModBlocks.twilight_oak_log_slab, "twilight_oak_log", "twilight_oak_log", "twilight_oak_log_top");
		slabColumn(ModBlocks.canopy_log_slab, "canopy_log", "canopy_log", "canopy_log_top");
		slabColumn(ModBlocks.mangrove_log_slab, "mangrove_log", "mangrove_log", "mangrove_log_top");
		slabColumn(ModBlocks.dark_oak_log_slab, "dark_log", "dark_log", "dark_log_top");
		slabColumn(ModBlocks.time_log_slab, "time_log", "time_log", "time_log_top");
		slabColumn(ModBlocks.transformation_log_slab, "transformation_log", "transformation_log", "transformation_log_top");
		slabColumn(ModBlocks.mining_log_slab, "mining_log", "mining_log", "mining_log_top");
		slabColumn(ModBlocks.sorting_log_slab, "sorting_log", "sorting_log", "sorting_log_top");

		fenceTwoLayer(ModBlocks.ironwood_fence, "ironwood_pattern", "ironwood_block", 0, 0, CUTOUT);
		fenceFiery(ModBlocks.fiery_fence);
		fenceBasic(ModBlocks.steeleaf_fence, "steeleaf_block");
		fenceBasic(ModBlocks.arctic_fur_fence, "arctic_fur_block");
		fenceTwoLayer(ModBlocks.carminite_fence, "carminite_block", "carminite_block_overlay", 4, 7, TRANSLUCENT);
		fenceColumn(ModBlocks.twilight_oak_log_fence, "twilight_oak_log", "twilight_oak_log_top");
		fenceColumn(ModBlocks.canopy_log_fence, "canopy_log", "canopy_log_top");
		fenceColumn(ModBlocks.mangrove_log_fence, "mangrove_log", "mangrove_log_top");
		fenceColumn(ModBlocks.dark_oak_log_fence, "dark_log", "dark_log_top");
		fenceColumn(ModBlocks.time_log_fence, "time_log", "time_log_top");
		fenceColumn(ModBlocks.transformation_log_fence, "transformation_log", "transformation_log_top");
		fenceColumn(ModBlocks.mining_log_fence, "mining_log", "mining_log_top");
		fenceColumn(ModBlocks.sorting_log_fence, "sorting_log", "sorting_log_top");

		trapdoorBasic(ModBlocks.ironwood_trapdoor, "ironwood");
		trapdoorExist(ModBlocks.fiery_trapdoor, "fiery");
		trapdoorBasic(ModBlocks.steeleaf_trapdoor, "steeleaf");
		trapdoorBasic(ModBlocks.arctic_fur_trapdoor, "arctic_fur");
		trapdoorExist(ModBlocks.carminite_trapdoor, "carminite");
		trapdoorTF(ModBlocks.twilight_oak_log_trapdoor, "twilight_oak_log");
		trapdoorTF(ModBlocks.canopy_log_trapdoor, "canopy_log");
		trapdoorTF(ModBlocks.mangrove_log_trapdoor, "mangrove_log");
		trapdoorTF(ModBlocks.dark_oak_log_trapdoor, "dark_log");
		trapdoorTF(ModBlocks.time_log_trapdoor, "time_log");
		trapdoorTF(ModBlocks.transformation_log_trapdoor, "transformation_log");
		trapdoorTF(ModBlocks.mining_log_trapdoor, "mining_log");
		trapdoorTF(ModBlocks.sorting_log_trapdoor, "sorting_log");

		fenceGateTwoLayer(ModBlocks.ironwood_fence_gate, "ironwood_pattern", "ironwood_block", 0, 0, CUTOUT);
		fenceGateFiery(ModBlocks.fiery_fence_gate);
		fenceGateBasic(ModBlocks.steeleaf_fence_gate, "steeleaf_block");
		fenceGateBasic(ModBlocks.arctic_fur_fence_gate, "arctic_fur_block");
		fenceGateTwoLayer(ModBlocks.carminite_fence_gate, "carminite_block", "carminite_block_overlay", 4, 7, TRANSLUCENT);
		fenceGateColumn(ModBlocks.twilight_oak_log_fence_gate, "twilight_oak_log", "twilight_oak_log_top");
		fenceGateColumn(ModBlocks.canopy_log_fence_gate, "canopy_log", "canopy_log_top");
		fenceGateColumn(ModBlocks.mangrove_log_fence_gate, "mangrove_log", "mangrove_log_top");
		fenceGateColumn(ModBlocks.dark_oak_log_fence_gate, "dark_log", "dark_log_top");
		fenceGateColumn(ModBlocks.time_log_fence_gate, "time_log", "time_log_top");
		fenceGateColumn(ModBlocks.transformation_log_fence_gate, "transformation_log", "transformation_log_top");
		fenceGateColumn(ModBlocks.mining_log_fence_gate, "mining_log", "mining_log_top");
		fenceGateColumn(ModBlocks.sorting_log_fence_gate, "sorting_log", "sorting_log_top");

		doorBasic(ModBlocks.ironwood_door, "ironwood");
		doorExist(ModBlocks.fiery_door, "fiery");
		doorBasic(ModBlocks.steeleaf_door, "steeleaf");
		doorExist(ModBlocks.carminite_door, "carminite");
		doorBasic(ModBlocks.arctic_fur_door, "arctic_fur");
		doorTF(ModBlocks.twilight_oak_log_door, "twilight_oak_log");
		doorTF(ModBlocks.canopy_log_door, "canopy_log");
		doorTF(ModBlocks.mangrove_log_door, "mangrove_log");
		doorTF(ModBlocks.dark_oak_log_door, "dark_log");
		doorTF(ModBlocks.time_log_door, "time_log");
		doorTF(ModBlocks.transformation_log_door, "transformation_log");
		doorTF(ModBlocks.mining_log_door, "mining_log");
		doorTF(ModBlocks.sorting_log_door, "sorting_log");

		poleTwoLayer(ModBlocks.ironwood_pole, "ironwood_pattern", "ironwood_block", "ironwood_block", 0, 0, CUTOUT);
		poleFiery(ModBlocks.fiery_pole, "fiery_block");
		poleBasic(ModBlocks.steeleaf_pole, "steeleaf_block", "steeleaf_block");
		poleBasic(ModBlocks.arctic_fur_pole, "arctic_fur_block", "arctic_fur_block");
		poleTwoLayer(ModBlocks.carminite_pole, "carminite_block", "carminite_block_overlay", "carminite_block", 4, 7, TRANSLUCENT);
		poleColumn(ModBlocks.twilight_oak_log_pole, "twilight_oak_log");
		poleColumn(ModBlocks.canopy_log_pole, "canopy_log");
		poleColumn(ModBlocks.mangrove_log_pole, "mangrove_log");
		poleColumn(ModBlocks.dark_oak_log_pole, "dark_log");
		poleColumn(ModBlocks.time_log_pole, "time_log");
		poleColumn(ModBlocks.transformation_log_pole, "transformation_log");
		poleColumn(ModBlocks.mining_log_pole, "mining_log");
		poleColumn(ModBlocks.sorting_log_pole, "sorting_log");
		poleBasic(ModBlocks.twilight_oak_plank_pole, "wood/planks_twilight_oak_0", "wood/planks/twilight_oak/twilight_oak_planks");
		poleBasic(ModBlocks.canopy_plank_pole, "wood/planks_canopy_0", "wood/planks/canopy/canopy_planks");
		poleBasic(ModBlocks.mangrove_plank_pole, "wood/planks_mangrove_0", "wood/planks/mangrove/mangrove_planks");
		poleBasic(ModBlocks.dark_oak_plank_pole, "wood/planks_darkwood_0", "wood/planks/darkwood/dark_planks");
		poleBasic(ModBlocks.time_plank_pole, "wood/planks_time_0", "wood/planks/time/time_planks");
		poleBasic(ModBlocks.transformation_plank_pole, "wood/planks_trans_0", "wood/planks/trans/transformation_planks");
		poleBasic(ModBlocks.mining_plank_pole, "wood/planks_mine_0", "wood/planks/mine/mining_planks");
		poleBasic(ModBlocks.sorting_plank_pole, "wood/planks_sort_0", "wood/planks/sort/sorting_planks");

		beamTwoLayer(ModBlocks.ironwood_beam, "ironwood_block", "ironwood_pattern", "ironwood_block", 0, 0, CUTOUT);
		beamFiery(ModBlocks.fiery_beam, "fiery_block");
		beamBasic(ModBlocks.steeleaf_beam, "steeleaf_block", "steeleaf_block");
		beamBasic(ModBlocks.arctic_fur_beam, "arctic_fur_block", "arctic_fur_block");
		beamTwoLayer(ModBlocks.carminite_beam, "carminite_block", "carminite_block", "carminite_block_overlay", 4, 7, TRANSLUCENT);
		beamColumn(ModBlocks.twilight_oak_log_beam, "twilight_oak_log");
		beamColumn(ModBlocks.canopy_log_beam, "canopy_log");
		beamColumn(ModBlocks.mangrove_log_beam, "mangrove_log");
		beamColumn(ModBlocks.dark_oak_log_beam, "dark_log");
		beamColumn(ModBlocks.time_log_beam, "time_log");
		beamColumn(ModBlocks.transformation_log_beam, "transformation_log");
		beamColumn(ModBlocks.mining_log_beam, "mining_log");
		beamColumn(ModBlocks.sorting_log_beam, "sorting_log");
		beamBasic(ModBlocks.twilight_oak_plank_beam, "wood/planks_twilight_oak_0", "wood/planks/twilight_oak/twilight_oak_planks");
		beamBasic(ModBlocks.canopy_plank_beam, "wood/planks_canopy_0", "wood/planks/canopy/canopy_planks");
		beamBasic(ModBlocks.mangrove_plank_beam, "wood/planks_mangrove_0", "wood/planks/mangrove/mangrove_planks");
		beamBasic(ModBlocks.dark_oak_plank_beam, "wood/planks_darkwood_0", "wood/planks/darkwood/dark_planks");
		beamBasic(ModBlocks.time_plank_beam, "wood/planks_time_0", "wood/planks/time/time_planks");
		beamBasic(ModBlocks.transformation_plank_beam, "wood/planks_trans_0", "wood/planks/trans/transformation_planks");
		beamBasic(ModBlocks.mining_plank_beam, "wood/planks_mine_0", "wood/planks/mine/mining_planks");
		beamBasic(ModBlocks.sorting_plank_beam, "wood/planks_sort_0", "wood/planks/sort/sorting_planks");

		wallTwoLayer(ModBlocks.ironwood_wall, "ironwood_pattern", "ironwood_block", 0, 0, CUTOUT);
		wallFiery(ModBlocks.fiery_wall);
		wallBasic(ModBlocks.steeleaf_wall, "steeleaf_block");
		wallBasic(ModBlocks.arctic_fur_wall, "arctic_fur_block");
		wallTwoLayer(ModBlocks.carminite_wall, "carminite_block", "carminite_block_overlay", 4, 7, TRANSLUCENT);
		wallColumn(ModBlocks.twilight_oak_log_wall, "twilight_oak_log");
		wallColumn(ModBlocks.canopy_log_wall, "canopy_log");
		wallColumn(ModBlocks.mangrove_log_wall, "mangrove_log");
		wallColumn(ModBlocks.dark_oak_log_wall, "dark_log");
		wallColumn(ModBlocks.time_log_wall, "time_log");
		wallColumn(ModBlocks.transformation_log_wall, "transformation_log");
		wallColumn(ModBlocks.mining_log_wall, "mining_log");
		wallColumn(ModBlocks.sorting_log_wall, "sorting_log");
		wallBasic(ModBlocks.twilight_oak_plank_wall, "wood/planks_twilight_oak_0");
		wallBasic(ModBlocks.canopy_plank_wall, "wood/planks_canopy_0");
		wallBasic(ModBlocks.mangrove_plank_wall, "wood/planks_mangrove_0");
		wallBasic(ModBlocks.dark_oak_plank_wall, "wood/planks_darkwood_0");
		wallBasic(ModBlocks.time_plank_wall, "wood/planks_time_0");
		wallBasic(ModBlocks.transformation_plank_wall, "wood/planks_trans_0");
		wallBasic(ModBlocks.mining_plank_wall, "wood/planks_mine_0");
		wallBasic(ModBlocks.sorting_plank_wall, "wood/planks_sort_0");

		saddleDoorBasic(ModBlocks.ironwood_saddle_door, "ironwood");
		saddleDoorExist(ModBlocks.fiery_saddle_door, "fiery");
		saddleDoorBasic(ModBlocks.steeleaf_saddle_door, "steeleaf");
		saddleDoorExist(ModBlocks.carminite_saddle_door, "carminite");
		saddleDoorBasic(ModBlocks.arctic_fur_saddle_door, "arctic_fur");
		saddleDoorTF(ModBlocks.twilight_oak_log_saddle_door, "twilight_oak_log");
		saddleDoorTF(ModBlocks.canopy_log_saddle_door, "canopy_log");
		saddleDoorTF(ModBlocks.mangrove_log_saddle_door, "mangrove_log");
		saddleDoorTF(ModBlocks.dark_oak_log_saddle_door, "dark_log");
		saddleDoorTF(ModBlocks.time_log_saddle_door, "time_log");
		saddleDoorTF(ModBlocks.transformation_log_saddle_door, "transformation_log");
		saddleDoorTF(ModBlocks.mining_log_saddle_door, "mining_log");
		saddleDoorTF(ModBlocks.sorting_log_saddle_door, "sorting_log");
		saddleDoorTF(ModBlocks.twilight_oak_plank_saddle_door, "wood/trapdoor/twilight_oak_trapdoor");
		saddleDoorTF(ModBlocks.canopy_plank_saddle_door, "wood/trapdoor/canopy_trapdoor");
		saddleDoorTF(ModBlocks.mangrove_plank_saddle_door, "wood/trapdoor/mangrove_trapdoor");
		saddleDoorTF(ModBlocks.dark_oak_plank_saddle_door, "wood/trapdoor/darkwood_trapdoor");
		saddleDoorTF(ModBlocks.time_plank_saddle_door, "wood/trapdoor/time_trapdoor");
		saddleDoorTF(ModBlocks.transformation_plank_saddle_door, "wood/trapdoor/trans_trapdoor");
		saddleDoorTF(ModBlocks.mining_plank_saddle_door, "wood/trapdoor/mine_trapdoor");
		saddleDoorTF(ModBlocks.sorting_plank_saddle_door, "wood/trapdoor/sort_trapdoor");
	}

	private void stairsTwoLayer(RegistryObject<? extends StairBlock> block, String baseName, String base, String over, int alight, int olight, ResourceLocation render) {
		String basename = baseName + "_stairs";
		ModelFile stairs = models().stairs2Layer(basename, tfLoc(base), tfLoc(over), alight, olight, render);
		ModelFile stairsInner = models().stairsInner2Layer(basename + "_inner", tfLoc(base), tfLoc(over), alight, olight, render);
		ModelFile stairsOuter = models().stairsOuter2Layer(basename + "_outer", tfLoc(base), tfLoc(over), alight, olight, render);
		stairsBlock(block.get(), stairs, stairsInner, stairsOuter);
	}

	public void stairsFiery(RegistryObject<? extends StairBlock> block) {
		String name = block.getId().getPath();
		ModelFile stairs = models().getExistingFile(modLoc("block/fiery/" + name));
		ModelFile stairsInner = models().getExistingFile(modLoc("block/fiery/" + name + "_inner"));
		ModelFile stairsOuter = models().getExistingFile(modLoc("block/fiery/" + name + "_outer"));
		stairsBlock(block.get(), stairs, stairsInner, stairsOuter);
	}

	public void slabTwoLayer(RegistryObject<? extends SlabBlock> block, String doubleslab, String base, String over, int alight, int olight, ResourceLocation render) {
		ModelFile bottom = models().slab2Layer(block.getId().getPath(), tfLoc(base), tfLoc(over), alight, olight, render);
		ModelFile top = models().slabTop2Layer(block.getId().getPath() + "_top", tfLoc(base), tfLoc(over), alight, olight, render);
		ModelFile full = models().getExistingFile(tfLoc(doubleslab));
		this.slabBlock(block.get(), bottom, top, full);
	}

	public void slabFiery(RegistryObject<? extends SlabBlock> block, String doubleslab) {
		String name = block.getId().getPath();
		ModelFile bottom = models().getExistingFile(modLoc("block/fiery/" + name));
		ModelFile top = models().getExistingFile(modLoc("block/fiery/" + name + "_top"));
		ModelFile full = models().getExistingFile(tfLoc(doubleslab));
		this.slabBlock(block.get(), bottom, top, full);
	}

	public void fenceTwoLayer(RegistryObject<? extends FenceBlock> block, String base, String over, int alight, int olight, ResourceLocation render) {
		String baseName = block.getId().getPath();
		ModelFile post = this.models().fencePost2Layer(baseName + "_post", tfLoc(base), tfLoc(over), alight, olight, render);
		ModelFile side = this.models().fenceSide2Layer(baseName + "_side", tfLoc(base), tfLoc(over), alight, olight, render);
		this.fourWayBlock(block.get(), post, side);
	}

	public void fenceFiery(RegistryObject<? extends FenceBlock> block) {
		String name = block.getId().getPath();
		ModelFile post = this.models().getExistingFile(modLoc("block/fiery/" + name + "_post"));
		ModelFile side = this.models().getExistingFile(modLoc("block/fiery/" + name + "_side"));
		this.fourWayBlock(block.get(), post, side);
	}

	public void trapdoorTF(RegistryObject<? extends TrapDoorBlock> block, String name) {
		this.trapdoorBlockWithRenderType(block.get(), this.tfLoc(name), true, CUTOUT);
	}

	public void trapdoorExist(RegistryObject<? extends TrapDoorBlock> block, String dir) {
		String name = block.getId().getPath();
		ModelFile bottom = this.models().getExistingFile(modLoc(String.format("block/%s/%s_bottom", dir, name)));
		ModelFile top = this.models().getExistingFile(modLoc(String.format("block/%s/%s_top", dir, name)));
		ModelFile open = this.models().getExistingFile(modLoc(String.format("block/%s/%s_open", dir, name)));
		this.trapdoorBlock(block.get(), bottom, top, open, true);
	}

	public void fenceGateTwoLayer(RegistryObject<? extends FenceGateBlock> block, String base, String over, int alight, int olight, ResourceLocation render) {
		ModelFile gate = this.models().fenceGate2Layer(block.getId().getPath(), tfLoc(base), tfLoc(over), alight, olight, render, true, 5.0F, 16.0F, 6.0F, 15.0F, 6.0F, 9.0F, 12.0F, 15.0F);
		ModelFile gateOpen = this.models().fenceGateOpen2Layer(block.getId().getPath() + "_open", tfLoc(base), tfLoc(over), alight, olight, render, true, 5.0F, 16.0F, 6.0F, 15.0F, 6.0F, 9.0F, 12.0F, 15.0F);
		ModelFile gateWall = this.models().fenceGate2Layer(block.getId().getPath() + "_wall", tfLoc(base), tfLoc(over), alight, olight, render, false, 2.0F, 13.0F, 3.0F, 12.0F, 3.0F, 6.0F, 9.0F, 12.0F);
		ModelFile gateWallOpen = this.models().fenceGateOpen2Layer(block.getId().getPath() + "_wall_open", tfLoc(base), tfLoc(over), alight, olight, render, true, 2.0F, 13.0F, 3.0F, 12.0F, 3.0F, 6.0F, 9.0F, 12.0F);
		this.fenceGateBlock(block.get(), gate, gateOpen, gateWall, gateWallOpen);
	}

	public void fenceGateFiery(RegistryObject<? extends FenceGateBlock> block) {
		String name = block.getId().getPath();
		ModelFile gate = this.models().getExistingFile(modLoc("block/fiery/" + name));
		ModelFile gateOpen = this.models().getExistingFile(modLoc("block/fiery/" + name + "_open"));
		ModelFile gateWall = this.models().getExistingFile(modLoc("block/fiery/" + name + "_wall"));
		ModelFile gateWallOpen = this.models().getExistingFile(modLoc("block/fiery/" + name + "_wall_open"));
		this.fenceGateBlock(block.get(), gate, gateOpen, gateWall, gateWallOpen);
	}

	public void doorTF(RegistryObject<? extends DoorBlock> block, String name) {
		this.door(block, tfLoc(name), tfLoc(name), tfLoc(name), tfLoc(name), CUTOUT);
	}

	public void doorExist(RegistryObject<? extends DoorBlock> block, String dir) {
		String name = block.getId().getPath();
		ModelFile bl = this.models().getExistingFile(modLoc(String.format("block/%s/%s_bottom_left", dir, name)));
		ModelFile blo = this.models().getExistingFile(modLoc(String.format("block/%s/%s_bottom_left_open", dir, name)));
		ModelFile br = this.models().getExistingFile(modLoc(String.format("block/%s/%s_bottom_right", dir, name)));
		ModelFile bro = this.models().getExistingFile(modLoc(String.format("block/%s/%s_bottom_right_open", dir, name)));
		ModelFile tl = this.models().getExistingFile(modLoc(String.format("block/%s/%s_top_left", dir, name)));
		ModelFile tlo = this.models().getExistingFile(modLoc(String.format("block/%s/%s_top_left_open", dir, name)));
		ModelFile tr = this.models().getExistingFile(modLoc(String.format("block/%s/%s_top_right", dir, name)));
		ModelFile tro = this.models().getExistingFile(modLoc(String.format("block/%s/%s_top_right_open", dir, name)));
		this.doorBlock(block.get(), bl, blo, br, bro, tl, tlo, tr, tro);
	}

	public void poleBasic(RegistryObject<? extends OrnamentPole> block, String name, String fullblock) {
		this.pole(block, tfLoc(fullblock), tfLoc(name), tfLoc(name), tfLoc(name), SOLID);
	}

	public void poleColumn(RegistryObject<? extends OrnamentPole> block, String name) {
		this.pole(block, tfLoc(name), tfLoc(name + "_top"), tfLoc(name + "_top"), tfLoc(name), SOLID);
	}

	public void poleTwoLayer(RegistryObject<? extends OrnamentPole> block, String base, String over, String fullblock, int alight, int olight, ResourceLocation render) {
		ModelFile whole = this.models().poleWhole2Layer(block.getId().getPath() + "_whole", tfLoc(base), tfLoc(over), alight, olight, render);
		ModelFile horizon = this.models().poleHorizontal2Layer(block.getId().getPath() + "_horizontal", tfLoc(base), tfLoc(over), alight, olight, render);
		ModelFile vertical = this.models().poleVertical2Layer(block.getId().getPath() + "_vertical", tfLoc(base), tfLoc(over), alight, olight, render);
		ModelFile corner = this.models().poleCorner2Layer(block.getId().getPath() + "_corner", tfLoc(base), tfLoc(over), alight, olight, render);
		ModelFile full = this.models().getExistingFile(tfLoc(fullblock));
		this.poleBlock(block, whole, horizon, vertical, corner, full);
	}

	public void poleFiery(RegistryObject<? extends OrnamentPole> block, String fullblock) {
		String name = block.getId().getPath();
		ModelFile whole = this.models().getExistingFile(modLoc("block/fiery/" + name + "_whole"));
		ModelFile horizon = this.models().getExistingFile(modLoc("block/fiery/" + name + "_horizontal"));
		ModelFile vertical = this.models().getExistingFile(modLoc("block/fiery/" + name + "_vertical"));
		ModelFile corner = this.models().getExistingFile(modLoc("block/fiery/" + name + "_corner"));
		ModelFile full = this.models().getExistingFile(tfLoc(fullblock));
		this.poleBlock(block, whole, horizon, vertical, corner, full);
	}

	public void beamBasic(RegistryObject<? extends OrnamentBeam> block, String name, String fullblock) {
		this.beam(block, tfLoc(fullblock), tfLoc(name), tfLoc(name), tfLoc(name), SOLID);
	}

	public void beamColumn(RegistryObject<? extends OrnamentBeam> block, String name) {
		this.beam(block, tfLoc(name), tfLoc(name + "_top"), tfLoc(name + "_top"), tfLoc(name), SOLID);
	}

	public void beamTwoLayer(RegistryObject<? extends OrnamentBeam> block, String name, String under, String overlay, int alight, int olight, ResourceLocation render) {
		ModelFile whole = this.models().beamWhole2Layer(block.getId().getPath() + "_whole", tfLoc(under), tfLoc(overlay), alight, olight, render);
		ModelFile horizon = this.models().beamHorizontal2Layer(block.getId().getPath() + "_horizontal", tfLoc(under), tfLoc(overlay), alight, olight, render);
		ModelFile vertical = this.models().beamVertical2Layer(block.getId().getPath() + "_verticalal", tfLoc(under), tfLoc(overlay), alight, olight, render);
		ModelFile corner = this.models().beamCorner2Layer(block.getId().getPath() + "_corner", tfLoc(under), tfLoc(overlay), alight, olight, render);
		ModelFile full = this.models().getExistingFile(this.tfLoc(name));
		this.beamBlock(block, whole, horizon, vertical, corner, full);
	}

	public void beamFiery(RegistryObject<? extends OrnamentBeam> block, String fullblock) {
		String name = block.getId().getPath();
		ModelFile whole = this.models().getExistingFile(modLoc("block/fiery/" + name + "_whole"));
		ModelFile horizon = this.models().getExistingFile(modLoc("block/fiery/" + name + "_horizontal"));
		ModelFile vertical = this.models().getExistingFile(modLoc("block/fiery/" + name + "_vertical"));
		ModelFile corner = this.models().getExistingFile(modLoc("block/fiery/" + name + "_corner"));
		ModelFile full = this.models().getExistingFile(tfLoc(fullblock));
		this.beamBlock(block, whole, horizon, vertical, corner, full);
	}

	public void wallColumn(RegistryObject<? extends WallBlock> block, String name) {
		this.wall(block, tfLoc(name), tfLoc(name + "_top"), tfLoc(name + "_top"), SOLID);
	}

	public void wallTwoLayer(RegistryObject<? extends WallBlock> block, String under, String overlay, int alight, int olight, ResourceLocation render) {
		String baseName = block.getId().getPath();
		ModelFile post = models().wallPost2Layer(baseName + "_post", tfLoc(under), tfLoc(overlay), alight, olight, render);
		ModelFile side = models().wallSide2Layer(baseName + "_side", tfLoc(under), tfLoc(overlay), alight, olight, render);
		ModelFile sideTall = models().wallSideTall2Layer(baseName + "_side_tall", tfLoc(under), tfLoc(overlay), alight, olight, render);
		this.wallBlock(block.get(), post, side, sideTall);
	}

	public void wallFiery(RegistryObject<? extends WallBlock> block) {
		String name = block.getId().getPath();
		ModelFile post = models().getExistingFile(modLoc("block/fiery/" + name + "_post"));
		ModelFile side = models().getExistingFile(modLoc("block/fiery/" + name + "_side"));
		ModelFile sideTall = models().getExistingFile(modLoc("block/fiery/" + name + "_side_tall"));
		this.wallBlock(block.get(), post, side, sideTall);
	}

	public void saddleDoorTF(RegistryObject<? extends OrnamentSaddleDoor> block, String name) {
		this.saddleDoor(block, tfLoc(name), tfLoc(name), tfLoc(name), CUTOUT);
	}

	public void saddleDoorExist(RegistryObject<? extends OrnamentSaddleDoor> block, String dir) {
		String name = block.getId().getPath();
		ModelFile left = this.models().getExistingFile(modLoc(String.format("block/%s/%s_left", dir, name)));
		ModelFile leftopen = this.models().getExistingFile(modLoc(String.format("block/%s/%s_left_open", dir, name)));
		ModelFile right = this.models().getExistingFile(modLoc(String.format("block/%s/%s_right", dir, name)));
		ModelFile rightopen = this.models().getExistingFile(modLoc(String.format("block/%s/%s_right_open", dir, name)));
		this.saddleDoorBlock(block, left, leftopen, right, rightopen);
	}
}
