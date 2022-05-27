package dev.xkmc.modpackhelper.init;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;
import org.apache.commons.lang3.tuple.Pair;

public class AuditConfig {

	public static class Common {

		//public final ForgeConfigSpec.BooleanValue suppressNamespaceError;
		//public final ForgeConfigSpec.BooleanValue suppressUnobtainableEnchantmentError;

		Common(ForgeConfigSpec.Builder builder) {
			builder.push("suppression");
			//suppressNamespaceError = builder.comment("Suppress Dangerous Prefix (Ex: Forge Milk, Apotheosis)").define("suppressNamespaceError", true);
			//suppressUnobtainableEnchantmentError = builder.comment("Suppress Enchantment Level Requirement Too High Error (Apotheosis)").define("suppressUnobtainableEnchantmentError", true);
			builder.pop();
		}

	}

	public static final ForgeConfigSpec COMMON_SPEC;
	public static final Common COMMON;

	static {
		final Pair<Common, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(Common::new);
		COMMON_SPEC = specPair.getRight();
		COMMON = specPair.getLeft();
	}

	/**
	 * Registers any relevant listeners for config
	 */
	public static void init() {
		ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, AuditConfig.COMMON_SPEC);
	}


}
