package dev.xkmc.modpackhelper.init;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("modpackhelper")
public class ModpackHelper {

	public static final String MODID = "modpackhelper";
	public static final Logger LOGGER = LogManager.getLogger();


	public ModpackHelper() {
		AuditConfig.init();
		FMLJavaModLoadingContext ctx = FMLJavaModLoadingContext.get();
		IEventBus bus = ctx.getModEventBus();

	}

}
