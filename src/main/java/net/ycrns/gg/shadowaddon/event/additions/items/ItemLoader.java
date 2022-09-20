package net.ycrns.gg.shadowaddon.event.additions.items;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;


import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ycrns.gg.shadowaddon.event.additions.CreativeTab;
import net.ycrns.gg.shadowaddon.event.additions.blocks.BlockLoader;
import net.ycrns.gg.shadowaddon.event.additions.armor.ShadowSteelArmor;

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
    //Flight Core
    public static final RegistryObject<Item> FLIGHT_CORE = REGISTRY.register
            ("flight_core", () -> new FlightCore());
    //Enhanced Shadow Steel
    public static final RegistryObject<Item>  ENHANCED_SHADOW_STEEL = REGISTRY.register
            ("enhanced_shadow_steel", () -> new EnhancedShadowSteel());
    //Shadow Steel Dust
    public static final RegistryObject<Item> SHADOW_STEEL_DUST = REGISTRY.register
            ("shadow_steel_dust", () -> new ShadowSteelDust());
    //Hypergolic Coal
    public static final RegistryObject<Item> HYPERGOLIC_COAL = REGISTRY.register
            ("hypergolic_fuel", () -> new HypergolicFuel());
    //First Armor Star
    public static final RegistryObject<Item> FIRST_ARMOR_STAR = REGISTRY.register
            ("first_armor_star", () -> new FirstArmorStar());
    //Second Armor Star
    public static final RegistryObject<Item> SECOND_ARMOR_STAR = REGISTRY.register
            ("second_armor_star", () -> new SecondArmorStar());
    //Third Armor Star
    public static final RegistryObject<Item> THIRD_ARMOR_STAR = REGISTRY.register
            ("third_armor_star", () -> new ThirdArmorStar());
    //First Armor Star
    public static final RegistryObject<Item> FOURTH_ARMOR_STAR = REGISTRY.register
            ("fourth_armor_star", () -> new FourthArmorStar());
    //First Armor Star
    public static final RegistryObject<Item> FIFTH_ARMOR_STAR = REGISTRY.register
            ("fifth_armor_star", () -> new FifthArmorStar());
    //Block Items
    public static final RegistryObject<Item> SHADOW_STEEL_BLOCK = block
            (BlockLoader.SHADOW_STEEL_BLOCK,CreativeTab.TAB_SHADOWADDON);
    public static final RegistryObject<Item> ENHANCED_SHADOW_STEEL_BLOCK =block
            (BlockLoader.ENHANCED_SHADOW_STEEL_BLOCK,CreativeTab.TAB_SHADOWADDON);



    //Tools
    public static final RegistryObject<Item> SHADOW_STEEL_PICKAXE = REGISTRY.register
            ("shadow_steel_pickaxe", () -> new ShadowSteelPickaxe());
    public static final RegistryObject<Item> SHADOW_STEEL_SWORD = REGISTRY.register
            ("shadow_steel_sword", () -> new ShadowSteelSword());
    public static final RegistryObject<Item> SHADOW_STEEL_AXE = REGISTRY.register
            ("shadow_steel_axe", () -> new ShadowSteelAxe());
    public static final RegistryObject<Item> SHADOW_STEEL_SHOVEL = REGISTRY.register
            ("shadow_steel_shovel", () -> new ShadowSteelShovel());

    //Shadow Steel Armor 0 Stars
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
