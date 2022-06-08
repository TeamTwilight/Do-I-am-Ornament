package com.androsa.doiamornament;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.ModelBakeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;
import twilightforest.client.model.item.FullbrightBakedModel;

import java.util.Objects;
import java.util.function.UnaryOperator;

@OnlyIn(Dist.CLIENT)
@Mod.EventBusSubscriber(modid = DoIAmOrnamentMod.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientHandler {

    @SubscribeEvent
    public static void modelBake(ModelBakeEvent event) {
        fullbright(event, ModBlocks.fiery_stairs);
        fullbright(event, ModBlocks.fiery_slab);
        fullbright(event, ModBlocks.fiery_fence);
        fullbright(event, ModBlocks.fiery_trapdoor);
        fullbright(event, ModBlocks.fiery_fence_gate);
        fullbright(event, ModBlocks.fiery_door);
        fullbright(event, ModBlocks.fiery_pole);
        fullbright(event, ModBlocks.fiery_beam);
        fullbright(event, ModBlocks.fiery_wall);
        fullbright(event, ModBlocks.fiery_saddle_door);
    }

    private static void fullbright(ModelBakeEvent event, RegistryObject<? extends Block> block) {
        fullbright(event, block, op -> op);
    }

    private static void fullbright(ModelBakeEvent event, RegistryObject<? extends Block> block, UnaryOperator<FullbrightBakedModel> process) {
        fullbright(event, Objects.requireNonNull(block.getId()), "inventory", process);
        fullbright(event, Objects.requireNonNull(block.getId()), "", process);
    }

    private static void fullbright(ModelBakeEvent event, ResourceLocation rl, String state, UnaryOperator<FullbrightBakedModel> process) {
        ModelResourceLocation mrl = new ModelResourceLocation(rl, state);
        event.getModelRegistry().put(mrl, process.apply(new FullbrightBakedModel(event.getModelRegistry().get(mrl))));
    }

    public static void registerRenders() {
        renderType(ModBlocks.fiery_stairs);
        renderType(ModBlocks.fiery_slab);
        renderType(ModBlocks.fiery_fence);
        renderType(ModBlocks.ironwood_trapdoor);
        renderType(ModBlocks.fiery_trapdoor);
        renderType(ModBlocks.steeleaf_trapdoor);
        renderType(ModBlocks.arctic_fur_trapdoor);
        renderType(ModBlocks.carminite_trapdoor);
        renderType(ModBlocks.twilight_oak_log_trapdoor);
        renderType(ModBlocks.canopy_log_trapdoor);
        renderType(ModBlocks.mangrove_log_trapdoor);
        renderType(ModBlocks.dark_oak_log_trapdoor);
        renderType(ModBlocks.time_log_trapdoor);
        renderType(ModBlocks.transformation_log_trapdoor);
        renderType(ModBlocks.mining_log_trapdoor);
        renderType(ModBlocks.sorting_log_trapdoor);
        renderType(ModBlocks.fiery_fence_gate);
        renderType(ModBlocks.ironwood_door);
        renderType(ModBlocks.fiery_door);
        renderType(ModBlocks.steeleaf_door);
        renderType(ModBlocks.arctic_fur_door);
        renderType(ModBlocks.carminite_door);
        renderType(ModBlocks.twilight_oak_log_door);
        renderType(ModBlocks.canopy_log_door);
        renderType(ModBlocks.mangrove_log_door);
        renderType(ModBlocks.dark_oak_log_door);
        renderType(ModBlocks.time_log_door);
        renderType(ModBlocks.transformation_log_door);
        renderType(ModBlocks.mining_log_door);
        renderType(ModBlocks.sorting_log_door);
        renderType(ModBlocks.fiery_pole);
        renderType(ModBlocks.fiery_beam);
        renderType(ModBlocks.fiery_wall);
        renderType(ModBlocks.ironwood_saddle_door);
        renderType(ModBlocks.fiery_saddle_door);
        renderType(ModBlocks.steeleaf_saddle_door);
        renderType(ModBlocks.arctic_fur_saddle_door);
        renderType(ModBlocks.carminite_saddle_door);
        renderType(ModBlocks.twilight_oak_log_saddle_door);
        renderType(ModBlocks.canopy_log_saddle_door);
        renderType(ModBlocks.mangrove_log_saddle_door);
        renderType(ModBlocks.dark_oak_log_saddle_door);
        renderType(ModBlocks.time_log_saddle_door);
        renderType(ModBlocks.transformation_log_saddle_door);
        renderType(ModBlocks.mining_log_saddle_door);
        renderType(ModBlocks.sorting_log_saddle_door);
        renderType(ModBlocks.twilight_oak_plank_saddle_door);
        renderType(ModBlocks.canopy_plank_saddle_door);
        renderType(ModBlocks.mangrove_plank_saddle_door);
        renderType(ModBlocks.dark_oak_plank_saddle_door);
        renderType(ModBlocks.time_plank_saddle_door);
        renderType(ModBlocks.transformation_plank_saddle_door);
        renderType(ModBlocks.mining_plank_saddle_door);
        renderType(ModBlocks.sorting_plank_saddle_door);
    }

    private static void renderType(RegistryObject<? extends Block> block) {
        ItemBlockRenderTypes.setRenderLayer(block.get(), RenderType.cutout());
    }
}
