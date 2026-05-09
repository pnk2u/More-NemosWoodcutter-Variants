package de.pnku.more_nemos_woodcutter_variants;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;

import static de.pnku.morenemoswoodcuttervariants.block.WoodcutterVariantBlocks.more_woodcutters;

@Environment(EnvType.CLIENT)
public class MoreNemosWoodcutterVariantsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        for (Block woodcutterBlock : more_woodcutters) {
            BlockRenderLayerMap.INSTANCE.putBlock(woodcutterBlock, RenderType.cutout());
        }
    }
}
