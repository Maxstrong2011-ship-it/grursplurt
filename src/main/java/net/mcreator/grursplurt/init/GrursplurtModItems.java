/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.grursplurt.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.grursplurt.item.PlaceholderItemDoNotAlterItem;
import net.mcreator.grursplurt.GrursplurtMod;

import java.util.function.Function;

public class GrursplurtModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(GrursplurtMod.MODID);
	public static final DeferredItem<Item> PLACEHOLDER_ITEM_DO_NOT_ALTER;
	static {
		PLACEHOLDER_ITEM_DO_NOT_ALTER = register("placeholder_item_do_not_alter", PlaceholderItemDoNotAlterItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, Item.Properties::new);
	}
}