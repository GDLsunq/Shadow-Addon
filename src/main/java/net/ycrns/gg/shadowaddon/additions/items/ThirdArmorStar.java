package net.ycrns.gg.shadowaddon.additions.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.ycrns.gg.shadowaddon.additions.CreativeTab;

public class ThirdArmorStar extends Item
{
    public ThirdArmorStar()
    {
        super(new Item.Properties().tab(CreativeTab.TAB_SHADOWADDON).stacksTo(1).rarity(Rarity.RARE));
    }
}
