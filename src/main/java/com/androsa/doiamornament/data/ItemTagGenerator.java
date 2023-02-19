package com.androsa.doiamornament.data;

import com.androsa.doiamornament.DoIAmOrnamentMod;
import com.androsa.ornamental.data.provider.OrnamentalItemTagProvider;
import com.androsa.ornamental.registry.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import org.apache.commons.compress.utils.Lists;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ItemTagGenerator extends OrnamentalItemTagProvider {

    public static final List<RegistryObject<? extends Block>> STAIRS = Lists.newArrayList();
    public static final List<RegistryObject<? extends Block>> WOOD_STAIRS = Lists.newArrayList();
    public static final List<RegistryObject<? extends Block>> SLABS = Lists.newArrayList();
    public static final List<RegistryObject<? extends Block>> WOOD_SLABS = Lists.newArrayList();
    public static final List<RegistryObject<? extends Block>> FENCES = Lists.newArrayList();
    public static final List<RegistryObject<? extends Block>> WOOD_FENCES = Lists.newArrayList();
    public static final List<RegistryObject<? extends Block>> TRAPDOORS = Lists.newArrayList();
    public static final List<RegistryObject<? extends Block>> WOOD_TRAPDOORS = Lists.newArrayList();
    public static final List<RegistryObject<? extends Block>> FENCE_GATES = Lists.newArrayList();
    public static final List<RegistryObject<? extends Block>> WOOD_FENCE_GATES = Lists.newArrayList();
    public static final List<RegistryObject<? extends Block>> DOORS = Lists.newArrayList();
    public static final List<RegistryObject<? extends Block>> WOOD_DOORS = Lists.newArrayList();
    public static final List<RegistryObject<? extends Block>> POLES = Lists.newArrayList();
    public static final List<RegistryObject<? extends Block>> BEAMS = Lists.newArrayList();
    public static final List<RegistryObject<? extends Block>> WALLS = Lists.newArrayList();
    public static final List<RegistryObject<? extends Block>> SADDLE_DOORS = Lists.newArrayList();

    public ItemTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> provider, BlockTagsProvider blocktags, ExistingFileHelper existingFileHelper) {
        super(output, provider, DoIAmOrnamentMod.MODID, existingFileHelper, blocktags);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.addToTag(ItemTags.STAIRS, STAIRS);
        this.addToTag(ItemTags.WOODEN_STAIRS, WOOD_STAIRS);
        this.addToTag(ItemTags.SLABS, SLABS);
        this.addToTag(ItemTags.WOODEN_SLABS, WOOD_SLABS);
        this.addToTag(ItemTags.FENCES, FENCES);
        this.addToTag(Tags.Items.FENCES, FENCES);
        this.addToTag(ItemTags.WOODEN_FENCES, WOOD_FENCES);
        this.addToTag(Tags.Items.FENCES_WOODEN, WOOD_FENCES);
        this.addToTag(ItemTags.TRAPDOORS, TRAPDOORS);
        this.addToTag(ItemTags.WOODEN_TRAPDOORS, WOOD_TRAPDOORS);
        this.addToTag(Tags.Items.FENCE_GATES, FENCE_GATES);
        this.addToTag(Tags.Items.FENCE_GATES_WOODEN, WOOD_FENCE_GATES);
        this.addToTag(ItemTags.DOORS, DOORS);
        this.addToTag(ItemTags.WOODEN_DOORS, WOOD_DOORS);
        this.addToTag(ModTags.Items.POLES, POLES);
        this.addToTag(ModTags.Items.BEAMS, BEAMS);
        this.addToTag(ItemTags.WALLS, WALLS);
        this.addToTag(ModTags.Items.SADDLE_DOORS, SADDLE_DOORS);
    }
}
