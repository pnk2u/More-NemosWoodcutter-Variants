package de.pnku.morenemoswoodcuttervariants;

import de.pnku.morenemoswoodcuttervariants.block.WoodcutterVariantBlocks;
import de.pnku.morenemoswoodcuttervariants.item.WoodcutterVariantItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreNemosWoodcutterVariants implements ModInitializer {

	public static final String MOD_ID = "morenemoswoodcuttervariants";
    public static final Logger log = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		if (FabricLoader.getInstance().getAllMods().stream()
				.noneMatch(mod -> {
				String modId = mod.getMetadata().getId();
				 return (modId.startsWith("nemo") && modId.endsWith("woodcutter"));
				})) {
			throw new RuntimeException("\"More Nemo\'s Woodcutter Variants\" requires a version of \"Nemo\'s Woodcutter\" to be installed but couldn't find any.");
		}
        WoodcutterVariantBlocks.registerBlocks();
        WoodcutterVariantItems.registerItems();
		log.info("Nemo's Woodcutters come in all* colors!");
	}
}