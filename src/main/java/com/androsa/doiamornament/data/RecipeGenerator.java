package com.androsa.doiamornament.data;

import com.androsa.doiamornament.DoIAmOrnamentMod;
import com.androsa.doiamornament.ModBlocks;
import com.androsa.ornamental.data.provider.OrnamentalRecipeProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import twilightforest.init.TFBlocks;
import twilightforest.init.TFItems;

import java.util.function.Consumer;

public class RecipeGenerator extends OrnamentalRecipeProvider {

    public RecipeGenerator(PackOutput output) {
        super(output, DoIAmOrnamentMod.MODID);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        stairs(consumer, ModBlocks.ironwood_stairs, TFBlocks.IRONWOOD_BLOCK.get());
        stairs(consumer, ModBlocks.fiery_stairs, TFBlocks.FIERY_BLOCK.get());
        stairs(consumer, ModBlocks.steeleaf_stairs, TFBlocks.STEELEAF_BLOCK.get());
        stairs(consumer, ModBlocks.arctic_fur_stairs, TFBlocks.ARCTIC_FUR_BLOCK.get());
        stairs(consumer, ModBlocks.carminite_stairs, TFBlocks.CARMINITE_BLOCK.get());
        stairs(consumer, ModBlocks.twilight_oak_log_stairs, TFBlocks.TWILIGHT_OAK_LOG.get());
        stairs(consumer, ModBlocks.canopy_log_stairs, TFBlocks.CANOPY_LOG.get());
        stairs(consumer, ModBlocks.mangrove_log_stairs, TFBlocks.MANGROVE_LOG.get());
        stairs(consumer, ModBlocks.dark_oak_log_stairs, TFBlocks.DARK_LOG.get());
        stairs(consumer, ModBlocks.time_log_stairs, TFBlocks.TIME_LOG.get());
        stairs(consumer, ModBlocks.transformation_log_stairs, TFBlocks.TRANSFORMATION_LOG.get());
        stairs(consumer, ModBlocks.mining_log_stairs, TFBlocks.MINING_LOG.get());
        stairs(consumer, ModBlocks.sorting_log_stairs, TFBlocks.SORTING_LOG.get());

        slab(consumer, ModBlocks.ironwood_slab, TFBlocks.IRONWOOD_BLOCK.get());
        slab(consumer, ModBlocks.fiery_slab, TFBlocks.FIERY_BLOCK.get());
        slab(consumer, ModBlocks.steeleaf_slab, TFBlocks.STEELEAF_BLOCK.get());
        slab(consumer, ModBlocks.arctic_fur_slab, TFBlocks.ARCTIC_FUR_BLOCK.get());
        slab(consumer, ModBlocks.carminite_slab, TFBlocks.CARMINITE_BLOCK.get());
        slab(consumer, ModBlocks.twilight_oak_log_slab, TFBlocks.TWILIGHT_OAK_LOG.get());
        slab(consumer, ModBlocks.canopy_log_slab, TFBlocks.CANOPY_LOG.get());
        slab(consumer, ModBlocks.mangrove_log_slab, TFBlocks.MANGROVE_LOG.get());
        slab(consumer, ModBlocks.dark_oak_log_slab, TFBlocks.DARK_LOG.get());
        slab(consumer, ModBlocks.time_log_slab, TFBlocks.TIME_LOG.get());
        slab(consumer, ModBlocks.transformation_log_slab, TFBlocks.TRANSFORMATION_LOG.get());
        slab(consumer, ModBlocks.mining_log_slab, TFBlocks.MINING_LOG.get());
        slab(consumer, ModBlocks.sorting_log_slab, TFBlocks.SORTING_LOG.get());

        fence(consumer, ModBlocks.ironwood_fence, TFBlocks.IRONWOOD_BLOCK.get(), TFItems.IRONWOOD_INGOT.get());
        fence(consumer, ModBlocks.fiery_fence, TFBlocks.FIERY_BLOCK.get(), TFItems.FIERY_INGOT.get());
        fence(consumer, ModBlocks.steeleaf_fence, TFBlocks.STEELEAF_BLOCK.get(), TFItems.STEELEAF_INGOT.get());
        fence(consumer, ModBlocks.arctic_fur_fence, TFBlocks.ARCTIC_FUR_BLOCK.get(), TFItems.ARCTIC_FUR.get());
        fence(consumer, ModBlocks.carminite_fence, TFBlocks.CARMINITE_BLOCK.get(), TFItems.CARMINITE.get());
        fence(consumer, ModBlocks.twilight_oak_log_fence, TFBlocks.TWILIGHT_OAK_LOG.get(), ModBlocks.twilight_oak_log_slab);
        fence(consumer, ModBlocks.canopy_log_fence, TFBlocks.CANOPY_LOG.get(), ModBlocks.canopy_log_slab);
        fence(consumer, ModBlocks.mangrove_log_fence, TFBlocks.MANGROVE_LOG.get(), ModBlocks.mangrove_log_slab);
        fence(consumer, ModBlocks.dark_oak_log_fence, TFBlocks.DARK_LOG.get(), ModBlocks.dark_oak_log_slab);
        fence(consumer, ModBlocks.time_log_fence, TFBlocks.TIME_LOG.get(), ModBlocks.time_log_slab);
        fence(consumer, ModBlocks.transformation_log_fence, TFBlocks.TRANSFORMATION_LOG.get(), ModBlocks.transformation_log_slab);
        fence(consumer, ModBlocks.mining_log_fence, TFBlocks.MINING_LOG.get(), ModBlocks.mining_log_slab);
        fence(consumer, ModBlocks.sorting_log_fence, TFBlocks.SORTING_LOG.get(), ModBlocks.sorting_log_slab);

        trapdoor(consumer, ModBlocks.ironwood_trapdoor, TFItems.IRONWOOD_INGOT.get());
        trapdoor(consumer, ModBlocks.fiery_trapdoor, TFItems.FIERY_INGOT.get());
        trapdoor(consumer, ModBlocks.steeleaf_trapdoor, TFItems.STEELEAF_INGOT.get());
        trapdoor(consumer, ModBlocks.arctic_fur_trapdoor, TFItems.ARCTIC_FUR.get());
        trapdoor(consumer, ModBlocks.carminite_trapdoor, TFItems.CARMINITE.get());
        trapdoorWide(consumer, ModBlocks.twilight_oak_log_trapdoor, ModBlocks.twilight_oak_log_slab);
        trapdoorWide(consumer, ModBlocks.canopy_log_trapdoor, ModBlocks.canopy_log_slab);
        trapdoorWide(consumer, ModBlocks.mangrove_log_trapdoor, ModBlocks.mangrove_log_slab);
        trapdoorWide(consumer, ModBlocks.dark_oak_log_trapdoor, ModBlocks.dark_oak_log_slab);
        trapdoorWide(consumer, ModBlocks.time_log_trapdoor, ModBlocks.time_log_slab);
        trapdoorWide(consumer, ModBlocks.transformation_log_trapdoor, ModBlocks.transformation_log_slab);
        trapdoorWide(consumer, ModBlocks.mining_log_trapdoor, ModBlocks.mining_log_slab);
        trapdoorWide(consumer, ModBlocks.sorting_log_trapdoor, ModBlocks.sorting_log_slab);

        fencegate(consumer, ModBlocks.ironwood_fence_gate, TFBlocks.IRONWOOD_BLOCK.get(), TFItems.IRONWOOD_INGOT.get());
        fencegate(consumer, ModBlocks.fiery_fence_gate, TFBlocks.FIERY_BLOCK.get(), TFItems.FIERY_INGOT.get());
        fencegate(consumer, ModBlocks.steeleaf_fence_gate, TFBlocks.STEELEAF_BLOCK.get(), TFItems.STEELEAF_INGOT.get());
        fencegate(consumer, ModBlocks.arctic_fur_fence_gate, TFBlocks.ARCTIC_FUR_BLOCK.get(), TFItems.ARCTIC_FUR.get());
        fencegate(consumer, ModBlocks.carminite_fence_gate, TFBlocks.CARMINITE_BLOCK.get(), TFItems.CARMINITE.get());
        fencegate(consumer, ModBlocks.twilight_oak_log_fence_gate, TFBlocks.TWILIGHT_OAK_LOG.get(), ModBlocks.twilight_oak_log_slab);
        fencegate(consumer, ModBlocks.canopy_log_fence_gate, TFBlocks.CANOPY_LOG.get(), ModBlocks.canopy_log_slab);
        fencegate(consumer, ModBlocks.mangrove_log_fence_gate, TFBlocks.MANGROVE_LOG.get(), ModBlocks.mangrove_log_slab);
        fencegate(consumer, ModBlocks.dark_oak_log_fence_gate, TFBlocks.DARK_LOG.get(), ModBlocks.dark_oak_log_slab);
        fencegate(consumer, ModBlocks.time_log_fence_gate, TFBlocks.TIME_LOG.get(), ModBlocks.time_log_slab);
        fencegate(consumer, ModBlocks.transformation_log_fence_gate, TFBlocks.TRANSFORMATION_LOG.get(), ModBlocks.transformation_log_slab);
        fencegate(consumer, ModBlocks.mining_log_fence_gate, TFBlocks.MINING_LOG.get(), ModBlocks.mining_log_slab);
        fencegate(consumer, ModBlocks.sorting_log_fence_gate, TFBlocks.SORTING_LOG.get(), ModBlocks.sorting_log_slab);

        door(consumer, ModBlocks.ironwood_door, TFItems.IRONWOOD_INGOT.get());
        door(consumer, ModBlocks.fiery_door, TFItems.FIERY_INGOT.get());
        door(consumer, ModBlocks.steeleaf_door, TFItems.STEELEAF_INGOT.get());
        door(consumer, ModBlocks.arctic_fur_door, TFItems.ARCTIC_FUR.get());
        door(consumer, ModBlocks.carminite_door, TFItems.CARMINITE.get());
        door(consumer, ModBlocks.twilight_oak_log_door, ModBlocks.twilight_oak_log_slab);
        door(consumer, ModBlocks.canopy_log_door, ModBlocks.canopy_log_slab);
        door(consumer, ModBlocks.mangrove_log_door, ModBlocks.mangrove_log_slab);
        door(consumer, ModBlocks.dark_oak_log_door, ModBlocks.dark_oak_log_slab);
        door(consumer, ModBlocks.time_log_door, ModBlocks.time_log_slab);
        door(consumer, ModBlocks.transformation_log_door, ModBlocks.transformation_log_slab);
        door(consumer, ModBlocks.mining_log_door, ModBlocks.mining_log_slab);
        door(consumer, ModBlocks.sorting_log_door, ModBlocks.sorting_log_slab);

        pole(consumer, ModBlocks.ironwood_pole, ModBlocks.ironwood_slab);
        pole(consumer, ModBlocks.fiery_pole, ModBlocks.fiery_slab);
        pole(consumer, ModBlocks.steeleaf_pole, ModBlocks.steeleaf_slab);
        pole(consumer, ModBlocks.arctic_fur_pole, ModBlocks.arctic_fur_slab);
        pole(consumer, ModBlocks.carminite_pole, ModBlocks.carminite_slab);
        pole(consumer, ModBlocks.twilight_oak_log_pole, ModBlocks.twilight_oak_log_slab);
        pole(consumer, ModBlocks.canopy_log_pole, ModBlocks.canopy_log_slab);
        pole(consumer, ModBlocks.mangrove_log_pole, ModBlocks.mangrove_log_slab);
        pole(consumer, ModBlocks.dark_oak_log_pole, ModBlocks.dark_oak_log_slab);
        pole(consumer, ModBlocks.time_log_pole, ModBlocks.time_log_slab);
        pole(consumer, ModBlocks.transformation_log_pole, ModBlocks.transformation_log_slab);
        pole(consumer, ModBlocks.mining_log_pole, ModBlocks.mining_log_slab);
        pole(consumer, ModBlocks.sorting_log_pole, ModBlocks.sorting_log_slab);
        pole(consumer, ModBlocks.twilight_oak_plank_pole, TFBlocks.TWILIGHT_OAK_SLAB.get());
        pole(consumer, ModBlocks.canopy_plank_pole, TFBlocks.CANOPY_SLAB.get());
        pole(consumer, ModBlocks.mangrove_plank_pole, TFBlocks.MANGROVE_SLAB.get());
        pole(consumer, ModBlocks.dark_oak_plank_pole, TFBlocks.DARK_SLAB.get());
        pole(consumer, ModBlocks.time_plank_pole, TFBlocks.TIME_SLAB.get());
        pole(consumer, ModBlocks.transformation_plank_pole, TFBlocks.TRANSFORMATION_SLAB.get());
        pole(consumer, ModBlocks.mining_plank_pole, TFBlocks.MINING_SLAB.get());
        pole(consumer, ModBlocks.sorting_plank_pole, TFBlocks.SORTING_SLAB.get());

        beam(consumer, ModBlocks.ironwood_beam, ModBlocks.ironwood_slab);
        beam(consumer, ModBlocks.fiery_beam, ModBlocks.fiery_slab);
        beam(consumer, ModBlocks.steeleaf_beam, ModBlocks.steeleaf_slab);
        beam(consumer, ModBlocks.arctic_fur_beam, ModBlocks.arctic_fur_slab);
        beam(consumer, ModBlocks.carminite_beam, ModBlocks.carminite_slab);
        beam(consumer, ModBlocks.twilight_oak_log_beam, ModBlocks.twilight_oak_log_slab);
        beam(consumer, ModBlocks.canopy_log_beam, ModBlocks.canopy_log_slab);
        beam(consumer, ModBlocks.mangrove_log_beam, ModBlocks.mangrove_log_slab);
        beam(consumer, ModBlocks.dark_oak_log_beam, ModBlocks.dark_oak_log_slab);
        beam(consumer, ModBlocks.time_log_beam, ModBlocks.time_log_slab);
        beam(consumer, ModBlocks.transformation_log_beam, ModBlocks.transformation_log_slab);
        beam(consumer, ModBlocks.mining_log_beam, ModBlocks.mining_log_slab);
        beam(consumer, ModBlocks.sorting_log_beam, ModBlocks.sorting_log_slab);
        beam(consumer, ModBlocks.twilight_oak_plank_beam, TFBlocks.TWILIGHT_OAK_SLAB.get());
        beam(consumer, ModBlocks.canopy_plank_beam, TFBlocks.CANOPY_SLAB.get());
        beam(consumer, ModBlocks.mangrove_plank_beam, TFBlocks.MANGROVE_SLAB.get());
        beam(consumer, ModBlocks.dark_oak_plank_beam, TFBlocks.DARK_SLAB.get());
        beam(consumer, ModBlocks.time_plank_beam, TFBlocks.TIME_SLAB.get());
        beam(consumer, ModBlocks.transformation_plank_beam, TFBlocks.TRANSFORMATION_SLAB.get());
        beam(consumer, ModBlocks.mining_plank_beam, TFBlocks.MINING_SLAB.get());
        beam(consumer, ModBlocks.sorting_plank_beam, TFBlocks.SORTING_SLAB.get());

        convertPoleBeam(consumer, ModBlocks.ironwood_pole, ModBlocks.ironwood_beam);
        convertPoleBeam(consumer, ModBlocks.fiery_pole, ModBlocks.fiery_beam);
        convertPoleBeam(consumer, ModBlocks.steeleaf_pole, ModBlocks.steeleaf_beam);
        convertPoleBeam(consumer, ModBlocks.arctic_fur_pole, ModBlocks.arctic_fur_beam);
        convertPoleBeam(consumer, ModBlocks.carminite_pole, ModBlocks.carminite_beam);
        convertPoleBeam(consumer, ModBlocks.twilight_oak_log_pole, ModBlocks.twilight_oak_log_beam);
        convertPoleBeam(consumer, ModBlocks.canopy_log_pole, ModBlocks.canopy_log_beam);
        convertPoleBeam(consumer, ModBlocks.mangrove_log_pole, ModBlocks.mangrove_log_beam);
        convertPoleBeam(consumer, ModBlocks.dark_oak_log_pole, ModBlocks.dark_oak_log_beam);
        convertPoleBeam(consumer, ModBlocks.time_log_pole, ModBlocks.time_log_beam);
        convertPoleBeam(consumer, ModBlocks.transformation_log_pole, ModBlocks.transformation_log_beam);
        convertPoleBeam(consumer, ModBlocks.mining_log_pole, ModBlocks.mining_log_beam);
        convertPoleBeam(consumer, ModBlocks.sorting_log_pole, ModBlocks.sorting_log_beam);
        convertPoleBeam(consumer, ModBlocks.twilight_oak_plank_pole, ModBlocks.twilight_oak_plank_beam);
        convertPoleBeam(consumer, ModBlocks.canopy_plank_pole, ModBlocks.canopy_plank_beam);
        convertPoleBeam(consumer, ModBlocks.mangrove_plank_pole, ModBlocks.mangrove_plank_beam);
        convertPoleBeam(consumer, ModBlocks.dark_oak_plank_pole, ModBlocks.dark_oak_plank_beam);
        convertPoleBeam(consumer, ModBlocks.time_plank_pole, ModBlocks.time_plank_beam);
        convertPoleBeam(consumer, ModBlocks.transformation_plank_pole, ModBlocks.transformation_plank_beam);
        convertPoleBeam(consumer, ModBlocks.mining_plank_pole, ModBlocks.mining_plank_beam);
        convertPoleBeam(consumer, ModBlocks.sorting_plank_pole, ModBlocks.sorting_plank_beam);

        wall(consumer, ModBlocks.ironwood_wall, TFBlocks.IRONWOOD_BLOCK.get());
        wall(consumer, ModBlocks.fiery_wall, TFBlocks.FIERY_BLOCK.get());
        wall(consumer, ModBlocks.steeleaf_wall, TFBlocks.STEELEAF_BLOCK.get());
        wall(consumer, ModBlocks.arctic_fur_wall, TFBlocks.ARCTIC_FUR_BLOCK.get());
        wall(consumer, ModBlocks.carminite_wall, TFBlocks.CARMINITE_BLOCK.get());
        wall(consumer, ModBlocks.twilight_oak_log_wall, TFBlocks.TWILIGHT_OAK_LOG.get());
        wall(consumer, ModBlocks.canopy_log_wall, TFBlocks.CANOPY_LOG.get());
        wall(consumer, ModBlocks.mangrove_log_wall, TFBlocks.MANGROVE_LOG.get());
        wall(consumer, ModBlocks.dark_oak_log_wall, TFBlocks.DARK_LOG.get());
        wall(consumer, ModBlocks.time_log_wall, TFBlocks.TIME_LOG.get());
        wall(consumer, ModBlocks.transformation_log_wall, TFBlocks.TRANSFORMATION_LOG.get());
        wall(consumer, ModBlocks.mining_log_wall, TFBlocks.MINING_LOG.get());
        wall(consumer, ModBlocks.sorting_log_wall, TFBlocks.SORTING_LOG.get());
        wall(consumer, ModBlocks.twilight_oak_plank_wall, TFBlocks.TWILIGHT_OAK_PLANKS.get());
        wall(consumer, ModBlocks.canopy_plank_wall, TFBlocks.CANOPY_PLANKS.get());
        wall(consumer, ModBlocks.mangrove_plank_wall, TFBlocks.MANGROVE_PLANKS.get());
        wall(consumer, ModBlocks.dark_oak_plank_wall, TFBlocks.DARK_PLANKS.get());
        wall(consumer, ModBlocks.time_plank_wall, TFBlocks.TIME_PLANKS.get());
        wall(consumer, ModBlocks.transformation_plank_wall, TFBlocks.TRANSFORMATION_PLANKS.get());
        wall(consumer, ModBlocks.mining_plank_wall, TFBlocks.MINING_PLANKS.get());
        wall(consumer, ModBlocks.sorting_plank_wall, TFBlocks.SORTING_PLANKS.get());

        saddleDoor(consumer, ModBlocks.ironwood_saddle_door, ModBlocks.ironwood_trapdoor);
        saddleDoor(consumer, ModBlocks.fiery_saddle_door, ModBlocks.fiery_trapdoor);
        saddleDoor(consumer, ModBlocks.steeleaf_saddle_door, ModBlocks.steeleaf_trapdoor);
        saddleDoor(consumer, ModBlocks.arctic_fur_saddle_door, ModBlocks.arctic_fur_trapdoor);
        saddleDoor(consumer, ModBlocks.carminite_saddle_door, ModBlocks.carminite_trapdoor);
        saddleDoor(consumer, ModBlocks.twilight_oak_log_saddle_door, ModBlocks.twilight_oak_log_trapdoor);
        saddleDoor(consumer, ModBlocks.canopy_log_saddle_door, ModBlocks.canopy_log_trapdoor);
        saddleDoor(consumer, ModBlocks.mangrove_log_saddle_door, ModBlocks.mangrove_log_trapdoor);
        saddleDoor(consumer, ModBlocks.dark_oak_log_saddle_door, ModBlocks.dark_oak_log_trapdoor);
        saddleDoor(consumer, ModBlocks.time_log_saddle_door, ModBlocks.time_log_trapdoor);
        saddleDoor(consumer, ModBlocks.transformation_log_saddle_door, ModBlocks.transformation_log_trapdoor);
        saddleDoor(consumer, ModBlocks.mining_log_saddle_door, ModBlocks.mining_log_trapdoor);
        saddleDoor(consumer, ModBlocks.sorting_log_saddle_door, ModBlocks.sorting_log_trapdoor);
        saddleDoor(consumer, ModBlocks.twilight_oak_plank_saddle_door, TFBlocks.TWILIGHT_OAK_TRAPDOOR.get());
        saddleDoor(consumer, ModBlocks.canopy_plank_saddle_door, TFBlocks.CANOPY_TRAPDOOR.get());
        saddleDoor(consumer, ModBlocks.mangrove_plank_saddle_door, TFBlocks.MANGROVE_TRAPDOOR.get());
        saddleDoor(consumer, ModBlocks.dark_oak_plank_saddle_door, TFBlocks.DARK_TRAPDOOR.get());
        saddleDoor(consumer, ModBlocks.time_plank_saddle_door, TFBlocks.TIME_TRAPDOOR.get());
        saddleDoor(consumer, ModBlocks.transformation_plank_saddle_door, TFBlocks.TRANSFORMATION_TRAPDOOR.get());
        saddleDoor(consumer, ModBlocks.mining_plank_saddle_door, TFBlocks.MINING_TRAPDOOR.get());
        saddleDoor(consumer, ModBlocks.sorting_plank_saddle_door, TFBlocks.SORTING_TRAPDOOR.get());

        saddleDoorFromDoor(consumer, ModBlocks.ironwood_saddle_door, ModBlocks.ironwood_door);
        saddleDoorFromDoor(consumer, ModBlocks.fiery_saddle_door, ModBlocks.fiery_door);
        saddleDoorFromDoor(consumer, ModBlocks.steeleaf_saddle_door, ModBlocks.steeleaf_door);
        saddleDoorFromDoor(consumer, ModBlocks.arctic_fur_saddle_door, ModBlocks.arctic_fur_door);
        saddleDoorFromDoor(consumer, ModBlocks.carminite_saddle_door, ModBlocks.carminite_door);
        saddleDoorFromDoor(consumer, ModBlocks.twilight_oak_log_saddle_door, ModBlocks.twilight_oak_log_door);
        saddleDoorFromDoor(consumer, ModBlocks.canopy_log_saddle_door, ModBlocks.canopy_log_door);
        saddleDoorFromDoor(consumer, ModBlocks.mangrove_log_saddle_door, ModBlocks.mangrove_log_door);
        saddleDoorFromDoor(consumer, ModBlocks.dark_oak_log_saddle_door, ModBlocks.dark_oak_log_door);
        saddleDoorFromDoor(consumer, ModBlocks.time_log_saddle_door, ModBlocks.time_log_door);
        saddleDoorFromDoor(consumer, ModBlocks.transformation_log_saddle_door, ModBlocks.transformation_log_door);
        saddleDoorFromDoor(consumer, ModBlocks.mining_log_saddle_door, ModBlocks.mining_log_door);
        saddleDoorFromDoor(consumer, ModBlocks.sorting_log_saddle_door, ModBlocks.sorting_log_door);
        saddleDoorFromDoor(consumer, ModBlocks.twilight_oak_plank_saddle_door, TFBlocks.TWILIGHT_OAK_DOOR.get());
        saddleDoorFromDoor(consumer, ModBlocks.canopy_plank_saddle_door, TFBlocks.CANOPY_DOOR.get());
        saddleDoorFromDoor(consumer, ModBlocks.mangrove_plank_saddle_door, TFBlocks.MANGROVE_DOOR.get());
        saddleDoorFromDoor(consumer, ModBlocks.dark_oak_plank_saddle_door, TFBlocks.DARK_DOOR.get());
        saddleDoorFromDoor(consumer, ModBlocks.time_plank_saddle_door, TFBlocks.TIME_DOOR.get());
        saddleDoorFromDoor(consumer, ModBlocks.transformation_plank_saddle_door, TFBlocks.TRANSFORMATION_DOOR.get());
        saddleDoorFromDoor(consumer, ModBlocks.mining_plank_saddle_door, TFBlocks.MINING_DOOR.get());
        saddleDoorFromDoor(consumer, ModBlocks.sorting_plank_saddle_door, TFBlocks.SORTING_DOOR.get());
    }
}
