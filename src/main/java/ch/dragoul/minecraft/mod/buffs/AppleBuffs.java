package ch.dragoul.minecraft.mod.buffs;

import java.io.File;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(
		modid = AppleBuffsConstants.MOD_ID, 
		name = AppleBuffsConstants.MOD_NAME, 
		version = AppleBuffsConstants.MOD_VERSION)
public class AppleBuffs {

	@SidedProxy(clientSide = AppleBuffsConstants.CLIENTPROXY, serverSide = AppleBuffsConstants.SERVERPROXY)
	public static ServerProxy proxy;
	
	@EventHandler
    public void init(FMLInitializationEvent event)
    {
		
    }
	
	@EventHandler
	public void preLoad(FMLPreInitializationEvent event) {
		
		AppleBuffsConfig.initProps(event.getModConfigurationDirectory());
		
		ItemManager.init();
		RecipeManager.init();
		proxy.registerRenderInfo();
	}

	@EventHandler
	public void postLoad(FMLPostInitializationEvent event) {
		
	}
	
	public static CreativeTabs tabCustom = new CreativeTabs("tabName") {
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return ItemManager.emerondApple;
	    }
	};
	
}
