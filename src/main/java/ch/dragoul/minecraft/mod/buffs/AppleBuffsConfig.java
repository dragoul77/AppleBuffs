package ch.dragoul.minecraft.mod.buffs;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class AppleBuffsConfig {
	
	private static boolean useDiamondApple;
	private static boolean useGodDiamondApple;
	private static boolean useEmeraldApple;
	private static boolean useGodEmeraldApple;
	private static boolean useEmerondApple;
	private static boolean useGodEmerondApple;
	
	private static int diamondAppleMultiplier;
	private static int emeraldAppleMultiplier;
	private static int emerondAppleMultiplier;
	private static int godDiamondAppleMultiplier;
	private static int godEmeraldAppleMultiplier;
	private static int godEmerondAppleMultiplier;
	
	public static void initProps(File modConfigurationDirectory) {
		
		File mainFile = new File(modConfigurationDirectory + "/AppleBuffs.cfg");
		
		Configuration config = new Configuration(mainFile);
		
		useDiamondApple = config.get("useApples", "diamondApple", true).getBoolean(true);
		useGodDiamondApple = config.get("useApples", "godDiamondApple", true).getBoolean(true);
		useEmeraldApple = config.get("useApples", "emeraldApple", true).getBoolean(true);
		useGodEmeraldApple = config.get("useApples", "godEmeraldApple", true).getBoolean(true);
		useEmerondApple = config.get("useApples", "emerondApple", true).getBoolean(true);
		useGodEmerondApple = config.get("useApples", "godEmerondApple", true).getBoolean(true);
		
		diamondAppleMultiplier = config.get("buffMultipliers", "diamondApple", 
				AppleBuffsConstants.DEFAULT_DIAMOND_MULTIPLIER).getInt(AppleBuffsConstants.DEFAULT_DIAMOND_MULTIPLIER);
		godDiamondAppleMultiplier = config.get("buffMultipliers", "godDiamondApple", 
				AppleBuffsConstants.DEFAULT_GOD_DIAMOND_MULTIPLIER).getInt(AppleBuffsConstants.DEFAULT_GOD_DIAMOND_MULTIPLIER);
		emeraldAppleMultiplier = config.get("buffMultipliers", "emeraldApple", 
				AppleBuffsConstants.DEFAULT_EMERALD_MULTIPLIER).getInt(AppleBuffsConstants.DEFAULT_EMERALD_MULTIPLIER);
		godEmeraldAppleMultiplier = config.get("buffMultipliers", "godEmeraldApple", 
				AppleBuffsConstants.DEFAULT_GOD_EMERALD_MULTIPLIER).getInt(AppleBuffsConstants.DEFAULT_GOD_EMERALD_MULTIPLIER);
		emerondAppleMultiplier = config.get("buffMultipliers", "emerondApple", 
				AppleBuffsConstants.DEFAULT_EMEROND_MULTIPLIER).getInt(AppleBuffsConstants.DEFAULT_EMEROND_MULTIPLIER);
		godEmerondAppleMultiplier = config.get("buffMultipliers", "godEmerondApple", 
				AppleBuffsConstants.DEFAULT_GOD_EMEROND_MULTIPLIER).getInt(AppleBuffsConstants.DEFAULT_GOD_EMEROND_MULTIPLIER);
		
		/* Save the configuration file only if it has changed */
        if (config.hasChanged())
            config.save();
	}

	public static boolean useDiamondApple() {
		return useDiamondApple;
	}

	public static boolean useGodDiamondApple() {
		return useGodDiamondApple;
	}

	public static boolean useEmeraldApple() {
		return useEmeraldApple;
	}

	public static boolean useGodEmeraldApple() {
		return useGodEmeraldApple;
	}

	public static boolean useEmerondApple() {
		return useEmerondApple;
	}

	public static boolean useGodEmerondApple() {
		return useGodEmerondApple;
	}

	public static int getDiamondAppleMultiplier() {
		return diamondAppleMultiplier;
	}

	public static int getEmeraldAppleMultiplier() {
		return emeraldAppleMultiplier;
	}

	public static int getEmerondAppleMultiplier() {
		return emerondAppleMultiplier;
	}

	public static int getGodDiamondAppleMultiplier() {
		return godDiamondAppleMultiplier;
	}

	public static int getGodEmeraldAppleMultiplier() {
		return godEmeraldAppleMultiplier;
	}

	public static int getGodEmerondAppleMultiplier() {
		return godEmerondAppleMultiplier;
	}

}
