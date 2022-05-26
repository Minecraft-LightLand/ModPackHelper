package dev.xkmc.modpackhelper.mixin;

import dev.xkmc.modpackhelper.events.ResourceReloadEventHandler;
import dev.xkmc.modpackhelper.init.ModpackHelper;
import net.minecraft.server.packs.PackResources;
import net.minecraft.server.packs.resources.PreparableReloadListener;
import net.minecraft.server.packs.resources.ReloadInstance;
import net.minecraft.server.packs.resources.ReloadableResourceManager;
import net.minecraft.util.Unit;
import org.apache.logging.log4j.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

@Mixin(ReloadableResourceManager.class)
public class ReloadableResourceManagerMixin {

	@Inject(at = @At("HEAD"), method = "registerReloadListener")
	public void registerReloadListener(PreparableReloadListener listener, CallbackInfo ci) {
		if (!ResourceReloadEventHandler.canAddResourceListener){
			ModpackHelper.LOGGER.fatal("Illegal access to add resource reload listener");
			ModpackHelper.LOGGER.throwing(Level.FATAL, new Exception("Illegal access to add resource reload listener"));
		}
	}

	@Inject(at = @At("HEAD"), method = "createReload")
	public void createReload(Executor p_143930_, Executor p_143931_, CompletableFuture<Unit> p_143932_, List<PackResources> p_143933_, CallbackInfoReturnable<ReloadInstance> cir) {

	}

}
