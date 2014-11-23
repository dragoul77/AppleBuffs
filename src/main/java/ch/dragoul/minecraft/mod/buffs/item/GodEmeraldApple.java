package ch.dragoul.minecraft.mod.buffs.item;

import net.minecraft.item.ItemStack;

public class GodEmeraldApple extends BaseBuffApple {

	public GodEmeraldApple() {
		super(AppleType.EMERALD_GOD);
	}

	@Override
	public boolean hasEffect(ItemStack item){
		return true;
	}
	
}
