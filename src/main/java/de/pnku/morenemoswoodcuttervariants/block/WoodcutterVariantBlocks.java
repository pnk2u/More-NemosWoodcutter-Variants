package de.pnku.morenemoswoodcuttervariants.block;

import com.devnemo.nemos.woodcutter.world.level.block.WoodcutterBlocks;
import com.devnemo.nemos.woodcutter.world.level.block.WoodcutterBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
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
import java.util.function.Function;

import static de.pnku.morenemoswoodcuttervariants.MoreNemosWoodcutterVariants.MOD_ID;

public class WoodcutterVariantBlocks {
    public static List<Block> more_woodcutters = new ArrayList<>();

    public static final Block ACACIA_WOODCUTTER_BLOCK;
    public static final Block BAMBOO_WOODCUTTER_BLOCK;
    public static final Block BIRCH_WOODCUTTER_BLOCK;
    public static final Block CHERRY_WOODCUTTER_BLOCK;
    public static final Block CRIMSON_WOODCUTTER_BLOCK;
    public static final Block DARK_OAK_WOODCUTTER_BLOCK;
    public static final Block PALE_OAK_WOODCUTTER_BLOCK;
    public static final Block JUNGLE_WOODCUTTER_BLOCK;
    public static final Block MANGROVE_WOODCUTTER_BLOCK;
    public static final Block SPRUCE_WOODCUTTER_BLOCK;
    public static final Block WARPED_WOODCUTTER_BLOCK;

    private static Block register(String path, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties properties) {
        return register(keyOf(path), factory, properties);
    }

    private static ResourceKey<Block> keyOf(String path) {
        return ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MOD_ID, path));
    }

    public static Block register(ResourceKey<Block> key, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties properties) {
        Block block = factory.apply(properties.setId(key));
        more_woodcutters.add(block);
        return Registry.register(BuiltInRegistries.BLOCK, key, block);
    }

    static {
        ACACIA_WOODCUTTER_BLOCK = register("acacia_woodcutter", WoodcutterBlock::new,
                BlockBehaviour.Properties.of()
                        .sound(SoundType.WOOD)
                        .mapColor(MapColor.COLOR_ORANGE)
                        .instrument(NoteBlockInstrument.BASS)
                        .strength(2.0f));
        BAMBOO_WOODCUTTER_BLOCK = register("bamboo_woodcutter", WoodcutterBlock::new,
                BlockBehaviour.Properties.of()
                        .sound(SoundType.BAMBOO_WOOD)
                        .mapColor(MapColor.COLOR_YELLOW)
                        .instrument(NoteBlockInstrument.BASS)
                        .strength(2.0f));
        BIRCH_WOODCUTTER_BLOCK = register("birch_woodcutter", WoodcutterBlock::new,
                BlockBehaviour.Properties.of()
                        .sound(SoundType.WOOD)
                        .mapColor(MapColor.SAND)
                        .instrument(NoteBlockInstrument.BASS)
                        .strength(2.0f));
        CHERRY_WOODCUTTER_BLOCK = register("cherry_woodcutter", WoodcutterBlock::new,
                BlockBehaviour.Properties.of()
                        .sound(SoundType.CHERRY_WOOD)
                        .mapColor(MapColor.TERRACOTTA_WHITE)
                        .instrument(NoteBlockInstrument.BASS)
                        .strength(2.0f));
        CRIMSON_WOODCUTTER_BLOCK = register("crimson_woodcutter", WoodcutterBlock::new,
                BlockBehaviour.Properties.of()
                        .sound(SoundType.NETHER_WOOD)
                        .mapColor(MapColor.CRIMSON_STEM)
                        .instrument(NoteBlockInstrument.BASS)
                        .strength(2.0f));
        DARK_OAK_WOODCUTTER_BLOCK = register("dark_oak_woodcutter", WoodcutterBlock::new,
                BlockBehaviour.Properties.of()
                        .sound(SoundType.WOOD)
                        .mapColor(MapColor.COLOR_BROWN)
                        .instrument(NoteBlockInstrument.BASS)
                        .strength(2.0f));
        PALE_OAK_WOODCUTTER_BLOCK = register("pale_oak_woodcutter", WoodcutterBlock::new,
                BlockBehaviour.Properties.of()
                        .sound(SoundType.WOOD)
                        .mapColor(MapColor.QUARTZ)
                        .instrument(NoteBlockInstrument.BASS)
                        .strength(2.0f));
        JUNGLE_WOODCUTTER_BLOCK = register("jungle_woodcutter", WoodcutterBlock::new,
                BlockBehaviour.Properties.of()
                        .sound(SoundType.WOOD)
                        .mapColor(MapColor.DIRT)
                        .instrument(NoteBlockInstrument.BASS)
                        .strength(2.0f));
        MANGROVE_WOODCUTTER_BLOCK = register("mangrove_woodcutter", WoodcutterBlock::new,
                BlockBehaviour.Properties.of()
                        .sound(SoundType.WOOD)
                        .mapColor(MapColor.COLOR_RED)
                        .instrument(NoteBlockInstrument.BASS)
                        .strength(2.0f));
        SPRUCE_WOODCUTTER_BLOCK = register("spruce_woodcutter", WoodcutterBlock::new,
                BlockBehaviour.Properties.of()
                        .sound(SoundType.WOOD)
                        .mapColor(MapColor.PODZOL)
                        .instrument(NoteBlockInstrument.BASS)
                        .strength(2.0f));
        WARPED_WOODCUTTER_BLOCK = register("warped_woodcutter", WoodcutterBlock::new,
                BlockBehaviour.Properties.of()
                        .sound(SoundType.NETHER_WOOD)
                        .mapColor(MapColor.WARPED_STEM)
                        .instrument(NoteBlockInstrument.BASS)
                        .strength(2.0f));
    }


    public static void registerBlocks() {
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(content -> content.addAfter(WoodcutterBlocks.WOODCUTTER.get(),
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
}