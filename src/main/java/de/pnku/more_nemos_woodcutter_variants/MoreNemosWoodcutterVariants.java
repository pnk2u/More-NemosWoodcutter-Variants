package de.pnku.more_nemos_woodcutter_variants;

import de.pnku.more_nemos_woodcutter_variants.block.MoreWoodcutterBlocks;
import de.pnku.more_nemos_woodcutter_variants.item.MoreWoodcutterItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreNemosWoodcutterVariants implements ModInitializer {

	public static final String MOD_ID = "more_nemos_woodcutter_variants";
	public static final String LEGACY_MOD_ID = "morenemoswoodcuttersvariants";
	public static String MOD_NAME;
    public static Logger LOGGER;

	@Override
	public void onInitialize() {
		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresentOrElse(
				modContainer -> MOD_NAME = modContainer.getMetadata().getName(),
				() -> {throw new RuntimeException("Failed to get ModContainer for " + MOD_ID);});
		LOGGER = LoggerFactory.getLogger(MOD_NAME.isEmpty() ? MOD_ID : MOD_NAME);
        LOGGER.info("Nemo's Woodcutters come in all* colors!");
		MoreWoodcutterBlocks.registerBlocks();
		MoreWoodcutterItems.registerItems();
	}

	public static ResourceLocation withModId(String path) {
		return ResourceLocation.tryBuild(MOD_ID, path);
	}

	public static ResourceLocation withLegacyModId(String path) {
		return ResourceLocation.tryBuild(LEGACY_MOD_ID, path);
	}
}