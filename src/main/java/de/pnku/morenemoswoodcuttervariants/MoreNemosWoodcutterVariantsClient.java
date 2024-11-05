package de.pnku.morenemoswoodcuttervariants;

import de.pnku.morenemoswoodcuttervariants.block.ModVariantBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

@Environment(EnvType.CLIENT)
public class MoreNemosWoodcutterVariantsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModVariantBlocks.ACACIA_WOODCUTTER_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVariantBlocks.BAMBOO_WOODCUTTER_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVariantBlocks.BIRCH_WOODCUTTER_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVariantBlocks.CHERRY_WOODCUTTER_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVariantBlocks.CRIMSON_WOODCUTTER_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVariantBlocks.DARK_OAK_WOODCUTTER_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVariantBlocks.JUNGLE_WOODCUTTER_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVariantBlocks.MANGROVE_WOODCUTTER_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVariantBlocks.SPRUCE_WOODCUTTER_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModVariantBlocks.WARPED_WOODCUTTER_BLOCK, RenderLayer.getCutout());
    }
}
