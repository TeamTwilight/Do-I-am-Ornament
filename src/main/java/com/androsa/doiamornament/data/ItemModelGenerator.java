package com.androsa.doiamornament.data;

import com.androsa.doiamornament.DoIAmOrnamentMod;
import com.androsa.doiamornament.ModBlocks;
import com.androsa.ornamental.data.provider.OrnamentalItemModelProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.loaders.ItemLayerModelBuilder;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import twilightforest.TwilightForestMod;

import java.util.Optional;
import java.util.function.Supplier;

public class ItemModelGenerator extends OrnamentalItemModelProvider {

    public ItemModelGenerator(PackOutput output, ExistingFileHelper helper) {
        super(output, DoIAmOrnamentMod.MODID, helper);
    }

    @NotNull
    @Override
    public String getName() {
        return "Do I am Ornament Item Models";
    }

    @Override
    protected void registerModels() {
        blockItem(ModBlocks.ironwood_stairs);
        blockItemFiery(ModBlocks.fiery_stairs);
        blockItem(ModBlocks.steeleaf_stairs);
        blockItem(ModBlocks.arctic_fur_stairs);
        blockItem(ModBlocks.carminite_stairs);
        blockItem(ModBlocks.twilight_oak_log_stairs);
        blockItem(ModBlocks.canopy_log_stairs);
        blockItem(ModBlocks.mangrove_log_stairs);
        blockItem(ModBlocks.dark_oak_log_stairs);
        blockItem(ModBlocks.time_log_stairs);
        blockItem(ModBlocks.transformation_log_stairs);
        blockItem(ModBlocks.mining_log_stairs);
        blockItem(ModBlocks.sorting_log_stairs);

        blockItem(ModBlocks.ironwood_slab);
        blockItemFiery(ModBlocks.fiery_slab);
        blockItem(ModBlocks.steeleaf_slab);
        blockItem(ModBlocks.arctic_fur_slab);
        blockItem(ModBlocks.carminite_slab);
        blockItem(ModBlocks.twilight_oak_log_slab);
        blockItem(ModBlocks.canopy_log_slab);
        blockItem(ModBlocks.mangrove_log_slab);
        blockItem(ModBlocks.dark_oak_log_slab);
        blockItem(ModBlocks.time_log_slab);
        blockItem(ModBlocks.transformation_log_slab);
        blockItem(ModBlocks.mining_log_slab);
        blockItem(ModBlocks.sorting_log_slab);

        blockItemFence(ModBlocks.ironwood_fence, "ironwood_block");
        blockItemFence(ModBlocks.steeleaf_fence, "steeleaf_block");
        blockItemFence(ModBlocks.arctic_fur_fence, "arctic_fur_block");
        blockItemFence(ModBlocks.carminite_fence, "carminite_block");
        blockItemFence(ModBlocks.twilight_oak_log_fence, "twilight_oak_log", "twilight_oak_log_top");
        blockItemFence(ModBlocks.canopy_log_fence, "canopy_log", "canopy_log_top");
        blockItemFence(ModBlocks.mangrove_log_fence, "mangrove_log", "mangrove_log_top");
        blockItemFence(ModBlocks.dark_oak_log_fence, "dark_log", "dark_log_top");
        blockItemFence(ModBlocks.time_log_fence, "time_log", "time_log_top");
        blockItemFence(ModBlocks.transformation_log_fence, "transformation_log", "transformation_log_top");
        blockItemFence(ModBlocks.mining_log_fence, "mining_log", "mining_log_top");
        blockItemFence(ModBlocks.sorting_log_fence, "sorting_log", "sorting_log_top");

        blockItemTrapdoor(ModBlocks.ironwood_trapdoor);
        blockItemTrapdoorExist(ModBlocks.fiery_trapdoor, "fiery");
        blockItemTrapdoor(ModBlocks.steeleaf_trapdoor);
        blockItemTrapdoor(ModBlocks.arctic_fur_trapdoor);
        blockItemTrapdoorExist(ModBlocks.carminite_trapdoor, "carminite");
        blockItemTrapdoor(ModBlocks.twilight_oak_log_trapdoor);
        blockItemTrapdoor(ModBlocks.canopy_log_trapdoor);
        blockItemTrapdoor(ModBlocks.mangrove_log_trapdoor);
        blockItemTrapdoor(ModBlocks.dark_oak_log_trapdoor);
        blockItemTrapdoor(ModBlocks.time_log_trapdoor);
        blockItemTrapdoor(ModBlocks.transformation_log_trapdoor);
        blockItemTrapdoor(ModBlocks.mining_log_trapdoor);
        blockItemTrapdoor(ModBlocks.sorting_log_trapdoor);

        blockItem(ModBlocks.ironwood_fence_gate);
        blockItemFiery(ModBlocks.fiery_fence_gate);
        blockItem(ModBlocks.steeleaf_fence_gate);
        blockItem(ModBlocks.arctic_fur_fence_gate);
        blockItem(ModBlocks.carminite_fence_gate);
        blockItem(ModBlocks.twilight_oak_log_fence_gate);
        blockItem(ModBlocks.canopy_log_fence_gate);
        blockItem(ModBlocks.mangrove_log_fence_gate);
        blockItem(ModBlocks.dark_oak_log_fence_gate);
        blockItem(ModBlocks.time_log_fence_gate);
        blockItem(ModBlocks.transformation_log_fence_gate);
        blockItem(ModBlocks.mining_log_fence_gate);
        blockItem(ModBlocks.sorting_log_fence_gate);

        blockItemModel(ModBlocks.ironwood_door);
        blockItemDoorEmissive(ModBlocks.fiery_door, 15, modLoc("item/fiery_door"));
        blockItemModel(ModBlocks.steeleaf_door);
        blockItemModel(ModBlocks.arctic_fur_door);
        blockItemDoorEmissive(ModBlocks.carminite_door, 7, modLoc("item/carminite_door"));
        blockItemModel(ModBlocks.twilight_oak_log_door);
        blockItemModel(ModBlocks.canopy_log_door);
        blockItemModel(ModBlocks.mangrove_log_door);
        blockItemModel(ModBlocks.dark_oak_log_door);
        blockItemModel(ModBlocks.time_log_door);
        blockItemModel(ModBlocks.transformation_log_door);
        blockItemModel(ModBlocks.mining_log_door);
        blockItemModel(ModBlocks.sorting_log_door);

        blockItemPole(ModBlocks.ironwood_pole, "ironwood_block");
        blockItemPole(ModBlocks.steeleaf_pole, "steeleaf_block");
        blockItemPole(ModBlocks.arctic_fur_pole, "arctic_fur_block");
        blockItemPole(ModBlocks.carminite_pole, "carminite_block");
        blockItemPole(ModBlocks.twilight_oak_log_pole, "twilight_oak_log_top", "twilight_oak_log");
        blockItemPole(ModBlocks.canopy_log_pole, "canopy_log_top", "canopy_log");
        blockItemPole(ModBlocks.mangrove_log_pole, "mangrove_log_top", "mangrove_log");
        blockItemPole(ModBlocks.dark_oak_log_pole, "dark_log_top", "dark_log");
        blockItemPole(ModBlocks.time_log_pole, "time_log_top", "time_log");
        blockItemPole(ModBlocks.transformation_log_pole, "transformation_log_top", "transformation_log");
        blockItemPole(ModBlocks.mining_log_pole, "mining_log_top", "mining_log");
        blockItemPole(ModBlocks.sorting_log_pole, "sorting_log_top", "sorting_log");
        blockItemPole(ModBlocks.twilight_oak_plank_pole, "wood/planks_twilight_oak_0");
        blockItemPole(ModBlocks.canopy_plank_pole, "wood/planks_canopy_0");
        blockItemPole(ModBlocks.mangrove_plank_pole, "wood/planks_mangrove_0");
        blockItemPole(ModBlocks.dark_oak_plank_pole, "wood/planks_darkwood_0");
        blockItemPole(ModBlocks.time_plank_pole, "wood/planks_time_0");
        blockItemPole(ModBlocks.transformation_plank_pole, "wood/planks_trans_0");
        blockItemPole(ModBlocks.mining_plank_pole, "wood/planks_mine_0");
        blockItemPole(ModBlocks.sorting_plank_pole, "wood/planks_sort_0");

        blockItemBeam(ModBlocks.ironwood_beam, "ironwood_block");
        blockItemBeam(ModBlocks.steeleaf_beam, "steeleaf_block");
        blockItemBeam(ModBlocks.arctic_fur_beam, "arctic_fur_block");
        blockItemBeam(ModBlocks.carminite_beam, "carminite_block");
        blockItemBeam(ModBlocks.twilight_oak_log_beam, "twilight_oak_log_top", "twilight_oak_log");
        blockItemBeam(ModBlocks.canopy_log_beam, "canopy_log_top", "canopy_log");
        blockItemBeam(ModBlocks.mangrove_log_beam, "mangrove_log_top", "mangrove_log");
        blockItemBeam(ModBlocks.dark_oak_log_beam, "dark_log_top", "dark_log");
        blockItemBeam(ModBlocks.time_log_beam, "time_log_top", "time_log");
        blockItemBeam(ModBlocks.transformation_log_beam, "transformation_log_top", "transformation_log");
        blockItemBeam(ModBlocks.mining_log_beam, "mining_log_top", "mining_log");
        blockItemBeam(ModBlocks.sorting_log_beam, "sorting_log_top", "sorting_log");
        blockItemBeam(ModBlocks.twilight_oak_plank_beam, "wood/planks_twilight_oak_0");
        blockItemBeam(ModBlocks.canopy_plank_beam, "wood/planks_canopy_0");
        blockItemBeam(ModBlocks.mangrove_plank_beam, "wood/planks_mangrove_0");
        blockItemBeam(ModBlocks.dark_oak_plank_beam, "wood/planks_darkwood_0");
        blockItemBeam(ModBlocks.time_plank_beam, "wood/planks_time_0");
        blockItemBeam(ModBlocks.transformation_plank_beam, "wood/planks_trans_0");
        blockItemBeam(ModBlocks.mining_plank_beam, "wood/planks_mine_0");
        blockItemBeam(ModBlocks.sorting_plank_beam, "wood/planks_sort_0");

        blockItemWall(ModBlocks.ironwood_wall, "ironwood_block");
        blockItemWall(ModBlocks.steeleaf_wall, "steeleaf_block");
        blockItemWall(ModBlocks.arctic_fur_wall, "arctic_fur_block");
        blockItemWall(ModBlocks.carminite_wall, "carminite_block");
        blockItemWall(ModBlocks.twilight_oak_log_wall, "twilight_oak_log", "twilight_oak_log_top");
        blockItemWall(ModBlocks.canopy_log_wall, "canopy_log", "canopy_log_top");
        blockItemWall(ModBlocks.mangrove_log_wall, "mangrove_log", "mangrove_log_top");
        blockItemWall(ModBlocks.dark_oak_log_wall, "dark_log", "dark_log_top");
        blockItemWall(ModBlocks.time_log_wall, "time_log", "time_log_top");
        blockItemWall(ModBlocks.transformation_log_wall, "transformation_log", "transformation_log_top");
        blockItemWall(ModBlocks.mining_log_wall, "mining_log", "mining_log_top");
        blockItemWall(ModBlocks.sorting_log_wall, "sorting_log", "sorting_log_top");
        blockItemWall(ModBlocks.twilight_oak_plank_wall, "wood/planks_twilight_oak_0");
        blockItemWall(ModBlocks.canopy_plank_wall, "wood/planks_canopy_0");
        blockItemWall(ModBlocks.mangrove_plank_wall, "wood/planks_mangrove_0");
        blockItemWall(ModBlocks.dark_oak_plank_wall, "wood/planks_darkwood_0");
        blockItemWall(ModBlocks.time_plank_wall, "wood/planks_time_0");
        blockItemWall(ModBlocks.transformation_plank_wall, "wood/planks_trans_0");
        blockItemWall(ModBlocks.mining_plank_wall, "wood/planks_mine_0");
        blockItemWall(ModBlocks.sorting_plank_wall, "wood/planks_sort_0");

        blockItemSaddleDoor(ModBlocks.ironwood_saddle_door, "ironwood");
        blockItemSaddleDoor(ModBlocks.steeleaf_saddle_door, "steeleaf");
        blockItemSaddleDoor(ModBlocks.arctic_fur_saddle_door, "arctic_fur");
        blockItemSaddleDoorTF(ModBlocks.twilight_oak_log_saddle_door, "twilight_oak_log");
        blockItemSaddleDoorTF(ModBlocks.canopy_log_saddle_door, "canopy_log");
        blockItemSaddleDoorTF(ModBlocks.mangrove_log_saddle_door, "mangrove_log");
        blockItemSaddleDoorTF(ModBlocks.dark_oak_log_saddle_door, "dark_log");
        blockItemSaddleDoorTF(ModBlocks.time_log_saddle_door, "time_log");
        blockItemSaddleDoorTF(ModBlocks.transformation_log_saddle_door, "transformation_log");
        blockItemSaddleDoorTF(ModBlocks.mining_log_saddle_door, "mining_log");
        blockItemSaddleDoorTF(ModBlocks.sorting_log_saddle_door, "sorting_log");
        blockItemSaddleDoorTF(ModBlocks.twilight_oak_plank_saddle_door, "wood/trapdoor/twilight_oak_trapdoor");
        blockItemSaddleDoorTF(ModBlocks.canopy_plank_saddle_door, "wood/trapdoor/canopy_trapdoor");
        blockItemSaddleDoorTF(ModBlocks.mangrove_plank_saddle_door, "wood/trapdoor/mangrove_trapdoor");
        blockItemSaddleDoorTF(ModBlocks.dark_oak_plank_saddle_door, "wood/trapdoor/darkwood_trapdoor");
        blockItemSaddleDoorTF(ModBlocks.time_plank_saddle_door, "wood/trapdoor/time_trapdoor");
        blockItemSaddleDoorTF(ModBlocks.transformation_plank_saddle_door, "wood/trapdoor/trans_trapdoor");
        blockItemSaddleDoorTF(ModBlocks.mining_plank_saddle_door, "wood/trapdoor/mine_trapdoor");
        blockItemSaddleDoorTF(ModBlocks.sorting_plank_saddle_door, "wood/trapdoor/sort_trapdoor");
    }

    public void blockItemFiery(Supplier<? extends Block> block) {
        String name = this.blockName(block);
        this.withExistingParent(name, this.modLoc("block/fiery/" + name));
    }

    @Override
    public void blockItemFence(Supplier<? extends Block> block, String name) {
        this.blockItemFence(block, name, name);
    }

    @Override
    public void blockItemFence(Supplier<? extends Block> block, String side, String top) {
        ResourceLocation toptex = TwilightForestMod.prefix("block/" + top);
        this.blockItemFence(block, TwilightForestMod.prefix("block/" + side), toptex, toptex);
    }

    public void blockItemDoorEmissive(Supplier<? extends Block> block, int level, ResourceLocation... textures) {
        ItemModelBuilder builder = existingParent(block, mcLoc("item/generated"));
        for (int i = 0; i < textures.length; i++) {
            builder = builder.texture("layer" + i, textures[i]);
        }
        builder.customLoader(ItemLayerModelBuilder::begin).emissive(level, level, 0).renderType("forge:forge_entity_unsorted_translucent", 0).end();
    }

    public void blockItemTrapdoorExist(Supplier<? extends Block> block, String dir) {
        String name = this.blockName(block);
        this.withExistingParent(name, this.modLoc(String.format("block/%s/%s_bottom", dir, name)));
    }

    @Override
    public void blockItemPole(Supplier<? extends Block> block, String name) {
        this.blockItemPole(block, name, name);
    }

    @Override
    public void blockItemPole(Supplier<? extends Block> block, String end, String side) {
        ResourceLocation toptex = TwilightForestMod.prefix("block/" + end);
        this.blockItemPole(block, toptex, toptex, TwilightForestMod.prefix("block/" + side), Optional.empty());
    }

    @Override
    public void blockItemBeam(Supplier<? extends Block> block, String name) {
        this.blockItemBeam(block, name, name);
    }

    @Override
    public void blockItemBeam(Supplier<? extends Block> block, String end, String side) {
        ResourceLocation toptex = TwilightForestMod.prefix("block/" + end);
        this.blockItemBeam(block, toptex, toptex, TwilightForestMod.prefix("block/" + side));
    }

    @Override
    public void blockItemWall(Supplier<? extends Block> block, String name) {
        this.blockItemWall(block, name, name);
    }

    @Override
    public void blockItemWall(Supplier<? extends Block> block, String side, String top) {
        ResourceLocation toptex = TwilightForestMod.prefix("block/" + top);
        this.blockItemWall(block, TwilightForestMod.prefix("block/" + side), toptex, toptex);
    }

    public void blockItemSaddleDoorTF(Supplier<? extends Block> block, String name) {
        ResourceLocation tex = TwilightForestMod.prefix("block/" + name);
        this.blockItemSaddleDoor(block, tex, tex, tex);
    }
}
