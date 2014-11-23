package ch.dragoul.minecraft.mod.buffs.item;

import ch.dragoul.minecraft.mod.buffs.AppleBuffsConfig;
import ch.dragoul.minecraft.mod.buffs.AppleBuffsConstants;

public enum AppleType {
	
	DIAMOND(AppleBuffsConfig.getDiamondAppleMultiplier(), 4, 2.0F, ItemCharacteristic.BASIC),
	DIAMOND_GOD(AppleBuffsConfig.getGodDiamondAppleMultiplier(), 20, 4.0F, ItemCharacteristic.GOD),
	EMERALD(AppleBuffsConfig.getEmeraldAppleMultiplier(), 8, 3.0F, ItemCharacteristic.BASIC),
	EMERALD_GOD(AppleBuffsConfig.getGodEmeraldAppleMultiplier(), 20, 4.0F, ItemCharacteristic.GOD),
	EMEROND(AppleBuffsConfig.getEmerondAppleMultiplier(), 12, 3.0F, ItemCharacteristic.BASIC),
	EMEROND_GOD(AppleBuffsConfig.getGodEmerondAppleMultiplier(), 20, 5.0F, ItemCharacteristic.GOD);
	
	private int _multiplier;
	private int _healAmount;
	private float _saturationModifier;
	private ItemCharacteristic _characteristic;
	AppleType(int multiplier, int healAmount, float saturationModifier, ItemCharacteristic characteristic) {
		_multiplier = multiplier;
		_healAmount = healAmount;
		_saturationModifier = saturationModifier;
		_characteristic = characteristic;
	}
	
	public int getMultiplier() {
		return _multiplier;
	}
	public int getHealAmount() {
		return _healAmount;
	}
	public float getSaturationModifier() {
		return _saturationModifier;
	}
	public ItemCharacteristic getCharacteristic() {
		return _characteristic;
	}
}
