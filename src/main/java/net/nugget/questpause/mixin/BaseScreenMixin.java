package net.nugget.questpause.mixin;

import dev.ftb.mods.ftblibrary.ui.BaseScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({BaseScreen.class})
public class BaseScreenMixin {
	public BaseScreenMixin() {
	}

	@Inject(
			method = {"doesGuiPauseGame"},
			at = {@At("HEAD")},
			remap = false,
			cancellable = true
	)
	public void isPauseScreen(CallbackInfoReturnable<Boolean> cir) {
		cir.setReturnValue(true);
	}
}