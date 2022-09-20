package net.ycrns.gg.shadowaddon.event.additions.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.ycrns.gg.shadowaddon.Shadowaddon.MODID;

public class BlockLoader
{
    public static final DeferredRegister<Block> REGISTRY =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    public static final DeferredRegister<BlockEntityType<?>> BLOCKENTITY =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, MODID);

    public static final RegistryObject<Block> SHADOW_STEEL_BLOCK = REGISTRY.register
            ("shadow_steel_block", () -> new ShadowSteelBlock());
    public static final RegistryObject<Block> ENHANCED_SHADOW_STEEL_BLOCK = REGISTRY.register
            ("enhanced_shadow_steel_block", () -> new EnhancedShadowSteelBlock());


}
