package com.androsa.doiamornament.data;

import com.androsa.doiamornament.DoIAmOrnamentMod;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemTagGenerator extends ItemTagsProvider {

    public ItemTagGenerator(DataGenerator generator, BlockTagsProvider blocktags, ExistingFileHelper existingFileHelper) {
        super(generator, blocktags, DoIAmOrnamentMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        this.copy(BlockTags.STAIRS, ItemTags.STAIRS);
        this.copy(BlockTags.WOODEN_STAIRS, ItemTags.WOODEN_STAIRS);
        this.copy(BlockTags.SLABS, ItemTags.SLABS);
        this.copy(BlockTags.WOODEN_SLABS, ItemTags.WOODEN_SLABS);
        this.copy(BlockTags.FENCES, ItemTags.FENCES);
        this.copy(Tags.Blocks.FENCES, Tags.Items.FENCES);
        this.copy(BlockTags.WOODEN_FENCES, ItemTags.WOODEN_FENCES);
        this.copy(Tags.Blocks.FENCES_WOODEN, Tags.Items.FENCES_WOODEN);
        this.copy(BlockTags.TRAPDOORS, ItemTags.TRAPDOORS);
        this.copy(BlockTags.WOODEN_TRAPDOORS, ItemTags.WOODEN_TRAPDOORS);
        this.copy(BlockTags.FENCE_GATES, Tags.Items.FENCE_GATES);
        this.copy(Tags.Blocks.FENCE_GATES_WOODEN, Tags.Items.FENCE_GATES_WOODEN);
        this.copy(BlockTags.DOORS, ItemTags.DOORS);
        this.copy(BlockTags.WOODEN_DOORS, ItemTags.WOODEN_DOORS);
        this.copy(BlockTags.WALLS, ItemTags.WALLS);
    }
}
