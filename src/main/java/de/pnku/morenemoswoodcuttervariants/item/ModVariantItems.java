package de.pnku.morenemoswoodcuttervariants.item;

import com.nemonotfound.nemoswoodcutter.item.ModItems;
import de.pnku.morenemoswoodcuttervariants.MoreNemosWoodcutterVariants;
import de.pnku.morenemoswoodcuttervariants.block.ModVariantBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import static net.minecraft.item.Items.register;

public class ModVariantItems {

public static final Item ACACIA_WOODCUTTER_ITEM = register(ModVariantBlocks.ACACIA_WOODCUTTER_BLOCK);
public static final Item BAMBOO_WOODCUTTER_ITEM = register(ModVariantBlocks.BAMBOO_WOODCUTTER_BLOCK);
public static final Item BIRCH_WOODCUTTER_ITEM = register(ModVariantBlocks.BIRCH_WOODCUTTER_BLOCK);
public static final Item CHERRY_WOODCUTTER_ITEM = register(ModVariantBlocks.CHERRY_WOODCUTTER_BLOCK);
public static final Item CRIMSON_WOODCUTTER_ITEM = register(ModVariantBlocks.CRIMSON_WOODCUTTER_BLOCK);
public static final Item DARK_OAK_WOODCUTTER_ITEM = register(ModVariantBlocks.DARK_OAK_WOODCUTTER_BLOCK);
public static final Item PALE_OAK_WOODCUTTER_ITEM = register(ModVariantBlocks.PALE_OAK_WOODCUTTER_BLOCK);
public static final Item JUNGLE_WOODCUTTER_ITEM = register(ModVariantBlocks.JUNGLE_WOODCUTTER_BLOCK);
public static final Item MANGROVE_WOODCUTTER_ITEM = register(ModVariantBlocks.MANGROVE_WOODCUTTER_BLOCK);
public static final Item SPRUCE_WOODCUTTER_ITEM = register(ModVariantBlocks.SPRUCE_WOODCUTTER_BLOCK);
public static final Item WARPED_WOODCUTTER_ITEM = register(ModVariantBlocks.WARPED_WOODCUTTER_BLOCK);

    public static void registerItems() {
        MoreNemosWoodcutterVariants.log.info("Register Woodcutter Variant items");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> content.addAfter(ModItems.WOODCUTTER,
                ModVariantItems.ACACIA_WOODCUTTER_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> content.addAfter(ModVariantItems.ACACIA_WOODCUTTER_ITEM,
                ModVariantItems.BAMBOO_WOODCUTTER_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> content.addAfter(ModVariantItems.BAMBOO_WOODCUTTER_ITEM,
                ModVariantItems.BIRCH_WOODCUTTER_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> content.addAfter(ModVariantItems.BIRCH_WOODCUTTER_ITEM,
                ModVariantItems.CHERRY_WOODCUTTER_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> content.addAfter(ModVariantItems.CHERRY_WOODCUTTER_ITEM,
                ModVariantItems.CRIMSON_WOODCUTTER_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> content.addAfter(ModVariantItems.CRIMSON_WOODCUTTER_ITEM,
                ModVariantItems.DARK_OAK_WOODCUTTER_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> content.addAfter(ModVariantItems.DARK_OAK_WOODCUTTER_ITEM,
                ModVariantItems.PALE_OAK_WOODCUTTER_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> content.addAfter(ModVariantItems.PALE_OAK_WOODCUTTER_ITEM,
                ModVariantItems.JUNGLE_WOODCUTTER_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> content.addAfter(ModVariantItems.JUNGLE_WOODCUTTER_ITEM,
                ModVariantItems.MANGROVE_WOODCUTTER_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> content.addAfter(ModVariantItems.MANGROVE_WOODCUTTER_ITEM,
                ModVariantItems.SPRUCE_WOODCUTTER_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> content.addAfter(ModVariantItems.SPRUCE_WOODCUTTER_ITEM,
                ModVariantItems.WARPED_WOODCUTTER_ITEM));
    }
}
