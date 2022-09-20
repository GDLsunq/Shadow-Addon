package net.ycrns.gg.shadowaddon.event.additions.items;

import net.minecraft.ChatFormatting;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.ycrns.gg.shadowaddon.event.additions.CreativeTab;

public class FifthArmorStar extends Item
{
    public FifthArmorStar()
    {
        super(new Item.Properties().tab(CreativeTab.TAB_SHADOWADDON).stacksTo(1).rarity(Rarity.create("Legendary", ChatFormatting.GOLD)));
    }
}
