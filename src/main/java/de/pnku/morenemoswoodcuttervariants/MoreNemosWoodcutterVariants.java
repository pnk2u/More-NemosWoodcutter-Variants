package de.pnku.morenemoswoodcuttervariants;

import de.pnku.morenemoswoodcuttervariants.block.WoodcutterVariantBlocks;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreNemosWoodcutterVariants implements ModInitializer {

	public static final String MOD_ID = "morenemoswoodcuttervariants";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Nemoʼs Woodcutters come in all* colors!");
		WoodcutterVariantBlocks.registerBlocks();
	}
}