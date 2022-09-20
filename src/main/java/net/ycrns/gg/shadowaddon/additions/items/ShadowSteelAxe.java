package net.ycrns.gg.shadowaddon.additions.items;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.ycrns.gg.shadowaddon.additions.CreativeTab;

public class ShadowSteelAxe extends AxeItem
{
        public ShadowSteelAxe()
        {
                super(new Tier()
                {

                        public int getUses()
                        {
                                return 3082;
                        }


                        public float getSpeed()
                        {
                                return 1;
                        }


                        public float getAttackDamageBonus()
                        {
                                return 12;
                        }


                        public int getLevel()
                        {
                                return 4;
                        }


                        public int getEnchantmentValue()
                        {
                                return 25;
                        }


                        public Ingredient getRepairIngredient()
                        {
                                return Ingredient.of(new ItemStack((ItemLoader.SHADOW_STEEL_PLATE.get())));
                        }
                }, 1, -3, new Item.Properties().tab(CreativeTab.TAB_SHADOWADDON));
        }
}
