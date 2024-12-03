package de.pnku.morenemoswoodcuttervariants.mixin.screen;

import com.nemonotfound.nemos.woodcutter.block.WoodcutterBlock;
import com.nemonotfound.nemos.woodcutter.screen.WoodcutterMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerLevelAccess;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(WoodcutterMenu.class)
public abstract class WoodcutterMenuMixin {

    @Shadow
    @Final
    private ContainerLevelAccess containerLevelAccess;

    @Inject(method = "stillValid", at = @At("HEAD"), cancellable = true)
    private void canUse(Player player, CallbackInfoReturnable<Boolean> info) {
        if (containerLevelAccess.evaluate((world, pos) -> world.getBlockState(pos).getBlock() instanceof WoodcutterBlock, true)) {
            info.setReturnValue(true);
        }
    }
}
