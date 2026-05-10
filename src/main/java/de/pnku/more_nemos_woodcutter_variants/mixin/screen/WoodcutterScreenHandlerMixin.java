package de.pnku.more_nemos_woodcutter_variants.mixin.screen;

import com.nemonotfound.nemoswoodcutter.block.WoodcutterBlock;
import com.nemonotfound.nemoswoodcutter.screen.WoodcutterScreenHandler;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerLevelAccess;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(WoodcutterScreenHandler.class)
public abstract class WoodcutterScreenHandlerMixin {

    @Shadow
    @Final
    private ContainerLevelAccess context;

    @Inject(method = "stillValid", at = @At("HEAD"), cancellable = true)
    private void injectedStillValid(Player player, CallbackInfoReturnable<Boolean> info) {
        if (context.evaluate((world, pos) -> world.getBlockState(pos).getBlock() instanceof WoodcutterBlock, true)) {
            info.setReturnValue(true);
        }
    }
}
