package de.pnku.more_nemos_woodcutter_variants.item;

import de.pnku.more_nemos_woodcutter_variants.MoreNemosWoodcutterVariants;
import de.pnku.more_nemos_woodcutter_variants.block.MoreWoodcutterBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

import java.util.List;

import static de.pnku.more_nemos_woodcutter_variants.block.MoreWoodcutterBlocks.*;

public class MoreWoodcutterItems {

    public static final Item BIRCH_WOODCUTTER = createWoodcutterItem("birch");
    public static final Item JUNGLE_WOODCUTTER = createWoodcutterItem("jungle");
    public static final Item ACACIA_WOODCUTTER = createWoodcutterItem("acacia");
    public static final Item DARK_OAK_WOODCUTTER = createWoodcutterItem("dark_oak");
    public static final Item MANGROVE_WOODCUTTER = createWoodcutterItem( "mangrove");
    public static final Item CHERRY_WOODCUTTER = createWoodcutterItem("cherry");
    public static final Item BAMBOO_WOODCUTTER = createWoodcutterItem("bamboo");
    public static final Item CRIMSON_WOODCUTTER = createWoodcutterItem("crimson");
    public static final Item SPRUCE_WOODCUTTER = createWoodcutterItem("spruce");
    public static final Item WARPED_WOODCUTTER = createWoodcutterItem("warped");

    public static final TagKey<Item> WOODCUTTER_VARIANTS_ITEM_TAG = TagKey.create(Registries.ITEM, MoreNemosWoodcutterVariants.withModId("woodcutter_variants"));
    public static final TagKey<Item> WOODCUTTERS_ITEM_TAG = TagKey.create(Registries.ITEM, MoreNemosWoodcutterVariants.withModId("woodcutters"));

    public static final List<Item> more_woodcutter_items = List.of(
            BIRCH_WOODCUTTER,
            SPRUCE_WOODCUTTER,
            JUNGLE_WOODCUTTER,
            ACACIA_WOODCUTTER,
            DARK_OAK_WOODCUTTER,
            MANGROVE_WOODCUTTER,
            CHERRY_WOODCUTTER,
            BAMBOO_WOODCUTTER,
            CRIMSON_WOODCUTTER,
            WARPED_WOODCUTTER
    );

    public static Item createWoodcutterItem(String woodType) {
        return new BlockItem(getWoodcutterBlockByWoodType(woodType), new Item.Properties());
    }

    public static void registerItems() {
        for (Item woodcutterItem : more_woodcutter_items) {
            String woodcutterName = ((MoreWoodcutterBlock) ((BlockItem) woodcutterItem).getBlock()).woodcutterWoodType + "_woodcutter";
            Registry.register(BuiltInRegistries.ITEM, MoreNemosWoodcutterVariants.withModId(woodcutterName), woodcutterItem);
            ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(entries -> entries.addBefore(Items.CARTOGRAPHY_TABLE, woodcutterItem));
            // mod_id change from morenemoswoodcuttervariants to more_nemos_woodcutter_variants - alias for backwards compatibility
                BuiltInRegistries.ITEM.addAlias(MoreNemosWoodcutterVariants.withLegacyModId(woodcutterName), MoreNemosWoodcutterVariants.withModId(woodcutterName));
        }
    }
}
