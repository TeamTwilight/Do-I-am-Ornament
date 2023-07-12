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

public class TFRegistryHelper extends MasterRegistryHelper {

    public TFRegistryHelper(DeferredRegister<Block> blockreg, DeferredRegister<Item> itemreg) {
        super(blockreg, itemreg);
    }

    @Override
    protected BlockBehaviour.Properties stairProperties(OrnamentBuilder builder) {
        BlockBehaviour.Properties props = super.stairProperties(builder);

        if (builder instanceof TFOrnamentBuilder tf) {
            if (tf.ignites) props.ignitedByLava();
        }

        return props;
    }

    @Override
    protected BlockBehaviour.Properties slabProperties(OrnamentBuilder builder) {
        BlockBehaviour.Properties props = super.slabProperties(builder);

        if (builder instanceof TFOrnamentBuilder tf) {
            if (tf.ignites) props.ignitedByLava();
        }

        return props;
    }

    @Override
    protected BlockBehaviour.Properties fenceProperties(OrnamentBuilder builder) {
        BlockBehaviour.Properties props = super.fenceProperties(builder);

        if (builder instanceof TFOrnamentBuilder tf) {
            if (tf.ignites) props.ignitedByLava();
        }

        return props;
    }

    @Override
    protected BlockBehaviour.Properties trapdoorProperties(OrnamentBuilder builder) {
        BlockBehaviour.Properties props = super.trapdoorProperties(builder);

        if (builder instanceof TFOrnamentBuilder tf) {
            if (tf.ignites) props.ignitedByLava();
        }

        return props;
    }

    @Override
    protected BlockBehaviour.Properties fencegateProperties(OrnamentBuilder builder) {
        BlockBehaviour.Properties props = super.fencegateProperties(builder);

        if (builder instanceof TFOrnamentBuilder tf) {
            if (tf.ignites) props.ignitedByLava();
        }

        return props;
    }

    @Override
    protected BlockBehaviour.Properties doorProperties(OrnamentBuilder builder) {
        BlockBehaviour.Properties props = super.doorProperties(builder);

        if (builder instanceof TFOrnamentBuilder tf) {
            if (tf.ignites) props.ignitedByLava();
        }

        return props;
    }

    @Override
    protected BlockBehaviour.Properties poleProperties(OrnamentBuilder builder) {
        BlockBehaviour.Properties props = super.poleProperties(builder);

        if (builder instanceof TFOrnamentBuilder tf) {
            if (tf.ignites) props.ignitedByLava();
        }

        return props;
    }

    @Override
    protected BlockBehaviour.Properties beamProperties(OrnamentBuilder builder) {
        BlockBehaviour.Properties props = super.beamProperties(builder);

        if (builder instanceof TFOrnamentBuilder tf) {
            if (tf.ignites) props.ignitedByLava();
        }

        return props;
    }

    @Override
    protected BlockBehaviour.Properties wallProperties(OrnamentBuilder builder) {
        BlockBehaviour.Properties props = super.wallProperties(builder);

        if (builder instanceof TFOrnamentBuilder tf) {
            if (tf.ignites) props.ignitedByLava();
        }

        return props;
    }

    @Override
    protected BlockBehaviour.Properties saddledoorProperties(OrnamentBuilder builder) {
        BlockBehaviour.Properties props = super.saddledoorProperties(builder);

        if (builder instanceof TFOrnamentBuilder tf) {
            if (tf.ignites) props.ignitedByLava();
        }

        return props;
    }

    @Override
    protected TagHelper stairTags() {
        return new TagHelper(
                array(BlockTagGenerator.STAIRS),
                array(ItemTagGenerator.STAIRS));
    }

    @Override
    protected TagHelper slabTags() {
        return new TagHelper(
                array(BlockTagGenerator.SLABS),
                array(ItemTagGenerator.SLABS));
    }

    @Override
    protected TagHelper fenceTags() {
        return new TagHelper(
                array(BlockTagGenerator.FENCES),
                array(ItemTagGenerator.FENCES));
    }

    @Override
    protected TagHelper trapdoorTags() {
        return new TagHelper(
                array(BlockTagGenerator.TRAPDOORS),
                array(ItemTagGenerator.TRAPDOORS));
    }

    @Override
    protected TagHelper fencegateTags() {
        return new TagHelper(
                array(BlockTagGenerator.FENCE_GATES),
                array(ItemTagGenerator.FENCE_GATES));
    }

    @Override
    protected TagHelper doorTags() {
        return new TagHelper(
                array(BlockTagGenerator.DOORS),
                array(ItemTagGenerator.DOORS));
    }

    @Override
    protected TagHelper poleTags() {
        return new TagHelper(
                array(BlockTagGenerator.POLES),
                array(ItemTagGenerator.POLES));
    }

    @Override
    protected TagHelper beamTags() {
        return new TagHelper(
                array(BlockTagGenerator.BEAMS),
                array(ItemTagGenerator.BEAMS));
    }

    @Override
    protected TagHelper wallTags() {
        return new TagHelper(
                array(BlockTagGenerator.WALLS),
                array(ItemTagGenerator.WALLS));
    }

    @Override
    protected TagHelper saddledoorTags() {
        return new TagHelper(
                array(BlockTagGenerator.SADDLE_DOORS),
                array(ItemTagGenerator.SADDLE_DOORS));
    }

    public RegistryObject<OrnamentTFStairs> stairs(TFOrnamentBuilder builder) {
        return this.stairs(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public RegistryObject<OrnamentTFStairs> stairs(TFOrnamentBuilder builder, ArrayList<List<RegistryObject<? extends Block>>> blocktags, ArrayList<List<RegistryObject<? extends Block>>> itemtags) {
        return this.stairs(builder, blocktags, itemtags, OrnamentTFStairs::new);
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
