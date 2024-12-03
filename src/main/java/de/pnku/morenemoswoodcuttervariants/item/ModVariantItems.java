package de.pnku.morenemoswoodcuttervariants.item;

import com.nemonotfound.nemos.woodcutter.block.ModBlocks;
import com.nemonotfound.nemos.woodcutter.item.ModItems;
import de.pnku.morenemoswoodcuttervariants.MoreNemosWoodcutterVariants;
import de.pnku.morenemoswoodcuttervariants.block.ModVariantBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

import static net.minecraft.world.item.Items.*;

public class ModVariantItems {

public static final Item ACACIA_WOODCUTTER_ITEM = registerBlock(ModVariantBlocks.ACACIA_WOODCUTTER_BLOCK);
public static final Item BAMBOO_WOODCUTTER_ITEM = registerBlock(ModVariantBlocks.BAMBOO_WOODCUTTER_BLOCK);
public static final Item BIRCH_WOODCUTTER_ITEM = registerBlock(ModVariantBlocks.BIRCH_WOODCUTTER_BLOCK);
public static final Item CHERRY_WOODCUTTER_ITEM = registerBlock(ModVariantBlocks.CHERRY_WOODCUTTER_BLOCK);
public static final Item CRIMSON_WOODCUTTER_ITEM = registerBlock(ModVariantBlocks.CRIMSON_WOODCUTTER_BLOCK);
public static final Item DARK_OAK_WOODCUTTER_ITEM = registerBlock(ModVariantBlocks.DARK_OAK_WOODCUTTER_BLOCK);
public static final Item PALE_OAK_WOODCUTTER_ITEM = registerBlock(ModVariantBlocks.PALE_OAK_WOODCUTTER_BLOCK);
public static final Item JUNGLE_WOODCUTTER_ITEM = registerBlock(ModVariantBlocks.JUNGLE_WOODCUTTER_BLOCK);
public static final Item MANGROVE_WOODCUTTER_ITEM = registerBlock(ModVariantBlocks.MANGROVE_WOODCUTTER_BLOCK);
public static final Item SPRUCE_WOODCUTTER_ITEM = registerBlock(ModVariantBlocks.SPRUCE_WOODCUTTER_BLOCK);
public static final Item WARPED_WOODCUTTER_ITEM = registerBlock(ModVariantBlocks.WARPED_WOODCUTTER_BLOCK);

    public static void registerItems() {
        MoreNemosWoodcutterVariants.log.info("Register Woodcutter Variant items");

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(content -> content.addAfter(ModBlocks.WOODCUTTER.get(),
                ModVariantBlocks.ACACIA_WOODCUTTER_BLOCK));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(content -> content.addAfter(ModVariantBlocks.ACACIA_WOODCUTTER_BLOCK,
                ModVariantBlocks.BAMBOO_WOODCUTTER_BLOCK));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(content -> content.addAfter(ModVariantBlocks.BAMBOO_WOODCUTTER_BLOCK,
                ModVariantBlocks.BIRCH_WOODCUTTER_BLOCK));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(content -> content.addAfter(ModVariantBlocks.BIRCH_WOODCUTTER_BLOCK,
                ModVariantBlocks.CHERRY_WOODCUTTER_BLOCK));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(content -> content.addAfter(ModVariantBlocks.CHERRY_WOODCUTTER_BLOCK,
                ModVariantBlocks.CRIMSON_WOODCUTTER_BLOCK));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(content -> content.addAfter(ModVariantBlocks.CRIMSON_WOODCUTTER_BLOCK,
                ModVariantBlocks.DARK_OAK_WOODCUTTER_BLOCK));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(content -> content.addAfter(ModVariantBlocks.CRIMSON_WOODCUTTER_BLOCK,
                ModVariantBlocks.PALE_OAK_WOODCUTTER_BLOCK));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(content -> content.addAfter(ModVariantBlocks.PALE_OAK_WOODCUTTER_BLOCK,
                ModVariantBlocks.JUNGLE_WOODCUTTER_BLOCK));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(content -> content.addAfter(ModVariantBlocks.JUNGLE_WOODCUTTER_BLOCK,
                ModVariantBlocks.MANGROVE_WOODCUTTER_BLOCK));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(content -> content.addAfter(ModVariantBlocks.MANGROVE_WOODCUTTER_BLOCK,
                ModVariantBlocks.SPRUCE_WOODCUTTER_BLOCK));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(content -> content.addAfter(ModVariantBlocks.SPRUCE_WOODCUTTER_BLOCK,
                ModVariantBlocks.WARPED_WOODCUTTER_BLOCK));
    }
}
