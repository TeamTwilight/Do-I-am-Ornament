package com.androsa.doiamornament;

import com.androsa.doiamornament.block.*;
import com.androsa.doiamornament.data.BlockTagGenerator;
import com.androsa.doiamornament.data.ItemTagGenerator;
import com.androsa.ornamental.builder.OrnamentBuilder;
import com.androsa.ornamental.registry.helper.MasterRegistryHelper;
import com.google.common.collect.Lists;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class TFRegistryHelper extends MasterRegistryHelper {

    public TFRegistryHelper(DeferredRegister<Block> blockreg, DeferredRegister<Item> itemreg) {
        super(blockreg, itemreg);
    }

    @Override
    protected BlockBehaviour.Properties stairProperties(OrnamentBuilder builder) {
        BlockBehaviour.Properties props = super.stairProperties(builder);

        if (builder instanceof TFOrnamentBuilder tfbuilder) {
            if (!tfbuilder.occlusion) props.noOcclusion();
            if (tfbuilder.emissive) props.emissiveRendering((state, level, pos) -> true);
        }

        return props;
    }

    @Override
    protected BlockBehaviour.Properties slabProperties(OrnamentBuilder builder) {
        BlockBehaviour.Properties props = super.slabProperties(builder);

        if (builder instanceof TFOrnamentBuilder tfbuilder) {
            if (!tfbuilder.occlusion) props.noOcclusion();
            if (tfbuilder.emissive) props.emissiveRendering((state, level, pos) -> true);
        }

        return props;
    }

    @Override
    protected BlockBehaviour.Properties fenceProperties(OrnamentBuilder builder) {
        BlockBehaviour.Properties props = super.fenceProperties(builder);

        if (builder instanceof TFOrnamentBuilder tfbuilder) {
            if (!tfbuilder.occlusion) props.noOcclusion();
            if (tfbuilder.emissive) props.emissiveRendering((state, level, pos) -> true);
        }

        return props;
    }

    @Override
    protected BlockBehaviour.Properties trapdoorProperties(OrnamentBuilder builder) {
        BlockBehaviour.Properties props = super.trapdoorProperties(builder);

        if (builder instanceof TFOrnamentBuilder tfbuilder) {
            if (tfbuilder.emissive) props.emissiveRendering((state, level, pos) -> true);
        }

        return props;
    }

    @Override
    protected BlockBehaviour.Properties fencegateProperties(OrnamentBuilder builder) {
        BlockBehaviour.Properties props = super.fencegateProperties(builder);

        if (builder instanceof TFOrnamentBuilder tfbuilder) {
            if (!tfbuilder.occlusion) props.noOcclusion();
            if (tfbuilder.emissive) props.emissiveRendering((state, level, pos) -> true);
        }

        return props;
    }

    @Override
    protected BlockBehaviour.Properties doorProperties(OrnamentBuilder builder) {
        BlockBehaviour.Properties props = super.doorProperties(builder);

        if (builder instanceof TFOrnamentBuilder tfbuilder) {
            if (tfbuilder.emissive) props.emissiveRendering((state, level, pos) -> true);
        }

        return props;
    }

    @Override
    protected BlockBehaviour.Properties poleProperties(OrnamentBuilder builder) {
        BlockBehaviour.Properties props = super.poleProperties(builder);

        if (builder instanceof TFOrnamentBuilder tfbuilder) {
            if (!tfbuilder.occlusion) props.noOcclusion();
            if (tfbuilder.emissive) props.emissiveRendering((state, level, pos) -> true);
        }

        return props;
    }

    @Override
    protected BlockBehaviour.Properties beamProperties(OrnamentBuilder builder) {
        BlockBehaviour.Properties props = super.beamProperties(builder);

        if (builder instanceof TFOrnamentBuilder tfbuilder) {
            if (!tfbuilder.occlusion) props.noOcclusion();
            if (tfbuilder.emissive) props.emissiveRendering((state, level, pos) -> true);
        }

        return props;
    }

    @Override
    protected BlockBehaviour.Properties wallProperties(OrnamentBuilder builder) {
        BlockBehaviour.Properties props = super.wallProperties(builder);

        if (builder instanceof TFOrnamentBuilder tfbuilder) {
            if (!tfbuilder.occlusion) props.noOcclusion();
            if (tfbuilder.emissive) props.emissiveRendering((state, level, pos) -> true);
        }

        return props;
    }

    @Override
    protected BlockBehaviour.Properties saddledoorProperties(OrnamentBuilder builder) {
        BlockBehaviour.Properties props = super.saddledoorProperties(builder);

        if (builder instanceof TFOrnamentBuilder tfbuilder) {
            if (!tfbuilder.occlusion) props.noOcclusion();
            if (tfbuilder.emissive) props.emissiveRendering((state, level, pos) -> true);
        }

        return props;
    }

    @Override
    protected ArrayList<List<RegistryObject<? extends Block>>> stairBlockTags() {
        return array(BlockTagGenerator.STAIRS);
    }

    @Override
    protected ArrayList<List<RegistryObject<? extends Block>>> stairItemTags() {
        return array(ItemTagGenerator.STAIRS);
    }

    @Override
    protected ArrayList<List<RegistryObject<? extends Block>>> slabBlockTags() {
        return array(BlockTagGenerator.SLABS);
    }

    @Override
    protected ArrayList<List<RegistryObject<? extends Block>>> slabItemTags() {
        return array(ItemTagGenerator.SLABS);
    }

    @Override
    protected ArrayList<List<RegistryObject<? extends Block>>> fenceBlockTags() {
        return array(BlockTagGenerator.FENCES);
    }

    @Override
    protected ArrayList<List<RegistryObject<? extends Block>>> fenceItemTags() {
        return array(ItemTagGenerator.FENCES);
    }

    @Override
    protected ArrayList<List<RegistryObject<? extends Block>>> trapdoorBlockTags() {
        return array(BlockTagGenerator.TRAPDOORS);
    }

    @Override
    protected ArrayList<List<RegistryObject<? extends Block>>> trapdoorItemTags() {
        return array(ItemTagGenerator.TRAPDOORS);
    }

    @Override
    protected ArrayList<List<RegistryObject<? extends Block>>> fencegateBlockTags() {
        return array(BlockTagGenerator.FENCE_GATES);
    }

    @Override
    protected ArrayList<List<RegistryObject<? extends Block>>> fencegateItemTags() {
        return array(ItemTagGenerator.FENCE_GATES);
    }

    @Override
    protected ArrayList<List<RegistryObject<? extends Block>>> doorBlockTags() {
        return array(BlockTagGenerator.DOORS);
    }

    @Override
    protected ArrayList<List<RegistryObject<? extends Block>>> doorItemTags() {
        return array(ItemTagGenerator.DOORS);
    }

    @Override
    protected ArrayList<List<RegistryObject<? extends Block>>> poleBlockTags() {
        return array(BlockTagGenerator.POLES);
    }

    @Override
    protected ArrayList<List<RegistryObject<? extends Block>>> poleItemTags() {
        return array(ItemTagGenerator.POLES);
    }

    @Override
    protected ArrayList<List<RegistryObject<? extends Block>>> beamBlockTags() {
        return array(BlockTagGenerator.BEAMS);
    }

    @Override
    protected ArrayList<List<RegistryObject<? extends Block>>> beamItemTags() {
        return array(ItemTagGenerator.BEAMS);
    }

    @Override
    protected ArrayList<List<RegistryObject<? extends Block>>> wallBlockTags() {
        return array(BlockTagGenerator.WALLS);
    }

    @Override
    protected ArrayList<List<RegistryObject<? extends Block>>> wallItemTags() {
        return array(ItemTagGenerator.WALLS);
    }

    @Override
    protected ArrayList<List<RegistryObject<? extends Block>>> saddledoorBlockTags() {
        return array(BlockTagGenerator.SADDLE_DOORS);
    }

    @Override
    protected ArrayList<List<RegistryObject<? extends Block>>> saddledoorItemTags() {
        return array(ItemTagGenerator.SADDLE_DOORS);
    }

    public RegistryObject<OrnamentTFStairs> stairs(Supplier<? extends Block> base, TFOrnamentBuilder builder) {
        return this.stairs(base, builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public RegistryObject<OrnamentTFStairs> stairs(Supplier<? extends Block> base, TFOrnamentBuilder builder, ArrayList<List<RegistryObject<? extends Block>>> blocktags, ArrayList<List<RegistryObject<? extends Block>>> itemtags) {
        return this.stairs(base, builder, blocktags, itemtags, OrnamentTFStairs::new);
    }

    public RegistryObject<OrnamentTFSlab> slab(TFOrnamentBuilder builder) {
        return this.slab(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public RegistryObject<OrnamentTFSlab> slab(TFOrnamentBuilder builder, ArrayList<List<RegistryObject<? extends Block>>> blocktags, ArrayList<List<RegistryObject<? extends Block>>> itemtags) {
        return this.slab(builder, blocktags, itemtags, OrnamentTFSlab::new);
    }

    public RegistryObject<OrnamentTFFence> fence(TFOrnamentBuilder builder) {
        return this.fence(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public RegistryObject<OrnamentTFFence> fence(TFOrnamentBuilder builder, ArrayList<List<RegistryObject<? extends Block>>> blocktags, ArrayList<List<RegistryObject<? extends Block>>> itemtags) {
        return this.fence(builder, blocktags, itemtags, OrnamentTFFence::new);
    }

    public RegistryObject<OrnamentTFTrapdoor> trapdoor(TFOrnamentBuilder builder) {
        return this.trapdoor(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public RegistryObject<OrnamentTFTrapdoor> trapdoor(TFOrnamentBuilder builder, ArrayList<List<RegistryObject<? extends Block>>> blocktags, ArrayList<List<RegistryObject<? extends Block>>> itemtags) {
        return this.trapdoor(builder, blocktags, itemtags, OrnamentTFTrapdoor::new);
    }

    public RegistryObject<OrnamentTFFenceGate> fencegate(TFOrnamentBuilder builder) {
        return this.fencegate(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public RegistryObject<OrnamentTFFenceGate> fencegate(TFOrnamentBuilder builder, ArrayList<List<RegistryObject<? extends Block>>> blocktags, ArrayList<List<RegistryObject<? extends Block>>> itemtags) {
        return this.fencegate(builder, blocktags, itemtags, OrnamentTFFenceGate::new);
    }

    public RegistryObject<OrnamentTFDoor> door(TFOrnamentBuilder builder) {
        return this.door(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public RegistryObject<OrnamentTFDoor> door(TFOrnamentBuilder builder, ArrayList<List<RegistryObject<? extends Block>>> blocktags, ArrayList<List<RegistryObject<? extends Block>>> itemtags) {
        return this.door(builder, blocktags, itemtags, OrnamentTFDoor::new);
    }

    public RegistryObject<OrnamentTFPole> pole(TFOrnamentBuilder builder) {
        return this.pole(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public RegistryObject<OrnamentTFPole> pole(TFOrnamentBuilder builder, ArrayList<List<RegistryObject<? extends Block>>> blocktags, ArrayList<List<RegistryObject<? extends Block>>> itemtags) {
        return this.pole(builder, blocktags, itemtags, OrnamentTFPole::new);
    }

    public RegistryObject<OrnamentTFBeam> beam(TFOrnamentBuilder builder) {
        return this.beam(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public RegistryObject<OrnamentTFBeam> beam(TFOrnamentBuilder builder, ArrayList<List<RegistryObject<? extends Block>>> blocktags, ArrayList<List<RegistryObject<? extends Block>>> itemtags) {
        return this.beam(builder, blocktags, itemtags, OrnamentTFBeam::new);
    }

    public RegistryObject<OrnamentTFWall> wall(TFOrnamentBuilder builder) {
        return this.wall(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public RegistryObject<OrnamentTFWall> wall(TFOrnamentBuilder builder, ArrayList<List<RegistryObject<? extends Block>>> blocktags, ArrayList<List<RegistryObject<? extends Block>>> itemtags) {
        return this.wall(builder, blocktags, itemtags, OrnamentTFWall::new);
    }

    public RegistryObject<OrnamentTFSaddleDoor> saddledoor(TFOrnamentBuilder builder) {
        return this.saddledoor(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public RegistryObject<OrnamentTFSaddleDoor> saddledoor(TFOrnamentBuilder builder, ArrayList<List<RegistryObject<? extends Block>>> blocktags, ArrayList<List<RegistryObject<? extends Block>>> itemtags) {
        return this.saddledoor(builder, blocktags, itemtags, OrnamentTFSaddleDoor::new);
    }
}
