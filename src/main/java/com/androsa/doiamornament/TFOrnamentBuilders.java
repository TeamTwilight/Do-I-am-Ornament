package com.androsa.doiamornament;

import com.androsa.doiamornament.data.BlockTagGenerator;
import com.androsa.ornamental.builder.OrnamentBuilder;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import twilightforest.init.TFBlocks;
import twilightforest.init.TFDamageTypes;
import twilightforest.init.TFItems;
import twilightforest.util.TFWoodTypes;

import java.util.List;

public class TFOrnamentBuilders {

	public static final TFOrnamentBuilder IRONWOOD = new TFOrnamentBuilder(
			new OrnamentBuilder("ironwood")
					.properties(Material.WOOD)
					.hardnessAndResistance(5.0F, 6.0F)
					.stairBaseBlock(TFBlocks.IRONWOOD_BLOCK)
					.blockSetType(SoundType.WOOD, SoundEvents.WOODEN_DOOR_CLOSE, SoundEvents.WOODEN_DOOR_OPEN, SoundEvents.WOODEN_TRAPDOOR_CLOSE, SoundEvents.WOODEN_TRAPDOOR_OPEN, SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_ON, SoundEvents.WOODEN_BUTTON_CLICK_OFF, SoundEvents.WOODEN_BUTTON_CLICK_ON)
					.canOpen()
					.addBlockTags(List.of(BlockTagGenerator.AXE, BlockTagGenerator.PICKAXE)));

	public static final TFOrnamentBuilder FIERY = new TFOrnamentBuilder(
			new OrnamentBuilder("fiery")
					.properties(Material.METAL, MaterialColor.TERRACOTTA_BLACK)
					.hardnessAndResistance(5.0F, 6.0F)
					.stairBaseBlock(TFBlocks.FIERY_BLOCK)
					.blockSetType(SoundType.METAL, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN, SoundEvents.IRON_TRAPDOOR_CLOSE, SoundEvents.IRON_TRAPDOOR_OPEN, SoundEvents.METAL_PRESSURE_PLATE_CLICK_OFF, SoundEvents.METAL_PRESSURE_PLATE_CLICK_ON, SoundEvents.STONE_BUTTON_CLICK_OFF, SoundEvents.STONE_BUTTON_CLICK_ON)
					.requiresTool()
					.saddledoorSounds(SoundEvents.IRON_TRAPDOOR_OPEN, SoundEvents.IRON_TRAPDOOR_CLOSE)
					.notSolid()
					.doEmissiveRendering()
					.floorHazard(((level, pos, state, entity) -> !entity.fireImmune() && entity instanceof LivingEntity living && !EnchantmentHelper.hasFrostWalker(living) && !living.getItemBySlot(EquipmentSlot.FEET).is(TFItems.FIERY_BOOTS.get())), (level) -> TFDamageTypes.getDamageSource(level, TFDamageTypes.FIERY), 1.0F)
					.addBlockTags(List.of(BlockTagGenerator.PICKAXE)))
			.noOcclusionShape()
			.shadeBrightness(1.0F);

	public static final TFOrnamentBuilder STEELEAF = new TFOrnamentBuilder(
			new OrnamentBuilder("steeleaf")
					.properties(Material.LEAVES)
					.stairBaseBlock(TFBlocks.STEELEAF_BLOCK)
					.blockSetType(SoundType.MOSS, SoundEvents.WOODEN_DOOR_CLOSE, SoundEvents.WOODEN_DOOR_OPEN, SoundEvents.WOODEN_TRAPDOOR_CLOSE, SoundEvents.WOODEN_TRAPDOOR_OPEN, SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_ON, SoundEvents.WOODEN_BUTTON_CLICK_OFF, SoundEvents.WOODEN_BUTTON_CLICK_ON)
					.hardnessAndResistance(5.0F, 6.0F)
					.canOpen()
					.addBlockTags(List.of(BlockTagGenerator.PORTAL_DECO, BlockTagGenerator.HOE)));

	public static final TFOrnamentBuilder ARCTIC_FUR = new TFOrnamentBuilder(
			new OrnamentBuilder("arctic_fur")
					.properties(Material.WOOL)
					.stairBaseBlock(TFBlocks.ARCTIC_FUR_BLOCK)
					.blockSetType(SoundType.WOOL, SoundEvents.WOODEN_DOOR_CLOSE, SoundEvents.WOODEN_DOOR_OPEN, SoundEvents.WOODEN_TRAPDOOR_CLOSE, SoundEvents.WOODEN_TRAPDOOR_OPEN, SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_ON, SoundEvents.WOODEN_BUTTON_CLICK_OFF, SoundEvents.WOODEN_BUTTON_CLICK_ON)
					.hardnessAndResistance(0.8F)
					.fall(0.1F)
					.canOpen()
					.addBlockTags(List.of(BlockTagGenerator.HOE)))
			.shearable(0.2F);

	public static final TFOrnamentBuilder CARMINITE = new TFOrnamentBuilder(
			new OrnamentBuilder("carminite")
					.properties(Material.CLAY, MaterialColor.COLOR_RED)
					.stairBaseBlock(TFBlocks.CARMINITE_BLOCK)
					.blockSetType(SoundType.SLIME_BLOCK, SoundEvents.WOODEN_DOOR_CLOSE, SoundEvents.WOODEN_DOOR_OPEN, SoundEvents.WOODEN_TRAPDOOR_CLOSE, SoundEvents.WOODEN_TRAPDOOR_OPEN, SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_ON, SoundEvents.WOODEN_BUTTON_CLICK_OFF, SoundEvents.WOODEN_BUTTON_CLICK_ON)
					.hardnessAndResistance(0.0F)
					.canOpen())
			.sticky();

	public static final TFOrnamentBuilder TWILIGHT_OAK_LOG = logOrnament("twilight_oak_log", MaterialColor.WOOD);
	public static final TFOrnamentBuilder CANOPY_LOG = logOrnament("canopy_log", MaterialColor.PODZOL);
	public static final TFOrnamentBuilder MANGROVE_LOG = logOrnament("mangrove_log", MaterialColor.DIRT);
	public static final TFOrnamentBuilder DARK_OAK_LOG = logOrnament("dark_log", MaterialColor.COLOR_ORANGE);
	public static final TFOrnamentBuilder TIME_LOG = logOrnament("time_log", MaterialColor.DIRT);
	public static final TFOrnamentBuilder TRANSFORMATION_LOG = logOrnament("transformation_log", MaterialColor.WOOD);
	public static final TFOrnamentBuilder MINING_LOG = logOrnament("mining_log", MaterialColor.SAND);
	public static final TFOrnamentBuilder SORTING_LOG = logOrnament("sorting_log", MaterialColor.PODZOL);

	public static final TFOrnamentBuilder TWILIGHT_OAK_PLANKS = plankOrnament("twilight_oak", MaterialColor.WOOD, TFWoodTypes.TWILIGHT_OAK_SET);
	public static final TFOrnamentBuilder CANOPY_PLANKS = plankOrnament("canopy", MaterialColor.PODZOL, TFWoodTypes.CANOPY_WOOD_SET);
	public static final TFOrnamentBuilder MANGROVE_PLANKS = plankOrnament("mangrove", MaterialColor.DIRT, TFWoodTypes.MANGROVE_WOOD_SET);
	public static final TFOrnamentBuilder DARK_OAK_PLANKS = plankOrnament("dark", MaterialColor.COLOR_ORANGE, TFWoodTypes.DARKWOOD_WOOD_SET);
	public static final TFOrnamentBuilder TIME_PLANKS = plankOrnament("time", MaterialColor.DIRT, TFWoodTypes.TIMEWOOD_WOOD_SET);
	public static final TFOrnamentBuilder TRANSFORMATION_PLANKS = plankOrnament("transformation", MaterialColor.WOOD, TFWoodTypes.TRANSFORMATION_WOOD_SET);
	public static final TFOrnamentBuilder MINING_PLANKS = plankOrnament("mining", MaterialColor.SAND, TFWoodTypes.MINING_WOOD_SET);
	public static final TFOrnamentBuilder SORTING_PLANKS = plankOrnament("sorting", MaterialColor.PODZOL, TFWoodTypes.SORTING_WOOD_SET);

	private static TFOrnamentBuilder logOrnament(String name, MaterialColor color) {
		BlockSetType blockset = BlockSetType.register(new BlockSetType(name, SoundType.WOOD, SoundEvents.WOODEN_DOOR_CLOSE, SoundEvents.WOODEN_DOOR_OPEN, SoundEvents.WOODEN_TRAPDOOR_CLOSE, SoundEvents.WOODEN_TRAPDOOR_OPEN, SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_ON, SoundEvents.WOODEN_BUTTON_CLICK_OFF, SoundEvents.WOODEN_BUTTON_CLICK_ON));
		return plankOrnament(name, color, blockset);
	}

	private static TFOrnamentBuilder plankOrnament(String name, MaterialColor color, BlockSetType type) {
		return new TFOrnamentBuilder(
				new OrnamentBuilder(name)
						.properties(Material.WOOD, color)
						.blockSetType(type)
						.hardnessAndResistance(2.0F)
						.canOpen()
						.burnTime(300, 300, 300, 150, 300, 150, 150, 300, 300)
						.addBlockTags(List.of(BlockTagGenerator.AXE)));
	}
}
