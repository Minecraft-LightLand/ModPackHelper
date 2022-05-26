package dev.xkmc.modpackhelper.events;

import net.minecraftforge.client.event.RegisterClientReloadListenersEvent;
import net.minecraftforge.event.AddReloadListenerEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ResourceReloadEventHandler {

	public static boolean canAddResourceListener = false;

	@SubscribeEvent(priority = EventPriority.HIGHEST)
	public static void addReloadListenersStart(AddReloadListenerEvent event) {

	}

	@SubscribeEvent(priority = EventPriority.HIGHEST)
	public static void clientReloadListenersStart(RegisterClientReloadListenersEvent event) {
		canAddResourceListener = true;
	}

	@SubscribeEvent(priority = EventPriority.LOWEST)
	public static void addReloadListenersStop(AddReloadListenerEvent event) {
	}

	@SubscribeEvent(priority = EventPriority.LOWEST)
	public static void clientReloadListenersStop(RegisterClientReloadListenersEvent event) {
		canAddResourceListener = false;
	}

}
