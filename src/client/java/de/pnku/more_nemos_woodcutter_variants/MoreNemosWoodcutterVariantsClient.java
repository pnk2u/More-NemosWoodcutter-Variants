package de.pnku.more_nemos_woodcutter_variants;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;

import static de.pnku.more_nemos_woodcutter_variants.block.MoreWoodcutterBlocks.more_woodcutter_blocks;

@Environment(EnvType.CLIENT)
public class MoreNemosWoodcutterVariantsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        for (Block woodcutterBlock : more_woodcutter_blocks) {
            BlockRenderLayerMap.INSTANCE.putBlock(woodcutterBlock, RenderType.cutout());
        }
    }
}
