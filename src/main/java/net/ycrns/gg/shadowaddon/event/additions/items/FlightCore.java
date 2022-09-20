package net.ycrns.gg.shadowaddon.event.additions.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.ycrns.gg.shadowaddon.event.additions.CreativeTab;

public class FlightCore extends Item
{
        public FlightCore()
        {
            super(new  Item.Properties().tab(CreativeTab.TAB_SHADOWADDON).stacksTo(64).rarity(Rarity.UNCOMMON));
        }

}
