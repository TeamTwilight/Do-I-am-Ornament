package com.androsa.doiamornament.data;

import com.androsa.doiamornament.DoIAmOrnamentMod;
import com.androsa.doiamornament.ModBlocks;
import com.androsa.ornamental.blocks.OrnamentBeam;
import com.androsa.ornamental.blocks.OrnamentPole;
import com.androsa.ornamental.blocks.OrnamentSaddleDoor;
import com.androsa.ornamental.blocks.PoleType;
import com.androsa.ornamental.data.provider.OrnamentalBlockStateProvider;
import net.minecraft.core.Direction;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.WallSide;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.client.model.generators.MultiPartBlockStateBuilder;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import twilightforest.TwilightForestMod;

import javax.annotation.Nonnull;
import java.util.Map;
import java.util.function.Supplier;

public class BlockStateGenerator extends OrnamentalBlockStateProvider {

	private final BlockModelGenerator blockModels;

	public BlockStateGenerator(DataGenerator generator, ExistingFileHelper helper) {
		super(generator, DoIAmOrnamentMod.MODID, helper);

		blockModels = new BlockModelGenerator(generator, helper) {
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
		stairsTwoLayer(ModBlocks.ironwood_stairs, "ironwood", "ironwood_pattern", "ironwood_block");
		stairsBasic(ModBlocks.steeleaf_stairs, "steeleaf_block");
		stairsBasic(ModBlocks.arctic_fur_stairs, "arctic_fur_block");
		stairsTwoLayer(ModBlocks.carminite_stairs, "carminite", "carminite_block", "carminite_block_overlay");
		stairsColumn(ModBlocks.twilight_oak_log_stairs, "twilight_oak_log", "twilight_oak_log_top");
		stairsColumn(ModBlocks.canopy_log_stairs, "canopy_log", "canopy_log_top");
		stairsColumn(ModBlocks.mangrove_log_stairs, "mangrove_log", "mangrove_log_top");
		stairsColumn(ModBlocks.dark_oak_log_stairs, "dark_log", "dark_log_top");
		stairsColumn(ModBlocks.time_log_stairs, "time_log", "time_log_top");
		stairsColumn(ModBlocks.transformation_log_stairs, "transformation_log", "transformation_log_top");
		stairsColumn(ModBlocks.mining_log_stairs, "mining_log", "mining_log_top");
		stairsColumn(ModBlocks.sorting_log_stairs, "sorting_log", "sorting_log_top");

		slabTwoLayer(ModBlocks.ironwood_slab, "ironwood_block", "ironwood_pattern", "ironwood_block");
		slabBasic(ModBlocks.steeleaf_slab, "steeleaf_block");
		slabBasic(ModBlocks.arctic_fur_slab, "arctic_fur_block");
		slabTwoLayer(ModBlocks.carminite_slab, "carminite_block", "carminite_block", "carminite_block_overlay");
		slabColumn(ModBlocks.twilight_oak_log_slab, "twilight_oak_log", "twilight_oak_log", "twilight_oak_log_top");
		slabColumn(ModBlocks.canopy_log_slab, "canopy_log", "canopy_log", "canopy_log_top");
		slabColumn(ModBlocks.mangrove_log_slab, "mangrove_log", "mangrove_log", "mangrove_log_top");
		slabColumn(ModBlocks.dark_oak_log_slab, "dark_log", "dark_log", "dark_log_top");
		slabColumn(ModBlocks.time_log_slab, "time_log", "time_log", "time_log_top");
		slabColumn(ModBlocks.transformation_log_slab, "transformation_log", "transformation_log", "transformation_log_top");
		slabColumn(ModBlocks.mining_log_slab, "mining_log", "mining_log", "mining_log_top");
		slabColumn(ModBlocks.sorting_log_slab, "sorting_log", "sorting_log", "sorting_log_top");

		fenceTwoLayer(ModBlocks.ironwood_fence, "ironwood_pattern", "ironwood_block");
		fenceBasic(ModBlocks.steeleaf_fence, "steeleaf_block");
		fenceBasic(ModBlocks.arctic_fur_fence, "arctic_fur_block");
		fenceTwoLayer(ModBlocks.carminite_fence, "carminite_block", "carminite_block_overlay");
		fenceColumn(ModBlocks.twilight_oak_log_fence, "twilight_oak_log", "twilight_oak_log_top");
		fenceColumn(ModBlocks.canopy_log_fence, "canopy_log", "canopy_log_top");
		fenceColumn(ModBlocks.mangrove_log_fence, "mangrove_log", "mangrove_log_top");
		fenceColumn(ModBlocks.dark_oak_log_fence, "dark_log", "dark_log_top");
		fenceColumn(ModBlocks.time_log_fence, "time_log", "time_log_top");
		fenceColumn(ModBlocks.transformation_log_fence, "transformation_log", "transformation_log_top");
		fenceColumn(ModBlocks.mining_log_fence, "mining_log", "mining_log_top");
		fenceColumn(ModBlocks.sorting_log_fence, "sorting_log", "sorting_log_top");

		trapdoorBasic(ModBlocks.ironwood_trapdoor, "ironwood");
		trapdoorBasic(ModBlocks.steeleaf_trapdoor, "steeleaf");
		trapdoorBasic(ModBlocks.arctic_fur_trapdoor, "arctic_fur");
		trapdoorBasic(ModBlocks.carminite_trapdoor, "carminite");
		trapdoorTF(ModBlocks.twilight_oak_log_trapdoor, "twilight_oak_log");
		trapdoorTF(ModBlocks.canopy_log_trapdoor, "canopy_log");
		trapdoorTF(ModBlocks.mangrove_log_trapdoor, "mangrove_log");
		trapdoorTF(ModBlocks.dark_oak_log_trapdoor, "dark_log");
		trapdoorTF(ModBlocks.time_log_trapdoor, "time_log");
		trapdoorTF(ModBlocks.transformation_log_trapdoor, "transformation_log");
		trapdoorTF(ModBlocks.mining_log_trapdoor, "mining_log");
		trapdoorTF(ModBlocks.sorting_log_trapdoor, "sorting_log");

		fenceGateTwoLayer(ModBlocks.ironwood_fence_gate, "ironwood_pattern", "ironwood_block");
		fenceGateBasic(ModBlocks.steeleaf_fence_gate, "steeleaf_block");
		fenceGateBasic(ModBlocks.arctic_fur_fence_gate, "arctic_fur_block");
		fenceGateTwoLayer(ModBlocks.carminite_fence_gate, "carminite_block", "carminite_block_overlay");
		fenceGateColumn(ModBlocks.twilight_oak_log_fence_gate, "twilight_oak_log", "twilight_oak_log_top");
		fenceGateColumn(ModBlocks.canopy_log_fence_gate, "canopy_log", "canopy_log_top");
		fenceGateColumn(ModBlocks.mangrove_log_fence_gate, "mangrove_log", "mangrove_log_top");
		fenceGateColumn(ModBlocks.dark_oak_log_fence_gate, "dark_log", "dark_log_top");
		fenceGateColumn(ModBlocks.time_log_fence_gate, "time_log", "time_log_top");
		fenceGateColumn(ModBlocks.transformation_log_fence_gate, "transformation_log", "transformation_log_top");
		fenceGateColumn(ModBlocks.mining_log_fence_gate, "mining_log", "mining_log_top");
		fenceGateColumn(ModBlocks.sorting_log_fence_gate, "sorting_log", "sorting_log_top");

		doorBasic(ModBlocks.ironwood_door, "ironwood");
		doorBasic(ModBlocks.steeleaf_door, "steeleaf");
		doorBasic(ModBlocks.arctic_fur_door, "arctic_fur");
		doorBasic(ModBlocks.carminite_door, "carminite");
		doorTF(ModBlocks.twilight_oak_log_door, "twilight_oak_log");
		doorTF(ModBlocks.canopy_log_door, "canopy_log");
		doorTF(ModBlocks.mangrove_log_door, "mangrove_log");
		doorTF(ModBlocks.dark_oak_log_door, "dark_log");
		doorTF(ModBlocks.time_log_door, "time_log");
		doorTF(ModBlocks.transformation_log_door, "transformation_log");
		doorTF(ModBlocks.mining_log_door, "mining_log");
		doorTF(ModBlocks.sorting_log_door, "sorting_log");

		poleTwoLayer(ModBlocks.ironwood_pole, "ironwood_pattern", "ironwood_block", "ironwood_block");
		poleBasic(ModBlocks.steeleaf_pole, "steeleaf_block", "steeleaf_block");
		poleBasic(ModBlocks.arctic_fur_pole, "arctic_fur_block", "arctic_fur_block");
		poleTwoLayer(ModBlocks.carminite_pole, "carminite_block", "carminite_block_overlay", "carminite_block");
		poleColumn(ModBlocks.twilight_oak_log_pole, "twilight_oak_log");
		poleColumn(ModBlocks.canopy_log_pole, "canopy_log");
		poleColumn(ModBlocks.mangrove_log_pole, "mangrove_log");
		poleColumn(ModBlocks.dark_oak_log_pole, "dark_log");
		poleColumn(ModBlocks.time_log_pole, "time_log");
		poleColumn(ModBlocks.transformation_log_pole, "transformation_log");
		poleColumn(ModBlocks.mining_log_pole, "mining_log");
		poleColumn(ModBlocks.sorting_log_pole, "sorting_log");
		poleBasic(ModBlocks.twilight_oak_plank_pole, "wood/planks_twilight_oak_0", "twilight_oak_planks");
		poleBasic(ModBlocks.canopy_plank_pole, "wood/planks_canopy_0", "canopy_planks");
		poleBasic(ModBlocks.mangrove_plank_pole, "wood/planks_mangrove_0", "mangrove_planks");
		poleBasic(ModBlocks.dark_oak_plank_pole, "wood/planks_darkwood_0", "dark_planks");
		poleBasic(ModBlocks.time_plank_pole, "wood/planks_time_0", "time_planks");
		poleBasic(ModBlocks.transformation_plank_pole, "wood/planks_trans_0", "transformation_planks");
		poleBasic(ModBlocks.mining_plank_pole, "wood/planks_mine_0", "mining_planks");
		poleBasic(ModBlocks.sorting_plank_pole, "wood/planks_sort_0", "sorting_planks");

		beamTwoLayer(ModBlocks.ironwood_beam, "ironwood", "ironwood_block", "ironwood_pattern", "ironwood_block", false, false);
		beamBasic(ModBlocks.steeleaf_beam, "steeleaf", "steeleaf_block", false, false);
		beamBasic(ModBlocks.arctic_fur_beam, "arctic_fur", "arctic_fur_block", false, false);
		beamTwoLayer(ModBlocks.carminite_beam, "carminite", "carminite_block", "carminite_block", "carminite_block_overlay", false, false);
		beamColumn(ModBlocks.twilight_oak_log_beam, "twilight_oak_log", "twilight_oak_log", false, false);
		beamColumn(ModBlocks.canopy_log_beam, "canopy_log", "canopy_log", false, false);
		beamColumn(ModBlocks.mangrove_log_beam, "mangrove_log", "mangrove_log", false, false);
		beamColumn(ModBlocks.dark_oak_log_beam, "dark_log", "dark_log", false, false);
		beamColumn(ModBlocks.time_log_beam, "time_log", "time_log", false, false);
		beamColumn(ModBlocks.transformation_log_beam, "transformation_log", "transformation_log", false, false);
		beamColumn(ModBlocks.mining_log_beam, "mining_log", "mining_log", false, false);
		beamColumn(ModBlocks.sorting_log_beam, "sorting_log", "sorting_log", false, false);
		beamBasic(ModBlocks.twilight_oak_plank_beam, "twilight_oak", "wood/planks_twilight_oak_0", "twilight_oak_planks", true, true);
		beamBasic(ModBlocks.canopy_plank_beam, "canopy", "wood/planks_canopy_0", "canopy_planks", true, true);
		beamBasic(ModBlocks.mangrove_plank_beam, "mangrove", "wood/planks_mangrove_0", "mangrove_planks", true, true);
		beamBasic(ModBlocks.dark_oak_plank_beam, "dark", "wood/planks_darkwood_0", "dark_planks", true, true);
		beamBasic(ModBlocks.time_plank_beam, "time", "wood/planks_time_0", "time_planks", true, true);
		beamBasic(ModBlocks.transformation_plank_beam, "transformation", "wood/planks_trans_0", "transformation_planks", true, true);
		beamBasic(ModBlocks.mining_plank_beam, "mining", "wood/planks_mine_0", "mining_planks", true, true);
		beamBasic(ModBlocks.sorting_plank_beam, "sorting", "wood/planks_sort_0", "sorting_planks", true, true);

		wallTwoLayer(ModBlocks.ironwood_wall, "ironwood_pattern", "ironwood_block");
		wallBasic(ModBlocks.steeleaf_wall, "steeleaf_block");
		wallBasic(ModBlocks.arctic_fur_wall, "arctic_fur_block");
		wallTwoLayer(ModBlocks.carminite_wall, "carminite_block", "carminite_block_overlay");
		wallColumn(ModBlocks.twilight_oak_log_wall, "twilight_oak_log");
		wallColumn(ModBlocks.canopy_log_wall, "canopy_log");
		wallColumn(ModBlocks.mangrove_log_wall, "mangrove_log");
		wallColumn(ModBlocks.dark_oak_log_wall, "dark_log");
		wallColumn(ModBlocks.time_log_wall, "time_log");
		wallColumn(ModBlocks.transformation_log_wall, "transformation_log");
		wallColumn(ModBlocks.mining_log_wall, "mining_log");
		wallColumn(ModBlocks.sorting_log_wall, "sorting_log");
		wallBasic(ModBlocks.twilight_oak_planks_wall, "wood/planks_twilight_oak_0");
		wallBasic(ModBlocks.canopy_planks_wall, "wood/planks_canopy_0");
		wallBasic(ModBlocks.mangrove_planks_wall, "wood/planks_mangrove_0");
		wallBasic(ModBlocks.dark_oak_planks_wall, "wood/planks_darkwood_0");
		wallBasic(ModBlocks.time_planks_wall, "wood/planks_time_0");
		wallBasic(ModBlocks.transformation_planks_wall, "wood/planks_trans_0");
		wallBasic(ModBlocks.mining_planks_wall, "wood/planks_mine_0");
		wallBasic(ModBlocks.sorting_planks_wall, "wood/planks_sort_0");

		saddleDoorBasic(ModBlocks.ironwood_saddle_door, "ironwood");
		saddleDoorBasic(ModBlocks.steeleaf_saddle_door, "steeleaf");
		saddleDoorBasic(ModBlocks.arctic_fur_saddle_door, "arctic_fur");
		saddleDoorBasic(ModBlocks.carminite_saddle_door, "carminite");
		saddleDoorTF(ModBlocks.twilight_oak_log_saddle_door, "twilight_oak_log");
		saddleDoorTF(ModBlocks.canopy_log_saddle_door, "canopy_log");
		saddleDoorTF(ModBlocks.mangrove_log_saddle_door, "mangrove_log");
		saddleDoorTF(ModBlocks.dark_oak_log_saddle_door, "dark_log");
		saddleDoorTF(ModBlocks.time_log_saddle_door, "time_log");
		saddleDoorTF(ModBlocks.transformation_log_saddle_door, "transformation_log");
		saddleDoorTF(ModBlocks.mining_log_saddle_door, "mining_log");
		saddleDoorTF(ModBlocks.sorting_log_saddle_door, "sorting_log");
		saddleDoorTF(ModBlocks.twilight_oak_planks_saddle_door, "wood/trapdoor/twilight_oak_trapdoor");
		saddleDoorTF(ModBlocks.canopy_planks_saddle_door, "wood/trapdoor/canopy_trapdoor");
		saddleDoorTF(ModBlocks.mangrove_planks_saddle_door, "wood/trapdoor/mangrove_trapdoor");
		saddleDoorTF(ModBlocks.dark_oak_planks_saddle_door, "wood/trapdoor/darkwood_trapdoor");
		saddleDoorTF(ModBlocks.time_planks_saddle_door, "wood/trapdoor/time_trapdoor");
		saddleDoorTF(ModBlocks.transformation_planks_saddle_door, "wood/trapdoor/trans_trapdoor");
		saddleDoorTF(ModBlocks.mining_planks_saddle_door, "wood/trapdoor/mine_trapdoor");
		saddleDoorTF(ModBlocks.sorting_planks_saddle_door, "wood/trapdoor/sort_trapdoor");
	}

	@Override
	public void stairsBasic(Supplier<? extends StairBlock> block, String name) {
		this.stairsBlock(block.get(), this.tfLoc(name));
	}

	@Override
	public void stairsColumn(Supplier<? extends StairBlock> block, String side, String end) {
		this.stairsBlock(block.get(), this.tfLoc(side), this.tfLoc(end), this.tfLoc(end));
	}

	private void stairsTwoLayer(Supplier<? extends StairBlock> block, String baseName, String base, String over) {
		String basename = baseName + "_stairs";
		ModelFile stairs = models().stairs2Layer(basename, tfLoc(base), tfLoc(over));
		ModelFile stairsInner = models().stairsInner2Layer(basename + "_inner", tfLoc(base), tfLoc(over));
		ModelFile stairsOuter = models().stairsOuter2Layer(basename + "_outer", tfLoc(base), tfLoc(over));
		stairsBlock(block.get(), stairs, stairsInner, stairsOuter);
	}

	@Override
	public void slabBasic(Supplier<? extends SlabBlock> block, String name) {
		this.slabBlock(block.get(), this.tfLoc(name), this.tfLoc(name));
	}

	@Override
	public void slabColumn(Supplier<? extends SlabBlock> block, String blockname, String side, String end) {
		slabBlock(block.get(), this.tfLoc(blockname), this.tfLoc(side), this.tfLoc(end), this.tfLoc(end));
	}

	public void slabTwoLayer(RegistryObject<? extends SlabBlock> block, String doubleslab, String base, String over) {
		ModelFile bottom = models().slab2Layer(block.getId().toString(), tfLoc(base), tfLoc(over));
		ModelFile top = models().slabTop2Layer(block.getId().toString() + "_top", tfLoc(base), tfLoc(over));
		ModelFile full = models().getExistingFile(tfLoc(doubleslab));
		slabBlock(block.get(), bottom, top, full);
	}

	@Override
	public void fenceBasic(Supplier<? extends FenceBlock> block, String name) {
		this.fenceBlock(block.get(), this.tfLoc(name));
	}

	public void fenceColumn(RegistryObject<? extends FenceBlock> block, String side, String top) {
		String baseName = block.getId().toString();
		this.fourWayBlock(block.get(), this.models().fencePostColumn(baseName + "_post", tfLoc(side), tfLoc(top)), this.models().fenceSide(baseName + "_side", this.tfLoc(side)));
	}

	public void fenceTwoLayer(RegistryObject<? extends FenceBlock> block, String base, String over) {
		String baseName = block.getId().toString();
		ModelFile post = this.models().fencePost2Layer(baseName + "_post", tfLoc(base), tfLoc(over));
		ModelFile side = this.models().fenceSide2Layer(baseName + "_side", tfLoc(base), tfLoc(over));
		this.fourWayBlock(block.get(), post, side);
	}

	public void trapdoorTF(Supplier<? extends TrapDoorBlock> block, String name) {
		this.trapdoorBlock(block.get(), this.tfLoc(name), true);
	}

	@Override
	public void fenceGateBasic(Supplier<? extends FenceGateBlock> block, String name) {
		this.fenceGateBlock(block.get(), this.tfLoc(name));
	}

	public void fenceGateColumn(RegistryObject<? extends FenceGateBlock> block, String side, String top) {
		ModelFile gate = this.models().fenceGateColumn(block.getId().toString(), tfLoc(side), tfLoc(top));
		ModelFile gateOpen = this.models().fenceGateOpenColumn(block.getId().toString() + "_open", tfLoc(side), tfLoc(top));
		ModelFile gateWall = this.models().fenceGateWallColumn(block.getId().toString() + "_wall", tfLoc(side), tfLoc(top));
		ModelFile gateWallOpen = this.models().fenceGateWallOpenColumn(block.getId().toString() + "_wall_open", tfLoc(side), tfLoc(top));
		this.fenceGateBlock(block.get(), gate, gateOpen, gateWall, gateWallOpen);
	}

	public void fenceGateTwoLayer(RegistryObject<? extends FenceGateBlock> block, String base, String over) {
		ModelFile gate = this.models().fenceGate2Layer(block.getId().toString(), tfLoc(base), tfLoc(over));
		ModelFile gateOpen = this.models().fenceGateOpen2Layer(block.getId().toString() + "_open", tfLoc(base), tfLoc(over));
		ModelFile gateWall = this.models().fenceGateWall2Layer(block.getId().toString() + "_wall", tfLoc(base), tfLoc(over));
		ModelFile gateWallOpen = this.models().fenceGateWallOpen2Layer(block.getId().toString() + "_wall_open", tfLoc(base), tfLoc(over));
		this.fenceGateBlock(block.get(), gate, gateOpen, gateWall, gateWallOpen);
	}

	public void doorTF(Supplier<? extends DoorBlock> block, String name) {
		this.doorBlock(block.get(), this.tfLoc(name), this.tfLoc(name));
	}

	@Override
	public void poleBasic(RegistryObject<? extends OrnamentPole> block, String name, String fullblock) {
		ModelFile corner = this.models().poleCorner(block.getId().toString() + "_corner", this.tfLoc(name));
		ModelFile half = this.models().slabVertical(block.getId().toString() + "_half", this.tfLoc(name));
		ModelFile cross = this.models().poleCross(block.getId().toString() + "_cross", this.tfLoc(name));
		ModelFile fill = this.models().stairsStraightSide(block.getId().toString() + "_fill", this.tfLoc(name));
		ModelFile full = this.models().getExistingFile(this.tfLoc(fullblock));
		this.poleBlock(block, corner, half, cross, fill, full);
	}

	@Override
	public void poleColumn(RegistryObject<? extends OrnamentPole> block, String name) {
		ModelFile corner = this.models().poleCornerColumn(block.getId().toString() + "_corner", this.tfLoc(name), this.tfLoc(name + "_top"));
		ModelFile half = this.models().slabVerticalColumn(block.getId().toString() + "_half", this.tfLoc(name), this.tfLoc(name + "_top"));
		ModelFile cross = this.models().poleCrossColumn(block.getId().toString() + "_cross", this.tfLoc(name), this.tfLoc(name + "_top"));
		ModelFile fill = this.models().stairsStraightSideColumn(block.getId().toString() + "_fill", this.tfLoc(name), this.tfLoc(name + "_top"));
		ModelFile full = this.models().getExistingFile(this.tfLoc(name));
		this.poleBlock(block, corner, half, cross, fill, full);
	}

	public void poleTwoLayer(RegistryObject<? extends OrnamentPole> block, String base, String over, String fullblock) {
		ModelFile corner = this.models().poleCorner2Layer(block.getId().toString() + "_corner", this.tfLoc(base), this.tfLoc(over));
		ModelFile half = this.models().slabVertical2Layer(block.getId().toString() + "_half", this.tfLoc(base), this.tfLoc(over));
		ModelFile cross = this.models().poleCross2Layer(block.getId().toString() + "_cross", this.tfLoc(base), this.tfLoc(over));
		ModelFile fill = this.models().stairsStraightSide2Layer(block.getId().toString() + "_fill", this.tfLoc(base), this.tfLoc(over));
		ModelFile full = this.models().getExistingFile(this.tfLoc(fullblock));
		this.poleBlock(block, corner, half, cross, fill, full);
	}

	@Override
	public void beamBasic(RegistryObject<? extends OrnamentBeam> block, String base, String name, String fullblock, boolean tfstairs, boolean tfslab) {
		String namebottom = base + "_slab";
		String nametop = namebottom + "_top";
		String namehalf = base + "_pole_half";
		String stairs = base + "_stairs";
		ModelFile corner = this.models().beamCorner(block.getId().toString() + "_corner", this.tfLoc(name));
		ModelFile top = tfslab ? null : this.models().getExistingFile(this.locOrnament(nametop));
		ModelFile bottom = this.models().getExistingFile(tfslab ? this.tfLoc(namebottom) : this.locOrnament(namebottom));
		ModelFile side = this.models().getExistingFile(this.locOrnament(namehalf));
		ModelFile cross = this.models().beamCross(block.getId().toString() + "_cross", this.tfLoc(name));
		ModelFile fill = this.models().getExistingFile(tfstairs ? this.tfLoc(stairs) : this.locOrnament(stairs));
		ModelFile full = this.models().getExistingFile(this.tfLoc(fullblock));

		if (tfslab) {
			this.beamBlockTF(block, corner, bottom, side, cross, fill, full);
		} else {
			this.beamBlock(block, corner, top, bottom, side, cross, fill, full);
		}
	}

	@Override
	public void beamColumn(RegistryObject<? extends OrnamentBeam> block, String base, String name, boolean tfstairs, boolean tfslab) {
		String namebottom = base + "_slab";
		String nametop = namebottom + "_top";
		String namehalf = base + "_pole_half";
		String stairs = base + "_stairs";
		ModelFile corner = this.models().beamCornerColumn(block.getId().toString() + "_corner", this.tfLoc(name), this.tfLoc(name + "_top"));
		ModelFile top = tfslab ? null : this.models().getExistingFile(this.locOrnament(nametop));
		ModelFile bottom = this.models().getExistingFile(tfslab ? this.tfLoc(namebottom) : this.locOrnament(namebottom));
		ModelFile side = this.models().getExistingFile(tfslab ? this.tfLoc(namebottom) : this.locOrnament(namehalf));
		ModelFile cross = this.models().beamCrossColumn(block.getId().toString() + "_cross", this.tfLoc(name), this.tfLoc(name + "_top"));
		ModelFile fill = this.models().getExistingFile(tfstairs ? this.tfLoc(stairs) : this.locOrnament(stairs));
		ModelFile full = this.models().getExistingFile(this.tfLoc(name));

		if (tfslab) {
			this.beamBlockTF(block, corner, bottom, side, cross, fill, full);
		} else {
			this.beamBlock(block, corner, top, bottom, side, cross, fill, full);
		}
	}

	public void beamTwoLayer(RegistryObject<? extends OrnamentBeam> block, String base, String name, String under, String overlay, boolean tfstairs, boolean tfslab) {
		String namebottom = base + "_slab";
		String nametop = namebottom + "_top";
		String namehalf = base + "_pole_half";
		String stairs = base + "_stairs";
		ModelFile corner = this.models().beamCorner2Layer(block.getId().toString() + "_corner", this.tfLoc(under), this.tfLoc(overlay));
		ModelFile top = tfslab ? null : this.models().getExistingFile(this.locOrnament(nametop));
		ModelFile bottom = this.models().getExistingFile(tfslab ? this.tfLoc(namebottom) : this.locOrnament(namebottom));
		ModelFile side = this.models().getExistingFile(tfslab ? this.tfLoc(namebottom) : this.locOrnament(namehalf));
		ModelFile cross = this.models().beamCross2Layer(block.getId().toString() + "_cross", this.tfLoc(under), this.tfLoc(overlay));
		ModelFile fill = this.models().getExistingFile(tfstairs ? this.tfLoc(stairs) : this.locOrnament(stairs));
		ModelFile full = this.models().getExistingFile(this.tfLoc(name));

		if (tfslab) {
			this.beamBlockTF(block, corner, bottom, side, cross, fill, full);
		} else {
			this.beamBlock(block, corner, top, bottom, side, cross, fill, full);
		}
	}

	public void beamBlockTF(Supplier<? extends OrnamentBeam> block, ModelFile corner, ModelFile bottomslab, ModelFile halfpole, ModelFile cross, ModelFile fill, ModelFile full) {
		this.getVariantBuilder(block.get()).forAllStatesExcept((state) -> {
			PoleType type = state.getValue(OrnamentBeam.TYPE);
			Direction.Axis axis = state.getValue(OrnamentBeam.HORIZONTAL_AXIS);
			PoleType.Shape shape = type.getShape();
			ModelFile model;

			switch(shape) {
				case HALF:
					if (type == PoleType.B_HALF || type == PoleType.T_HALF) {
						model = bottomslab;
					} else {
						model = halfpole;
					}
					break;
				case CROSS:
					model = cross;
					break;
				case FILL:
					model = fill;
					break;
				case BLOCK:
					model = full;
					break;
				default:
					model = corner;
			}

			short xRot;
			if (type != PoleType.BL_CORNER && type != PoleType.BR_CORNER && type != PoleType.T_HALF && type != PoleType.TL_FILL && type != PoleType.TR_FILL) {
				xRot = 0;
			} else {
				xRot = 180;
			}

			int yRot;
			if (type != PoleType.TL_CORNER && type != PoleType.BR_CORNER && type != PoleType.L_HALF && type != PoleType.TL_BR) {
				if (type != PoleType.TR_CORNER && type != PoleType.BL_CORNER && type != PoleType.R_HALF && type != PoleType.TR_BL) {
					if (type != PoleType.TL_FILL && type != PoleType.BL_FILL) {
						yRot = 0;
					} else {
						yRot = 180;
					}
				} else {
					yRot = 90;
				}
			} else {
				yRot = 270;
			}

			if (type != PoleType.T_HALF && type != PoleType.B_HALF && type != PoleType.FULL) {
				yRot = axis == Direction.Axis.X ? yRot + 90 : yRot;
			}

			yRot = yRot == 360 ? 0 : yRot;
			boolean uvlock = yRot != 0 || xRot != 0;
			return ConfiguredModel.builder().modelFile(model).rotationY(yRot).rotationX(xRot).uvLock(uvlock).build();
		}, OrnamentBeam.WATERLOGGED);
	}

	@Override
	public void wallBasic(Supplier<? extends WallBlock> block, String name) {
		this.wallBlock(block.get(), tfLoc(name));
	}

	public void wallColumn(RegistryObject<? extends WallBlock> block, String name) {
		String basename = block.getId().toString();
		ModelFile wallpost = this.models().wallPostColumn(basename + "_post", this.tfLoc(name), this.tfLoc(name + "_top"));
		ModelFile wallside = this.models().wallSideColumn(basename + "_side", this.tfLoc(name), this.tfLoc(name + "_top"));
		ModelFile walltall = this.models().wallSideTallColumn(basename + "_side_tall", this.tfLoc(name), this.tfLoc(name + "_top"));
		this.wallBlock(block.get(), wallpost, wallside, walltall);
	}

	public void wallTwoLayer(RegistryObject<? extends WallBlock> block, String under, String overlay) {
		String baseName = block.getId().getPath();
		ModelFile post = models().wallPost2Layer(baseName + "_post", tfLoc(under), tfLoc(overlay));
		ModelFile side = models().wallSide2Layer(baseName + "_side", tfLoc(under), tfLoc(overlay));
		ModelFile sideTall = models().wallSideTall2Layer(baseName + "_side_tall", tfLoc(under), tfLoc(overlay));

		MultiPartBlockStateBuilder builder = getMultipartBuilder(block.get())
				.part().modelFile(post).addModel()
				.condition(WallBlock.UP, true).end();
		WALL_PROPS.entrySet().stream()
				.filter(e -> e.getKey().getAxis().isHorizontal())
				.forEach(e -> {
					wallSidePart(builder, side, e, WallSide.LOW);
					wallSidePart(builder, sideTall, e, WallSide.TALL);
				});
	}

	private void wallSidePart(MultiPartBlockStateBuilder builder, ModelFile model, Map.Entry<Direction, Property<WallSide>> entry, WallSide height) {
		builder.part()
				.modelFile(model)
				.rotationY((((int) entry.getKey().toYRot()) + 180) % 360)
				.uvLock(true)
				.addModel()
				.condition(entry.getValue(), height);
	}

	public void saddleDoorTF(RegistryObject<? extends OrnamentSaddleDoor> block, String name) {
		this.saddleDoorBlock(block, this.tfLoc(name));
	}
}
