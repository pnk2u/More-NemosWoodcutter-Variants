package de.pnku.more_nemos_woodcutter_variants.block;

import com.nemonotfound.nemos.woodcutter.world.level.block.WoodcutterBlocks;
import com.nemonotfound.nemos.woodcutter.world.level.block.WoodcutterBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

import static de.pnku.more_nemos_woodcutter_variants.MoreNemosWoodcutterVariants.withModId;

public class MoreWoodcutterBlock extends WoodcutterBlock {
    public final String woodcutterWoodType;

    public MoreWoodcutterBlock(MapColor colour, String woodcutterWoodType) {
        super(Properties.ofFullCopy(WoodcutterBlocks.WOODCUTTER.get()).setId(ResourceKey.create(Registries.BLOCK, withModId(woodcutterWoodType + "_woodcutter"))).mapColor(colour));
        this.woodcutterWoodType = woodcutterWoodType;
    }

    public MoreWoodcutterBlock(MapColor colour, SoundType soundType, String woodcutterWoodType) {
        super(Properties.ofFullCopy(WoodcutterBlocks.WOODCUTTER.get()).setId(ResourceKey.create(Registries.BLOCK, withModId(woodcutterWoodType + "_woodcutter"))).mapColor(colour).sound(soundType));
        this.woodcutterWoodType = woodcutterWoodType;
    }
}
