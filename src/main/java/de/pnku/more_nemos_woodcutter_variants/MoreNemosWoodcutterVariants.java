package de.pnku.more_nemos_woodcutter_variants;

import de.pnku.more_nemos_woodcutter_variants.block.MoreWoodcutterBlocks;
import de.pnku.more_nemos_woodcutter_variants.item.MoreWoodcutterItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreNemosWoodcutterVariants implements ModInitializer {

	public static final String MOD_ID = "more_nemos_woodcutter_variants";
	public static final String LEGACY_MOD_ID = "morenemoswoodcuttersvariants";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Nemo's Woodcutters come in all* colors!");
		MoreWoodcutterBlocks.registerBlocks();
		MoreWoodcutterItems.registerItems();
	}

	public static Identifier withModId(String path) {
		return Identifier.tryBuild(MOD_ID, path);
	}

	public static ResourceLocation withLegacyModId(String path) {
		return ResourceLocation.tryBuild(LEGACY_MOD_ID, path);
	}
}