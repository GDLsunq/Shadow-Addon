package net.ycrns.gg.shadowaddon.additions.items;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;


import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ycrns.gg.shadowaddon.additions.CreativeTab;
import net.ycrns.gg.shadowaddon.additions.blocks.BlockLoader;
import net.ycrns.gg.shadowaddon.additions.armor.ShadowSteelArmor;

import static net.ycrns.gg.shadowaddon.Shadowaddon.MODID;

public class ItemLoader
{
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);


    //Reinforced Tool Handle
    public static final RegistryObject<Item> REINFORCED_TOOL_HANDLE = REGISTRY.register
            ("reinforced_tool_handle", () -> new ReinforcedToolHandle());
    //Shadow Steel Plate
    public static final RegistryObject<Item> SHADOW_STEEL_PLATE = REGISTRY.register
            ("shadow_steel_plate", () -> new ShadowSteelPlate());
    //Shadow Steel Hammer
    public static final RegistryObject<Item> SHADOW_STEEL_HAMMER = REGISTRY.register
            ("shadow_steel_hammer", () -> new ShadowSteelHammer());
    //Shadow Steel Blockitem
    public static final RegistryObject<Item> SHADOW_STEEL_BLOCK = block(BlockLoader.SHADOW_STEEL_BLOCK,
            CreativeTab.TAB_SHADOWADDON);
    //Tools
    public static final RegistryObject<Item> SHADOW_STEEL_PICKAXE = REGISTRY.register
            ("shadow_steel_pickaxe", () -> new ShadowSteelPickaxe());
    public static final RegistryObject<Item> SHADOW_STEEL_SWORD = REGISTRY.register
            ("shadow_steel_sword", () -> new ShadowSteelSword());
    public static final RegistryObject<Item> SHADOW_STEEL_AXE = REGISTRY.register
            ("shadow_steel_axe", () -> new ShadowSteelAxe());
    public static final RegistryObject<Item> SHADOW_STEEL_SHOVEL = REGISTRY.register
            ("shadow_steel_shovel", () -> new ShadowSteelShovel());

    //Armor
    public static final RegistryObject<Item> SHADOW_STEEL_HELMET = REGISTRY.register
            ("shadow_steel_helmet", () -> new ShadowSteelArmor.Helmet());
    public static final RegistryObject<Item> SHADOW_STEEL_CHESTPLATE = REGISTRY.register
            ("shadow_steel_chestplate", () -> new ShadowSteelArmor.Chestplate());
    public static final RegistryObject<Item> SHADOW_STEEL_LEGGINGS = REGISTRY.register
            ("shadow_steel_leggings", () -> new ShadowSteelArmor.Leggings());
    public static final RegistryObject<Item> SHADOW_STEEL_BOOTS = REGISTRY.register
            ("shadow_steel_boots", () -> new ShadowSteelArmor.Boots());



    private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab)
    {
        return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }
}
