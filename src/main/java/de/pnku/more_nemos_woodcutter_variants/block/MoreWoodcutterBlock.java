package de.pnku.more_nemos_woodcutter_variants.block;

import com.nemonotfound.nemoswoodcutter.block.ModBlocks;
import com.nemonotfound.nemoswoodcutter.block.WoodcutterBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

public class MoreWoodcutterBlock extends WoodcutterBlock {
    public final String woodcutterWoodType;

    public MoreWoodcutterBlock(MapColor colour, String woodcutterWoodType) {
        super(Properties.ofFullCopy(ModBlocks.WOODCUTTER_BLOCK).mapColor(colour));
        this.woodcutterWoodType = woodcutterWoodType;
    }

    public MoreWoodcutterBlock(MapColor colour, SoundType soundType, String woodcutterWoodType) {
        super(Properties.ofFullCopy(ModBlocks.WOODCUTTER_BLOCK).mapColor(colour).sound(soundType));
        this.woodcutterWoodType = woodcutterWoodType;
    }
}
