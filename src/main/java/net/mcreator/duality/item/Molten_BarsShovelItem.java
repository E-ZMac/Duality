
package net.mcreator.duality.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.duality.init.DualityModItems;

public class Molten_BarsShovelItem extends ShovelItem {
	public Molten_BarsShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 323;
			}

			public float getSpeed() {
				return 7f;
			}

			public float getAttackDamageBonus() {
				return 3f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 17;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(DualityModItems.MOLTEN_BARS_INGOT.get()));
			}
		}, 1, 0f, new Item.Properties());
	}
}
