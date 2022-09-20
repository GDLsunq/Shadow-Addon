package net.ycrns.gg.shadowaddon.event.additions.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.ycrns.gg.shadowaddon.event.additions.CreativeTab;

public class ShadowSteelHammer extends Item
{
    public ShadowSteelHammer()
    {
        super(new Item.Properties().tab(CreativeTab.TAB_SHADOWADDON).stacksTo(1).rarity(Rarity.COMMON).durability(100));
    }

    @Override
    public int getUseDuration(ItemStack itemStack)
    {
        return 0;
    }

    @Override
    public boolean hasCraftingRemainingItem()
    {
        return true;
    }

    @Override
    public boolean isRepairable(ItemStack itemstack)
    {
        return false;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemstack) {
        ItemStack retval = new ItemStack(this);
        retval.setDamageValue(itemstack.getDamageValue() + 1);
        if (retval.getDamageValue() >= retval.getMaxDamage()) {
            return ItemStack.EMPTY;
        }
        return retval;
    }

}
