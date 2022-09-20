package net.ycrns.gg.shadowaddon.event.additions.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.ycrns.gg.shadowaddon.event.additions.CreativeTab;

public class ShadowSteelShovel extends ShovelItem
{
    public ShadowSteelShovel() {
        super(new Tier() {
            public int getUses() {
                return 3082;
            }

            public float getSpeed() {
                return 12f;
            }

            public float getAttackDamageBonus() {
                return 4f;
            }

            public int getLevel() {
                return 4;
            }

            public int getEnchantmentValue() {
                return 25;
            }

            public Ingredient getRepairIngredient()
            {
                return Ingredient.of(new ItemStack((ItemLoader.SHADOW_STEEL_PLATE.get())));
            }
        }, 1, -3f, new Item.Properties().tab(CreativeTab.TAB_SHADOWADDON));
    }
}
