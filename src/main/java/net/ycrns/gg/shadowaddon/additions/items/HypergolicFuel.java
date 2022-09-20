package net.ycrns.gg.shadowaddon.additions.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.crafting.RecipeType;
import net.ycrns.gg.shadowaddon.additions.CreativeTab;

import javax.annotation.Nullable;

public class HypergolicFuel extends Item
{
        public HypergolicFuel()
        {
                super(new  Item.Properties().tab(CreativeTab.TAB_SHADOWADDON).stacksTo(8).rarity(Rarity.RARE));
        }
        @Override
        public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType)
        {
                return 6400;
        }
}
