package net.ycrns.gg.shadowaddon.additions.blocks;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.core.BlockPos;



import java.util.Collections;
import java.util.List;


public class ShadowSteelBlock extends Block
{
    public ShadowSteelBlock()
    {
        super(BlockBehaviour.Properties.of(Material.HEAVY_METAL).sound(SoundType.COPPER).strength(4f, 1200f));
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
