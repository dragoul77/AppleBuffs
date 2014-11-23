package ch.dragoul.minecraft.mod.buffs.item;

import net.minecraft.item.ItemStack;

public class GodDiamondApple extends BaseBuffApple {
	
	public GodDiamondApple() {
		super(AppleType.DIAMOND_GOD);
	}
	
	@Override
	public boolean hasEffect(ItemStack item){
		return true;
	}
	
}
