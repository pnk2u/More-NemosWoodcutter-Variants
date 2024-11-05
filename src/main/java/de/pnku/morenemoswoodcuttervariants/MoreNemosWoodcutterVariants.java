package de.pnku.morenemoswoodcuttervariants;

import de.pnku.morenemoswoodcuttervariants.block.ModVariantBlocks;
import de.pnku.morenemoswoodcuttervariants.item.ModVariantItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreNemosWoodcutterVariants implements ModInitializer {

	public static final String MOD_ID = "morenemoswoodcuttervariants";
    public static final Logger log = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModVariantBlocks.registerBlocks();
		ModVariantItems.registerItems();
		log.info("Nemo's Woodcutters come in all* colors!");
	}
}