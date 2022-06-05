package com.androsa.doiamornament.data;

import com.androsa.doiamornament.DoIAmOrnamentMod;
import com.androsa.ornamental.data.provider.OrnamentalBlockModelProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.common.data.ExistingFileHelper;

public abstract class BlockModelGenerator extends OrnamentalBlockModelProvider {

	private static final String DIAC_MODELS = "doiamornament:block/";

	public BlockModelGenerator(DataGenerator generator, ExistingFileHelper helper) {
		super(generator, DoIAmOrnamentMod.MODID, helper);
	}

	public BlockModelBuilder stairs2Layer(String name, ResourceLocation base, ResourceLocation overlay) {
		return withExistingParent(name, DIAC_MODELS + "stairs_2_layer")
				.texture("all", base)
				.texture("over", overlay);
	}

	public BlockModelBuilder stairsInner2Layer(String name, ResourceLocation base, ResourceLocation overlay) {
		return withExistingParent(name, DIAC_MODELS + "inner_stairs_2_layer")
				.texture("all", base)
				.texture("over", overlay);
	}

	public BlockModelBuilder stairsOuter2Layer(String name, ResourceLocation base, ResourceLocation overlay) {
		return withExistingParent(name, DIAC_MODELS + "outer_stairs_2_layer")
				.texture("all", base)
				.texture("over", overlay);
	}

	public BlockModelBuilder slab2Layer(String name, ResourceLocation base, ResourceLocation overlay) {
		return withExistingParent(name, DIAC_MODELS + "slab_2_layer")
				.texture("all", base)
				.texture("over", overlay);
	}

	public BlockModelBuilder slabTop2Layer(String name, ResourceLocation base, ResourceLocation overlay) {
		return withExistingParent(name, DIAC_MODELS + "slab_top_2_layer")
				.texture("all", base)
				.texture("over", overlay);
	}

	public BlockModelBuilder fencePost2Layer(String name, ResourceLocation base, ResourceLocation overlay) {
		return withExistingParent(name, DIAC_MODELS + "fence_post_2_layer")
				.texture("all", base)
				.texture("over", overlay);
	}

	public BlockModelBuilder fenceSide2Layer(String name, ResourceLocation base, ResourceLocation overlay) {
		return withExistingParent(name, DIAC_MODELS + "fence_side_2_layer")
				.texture("all", base)
				.texture("over", overlay);
	}

	public BlockModelBuilder fenceGate2Layer(String name, ResourceLocation base, ResourceLocation overlay) {
		return withExistingParent(name, DIAC_MODELS + "fence_gate_2_layer")
				.texture("all", base)
				.texture("over", overlay);
	}

	public BlockModelBuilder fenceGateOpen2Layer(String name, ResourceLocation base, ResourceLocation overlay) {
		return withExistingParent(name, DIAC_MODELS + "fence_gate_open_2_layer")
				.texture("all", base)
				.texture("over", overlay);
	}

	public BlockModelBuilder fenceGateWall2Layer(String name, ResourceLocation base, ResourceLocation overlay) {
		return withExistingParent(name, DIAC_MODELS + "fence_gate_wall_2_layer")
				.texture("all", base)
				.texture("over", overlay);
	}

	public BlockModelBuilder fenceGateWallOpen2Layer(String name, ResourceLocation base, ResourceLocation overlay) {
		return withExistingParent(name, DIAC_MODELS + "fence_gate_wall_open_2_layer")
				.texture("all", base)
				.texture("over", overlay);
	}

	public BlockModelBuilder poleCorner2Layer(String name, ResourceLocation base, ResourceLocation overlay) {
		return withExistingParent(name, DIAC_MODELS + "pole_corner_2_layer")
				.texture("all", base)
				.texture("over", overlay);
	}

	public BlockModelBuilder slabVertical2Layer(String name, ResourceLocation base, ResourceLocation overlay) {
		return withExistingParent(name, DIAC_MODELS + "pole_corner_2_layer")
				.texture("all", base)
				.texture("over", overlay);
	}

	public BlockModelBuilder poleCross2Layer(String name, ResourceLocation base, ResourceLocation overlay) {
		return withExistingParent(name, DIAC_MODELS + "pole_cross_2_layer")
				.texture("all", base)
				.texture("over", overlay);
	}

	public BlockModelBuilder stairsStraightSide2Layer(String name, ResourceLocation base, ResourceLocation overlay) {
		return withExistingParent(name, DIAC_MODELS + "stairs_straight_side_2_layer")
				.texture("all", base)
				.texture("over", overlay);
	}

	public BlockModelBuilder beamCorner2Layer(String name, ResourceLocation base, ResourceLocation overlay) {
		return withExistingParent(name, DIAC_MODELS + "beam_corner_2_layer")
				.texture("all", base)
				.texture("over", overlay);
	}

	public BlockModelBuilder beamCross2Layer(String name, ResourceLocation base, ResourceLocation overlay) {
		return withExistingParent(name, DIAC_MODELS + "beam_cross_2_layer")
				.texture("all", base)
				.texture("over", overlay);
	}

	public BlockModelBuilder wallPost2Layer(String name, ResourceLocation base, ResourceLocation overlay) {
		return withExistingParent(name, DIAC_MODELS + "wall_post_2_layer")
				.texture("all", base)
				.texture("over", overlay);
	}

	public BlockModelBuilder wallSide2Layer(String name, ResourceLocation base, ResourceLocation overlay) {
		return withExistingParent(name, DIAC_MODELS + "wall_side_2_layer")
				.texture("all", base)
				.texture("over", overlay);
	}

	public BlockModelBuilder wallSideTall2Layer(String name, ResourceLocation base, ResourceLocation overlay) {
		return withExistingParent(name, DIAC_MODELS + "wall_side_tall_2_layer")
				.texture("all", base)
				.texture("over", overlay);
	}
}
