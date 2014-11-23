package ch.dragoul.minecraft.mod.buffs.item;

import java.util.List;

import ch.dragoul.minecraft.mod.buffs.AppleBuffsConstants;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class BaseBuffApple extends ItemFood {
	
	private AppleType _type;

	public BaseBuffApple(AppleType type) {
		super(type.getHealAmount(), type.getSaturationModifier(), false);
		_type = type;
		setMaxDamage(0);
		setHasSubtypes(true);
		setAlwaysEdible();
	}
    
	@Override
	protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
		if (world.isRemote)
			return;

        addBuffs(player, Potion.field_76444_x, 4, 1200); // Absorption, add an extra minute
        addBuffs(player, Potion.resistance);
        addBuffs(player, Potion.digSpeed);
        addBuffs(player, Potion.damageBoost);
	}
	
	private void addBuffs(EntityPlayer player, Potion potion) {
		addBuffs(player, potion, 0, 0);
	}

	private void addBuffs(EntityPlayer player, Potion potion, int apmlifier, int durationOffset) {
		PotionEffect potionEffect;
		int duration = 0;
		potionEffect = player.getActivePotionEffect(potion);
        if (potionEffect != null)
            duration = potionEffect.getDuration();
        // add the offset if it is not yet added
        duration = duration == 0 ? durationOffset : 0;
        duration = duration + 60 * 20 * _type.getMultiplier();
        duration = duration > AppleBuffsConstants.MAX_BUFF_TIME ? AppleBuffsConstants.MAX_BUFF_TIME : duration;
        
        player.addPotionEffect(new PotionEffect(potion.id, duration, apmlifier));
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean p_77624_4_) {
		super.addInformation(stack, player, list, p_77624_4_);
		String color = "\u00a7";
		switch(_type.getCharacteristic()) {
			case BASIC:
				color += "b";
				break;
			case GOD:
				color += "d";
				break;
		}
		stack.setStackDisplayName(color + stack.getDisplayName());
		
		list.add("\u00a79" + _type.getMultiplier() + " minute buff");
	}
	
}
