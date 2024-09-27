package com.androsa.doiamornament.data;

import com.androsa.doiamornament.DoIAmOrnamentMod;
import com.androsa.ornamental.data.provider.OrnamentalBlockTagProvider;
import com.androsa.ornamental.registry.ModTags;
import com.google.common.collect.Lists;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class BlockTagGenerator extends OrnamentalBlockTagProvider {

    public static final List<Supplier<? extends Block>> STAIRS = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> WOOD_STAIRS = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> SLABS = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> WOOD_SLABS = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> FENCES = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> WOOD_FENCES = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> TRAPDOORS = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> WOOD_TRAPDOORS = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> FENCE_GATES = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> WOOD_FENCE_GATES = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> DOORS = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> WOOD_DOORS = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> POLES = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> BEAMS = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> WALLS = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> SADDLE_DOORS = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> BEACON_BASES = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> PORTAL_DECO = Lists.newArrayList();

    public static final List<Supplier<? extends Block>> AXE = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> HOE = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> PICKAXE = Lists.newArrayList();

    public BlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> provider, ExistingFileHelper existingFileHelper) {
        super(output, provider, DoIAmOrnamentMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
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
        this.addToTag(ModTags.Blocks.POLES, POLES);
        this.addToTag(ModTags.Blocks.BEAMS, BEAMS);
        this.addToTag(BlockTags.WALLS, WALLS);
        this.addToTag(ModTags.Blocks.SADDLE_DOORS, SADDLE_DOORS);
        this.addToTag(BlockTags.BEACON_BASE_BLOCKS, BEACON_BASES);
        this.addToTag(twilightforest.data.tags.BlockTagGenerator.PORTAL_DECO, PORTAL_DECO);

        this.addToTag(BlockTags.MINEABLE_WITH_AXE, AXE);
        this.addToTag(BlockTags.MINEABLE_WITH_HOE, HOE);
        this.addToTag(BlockTags.MINEABLE_WITH_PICKAXE, PICKAXE);
    }
}
