package de.pnku.more_nemos_woodcutter_variants;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.resource.v1.ResourceLoader;
import net.fabricmc.fabric.api.resource.v1.pack.PackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.network.chat.Component;

@Environment(EnvType.CLIENT)
public class MoreNemosWoodcutterVariantsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ResourceLoader.registerBuiltinPack(
                MoreNemosWoodcutterVariants.withModId(MoreNemosWoodcutterVariants.MOD_ID),
                FabricLoader.getInstance().getModContainer(MoreNemosWoodcutterVariants.MOD_ID).orElseThrow(),
                Component.translatable("resourcePack." + MoreNemosWoodcutterVariants.MOD_ID + ".name"),
                PackActivationType.ALWAYS_ENABLED
        );
    }
}
