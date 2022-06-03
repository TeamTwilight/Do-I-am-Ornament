package com.androsa.doiamornament.block;

import com.androsa.doiamornament.TFOrnamentBuilder;
import com.androsa.ornamental.blocks.OrnamentStair;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ShearsItem;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import twilightforest.item.TFItems;
import twilightforest.util.TFDamageSources;

import java.util.function.Supplier;

public class OrnamentTFStairs extends OrnamentStair {

	private final TFOrnamentBuilder tfBuilder;

	public OrnamentTFStairs(Supplier<BlockState> base, Properties props, TFOrnamentBuilder tfbuilder) {
		super(base, props, tfbuilder.getBuilder());
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
	public void stepOn(Level worldIn, BlockPos pos, BlockState state, Entity entityIn) {
		if (tfBuilder.fireHazard) {
			if (!entityIn.fireImmune() && entityIn instanceof LivingEntity living && !EnchantmentHelper.hasFrostWalker(living) && !living.getItemBySlot(EquipmentSlot.FEET).is(TFItems.FIERY_BOOTS.get())) {
				entityIn.hurt(TFDamageSources.FIERY, tfBuilder.hazardDamage);
			}
		}

		super.stepOn(worldIn, pos, state, entityIn);
	}

	@Override
	public boolean isStickyBlock(BlockState state) {
		return tfBuilder.sticky;
	}
}
