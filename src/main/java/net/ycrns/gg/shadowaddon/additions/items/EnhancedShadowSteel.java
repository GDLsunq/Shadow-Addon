package net.ycrns.gg.shadowaddon.additions.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.ycrns.gg.shadowaddon.additions.CreativeTab;

public class EnhancedShadowSteel extends Item
{
    public EnhancedShadowSteel()
    {
        super(new Item.Properties().tab(CreativeTab.TAB_SHADOWADDON).stacksTo(64).rarity(Rarity.RARE).fireResistant());
    }
}
