package net.ycrns.gg.shadowaddon.additions;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.ycrns.gg.shadowaddon.additions.items.ItemLoader;

public class CreativeTab
{
    public static CreativeModeTab TAB_SHADOWADDON;
    public static void load()
    {
        TAB_SHADOWADDON = new CreativeModeTab("tabshadowaddon")
        {
            @Override
            public ItemStack makeIcon()
            {
                return new ItemStack(ItemLoader.SHADOW_STEEL_PLATE.get());
            }
            @OnlyIn(Dist.CLIENT)
            public boolean hasSearchBar()
            {
                return false;
            }
        };
    }

}

