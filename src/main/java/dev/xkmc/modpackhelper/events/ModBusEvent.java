package dev.xkmc.modpackhelper.events;

import dev.xkmc.modpackhelper.init.ModpackHelper;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ModBusEvent {


	@SubscribeEvent(priority = EventPriority.HIGHEST)
	public static void registerLoaders(ModelRegistryEvent event) {
		if (!ResourceReloadEventHandler.canAddResourceListener){
			ModpackHelper.LOGGER.fatal("Model Registry Event Fired Illegally");
		}
	}

}
