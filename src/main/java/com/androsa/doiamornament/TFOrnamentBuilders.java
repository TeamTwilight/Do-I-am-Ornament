package com.androsa.doiamornament;

import com.androsa.doiamornament.data.BlockTagGenerator;
import com.androsa.ornamental.builder.BlockSetBuilder;
import com.androsa.ornamental.builder.FloorHazard;
import com.androsa.ornamental.builder.OrnamentBuilder;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;
import twilightforest.init.TFBlocks;
import twilightforest.init.TFDamageTypes;
import twilightforest.init.TFItems;
import twilightforest.util.woods.TFWoodTypes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class TFOrnamentBuilders {

	public static final TFOrnamentBuilder IRONWOOD = new TFOrnamentBuilder(
			new OrnamentBuilder("ironwood")
					.mapColor(MapColor.WOOD)
					.hardnessAndResistance(5.0F, 6.0F)
					.stairBaseBlock(TFBlocks.IRONWOOD_BLOCK)
					.blockSetType(new BlockSetBuilder("ironwood")
							.soundType(SoundType.WOOD)
							.weakBlockSet()
							.build())
					.addBlockTags(new ArrayList<>(List.of(BlockTagGenerator.AXE, BlockTagGenerator.PICKAXE))));

	public static final TFOrnamentBuilder FIERY = new TFOrnamentBuilder(
			new OrnamentBuilder("fiery")
					.mapColor(MapColor.TERRACOTTA_BLACK)
					.hardnessAndResistance(5.0F, 6.0F)
					.stairBaseBlock(TFBlocks.FIERY_BLOCK)
					.blockSetType(new BlockSetBuilder("fiery")
							.soundType(SoundType.METAL)
							.ironSounds()
							.build())
					.requiresTool()
					.saddledoorSounds(SoundEvents.IRON_TRAPDOOR_OPEN, SoundEvents.IRON_TRAPDOOR_CLOSE)
					.notSolid()
					.doEmissiveRendering()
					.floorHazard(new FloorHazard((level, pos, state, entity) -> !entity.fireImmune() && entity instanceof LivingEntity living && !living.getItemBySlot(EquipmentSlot.FEET).is(TFItems.FIERY_BOOTS.get()), (level) -> TFDamageTypes.getDamageSource(level, TFDamageTypes.FIERY), 1.0F))
					.addBlockTags(new ArrayList<>(List.of(BlockTagGenerator.PICKAXE))))
			.noOcclusionShape()
			.shadeBrightness(1.0F);

	public static final TFOrnamentBuilder STEELEAF = new TFOrnamentBuilder(
			new OrnamentBuilder("steeleaf")
					.mapColor(MapColor.PLANT)
					.stairBaseBlock(TFBlocks.STEELEAF_BLOCK)
					.blockSetType(new BlockSetBuilder("steeleaf")
							.soundType(SoundType.MOSS)
							.weakBlockSet()
							.build())
					.hardnessAndResistance(5.0F, 6.0F)
					.addBlockTags(new ArrayList<>(List.of(BlockTagGenerator.PORTAL_DECO, BlockTagGenerator.HOE))));

	public static final TFOrnamentBuilder ARCTIC_FUR = new TFOrnamentBuilder(
			new OrnamentBuilder("arctic_fur")
					.mapColor(MapColor.WOOL)
					.stairBaseBlock(TFBlocks.ARCTIC_FUR_BLOCK)
					.blockSetType(new BlockSetBuilder("arctic_fur")
							.soundType(SoundType.WOOL)
							.weakBlockSet()
							.build())
					.hardnessAndResistance(0.8F)
					.fall(0.1F)
					.addBlockTags(new ArrayList<>(List.of(BlockTagGenerator.HOE)))
					.lavaIgnites())
			.shearable(0.2F);

	public static final TFOrnamentBuilder CARMINITE = new TFOrnamentBuilder(
			new OrnamentBuilder("carminite")
					.mapColor(MapColor.COLOR_RED)
					.stairBaseBlock(TFBlocks.CARMINITE_BLOCK)
					.hardnessAndResistance(1.5F, 10.0F)
					.blockSetType(new BlockSetBuilder("carminite")
							.soundType(SoundType.METAL)
							.ironSounds()
							.build())
					.saddledoorSounds(SoundEvents.IRON_TRAPDOOR_OPEN, SoundEvents.IRON_TRAPDOOR_CLOSE)
					.requiresTool()
					.addBlockTags(new ArrayList<>(List.of(BlockTagGenerator.PICKAXE))));

	public static final TFOrnamentBuilder TWILIGHT_OAK_LOG = logOrnament("twilight_oak_log", MapColor.WOOD, TFBlocks.TWILIGHT_OAK_LOG);
	public static final TFOrnamentBuilder CANOPY_LOG = logOrnament("canopy_log", MapColor.PODZOL, TFBlocks.CANOPY_LOG);
	public static final TFOrnamentBuilder MANGROVE_LOG = logOrnament("mangrove_log", MapColor.DIRT, TFBlocks.MANGROVE_LOG);
	public static final TFOrnamentBuilder DARK_OAK_LOG = logOrnament("dark_log", MapColor.COLOR_ORANGE, TFBlocks.DARK_LOG);
	public static final TFOrnamentBuilder TIME_LOG = logOrnament("time_log", MapColor.DIRT, TFBlocks.TIME_LOG);
	public static final TFOrnamentBuilder TRANSFORMATION_LOG = logOrnament("transformation_log", MapColor.WOOD, TFBlocks.TRANSFORMATION_LOG);
	public static final TFOrnamentBuilder MINING_LOG = logOrnament("mining_log", MapColor.SAND, TFBlocks.MINING_LOG);
	public static final TFOrnamentBuilder SORTING_LOG = logOrnament("sorting_log", MapColor.PODZOL, TFBlocks.SORTING_LOG);

	public static final TFOrnamentBuilder TWILIGHT_OAK_PLANKS = plankOrnament("twilight_oak", MapColor.WOOD, TFBlocks.TWILIGHT_OAK_PLANKS, TFWoodTypes.TWILIGHT_OAK_SET);
	public static final TFOrnamentBuilder CANOPY_PLANKS = plankOrnament("canopy", MapColor.PODZOL, TFBlocks.CANOPY_PLANKS, TFWoodTypes.CANOPY_WOOD_SET);
	public static final TFOrnamentBuilder MANGROVE_PLANKS = plankOrnament("mangrove", MapColor.DIRT, TFBlocks.MANGROVE_PLANKS, TFWoodTypes.MANGROVE_WOOD_SET);
	public static final TFOrnamentBuilder DARK_OAK_PLANKS = plankOrnament("dark", MapColor.COLOR_ORANGE, TFBlocks.DARK_PLANKS, TFWoodTypes.DARK_WOOD_SET);
	public static final TFOrnamentBuilder TIME_PLANKS = plankOrnament("time", MapColor.DIRT, TFBlocks.TIME_PLANKS, TFWoodTypes.TIME_WOOD_SET);
	public static final TFOrnamentBuilder TRANSFORMATION_PLANKS = plankOrnament("transformation", MapColor.WOOD, TFBlocks.TRANSFORMATION_PLANKS, TFWoodTypes.TRANSFORMATION_WOOD_SET);
	public static final TFOrnamentBuilder MINING_PLANKS = plankOrnament("mining", MapColor.SAND, TFBlocks.MINING_PLANKS, TFWoodTypes.MINING_WOOD_SET);
	public static final TFOrnamentBuilder SORTING_PLANKS = plankOrnament("sorting", MapColor.PODZOL, TFBlocks.SORTING_PLANKS, TFWoodTypes.SORTING_WOOD_SET);

	private static TFOrnamentBuilder logOrnament(String name, MapColor color, Supplier<? extends Block> base) {
		BlockSetType blockset = new BlockSetBuilder(name)
				.soundType(SoundType.WOOD)
				.weakBlockSet()
				.build();
		return plankOrnament(name, color, base, blockset);
	}

	private static TFOrnamentBuilder plankOrnament(String name, MapColor color, Supplier<? extends Block> base, BlockSetType type) {
		return new TFOrnamentBuilder(
				new OrnamentBuilder(name)
						.mapColor(color)
						.stairBaseBlock(base)
						.blockSetType(type)
						.hardnessAndResistance(2.0F)
						.burnTime(300, 300, 300, 150, 300, 150, 150, 300, 300)
						.addBlockTags(new ArrayList<>(List.of(BlockTagGenerator.AXE)))
						.lavaIgnites());
	}
}
