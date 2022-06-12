package net.ycrns.gg.shadowaddon.additions.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.ycrns.gg.shadowaddon.additions.CreativeTab;

public class ShadowSteelPlate extends Item
{
    public ShadowSteelPlate()
    {
        super(new  Item.Properties().tab(CreativeTab.TAB_SHADOWADDON).stacksTo(64).rarity(Rarity.COMMON));
    }

    @Override
    public int getUseDuration(ItemStack itemStack)
    {
        return 0;
    }
}
