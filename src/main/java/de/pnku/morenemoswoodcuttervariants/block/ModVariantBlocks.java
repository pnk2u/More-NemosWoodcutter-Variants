package de.pnku.morenemoswoodcuttervariants.block;

import com.nemonotfound.nemoswoodcutter.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import com.nemonotfound.nemoswoodcutter.block.WoodcutterBlock;

import static de.pnku.morenemoswoodcuttervariants.MoreNemosWoodcutterVariants.MOD_ID;
import static de.pnku.morenemoswoodcuttervariants.MoreNemosWoodcutterVariants.log;
import static net.minecraft.block.enums.NoteBlockInstrument.*;

public class ModVariantBlocks {

    public static final Block ACACIA_WOODCUTTER_BLOCK = registerBlock("acacia_woodcutter",
            new WoodcutterBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .mapColor(MapColor.ORANGE)
                    .instrument(BASS)
                    .strength(2.0f)));
    public static final Block BAMBOO_WOODCUTTER_BLOCK = registerBlock("bamboo_woodcutter",
            new WoodcutterBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.BAMBOO_WOOD)
                    .mapColor(MapColor.YELLOW)
                    .instrument(BASS)
                    .strength(2.0f)));
    public static final Block BIRCH_WOODCUTTER_BLOCK = registerBlock("birch_woodcutter",
            new WoodcutterBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .mapColor(MapColor.PALE_YELLOW)
                    .instrument(BASS)
                    .strength(2.0f)));
    public static final Block CHERRY_WOODCUTTER_BLOCK = registerBlock("cherry_woodcutter",
            new WoodcutterBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.CHERRY_WOOD)
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .instrument(BASS)
                    .strength(2.0f)));
    public static final Block CRIMSON_WOODCUTTER_BLOCK = registerBlock("crimson_woodcutter",
            new WoodcutterBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.NETHER_WOOD)
                    .mapColor(MapColor.DULL_PINK)
                    .instrument(BASS)
                    .strength(2.0f)));
    public static final Block DARK_OAK_WOODCUTTER_BLOCK = registerBlock("dark_oak_woodcutter",
            new WoodcutterBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .mapColor(MapColor.BROWN)
                    .instrument(BASS)
                    .strength(2.0f)));
    public static final Block JUNGLE_WOODCUTTER_BLOCK = registerBlock("jungle_woodcutter",
            new WoodcutterBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .mapColor(MapColor.DIRT_BROWN)
                    .instrument(BASS)
                    .strength(2.0f)));
    public static final Block MANGROVE_WOODCUTTER_BLOCK = registerBlock("mangrove_woodcutter",
            new WoodcutterBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .mapColor(MapColor.RED)
                    .instrument(BASS)
                    .strength(2.0f)));
    public static final Block SPRUCE_WOODCUTTER_BLOCK = registerBlock("spruce_woodcutter",
            new WoodcutterBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .mapColor(MapColor.SPRUCE_BROWN)
                    .instrument(BASS)
                    .strength(2.0f)));
    public static final Block WARPED_WOODCUTTER_BLOCK = registerBlock("warped_woodcutter",
            new WoodcutterBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.NETHER_WOOD)
                    .mapColor(MapColor.DARK_AQUA)
                    .instrument(BASS)
                    .strength(2.0f)));



    public static void registerBlocks() {
        log.info("Register woodcutter variant blocks");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> content.addAfter(ModBlocks.WOODCUTTER_BLOCK,
                ModVariantBlocks.ACACIA_WOODCUTTER_BLOCK));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> content.addAfter(ModVariantBlocks.ACACIA_WOODCUTTER_BLOCK,
                ModVariantBlocks.BAMBOO_WOODCUTTER_BLOCK));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> content.addAfter(ModVariantBlocks.BAMBOO_WOODCUTTER_BLOCK,
                ModVariantBlocks.BIRCH_WOODCUTTER_BLOCK));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> content.addAfter(ModVariantBlocks.BIRCH_WOODCUTTER_BLOCK,
                ModVariantBlocks.CHERRY_WOODCUTTER_BLOCK));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> content.addAfter(ModVariantBlocks.CHERRY_WOODCUTTER_BLOCK,
                ModVariantBlocks.CRIMSON_WOODCUTTER_BLOCK));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> content.addAfter(ModVariantBlocks.CRIMSON_WOODCUTTER_BLOCK,
                ModVariantBlocks.DARK_OAK_WOODCUTTER_BLOCK));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> content.addAfter(ModVariantBlocks.DARK_OAK_WOODCUTTER_BLOCK,
                ModVariantBlocks.JUNGLE_WOODCUTTER_BLOCK));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> content.addAfter(ModVariantBlocks.JUNGLE_WOODCUTTER_BLOCK,
                ModVariantBlocks.MANGROVE_WOODCUTTER_BLOCK));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> content.addAfter(ModVariantBlocks.MANGROVE_WOODCUTTER_BLOCK,
                ModVariantBlocks.SPRUCE_WOODCUTTER_BLOCK));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> content.addAfter(ModVariantBlocks.SPRUCE_WOODCUTTER_BLOCK,
                ModVariantBlocks.WARPED_WOODCUTTER_BLOCK));
    }

    private static Block registerBlock(String path, Block block) {
        Block registeredBlock = Registry.register(Registries.BLOCK, Identifier.of(MOD_ID, path), block);
        Registry.register(Registries.ITEM, Identifier.of(MOD_ID, path), new BlockItem(block, new Item.Settings()));

        return registeredBlock;
    }
}
