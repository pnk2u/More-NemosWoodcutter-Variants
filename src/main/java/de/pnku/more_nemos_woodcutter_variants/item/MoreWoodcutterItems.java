package de.pnku.more_nemos_woodcutter_variants.item;

import de.pnku.more_nemos_woodcutter_variants.MoreNemosWoodcutterVariants;
import de.pnku.more_nemos_woodcutter_variants.block.MoreWoodcutterBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

import java.util.List;

import static de.pnku.more_nemos_woodcutter_variants.block.MoreWoodcutterBlocks.*;

public class MoreWoodcutterItems {

    public static final Item BIRCH_WOODCUTTER = itemFromWoodType("birch");
    public static final Item JUNGLE_WOODCUTTER = itemFromWoodType("jungle");
    public static final Item ACACIA_WOODCUTTER = itemFromWoodType("acacia");
    public static final Item DARK_OAK_WOODCUTTER = itemFromWoodType("dark_oak");
    public static final Item PALE_OAK_WOODCUTTER = itemFromWoodType("pale_oak");
    public static final Item MANGROVE_WOODCUTTER = itemFromWoodType( "mangrove");
    public static final Item CHERRY_WOODCUTTER = itemFromWoodType("cherry");
    public static final Item BAMBOO_WOODCUTTER = itemFromWoodType("bamboo");
    public static final Item CRIMSON_WOODCUTTER = itemFromWoodType("crimson",true);
    public static final Item SPRUCE_WOODCUTTER = itemFromWoodType("spruce");
    public static final Item WARPED_WOODCUTTER = itemFromWoodType("warped",true);

    public static final TagKey<Item> WOODCUTTER_VARIANTS_ITEM_TAG = TagKey.create(Registries.ITEM, MoreNemosWoodcutterVariants.withModId("woodcutter_variants"));
    public static final TagKey<Item> WOODCUTTERS_ITEM_TAG = TagKey.create(Registries.ITEM, MoreNemosWoodcutterVariants.withModId("woodcutters"));

    public static BlockItem itemFromWoodType(String woodType) {
        return itemFromWoodType(woodType, false);
    }

    public static BlockItem itemFromWoodType(String woodType, boolean isNether) {
        Block block = getWoodcutterBlockByWoodType(woodType);
        return new BlockItem(block, setProperties(block, isNether));
    }

    public static Item.Properties setProperties(Block block, boolean isNether) {
        Item.Properties properties = new Item.Properties()
                .setId(ResourceKey.create(Registries.ITEM,BuiltInRegistries.BLOCK.getKey(block))).useBlockDescriptionPrefix();
        if (isNether) properties.fireResistant();
        return properties;
    }

    public static final List<Item> more_woodcutter_items = List.of(
            BIRCH_WOODCUTTER,
            SPRUCE_WOODCUTTER,
            JUNGLE_WOODCUTTER,
            ACACIA_WOODCUTTER,
            DARK_OAK_WOODCUTTER,
            PALE_OAK_WOODCUTTER,
            MANGROVE_WOODCUTTER,
            CHERRY_WOODCUTTER,
            BAMBOO_WOODCUTTER,
            CRIMSON_WOODCUTTER,
            WARPED_WOODCUTTER
    );

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
