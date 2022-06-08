package com.androsa.doiamornament.data;

import com.androsa.doiamornament.DoIAmOrnamentMod;
import com.androsa.doiamornament.ModBlocks;
import com.google.common.collect.ImmutableSet;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.Set;
import java.util.function.Supplier;

public class BlockTagGenerator extends BlockTagsProvider {

    private static final ImmutableSet<Supplier<? extends Block>> STAIRS = ImmutableSet.of(
            ModBlocks.ironwood_stairs, ModBlocks.fiery_stairs, ModBlocks.steeleaf_stairs, ModBlocks.arctic_fur_stairs, ModBlocks.carminite_stairs);
    private static final ImmutableSet<Supplier<? extends Block>> WOOD_STAIRS = ImmutableSet.of(
            ModBlocks.twilight_oak_log_stairs, ModBlocks.canopy_log_stairs, ModBlocks.mangrove_log_stairs, ModBlocks.dark_oak_log_stairs,
            ModBlocks.time_log_stairs, ModBlocks.transformation_log_stairs, ModBlocks.mining_log_stairs, ModBlocks.sorting_log_stairs);
    private static final ImmutableSet<Supplier<? extends Block>> SLABS = ImmutableSet.of(
            ModBlocks.ironwood_slab, ModBlocks.fiery_slab, ModBlocks.steeleaf_slab, ModBlocks.arctic_fur_slab, ModBlocks.carminite_slab);
    private static final ImmutableSet<Supplier<? extends Block>> WOOD_SLABS = ImmutableSet.of(
            ModBlocks.twilight_oak_log_slab, ModBlocks.canopy_log_slab, ModBlocks.mangrove_log_slab, ModBlocks.dark_oak_log_slab,
            ModBlocks.time_log_slab, ModBlocks.transformation_log_slab, ModBlocks.mining_log_slab, ModBlocks.sorting_log_slab);
    private static final ImmutableSet<Supplier<? extends Block>> FENCES = ImmutableSet.of(
            ModBlocks.ironwood_fence, ModBlocks.fiery_fence, ModBlocks.steeleaf_fence, ModBlocks.arctic_fur_fence, ModBlocks.carminite_fence);
    private static final ImmutableSet<Supplier<? extends Block>> WOOD_FENCES = ImmutableSet.of(
            ModBlocks.twilight_oak_log_fence, ModBlocks.canopy_log_fence, ModBlocks.mangrove_log_fence, ModBlocks.dark_oak_log_fence,
            ModBlocks.time_log_fence, ModBlocks.transformation_log_fence, ModBlocks.mining_log_fence, ModBlocks.sorting_log_fence);
    private static final ImmutableSet<Supplier<? extends Block>> TRAPDOORS = ImmutableSet.of(
            ModBlocks.ironwood_trapdoor, ModBlocks.fiery_trapdoor, ModBlocks.steeleaf_trapdoor, ModBlocks.arctic_fur_trapdoor, ModBlocks.carminite_trapdoor);
    private static final ImmutableSet<Supplier<? extends Block>> WOOD_TRAPDOORS = ImmutableSet.of(
            ModBlocks.twilight_oak_log_trapdoor, ModBlocks.canopy_log_trapdoor, ModBlocks.mangrove_log_trapdoor, ModBlocks.dark_oak_log_trapdoor,
            ModBlocks.time_log_trapdoor, ModBlocks.transformation_log_trapdoor, ModBlocks.mining_log_trapdoor, ModBlocks.sorting_log_trapdoor);
    private static final ImmutableSet<Supplier<? extends Block>> FENCE_GATES = ImmutableSet.of(
            ModBlocks.ironwood_fence_gate, ModBlocks.fiery_fence_gate, ModBlocks.steeleaf_fence_gate, ModBlocks.arctic_fur_fence_gate, ModBlocks.carminite_fence_gate);
    private static final ImmutableSet<Supplier<? extends Block>> WOOD_FENCE_GATES = ImmutableSet.of(
            ModBlocks.twilight_oak_log_fence_gate, ModBlocks.canopy_log_fence_gate, ModBlocks.mangrove_log_fence_gate, ModBlocks.dark_oak_log_fence_gate,
            ModBlocks.time_log_fence_gate, ModBlocks.transformation_log_fence_gate, ModBlocks.mining_log_fence_gate,ModBlocks.sorting_log_fence_gate);
    private static final ImmutableSet<Supplier<? extends Block>> DOORS = ImmutableSet.of(
            ModBlocks.ironwood_door, ModBlocks.fiery_door, ModBlocks.steeleaf_door, ModBlocks.arctic_fur_door, ModBlocks.carminite_door);
    private static final ImmutableSet<Supplier<? extends Block>> WOOD_DOORS = ImmutableSet.of(
            ModBlocks.twilight_oak_log_door, ModBlocks.canopy_log_door, ModBlocks.mangrove_log_door, ModBlocks.dark_oak_log_door,
            ModBlocks.time_log_door, ModBlocks.transformation_log_door, ModBlocks.mining_log_door, ModBlocks.sorting_log_door);
    private static final ImmutableSet<Supplier<? extends Block>> WALLS = ImmutableSet.of(
            ModBlocks.ironwood_wall, ModBlocks.fiery_wall, ModBlocks.steeleaf_wall, ModBlocks.arctic_fur_wall, ModBlocks.carminite_wall,
            ModBlocks.twilight_oak_log_wall, ModBlocks.canopy_log_wall, ModBlocks.mangrove_log_wall, ModBlocks.dark_oak_log_wall,
            ModBlocks.time_log_wall, ModBlocks.transformation_log_wall, ModBlocks.mining_log_wall, ModBlocks.sorting_log_wall,
            ModBlocks.twilight_oak_plank_wall, ModBlocks.canopy_plank_wall, ModBlocks.mangrove_plank_wall, ModBlocks.dark_oak_plank_wall,
            ModBlocks.time_plank_wall, ModBlocks.transformation_plank_wall, ModBlocks.mining_plank_wall, ModBlocks.sorting_plank_wall);

    public static final ImmutableSet<Supplier<? extends Block>> AXE = ImmutableSet.of(
            ModBlocks.ironwood_stairs, ModBlocks.ironwood_slab, ModBlocks.ironwood_fence, ModBlocks.ironwood_trapdoor, ModBlocks.ironwood_fence_gate, ModBlocks.ironwood_door, ModBlocks.ironwood_pole, ModBlocks.ironwood_beam, ModBlocks.ironwood_wall, ModBlocks.ironwood_saddle_door,
            ModBlocks.twilight_oak_log_stairs, ModBlocks.twilight_oak_log_slab, ModBlocks.twilight_oak_log_fence, ModBlocks.twilight_oak_log_trapdoor, ModBlocks.twilight_oak_log_fence_gate, ModBlocks.twilight_oak_log_door, ModBlocks.twilight_oak_log_pole, ModBlocks.twilight_oak_log_beam, ModBlocks.twilight_oak_log_wall, ModBlocks.twilight_oak_log_saddle_door,
            ModBlocks.canopy_log_stairs, ModBlocks.canopy_log_slab, ModBlocks.canopy_log_fence, ModBlocks.canopy_log_trapdoor, ModBlocks.canopy_log_fence_gate, ModBlocks.canopy_log_door, ModBlocks.canopy_log_pole, ModBlocks.canopy_log_beam, ModBlocks.canopy_log_wall, ModBlocks.canopy_log_saddle_door,
            ModBlocks.mangrove_log_stairs, ModBlocks.mangrove_log_slab, ModBlocks.mangrove_log_fence, ModBlocks.mangrove_log_trapdoor, ModBlocks.mangrove_log_fence_gate, ModBlocks.mangrove_log_door, ModBlocks.mangrove_log_pole, ModBlocks.mangrove_log_beam, ModBlocks.mangrove_log_wall, ModBlocks.mangrove_log_saddle_door,
            ModBlocks.dark_oak_log_stairs, ModBlocks.dark_oak_log_slab, ModBlocks.dark_oak_log_fence, ModBlocks.dark_oak_log_trapdoor, ModBlocks.dark_oak_log_fence_gate, ModBlocks.dark_oak_log_door, ModBlocks.dark_oak_log_pole, ModBlocks.dark_oak_log_beam, ModBlocks.dark_oak_log_wall, ModBlocks.dark_oak_log_saddle_door,
            ModBlocks.time_log_stairs, ModBlocks.time_log_slab, ModBlocks.time_log_fence, ModBlocks.time_log_trapdoor, ModBlocks.time_log_fence_gate, ModBlocks.time_log_door, ModBlocks.time_log_pole, ModBlocks.time_log_beam, ModBlocks.time_log_wall, ModBlocks.time_log_saddle_door,
            ModBlocks.transformation_log_stairs, ModBlocks.transformation_log_slab, ModBlocks.transformation_log_fence, ModBlocks.transformation_log_trapdoor, ModBlocks.transformation_log_fence_gate, ModBlocks.transformation_log_door, ModBlocks.transformation_log_pole, ModBlocks.transformation_log_beam, ModBlocks.transformation_log_wall, ModBlocks.transformation_log_saddle_door,
            ModBlocks.mining_log_stairs, ModBlocks.mining_log_slab, ModBlocks.mining_log_fence, ModBlocks.mining_log_trapdoor, ModBlocks.mining_log_fence_gate, ModBlocks.mining_log_door, ModBlocks.mining_log_pole, ModBlocks.mining_log_beam, ModBlocks.mining_log_wall, ModBlocks.mining_log_saddle_door,
            ModBlocks.sorting_log_stairs, ModBlocks.sorting_log_slab, ModBlocks.sorting_log_fence, ModBlocks.sorting_log_trapdoor, ModBlocks.sorting_log_fence_gate, ModBlocks.sorting_log_door, ModBlocks.sorting_log_pole, ModBlocks.sorting_log_beam, ModBlocks.sorting_log_wall, ModBlocks.sorting_log_saddle_door,
            ModBlocks.twilight_oak_plank_pole, ModBlocks.twilight_oak_plank_beam, ModBlocks.twilight_oak_plank_wall, ModBlocks.twilight_oak_plank_saddle_door,
            ModBlocks.canopy_plank_pole, ModBlocks.canopy_plank_beam, ModBlocks.canopy_plank_wall, ModBlocks.canopy_plank_saddle_door,
            ModBlocks.mangrove_plank_pole, ModBlocks.mangrove_plank_beam, ModBlocks.mangrove_plank_wall, ModBlocks.mangrove_plank_saddle_door,
            ModBlocks.dark_oak_plank_pole, ModBlocks.dark_oak_plank_beam, ModBlocks.dark_oak_plank_wall, ModBlocks.dark_oak_plank_saddle_door,
            ModBlocks.time_plank_pole, ModBlocks.time_plank_beam, ModBlocks.time_plank_wall, ModBlocks.time_plank_saddle_door,
            ModBlocks.transformation_plank_pole, ModBlocks.transformation_plank_beam, ModBlocks.transformation_plank_wall, ModBlocks.transformation_plank_saddle_door,
            ModBlocks.mining_plank_pole, ModBlocks.mining_plank_beam, ModBlocks.mining_plank_wall, ModBlocks.mining_plank_saddle_door,
            ModBlocks.sorting_plank_pole, ModBlocks.sorting_plank_beam, ModBlocks.sorting_plank_wall, ModBlocks.sorting_plank_saddle_door);
    public static final ImmutableSet<Supplier<? extends Block>> HOE = ImmutableSet.of(
            ModBlocks.steeleaf_stairs, ModBlocks.steeleaf_slab, ModBlocks.steeleaf_fence, ModBlocks.steeleaf_trapdoor, ModBlocks.steeleaf_fence_gate, ModBlocks.steeleaf_door, ModBlocks.steeleaf_pole, ModBlocks.steeleaf_beam, ModBlocks.steeleaf_wall, ModBlocks.steeleaf_saddle_door,
            ModBlocks.arctic_fur_stairs, ModBlocks.arctic_fur_slab, ModBlocks.arctic_fur_fence, ModBlocks.arctic_fur_trapdoor, ModBlocks.arctic_fur_fence_gate, ModBlocks.arctic_fur_door, ModBlocks.arctic_fur_pole, ModBlocks.arctic_fur_beam, ModBlocks.arctic_fur_wall, ModBlocks.arctic_fur_saddle_door);
    public static final ImmutableSet<Supplier<? extends Block>> PICKAXE = ImmutableSet.of(
            ModBlocks.fiery_stairs, ModBlocks.fiery_slab, ModBlocks.fiery_fence, ModBlocks.fiery_trapdoor, ModBlocks.fiery_fence_gate, ModBlocks.fiery_door, ModBlocks.fiery_pole, ModBlocks.fiery_beam, ModBlocks.fiery_wall, ModBlocks.fiery_saddle_door);

    public BlockTagGenerator(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, DoIAmOrnamentMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        this.addToTag(BlockTags.STAIRS, STAIRS);
        this.addToTag(BlockTags.WOODEN_STAIRS, WOOD_STAIRS);
        this.addToTag(BlockTags.SLABS, SLABS);
        this.addToTag(BlockTags.WOODEN_SLABS, WOOD_SLABS);
        this.addToTag(BlockTags.FENCES, FENCES);
        this.addToTag(Tags.Blocks.FENCES, FENCES);
        this.addToTag(BlockTags.WOODEN_FENCES, WOOD_FENCES);
        this.addToTag(Tags.Blocks.FENCES_WOODEN, WOOD_FENCES);
        this.addToTag(BlockTags.TRAPDOORS, TRAPDOORS);
        this.addToTag(BlockTags.WOODEN_TRAPDOORS, WOOD_TRAPDOORS);
        this.addToTag(BlockTags.FENCE_GATES, FENCE_GATES);
        this.addToTag(BlockTags.FENCE_GATES, WOOD_FENCE_GATES);
        this.addToTag(Tags.Blocks.FENCE_GATES, FENCE_GATES);
        this.addToTag(Tags.Blocks.FENCE_GATES_WOODEN, WOOD_FENCE_GATES);
        this.addToTag(BlockTags.DOORS, DOORS);
        this.addToTag(BlockTags.WOODEN_DOORS, WOOD_DOORS);
        this.addToTag(BlockTags.WALLS, WALLS);
        this.addToTag(BlockTags.BEACON_BASE_BLOCKS, STAIRS);

        this.addToTag(BlockTags.MINEABLE_WITH_AXE, AXE);
        this.addToTag(BlockTags.MINEABLE_WITH_HOE, HOE);
        this.addToTag(BlockTags.MINEABLE_WITH_PICKAXE, PICKAXE);
    }

    protected void addToTag(TagKey<Block> tag, Set<Supplier<? extends Block>> set) {
        for (Supplier<? extends Block> block : set) {
            this.tag(tag).add(block.get());
        }
    }
}
