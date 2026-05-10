package de.pnku.more_nemos_woodcutter_variants;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.world.level.block.Block;

import static de.pnku.more_nemos_woodcutter_variants.block.WoodcutterVariantBlocks.more_woodcutters;

@Environment(EnvType.CLIENT)
public class MoreNemosWoodcutterVariantsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        String mcVersion = FabricLoader.getInstance().getModContainer("minecraft").get().getMetadata().getVersion().getFriendlyString();
        boolean isLegacy = mcVersion.contains("1.21.4") || mcVersion.contains("1.21.5");
        boolean isDev = FabricLoader.getInstance().isDevelopmentEnvironment();
        for (Block woodcutterBlock : more_woodcutters) {
            if (isLegacy) {legacyAddToRenderLayerMap(woodcutterBlock);}
            else {addToRenderLayerMap(woodcutterBlock, isDev);}
        }
    }

    private void legacyAddToRenderLayerMap(Block block) {
        try {
            Class<?> legacyBlockRenderLayerMap = Class.forName("net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap");
            Class<?> renderTypeClass = Class.forName("net.minecraft.class_1921");
            legacyBlockRenderLayerMap.getMethod("putBlock", Block.class, renderTypeClass)
                    .invoke(legacyBlockRenderLayerMap.getField("INSTANCE").get(null), block, renderTypeClass.getMethod("method_23581").invoke(null));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void addToRenderLayerMap(Block block, boolean isDev) {
        try {
            Class<?> blockRenderLayerMap = Class.forName("net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap");
            String chunkSectionLayerClassName = isDev ? "net.minecraft.client.renderer.chunk.ChunkSectionLayer" : "net.minecraft.class_11515";
            Class<?> chunkSectionLayerClass = Class.forName(chunkSectionLayerClassName);
            blockRenderLayerMap.getMethod("putBlock", Block.class, chunkSectionLayerClass)
                    .invoke(null, block, chunkSectionLayerClass.getEnumConstants()[2]);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // print runtime classpath for debugging
        String classpath = System.getProperty("java.class.path");
        MoreNemosWoodcutterVariants.LOGGER.info("Runtime classpath: " + classpath);
    }
}
