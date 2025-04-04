package de.pnku.morenemoswoodcuttervariants.block;

import com.nemonotfound.nemoswoodcutter.block.ModBlocks;
import com.nemonotfound.nemoswoodcutter.block.WoodcutterBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

import java.util.ArrayList;
import java.util.List;

import static de.pnku.morenemoswoodcuttervariants.MoreNemosWoodcutterVariants.MOD_ID;
import static de.pnku.morenemoswoodcuttervariants.MoreNemosWoodcutterVariants.log;

public class WoodcutterVariantBlocks {
    public static List<Block> more_woodcutters = new ArrayList<>();

    public static final Block ACACIA_WOODCUTTER_BLOCK = registerBlock("acacia_woodcutter",
            new WoodcutterBlock(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOD)
                    .mapColor(MapColor.COLOR_ORANGE)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0f)));
    public static final Block BAMBOO_WOODCUTTER_BLOCK = registerBlock("bamboo_woodcutter",
            new WoodcutterBlock(BlockBehaviour.Properties.of()
                    .sound(SoundType.BAMBOO_WOOD)
                    .mapColor(MapColor.COLOR_YELLOW)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0f)));
    public static final Block BIRCH_WOODCUTTER_BLOCK = registerBlock("birch_woodcutter",
            new WoodcutterBlock(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOD)
                    .mapColor(MapColor.SAND)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0f)));
    public static final Block CHERRY_WOODCUTTER_BLOCK = registerBlock("cherry_woodcutter",
            new WoodcutterBlock(BlockBehaviour.Properties.of()
                    .sound(SoundType.CHERRY_WOOD)
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0f)));
    public static final Block CRIMSON_WOODCUTTER_BLOCK = registerBlock("crimson_woodcutter",
            new WoodcutterBlock(BlockBehaviour.Properties.of()
                    .sound(SoundType.NETHER_WOOD)
                    .mapColor(MapColor.CRIMSON_STEM)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0f)));
    public static final Block DARK_OAK_WOODCUTTER_BLOCK = registerBlock("dark_oak_woodcutter",
            new WoodcutterBlock(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOD)
                    .mapColor(MapColor.COLOR_BROWN)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0f)));
    public static final Block JUNGLE_WOODCUTTER_BLOCK = registerBlock("jungle_woodcutter",
            new WoodcutterBlock(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOD)
                    .mapColor(MapColor.DIRT)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0f)));
    public static final Block MANGROVE_WOODCUTTER_BLOCK = registerBlock("mangrove_woodcutter",
            new WoodcutterBlock(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOD)
                    .mapColor(MapColor.COLOR_RED)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0f)));
    public static final Block SPRUCE_WOODCUTTER_BLOCK = registerBlock("spruce_woodcutter",
            new WoodcutterBlock(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOD)
                    .mapColor(MapColor.PODZOL)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0f)));
    public static final Block WARPED_WOODCUTTER_BLOCK = registerBlock("warped_woodcutter",
            new WoodcutterBlock(BlockBehaviour.Properties.of()
                    .sound(SoundType.NETHER_WOOD)
                    .mapColor(MapColor.WARPED_STEM)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0f)));


    public static void registerBlocks() {
        log.info("Register woodcutter variant blocks");

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(content -> content.addAfter(ModBlocks.WOODCUTTER_BLOCK,
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
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(content -> content.addAfter(WoodcutterVariantBlocks.DARK_OAK_WOODCUTTER_BLOCK,
                WoodcutterVariantBlocks.JUNGLE_WOODCUTTER_BLOCK));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(content -> content.addAfter(WoodcutterVariantBlocks.JUNGLE_WOODCUTTER_BLOCK,
                WoodcutterVariantBlocks.MANGROVE_WOODCUTTER_BLOCK));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(content -> content.addAfter(WoodcutterVariantBlocks.MANGROVE_WOODCUTTER_BLOCK,
                WoodcutterVariantBlocks.SPRUCE_WOODCUTTER_BLOCK));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(content -> content.addAfter(WoodcutterVariantBlocks.SPRUCE_WOODCUTTER_BLOCK,
                WoodcutterVariantBlocks.WARPED_WOODCUTTER_BLOCK));
    }

    private static Block registerBlock(String path, Block block) {
        Block registeredBlock = Registry.register(BuiltInRegistries.BLOCK, ResourceLocation.tryBuild(MOD_ID, path), block);
        Registry.register(BuiltInRegistries.ITEM, ResourceLocation.tryBuild(MOD_ID, path), new BlockItem(block, new Item.Properties()));
        more_woodcutters.add(registeredBlock);
        return registeredBlock;
    }
}
