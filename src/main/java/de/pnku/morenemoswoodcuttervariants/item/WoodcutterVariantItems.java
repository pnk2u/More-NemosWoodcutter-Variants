package de.pnku.morenemoswoodcuttervariants.item;

import com.nemonotfound.nemos.woodcutter.block.ModBlocks;
import de.pnku.morenemoswoodcuttervariants.MoreNemosWoodcutterVariants;
import de.pnku.morenemoswoodcuttervariants.block.WoodcutterVariantBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

import static net.minecraft.world.item.Items.*;

public class WoodcutterVariantItems {

public static final Item ACACIA_WOODCUTTER_ITEM = registerBlock(WoodcutterVariantBlocks.ACACIA_WOODCUTTER_BLOCK);
public static final Item BAMBOO_WOODCUTTER_ITEM = registerBlock(WoodcutterVariantBlocks.BAMBOO_WOODCUTTER_BLOCK);
public static final Item BIRCH_WOODCUTTER_ITEM = registerBlock(WoodcutterVariantBlocks.BIRCH_WOODCUTTER_BLOCK);
public static final Item CHERRY_WOODCUTTER_ITEM = registerBlock(WoodcutterVariantBlocks.CHERRY_WOODCUTTER_BLOCK);
public static final Item CRIMSON_WOODCUTTER_ITEM = registerBlock(WoodcutterVariantBlocks.CRIMSON_WOODCUTTER_BLOCK);
public static final Item DARK_OAK_WOODCUTTER_ITEM = registerBlock(WoodcutterVariantBlocks.DARK_OAK_WOODCUTTER_BLOCK);
public static final Item PALE_OAK_WOODCUTTER_ITEM = registerBlock(WoodcutterVariantBlocks.PALE_OAK_WOODCUTTER_BLOCK);
public static final Item JUNGLE_WOODCUTTER_ITEM = registerBlock(WoodcutterVariantBlocks.JUNGLE_WOODCUTTER_BLOCK);
public static final Item MANGROVE_WOODCUTTER_ITEM = registerBlock(WoodcutterVariantBlocks.MANGROVE_WOODCUTTER_BLOCK);
public static final Item SPRUCE_WOODCUTTER_ITEM = registerBlock(WoodcutterVariantBlocks.SPRUCE_WOODCUTTER_BLOCK);
public static final Item WARPED_WOODCUTTER_ITEM = registerBlock(WoodcutterVariantBlocks.WARPED_WOODCUTTER_BLOCK);

    public static void registerItems() {
        MoreNemosWoodcutterVariants.log.info("Register Woodcutter Variant items");

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(content -> content.addAfter(ModBlocks.WOODCUTTER.get(),
                WoodcutterVariantBlocks.ACACIA_WOODCUTTER_BLOCK));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(content -> content.addAfter(WoodcutterVariantBlocks.ACACIA_WOODCUTTER_BLOCK,
                WoodcutterVariantBlocks.BAMBOO_WOODCUTTER_BLOCK));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(content -> content.addAfter(WoodcutterVariantBlocks.BAMBOO_WOODCUTTER_BLOCK,
                WoodcutterVariantBlocks.BIRCH_WOODCUTTER_BLOCK));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(content -> content.addAfter(WoodcutterVariantBlocks.BIRCH_WOODCUTTER_BLOCK,
                WoodcutterVariantBlocks.CHERRY_WOODCUTTER_BLOCK));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(content -> content.addAfter(WoodcutterVariantBlocks.CHERRY_WOODCUTTER_BLOCK,
                WoodcutterVariantBlocks.CRIMSON_WOODCUTTER_BLOCK));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(content -> content.addAfter(WoodcutterVariantBlocks.CRIMSON_WOODCUTTER_BLOCK,
                WoodcutterVariantBlocks.DARK_OAK_WOODCUTTER_BLOCK));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(content -> content.addAfter(WoodcutterVariantBlocks.CRIMSON_WOODCUTTER_BLOCK,
                WoodcutterVariantBlocks.PALE_OAK_WOODCUTTER_BLOCK));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(content -> content.addAfter(WoodcutterVariantBlocks.PALE_OAK_WOODCUTTER_BLOCK,
                WoodcutterVariantBlocks.JUNGLE_WOODCUTTER_BLOCK));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(content -> content.addAfter(WoodcutterVariantBlocks.JUNGLE_WOODCUTTER_BLOCK,
                WoodcutterVariantBlocks.MANGROVE_WOODCUTTER_BLOCK));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(content -> content.addAfter(WoodcutterVariantBlocks.MANGROVE_WOODCUTTER_BLOCK,
                WoodcutterVariantBlocks.SPRUCE_WOODCUTTER_BLOCK));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(content -> content.addAfter(WoodcutterVariantBlocks.SPRUCE_WOODCUTTER_BLOCK,
                WoodcutterVariantBlocks.WARPED_WOODCUTTER_BLOCK));
    }
}
