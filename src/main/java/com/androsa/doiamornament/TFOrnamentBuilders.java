package com.androsa.doiamornament;

import com.androsa.ornamental.builder.OrnamentBuilder;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class TFOrnamentBuilders {

	public static final TFOrnamentBuilder IRONWOOD = new TFOrnamentBuilder(
			new OrnamentBuilder("ironwood")
					.properties(Material.WOOD)
					.sound(SoundType.WOOD)
					.hardnessAndResistance(5.0F, 6.0F)
					.canOpen());

	public static final TFOrnamentBuilder FIERY = new TFOrnamentBuilder(
			new OrnamentBuilder("fiery")
					.properties(Material.METAL, MaterialColor.TERRACOTTA_BLACK)
					.sound(SoundType.METAL)
					.hardnessAndResistance(5.0F, 6.0F))
			.noOcclusion()
			.emissiveRender()
			.shadeBrightness(1.0F)
			.fireHazard(1.0F);

	public static final TFOrnamentBuilder STEELEAF = new TFOrnamentBuilder(
			new OrnamentBuilder("steeleaf")
					.properties(Material.LEAVES)
					.sound(SoundType.GRASS)
					.hardnessAndResistance(5.0F, 6.0F)
					.fall(0.75F)
					.canOpen());

	public static final TFOrnamentBuilder ARCTIC_FUR = new TFOrnamentBuilder(
			new OrnamentBuilder("arctic_fur")
					.properties(Material.WOOL)
					.sound(SoundType.WOOL)
					.hardnessAndResistance(0.8F)
					.fall(0.1F)
					.canOpen())
			.shearable(0.2F);

	public static final TFOrnamentBuilder CARMINITE = new TFOrnamentBuilder(
			new OrnamentBuilder("carminite")
					.properties(Material.CLAY, MaterialColor.COLOR_RED)
					.sound(SoundType.SLIME_BLOCK)
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

	public static final TFOrnamentBuilder TWILIGHT_OAK_PLANKS = logOrnament("twilight_oak", MaterialColor.WOOD);
	public static final TFOrnamentBuilder CANOPY_PLANKS = logOrnament("canopy", MaterialColor.PODZOL);
	public static final TFOrnamentBuilder MANGROVE_PLANKS = logOrnament("mangrove", MaterialColor.DIRT);
	public static final TFOrnamentBuilder DARK_OAK_PLANKS = logOrnament("dark", MaterialColor.COLOR_ORANGE);
	public static final TFOrnamentBuilder TIME_PLANKS = logOrnament("time", MaterialColor.DIRT);
	public static final TFOrnamentBuilder TRANSFORMATION_PLANKS = logOrnament("transformation", MaterialColor.WOOD);
	public static final TFOrnamentBuilder MINING_PLANKS = logOrnament("mining", MaterialColor.SAND);
	public static final TFOrnamentBuilder SORTING_PLANKS = logOrnament("sorting", MaterialColor.PODZOL);

	private static TFOrnamentBuilder logOrnament(String name, MaterialColor color) {
		return new TFOrnamentBuilder(
				new OrnamentBuilder(name)
						.properties(Material.WOOD, color)
						.sound(SoundType.WOOD)
						.hardnessAndResistance(2.0F)
						.canOpen()
						.burnTime(300, 300, 300, 150, 300, 150, 150, 300, 300));
	}
}
