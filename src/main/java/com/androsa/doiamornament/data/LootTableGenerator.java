package com.androsa.doiamornament.data;

import com.androsa.doiamornament.ModBlocks;
import com.androsa.ornamental.data.provider.OrnamentLootTableProvider;
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSet;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class LootTableGenerator extends LootTableProvider {

    public LootTableGenerator(DataGenerator generator) {
        super(generator);
    }

    public String getName() {
        return "Do I am Ornament Loot Tables";
    }

    protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootContextParamSet>> getTables() {
        return ImmutableList.of(Pair.of(LootTableGenerator.BlockTables::new, LootContextParamSets.BLOCK));
    }

    @Override
    protected void validate(Map<ResourceLocation, LootTable> map, ValidationContext validationtracker) {
    }

    public static class BlockTables extends OrnamentLootTableProvider {

        @Override
        protected void addTables() {
            this.dropSelf(ModBlocks.ironwood_stairs);
            this.dropSelf(ModBlocks.fiery_stairs);
            this.dropSelf(ModBlocks.steeleaf_stairs);
            this.dropSelf(ModBlocks.arctic_fur_stairs);
            this.dropSelf(ModBlocks.carminite_stairs);
            this.dropSelf(ModBlocks.twilight_oak_log_stairs);
            this.dropSelf(ModBlocks.canopy_log_stairs);
            this.dropSelf(ModBlocks.mangrove_log_stairs);
            this.dropSelf(ModBlocks.dark_oak_log_stairs);
            this.dropSelf(ModBlocks.time_log_stairs);
            this.dropSelf(ModBlocks.transformation_log_stairs);
            this.dropSelf(ModBlocks.mining_log_stairs);
            this.dropSelf(ModBlocks.sorting_log_stairs);

            this.dropSlab(ModBlocks.ironwood_slab);
            this.dropSlab(ModBlocks.fiery_slab);
            this.dropSlab(ModBlocks.steeleaf_slab);
            this.dropSlab(ModBlocks.arctic_fur_slab);
            this.dropSlab(ModBlocks.carminite_slab);
            this.dropSlab(ModBlocks.twilight_oak_log_slab);
            this.dropSlab(ModBlocks.canopy_log_slab);
            this.dropSlab(ModBlocks.mangrove_log_slab);
            this.dropSlab(ModBlocks.dark_oak_log_slab);
            this.dropSlab(ModBlocks.time_log_slab);
            this.dropSlab(ModBlocks.transformation_log_slab);
            this.dropSlab(ModBlocks.mining_log_slab);
            this.dropSlab(ModBlocks.sorting_log_slab);

            this.dropSelf(ModBlocks.ironwood_fence);
            this.dropSelf(ModBlocks.fiery_fence);
            this.dropSelf(ModBlocks.steeleaf_fence);
            this.dropSelf(ModBlocks.arctic_fur_fence);
            this.dropSelf(ModBlocks.carminite_fence);
            this.dropSelf(ModBlocks.twilight_oak_log_fence);
            this.dropSelf(ModBlocks.canopy_log_fence);
            this.dropSelf(ModBlocks.mangrove_log_fence);
            this.dropSelf(ModBlocks.dark_oak_log_fence);
            this.dropSelf(ModBlocks.time_log_fence);
            this.dropSelf(ModBlocks.transformation_log_fence);
            this.dropSelf(ModBlocks.mining_log_fence);
            this.dropSelf(ModBlocks.sorting_log_fence);

            this.dropSelf(ModBlocks.ironwood_trapdoor);
            this.dropSelf(ModBlocks.fiery_trapdoor);
            this.dropSelf(ModBlocks.steeleaf_trapdoor);
            this.dropSelf(ModBlocks.arctic_fur_trapdoor);
            this.dropSelf(ModBlocks.carminite_trapdoor);
            this.dropSelf(ModBlocks.twilight_oak_log_trapdoor);
            this.dropSelf(ModBlocks.canopy_log_trapdoor);
            this.dropSelf(ModBlocks.mangrove_log_trapdoor);
            this.dropSelf(ModBlocks.dark_oak_log_trapdoor);
            this.dropSelf(ModBlocks.time_log_trapdoor);
            this.dropSelf(ModBlocks.transformation_log_trapdoor);
            this.dropSelf(ModBlocks.mining_log_trapdoor);
            this.dropSelf(ModBlocks.sorting_log_trapdoor);

            this.dropSelf(ModBlocks.ironwood_fence_gate);
            this.dropSelf(ModBlocks.fiery_fence_gate);
            this.dropSelf(ModBlocks.steeleaf_fence_gate);
            this.dropSelf(ModBlocks.arctic_fur_fence_gate);
            this.dropSelf(ModBlocks.carminite_fence_gate);
            this.dropSelf(ModBlocks.twilight_oak_log_fence_gate);
            this.dropSelf(ModBlocks.canopy_log_fence_gate);
            this.dropSelf(ModBlocks.mangrove_log_fence_gate);
            this.dropSelf(ModBlocks.dark_oak_log_fence_gate);
            this.dropSelf(ModBlocks.time_log_fence_gate);
            this.dropSelf(ModBlocks.transformation_log_fence_gate);
            this.dropSelf(ModBlocks.mining_log_fence_gate);
            this.dropSelf(ModBlocks.sorting_log_fence_gate);

            this.dropDoor(ModBlocks.ironwood_door);
            this.dropDoor(ModBlocks.fiery_door);
            this.dropDoor(ModBlocks.steeleaf_door);
            this.dropDoor(ModBlocks.arctic_fur_door);
            this.dropDoor(ModBlocks.carminite_door);
            this.dropDoor(ModBlocks.twilight_oak_log_door);
            this.dropDoor(ModBlocks.canopy_log_door);
            this.dropDoor(ModBlocks.mangrove_log_door);
            this.dropDoor(ModBlocks.dark_oak_log_door);
            this.dropDoor(ModBlocks.time_log_door);
            this.dropDoor(ModBlocks.transformation_log_door);
            this.dropDoor(ModBlocks.mining_log_door);
            this.dropDoor(ModBlocks.sorting_log_door);

            this.dropSelf(ModBlocks.ironwood_pole);
            this.dropSelf(ModBlocks.fiery_pole);
            this.dropSelf(ModBlocks.steeleaf_pole);
            this.dropSelf(ModBlocks.arctic_fur_pole);
            this.dropSelf(ModBlocks.carminite_pole);
            this.dropSelf(ModBlocks.twilight_oak_log_pole);
            this.dropSelf(ModBlocks.canopy_log_pole);
            this.dropSelf(ModBlocks.mangrove_log_pole);
            this.dropSelf(ModBlocks.dark_oak_log_pole);
            this.dropSelf(ModBlocks.time_log_pole);
            this.dropSelf(ModBlocks.transformation_log_pole);
            this.dropSelf(ModBlocks.mining_log_pole);
            this.dropSelf(ModBlocks.sorting_log_pole);
            this.dropSelf(ModBlocks.twilight_oak_plank_pole);
            this.dropSelf(ModBlocks.canopy_plank_pole);
            this.dropSelf(ModBlocks.mangrove_plank_pole);
            this.dropSelf(ModBlocks.dark_oak_plank_pole);
            this.dropSelf(ModBlocks.time_plank_pole);
            this.dropSelf(ModBlocks.transformation_plank_pole);
            this.dropSelf(ModBlocks.mining_plank_pole);
            this.dropSelf(ModBlocks.sorting_plank_pole);

            this.dropSelf(ModBlocks.ironwood_beam);
            this.dropSelf(ModBlocks.fiery_beam);
            this.dropSelf(ModBlocks.steeleaf_beam);
            this.dropSelf(ModBlocks.arctic_fur_beam);
            this.dropSelf(ModBlocks.carminite_beam);
            this.dropSelf(ModBlocks.twilight_oak_log_beam);
            this.dropSelf(ModBlocks.canopy_log_beam);
            this.dropSelf(ModBlocks.mangrove_log_beam);
            this.dropSelf(ModBlocks.dark_oak_log_beam);
            this.dropSelf(ModBlocks.time_log_beam);
            this.dropSelf(ModBlocks.transformation_log_beam);
            this.dropSelf(ModBlocks.mining_log_beam);
            this.dropSelf(ModBlocks.sorting_log_beam);
            this.dropSelf(ModBlocks.twilight_oak_plank_beam);
            this.dropSelf(ModBlocks.canopy_plank_beam);
            this.dropSelf(ModBlocks.mangrove_plank_beam);
            this.dropSelf(ModBlocks.dark_oak_plank_beam);
            this.dropSelf(ModBlocks.time_plank_beam);
            this.dropSelf(ModBlocks.transformation_plank_beam);
            this.dropSelf(ModBlocks.mining_plank_beam);
            this.dropSelf(ModBlocks.sorting_plank_beam);

            this.dropSelf(ModBlocks.ironwood_wall);
            this.dropSelf(ModBlocks.fiery_wall);
            this.dropSelf(ModBlocks.steeleaf_wall);
            this.dropSelf(ModBlocks.arctic_fur_wall);
            this.dropSelf(ModBlocks.carminite_wall);
            this.dropSelf(ModBlocks.twilight_oak_log_wall);
            this.dropSelf(ModBlocks.canopy_log_wall);
            this.dropSelf(ModBlocks.mangrove_log_wall);
            this.dropSelf(ModBlocks.dark_oak_log_wall);
            this.dropSelf(ModBlocks.time_log_wall);
            this.dropSelf(ModBlocks.transformation_log_wall);
            this.dropSelf(ModBlocks.mining_log_wall);
            this.dropSelf(ModBlocks.sorting_log_wall);
            this.dropSelf(ModBlocks.twilight_oak_plank_wall);
            this.dropSelf(ModBlocks.canopy_plank_wall);
            this.dropSelf(ModBlocks.mangrove_plank_wall);
            this.dropSelf(ModBlocks.dark_oak_plank_wall);
            this.dropSelf(ModBlocks.time_plank_wall);
            this.dropSelf(ModBlocks.transformation_plank_wall);
            this.dropSelf(ModBlocks.mining_plank_wall);
            this.dropSelf(ModBlocks.sorting_plank_wall);

            this.dropSelf(ModBlocks.ironwood_saddle_door);
            this.dropSelf(ModBlocks.fiery_saddle_door);
            this.dropSelf(ModBlocks.steeleaf_saddle_door);
            this.dropSelf(ModBlocks.arctic_fur_saddle_door);
            this.dropSelf(ModBlocks.carminite_saddle_door);
            this.dropSelf(ModBlocks.twilight_oak_log_saddle_door);
            this.dropSelf(ModBlocks.canopy_log_saddle_door);
            this.dropSelf(ModBlocks.mangrove_log_saddle_door);
            this.dropSelf(ModBlocks.dark_oak_log_saddle_door);
            this.dropSelf(ModBlocks.time_log_saddle_door);
            this.dropSelf(ModBlocks.transformation_log_saddle_door);
            this.dropSelf(ModBlocks.mining_log_saddle_door);
            this.dropSelf(ModBlocks.sorting_log_saddle_door);
            this.dropSelf(ModBlocks.twilight_oak_plank_saddle_door);
            this.dropSelf(ModBlocks.canopy_plank_saddle_door);
            this.dropSelf(ModBlocks.mangrove_plank_saddle_door);
            this.dropSelf(ModBlocks.dark_oak_plank_saddle_door);
            this.dropSelf(ModBlocks.time_plank_saddle_door);
            this.dropSelf(ModBlocks.transformation_plank_saddle_door);
            this.dropSelf(ModBlocks.mining_plank_saddle_door);
            this.dropSelf(ModBlocks.sorting_plank_saddle_door);
        }

        @Override
        protected Iterable<Block> getKnownBlocks() {
            return ModBlocks.BLOCKS.getEntries().stream().map(Supplier::get).collect(Collectors.toList());
        }
    }
}
