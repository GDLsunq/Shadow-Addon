package net.ycrns.gg.shadowaddon.event.additions.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.ycrns.gg.shadowaddon.event.additions.CreativeTab;

public class ShadowSteelSword extends SwordItem
{
    public ShadowSteelSword()
    {
        super(new Tier()
        {

            public int getUses()
            {
                return 3082;
            }


            public float getSpeed()
            {
                return 2;
            }


            public float getAttackDamageBonus()
            {
                return 9f;
            }


            public int getLevel()
            {
                return 1;
            }


            public int getEnchantmentValue()
            {
                return 25;
            }


            public Ingredient getRepairIngredient()
            {
                return Ingredient.of(new ItemStack((ItemLoader.SHADOW_STEEL_PLATE.get())));
            }
        }, 3, -3f, new Item.Properties().tab(CreativeTab.TAB_SHADOWADDON));

    }
}
