package ch.dragoul.minecraft.mod.buffs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;
import ch.dragoul.minecraft.mod.buffs.item.*;

public class ItemManager {
	
	public static DiamondApple diamondApple;
	public static GodDiamondApple godDiamondApple;
	public static EmeraldApple emeraldApple;
	public static GodEmeraldApple godEmeraldApple;
	public static EmerondApple emerondApple;
	public static GodEmerondApple godEmerondApple;
	
	public static void init() {
		load();
		register();
	}
	
	private static void load() {
		diamondApple = new DiamondApple();
		diamondApple
			.setUnlocalizedName("diamondApple")
			.setCreativeTab(AppleBuffs.tabCustom)
			.setTextureName(AppleBuffsConstants.MOD_ID + ":" + AppleBuffsConstants.IMG_DIAMOND_APPLE);
		
		godDiamondApple = new GodDiamondApple();
		godDiamondApple
			.setUnlocalizedName("godDiamondApple")
			.setCreativeTab(AppleBuffs.tabCustom)
			.setTextureName(AppleBuffsConstants.MOD_ID + ":" + AppleBuffsConstants.IMG_DIAMOND_APPLE); 
		
		emeraldApple = new EmeraldApple();
		emeraldApple
			.setUnlocalizedName("emeraldApple")
			.setCreativeTab(AppleBuffs.tabCustom)
			.setTextureName(AppleBuffsConstants.MOD_ID + ":" + AppleBuffsConstants.IMG_EMERALD_APPLE); 
		
		godEmeraldApple = new GodEmeraldApple();
		godEmeraldApple
			.setUnlocalizedName("godEmeraldApple")
			.setCreativeTab(AppleBuffs.tabCustom)
			.setTextureName(AppleBuffsConstants.MOD_ID + ":" + AppleBuffsConstants.IMG_EMERALD_APPLE); 
		
		emerondApple = new EmerondApple();
		emerondApple
			.setUnlocalizedName("emerondApple")
			.setCreativeTab(AppleBuffs.tabCustom)
			.setTextureName(AppleBuffsConstants.MOD_ID + ":" + AppleBuffsConstants.IMG_EMEROND_APPLE);
		
		godEmerondApple = new GodEmerondApple();
		godEmerondApple
			.setUnlocalizedName("godEmerondApple")
			.setCreativeTab(AppleBuffs.tabCustom)
			.setTextureName(AppleBuffsConstants.MOD_ID + ":" + AppleBuffsConstants.IMG_EMEROND_APPLE);
	}
	
	private static void register() {
		if (AppleBuffsConfig.useDiamondApple())
			GameRegistry.registerItem(diamondApple, diamondApple.getUnlocalizedName());
		if (AppleBuffsConfig.useGodDiamondApple())
			GameRegistry.registerItem(godDiamondApple, godDiamondApple.getUnlocalizedName());
		if (AppleBuffsConfig.useEmeraldApple())
			GameRegistry.registerItem(emeraldApple, emeraldApple.getUnlocalizedName());
		if (AppleBuffsConfig.useGodEmeraldApple())
			GameRegistry.registerItem(godEmeraldApple, godEmeraldApple.getUnlocalizedName());
		if (AppleBuffsConfig.useEmerondApple())
			GameRegistry.registerItem(emerondApple, emerondApple.getUnlocalizedName());
		if (AppleBuffsConfig.useGodEmerondApple())
			GameRegistry.registerItem(godEmerondApple, godEmerondApple.getUnlocalizedName());
	}

}
