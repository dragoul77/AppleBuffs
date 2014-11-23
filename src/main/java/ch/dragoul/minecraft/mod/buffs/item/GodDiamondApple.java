package ch.dragoul.minecraft.mod.buffs.item;

import ch.dragoul.minecraft.mod.buffs.AppleBuffsConstants;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class GodDiamondApple extends BaseBuffApple {
	
	public GodDiamondApple() {
		super(AppleType.DIAMOND_GOD);
	}
	
	@Override
	public boolean hasEffect(ItemStack item){
		return true;
	}
	
}
