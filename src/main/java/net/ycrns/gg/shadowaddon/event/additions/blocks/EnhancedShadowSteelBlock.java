package net.ycrns.gg.shadowaddon.event.additions.blocks;

import net.minecraft.world.item.ItemStack;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.storage.loot.LootContext;

import java.util.Collections;
import java.util.List;

public class EnhancedShadowSteelBlock extends Block
{
    public EnhancedShadowSteelBlock()
    {
        super(BlockBehaviour.Properties.of(Material.HEAVY_METAL).sound(SoundType.METAL).strength(5f, 2000f));
    }

    @Override
    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder)
    {
        List<ItemStack> dropsOriginal = super.getDrops(state, builder);
        if(!dropsOriginal.isEmpty())
            return dropsOriginal;
        return Collections.singletonList(new ItemStack(this, 1));
    }
}
