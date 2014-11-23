package ch.dragoul.minecraft.mod.buffs;

import sun.applet.AppletClassLoader;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeManager {
	
	public static void init() {
		initCraftingRecipes();
		initSmeltingRecipes();
	}
	
	private static void initCraftingRecipes() {
		// Diamond Apple
		if (AppleBuffsConfig.useDiamondApple()) 
		{
			GameRegistry.addShapedRecipe(
					new ItemStack(ItemManager.diamondApple, 1, 0), 
					new Object[]{
						" D ", 
						"DAD", 
						" D ", 
						'D', Items.diamond, 'A', Items.apple});
			GameRegistry.addShapedRecipe(
					new ItemStack(ItemManager.diamondApple, 1, 0), 
					new Object[]{
						"D D", 
						" A ", 
						"D D", 
						'D', Items.diamond, 'A', Items.apple});			
		}
		
		// God Diamond Apple
		if (AppleBuffsConfig.useGodDiamondApple()) 
		{
			GameRegistry.addShapedRecipe(
					new ItemStack(ItemManager.godDiamondApple, 1, 1), 
					new Object[]{
						" D ", 
						"DAD", 
						" D ", 
						'D', Blocks.diamond_block, 'A', Items.apple});
			GameRegistry.addShapedRecipe(
					new ItemStack(ItemManager.godDiamondApple, 1, 1), 
					new Object[]{
						"D D", 
						" A ", 
						"D D", 
						'D', Blocks.diamond_block, 'A', Items.apple});			
		}
		
		// Emerald Apple
		if (AppleBuffsConfig.useEmeraldApple()) 
		{
			GameRegistry.addShapedRecipe(
					new ItemStack(ItemManager.emeraldApple, 1, 0), 
					new Object[]{
						" E ", 
						"EAE", 
						" E ", 
						'E', Items.emerald, 'A', Items.apple});
			GameRegistry.addShapedRecipe(
					new ItemStack(ItemManager.emeraldApple, 1, 0), 
					new Object[]{
						"E E", 
						" A ", 
						"E E", 
						'E', Items.emerald, 'A', Items.apple});			
		}
		
		// God Emerald Apple
		if (AppleBuffsConfig.useGodEmeraldApple()) 
		{
			GameRegistry.addShapedRecipe(
					new ItemStack(ItemManager.godEmeraldApple, 1, 1), 
					new Object[]{
						" E ", 
						"EAE", 
						" E ", 
						'E', Blocks.emerald_block, 'A', Items.apple});
			GameRegistry.addShapedRecipe(
					new ItemStack(ItemManager.godEmeraldApple, 1, 1), 
					new Object[]{
						"E E", 
						" A ", 
						"E E",  
						'E', Blocks.emerald_block, 'A', Items.apple});			
		}
		
		// Emerond Apple
		if (AppleBuffsConfig.useEmerondApple()) 
		{
			GameRegistry.addShapedRecipe(
					new ItemStack(ItemManager.emerondApple, 1, 0), 
					new Object[]{
						"DED", 
						"EAE", 
						"DED", 
						'E', Items.emerald, 'D', Items.diamond, 'A', Items.apple});
			GameRegistry.addShapedRecipe(
					new ItemStack(ItemManager.emerondApple, 1, 0), 
					new Object[]{
						"EDE", 
						"DAD", 
						"EDE", 
						'E', Items.emerald, 'D', Items.diamond, 'A', Items.apple});
		}
		
		// God Emerond Apple
		if (AppleBuffsConfig.useGodEmerondApple()) 
		{
			GameRegistry.addShapedRecipe(
					new ItemStack(ItemManager.godEmerondApple, 1, 1), 
					new Object[]{
						"DED", 
						"EAE", 
						"DED", 
						'E', Blocks.emerald_block, 'D', Blocks.diamond_block, 'A', Items.apple});
			GameRegistry.addShapedRecipe(
					new ItemStack(ItemManager.godEmerondApple, 1, 1), 
					new Object[]{
						"EDE", 
						"DAD", 
						"EDE", 
						'E', Blocks.emerald_block, 'D', Blocks.diamond_block, 'A', Items.apple});			
		}
	}
	
	private static void initSmeltingRecipes() {
		
	}

}
