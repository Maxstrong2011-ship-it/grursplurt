package net.mcreator.grursplurt.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PlaceholderItemDoNotAlterItem extends Item {
	public PlaceholderItemDoNotAlterItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).stacksTo(1));
	}
}