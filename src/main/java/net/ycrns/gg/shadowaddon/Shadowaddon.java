package net.ycrns.gg.shadowaddon;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.ycrns.gg.shadowaddon.additions.CreativeTab;
import net.ycrns.gg.shadowaddon.additions.blocks.BlockLoader;
import net.ycrns.gg.shadowaddon.additions.items.ItemLoader;
import net.ycrns.gg.shadowaddon.additions.recipes.ModRecipes;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("shadowaddon")
public class Shadowaddon
{
    public static final String MODID = "shadowaddon";
    private static final Logger LOGGER = LogManager.getLogger();
    IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();



    public Shadowaddon()
    {
        //Creative Tab load
        CreativeTab.load();
        //Item Register
        ItemLoader.REGISTRY.register(bus);
        //Block Register
        BlockLoader.REGISTRY.register(bus);
        //Recipe Type
        ModRecipes.register(bus);
        //BlockEntity Register


        MinecraftForge.EVENT_BUS.register(this);
    }
}