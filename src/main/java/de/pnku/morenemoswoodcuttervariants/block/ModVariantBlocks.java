package de.pnku.morenemoswoodcuttervariants.block;

import com.nemonotfound.nemoswoodcutter.NemosWoodcutter;
import com.nemonotfound.nemoswoodcutter.block.ModBlocks;
import de.pnku.morenemoswoodcuttervariants.item.ModVariantItems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import com.nemonotfound.nemoswoodcutter.block.WoodcutterBlock;

import java.util.function.Function;

import static de.pnku.morenemoswoodcuttervariants.MoreNemosWoodcutterVariants.MOD_ID;
import static de.pnku.morenemoswoodcuttervariants.MoreNemosWoodcutterVariants.log;
import static net.minecraft.block.enums.NoteBlockInstrument.*;

public class ModVariantBlocks {

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

    public ModVariantBlocks() {
    }

    public static void registerBlocks() {
        log.info("Register Woodcutter Variant blocks");
    }

    private static Block register(String path, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        return register(keyOf(path), factory, settings);
    }

    private static RegistryKey<Block> keyOf(String path) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, path));
    }

    public static Block register(RegistryKey<Block> key, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        Block block = factory.apply(settings.registryKey(key));
        return Registry.register(Registries.BLOCK, key, block);
    }

    static {
        ACACIA_WOODCUTTER_BLOCK = register("acacia_woodcutter", WoodcutterBlock::new,
                AbstractBlock.Settings.create()
                        .sounds(BlockSoundGroup.WOOD)
                        .mapColor(MapColor.ORANGE)
                        .instrument(BASS)
                        .strength(2.0f));
        BAMBOO_WOODCUTTER_BLOCK = register("bamboo_woodcutter", WoodcutterBlock::new,
                AbstractBlock.Settings.create()
                        .sounds(BlockSoundGroup.BAMBOO_WOOD)
                        .mapColor(MapColor.YELLOW)
                        .instrument(BASS)
                        .strength(2.0f));
        BIRCH_WOODCUTTER_BLOCK = register("birch_woodcutter", WoodcutterBlock::new,
                AbstractBlock.Settings.create()
                        .sounds(BlockSoundGroup.WOOD)
                        .mapColor(MapColor.PALE_YELLOW)
                        .instrument(BASS)
                        .strength(2.0f));
        CHERRY_WOODCUTTER_BLOCK = register("cherry_woodcutter", WoodcutterBlock::new,
                AbstractBlock.Settings.create()
                        .sounds(BlockSoundGroup.CHERRY_WOOD)
                        .mapColor(MapColor.TERRACOTTA_WHITE)
                        .instrument(BASS)
                        .strength(2.0f));
        CRIMSON_WOODCUTTER_BLOCK = register("crimson_woodcutter", WoodcutterBlock::new,
                AbstractBlock.Settings.create()
                        .sounds(BlockSoundGroup.NETHER_WOOD)
                        .mapColor(MapColor.DULL_PINK)
                        .instrument(BASS)
                        .strength(2.0f));
        DARK_OAK_WOODCUTTER_BLOCK = register("dark_oak_woodcutter", WoodcutterBlock::new,
                AbstractBlock.Settings.create()
                        .sounds(BlockSoundGroup.WOOD)
                        .mapColor(MapColor.BROWN)
                        .instrument(BASS)
                        .strength(2.0f));
        PALE_OAK_WOODCUTTER_BLOCK = register("pale_oak_woodcutter", WoodcutterBlock::new,
                AbstractBlock.Settings.create()
                        .sounds(BlockSoundGroup.WOOD)
                        .mapColor(MapColor.STONE_GRAY)
                        .instrument(BASS)
                        .strength(2.0f));
        JUNGLE_WOODCUTTER_BLOCK = register("jungle_woodcutter", WoodcutterBlock::new,
                AbstractBlock.Settings.create()
                        .sounds(BlockSoundGroup.WOOD)
                        .mapColor(MapColor.DIRT_BROWN)
                        .instrument(BASS)
                        .strength(2.0f));
        MANGROVE_WOODCUTTER_BLOCK = register("mangrove_woodcutter", WoodcutterBlock::new,
                AbstractBlock.Settings.create()
                        .sounds(BlockSoundGroup.WOOD)
                        .mapColor(MapColor.RED)
                        .instrument(BASS)
                        .strength(2.0f));
        SPRUCE_WOODCUTTER_BLOCK = register("spruce_woodcutter", WoodcutterBlock::new,
                AbstractBlock.Settings.create()
                        .sounds(BlockSoundGroup.WOOD)
                        .mapColor(MapColor.SPRUCE_BROWN)
                        .instrument(BASS)
                        .strength(2.0f));
        WARPED_WOODCUTTER_BLOCK = register("warped_woodcutter", WoodcutterBlock::new,
                AbstractBlock.Settings.create()
                        .sounds(BlockSoundGroup.NETHER_WOOD)
                        .mapColor(MapColor.DARK_AQUA)
                        .instrument(BASS)
                        .strength(2.0f));
    }

}
