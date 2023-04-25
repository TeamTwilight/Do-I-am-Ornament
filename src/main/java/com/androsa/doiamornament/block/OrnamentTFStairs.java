package com.androsa.doiamornament.block;

import com.androsa.doiamornament.TFOrnamentBuilder;
import com.androsa.ornamental.blocks.OrnamentStair;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ShearsItem;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class OrnamentTFStairs extends OrnamentStair {

	private final TFOrnamentBuilder tfBuilder;

	public OrnamentTFStairs(Properties props, TFOrnamentBuilder tfbuilder) {
		super(props, tfbuilder.getBuilder());
		this.tfBuilder = tfbuilder;
	}

	@Override
	@Deprecated
	public float getShadeBrightness(BlockState state, BlockGetter getter, BlockPos pos) {
		return tfBuilder.shadeBrightness > 0.0F ? tfBuilder.shadeBrightness : super.getShadeBrightness(state, getter, pos);
	}

	@Override
	@Deprecated
	public float getDestroyProgress(BlockState state, Player player, BlockGetter reader, BlockPos pos) {
		return tfBuilder.shearable ? player.getMainHandItem().getItem() instanceof ShearsItem ? tfBuilder.shearSpeed : super.getDestroyProgress(state, player, reader, pos) : super.getDestroyProgress(state, player, reader, pos);
	}

	@Override
	@Deprecated
	public VoxelShape getOcclusionShape(BlockState state, BlockGetter getter, BlockPos pos) {
		return !tfBuilder.occlusion ? Shapes.empty() : super.getOcclusionShape(state, getter, pos);
	}

	@Override
	public boolean isStickyBlock(BlockState state) {
		return tfBuilder.sticky;
	}
}
