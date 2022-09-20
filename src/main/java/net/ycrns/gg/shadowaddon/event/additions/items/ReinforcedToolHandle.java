package net.ycrns.gg.shadowaddon.event.additions.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.ycrns.gg.shadowaddon.event.additions.CreativeTab;

public class ReinforcedToolHandle extends Item
{
    public ReinforcedToolHandle()
    {
        super(new  Item.Properties().tab(CreativeTab.TAB_SHADOWADDON).stacksTo(64).rarity(Rarity.COMMON));
    }
    @Override
    public int getUseDuration(ItemStack itemStack)
    {
        return 0;
    }
}
