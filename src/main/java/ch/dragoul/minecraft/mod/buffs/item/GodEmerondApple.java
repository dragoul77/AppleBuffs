package ch.dragoul.minecraft.mod.buffs.item;

import net.minecraft.item.ItemStack;

public class GodEmerondApple extends BaseBuffApple {

	public GodEmerondApple() {
		super(AppleType.EMEROND_GOD);
	}

	@Override
	public boolean hasEffect(ItemStack item){
		return true;
	}
	
}
