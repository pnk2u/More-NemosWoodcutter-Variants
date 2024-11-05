package de.pnku.morenemoswoodcuttervariants;

import de.pnku.morenemoswoodcuttervariants.block.WoodcutterVariantBlocks;
import de.pnku.morenemoswoodcuttervariants.item.WoodcutterVariantItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreNemosWoodcutterVariants implements ModInitializer {

	public static final String MOD_ID = "morenemoswoodcuttervariants";
    public static final Logger log = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        WoodcutterVariantBlocks.registerBlocks();
        WoodcutterVariantItems.registerItems();
		log.info("Nemo's Woodcutters come in all* colors!");
	}
}