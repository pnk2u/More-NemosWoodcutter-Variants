package de.pnku.more_nemos_woodcutter_variants.block;

import de.pnku.more_nemos_woodcutter_variants.MoreNemosWoodcutterVariants;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MoreWoodcutterBlocks {

    public static final Block BIRCH_WOODCUTTER = new MoreWoodcutterBlock(MapColor.SAND, "birch");
    public static final Block SPRUCE_WOODCUTTER = new MoreWoodcutterBlock(MapColor.COLOR_BROWN, "spruce");
    public static final Block JUNGLE_WOODCUTTER = new MoreWoodcutterBlock(MapColor.DIRT, "jungle");
    public static final Block ACACIA_WOODCUTTER = new MoreWoodcutterBlock(MapColor.COLOR_ORANGE, "acacia");
    public static final Block DARK_OAK_WOODCUTTER = new MoreWoodcutterBlock(MapColor.COLOR_BROWN, "dark_oak");
    public static final Block PALE_OAK_WOODCUTTER = new MoreWoodcutterBlock(MapColor.QUARTZ, "pale_oak");
    public static final Block MANGROVE_WOODCUTTER = new MoreWoodcutterBlock(MapColor.COLOR_RED, "mangrove");
    public static final Block CHERRY_WOODCUTTER = new MoreWoodcutterBlock(MapColor.TERRACOTTA_WHITE, SoundType.CHERRY_WOOD, "cherry");
    public static final Block BAMBOO_WOODCUTTER = new MoreWoodcutterBlock(MapColor.COLOR_YELLOW, SoundType.BAMBOO_WOOD, "bamboo");
    public static final Block CRIMSON_WOODCUTTER = new MoreWoodcutterBlock(MapColor.CRIMSON_STEM, SoundType.NETHER_WOOD, "crimson");
    public static final Block WARPED_WOODCUTTER = new MoreWoodcutterBlock(MapColor.WARPED_STEM, SoundType.NETHER_WOOD, "warped");

    public static final TagKey<Block> WOODCUTTER_VARIANTS_BLOCK_TAG = TagKey.create(Registries.BLOCK, MoreNemosWoodcutterVariants.withModId("woodcutter_variants"));
    public static final TagKey<Block> WOODCUTTERS_BLOCK_TAG = TagKey.create(Registries.BLOCK, MoreNemosWoodcutterVariants.withModId("woodcutters"));
    public static final Map<String, Block> WOODCUTTER_BLOCKS_BY_WOOD_TYPE = new HashMap<>();

    public static final List<Block> more_woodcutter_blocks = List.of(
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

    public static void registerBlocks() {
        for (Block woodcutterBlock : more_woodcutter_blocks) {
            String woodcutterName = ((MoreWoodcutterBlock) woodcutterBlock).woodcutterWoodType + "_woodcutter";
            Registry.register(BuiltInRegistries.BLOCK, MoreNemosWoodcutterVariants.withModId(woodcutterName), woodcutterBlock);
            WOODCUTTER_BLOCKS_BY_WOOD_TYPE.put(((MoreWoodcutterBlock) woodcutterBlock).woodcutterWoodType, woodcutterBlock);
            // mod_id change from morenemoswoodcuttervariants to more_nemos_woodcutter_variants - alias for backwards compatibility
                BuiltInRegistries.BLOCK.addAlias(MoreNemosWoodcutterVariants.withLegacyModId(woodcutterName), MoreNemosWoodcutterVariants.withModId(woodcutterName));
        }
    }

    public static Block getWoodcutterBlockByWoodType(String woodType) {
        return WOODCUTTER_BLOCKS_BY_WOOD_TYPE.get(woodType);
    }
}
