package com.androsa.doiamornament;

import com.androsa.doiamornament.block.*;
import com.androsa.doiamornament.data.BlockTagGenerator;
import com.androsa.doiamornament.data.ItemTagGenerator;
import com.androsa.ornamental.registry.helper.MasterRegistryHelper;
import com.google.common.collect.Lists;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class TFRegistryHelper extends MasterRegistryHelper {

    public TFRegistryHelper(DeferredRegister<Block> blockreg, DeferredRegister<Item> itemreg) {
        super(blockreg, itemreg);
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

    @Override
    protected TagHelper supportTags() {
        return new TagHelper(
                array(BlockTagGenerator.SUPPORTS),
                array(ItemTagGenerator.SUPPORTS));
    }

    public Supplier<OrnamentTFStairs> stairs(TFOrnamentBuilder builder) {
        return this.stairs(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public Supplier<OrnamentTFStairs> stairs(TFOrnamentBuilder builder, ArrayList<List<Supplier<? extends Block>>> blocktags, ArrayList<List<Supplier<? extends Block>>> itemtags) {
        return this.stairs(builder, blocktags, itemtags, OrnamentTFStairs::new);
    }

    public Supplier<OrnamentTFSlab> slab(TFOrnamentBuilder builder) {
        return this.slab(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public Supplier<OrnamentTFSlab> slab(TFOrnamentBuilder builder, ArrayList<List<Supplier<? extends Block>>> blocktags, ArrayList<List<Supplier<? extends Block>>> itemtags) {
        return this.slab(builder, blocktags, itemtags, OrnamentTFSlab::new);
    }

    public Supplier<OrnamentTFFence> fence(TFOrnamentBuilder builder) {
        return this.fence(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public Supplier<OrnamentTFFence> fence(TFOrnamentBuilder builder, ArrayList<List<Supplier<? extends Block>>> blocktags, ArrayList<List<Supplier<? extends Block>>> itemtags) {
        return this.fence(builder, blocktags, itemtags, OrnamentTFFence::new);
    }

    public Supplier<OrnamentTFTrapdoor> trapdoor(TFOrnamentBuilder builder) {
        return this.trapdoor(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public Supplier<OrnamentTFTrapdoor> trapdoor(TFOrnamentBuilder builder, ArrayList<List<Supplier<? extends Block>>> blocktags, ArrayList<List<Supplier<? extends Block>>> itemtags) {
        return this.trapdoor(builder, blocktags, itemtags, OrnamentTFTrapdoor::new);
    }

    public Supplier<OrnamentTFFenceGate> fencegate(TFOrnamentBuilder builder) {
        return this.fencegate(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public Supplier<OrnamentTFFenceGate> fencegate(TFOrnamentBuilder builder, ArrayList<List<Supplier<? extends Block>>> blocktags, ArrayList<List<Supplier<? extends Block>>> itemtags) {
        return this.fencegate(builder, blocktags, itemtags, OrnamentTFFenceGate::new);
    }

    public Supplier<OrnamentTFDoor> door(TFOrnamentBuilder builder) {
        return this.door(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public Supplier<OrnamentTFDoor> door(TFOrnamentBuilder builder, ArrayList<List<Supplier<? extends Block>>> blocktags, ArrayList<List<Supplier<? extends Block>>> itemtags) {
        return this.door(builder, blocktags, itemtags, OrnamentTFDoor::new);
    }

    public Supplier<OrnamentTFPole> pole(TFOrnamentBuilder builder) {
        return this.pole(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public Supplier<OrnamentTFPole> pole(TFOrnamentBuilder builder, ArrayList<List<Supplier<? extends Block>>> blocktags, ArrayList<List<Supplier<? extends Block>>> itemtags) {
        return this.pole(builder, blocktags, itemtags, OrnamentTFPole::new);
    }

    public Supplier<OrnamentTFBeam> beam(TFOrnamentBuilder builder) {
        return this.beam(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public Supplier<OrnamentTFBeam> beam(TFOrnamentBuilder builder, ArrayList<List<Supplier<? extends Block>>> blocktags, ArrayList<List<Supplier<? extends Block>>> itemtags) {
        return this.beam(builder, blocktags, itemtags, OrnamentTFBeam::new);
    }

    public Supplier<OrnamentTFWall> wall(TFOrnamentBuilder builder) {
        return this.wall(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public Supplier<OrnamentTFWall> wall(TFOrnamentBuilder builder, ArrayList<List<Supplier<? extends Block>>> blocktags, ArrayList<List<Supplier<? extends Block>>> itemtags) {
        return this.wall(builder, blocktags, itemtags, OrnamentTFWall::new);
    }

    public Supplier<OrnamentTFSaddleDoor> saddledoor(TFOrnamentBuilder builder) {
        return this.saddledoor(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public Supplier<OrnamentTFSaddleDoor> saddledoor(TFOrnamentBuilder builder, ArrayList<List<Supplier<? extends Block>>> blocktags, ArrayList<List<Supplier<? extends Block>>> itemtags) {
        return this.saddledoor(builder, blocktags, itemtags, OrnamentTFSaddleDoor::new);
    }

    public Supplier<OrnamentTFSupport> support(TFOrnamentBuilder builder) {
        return this.support(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public Supplier<OrnamentTFSupport> support(TFOrnamentBuilder builder, ArrayList<List<Supplier<? extends Block>>> blocktags, ArrayList<List<Supplier<? extends Block>>> itemtags) {
        return this.support(builder, blocktags, itemtags, OrnamentTFSupport::new);
    }
}
