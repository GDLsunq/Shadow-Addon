package net.ycrns.gg.shadowaddon.event;

import net.minecraft.core.Registry;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.ycrns.gg.shadowaddon.Shadowaddon;
import net.ycrns.gg.shadowaddon.event.additions.recipes.AlloyingRecipeType;

@Mod.EventBusSubscriber(modid = Shadowaddon.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents
{
    @SubscribeEvent
    public static void registerRecipeTypes(final RegistryEvent.Register<RecipeSerializer<?>> event)
    {
        Registry.register(Registry.RECIPE_TYPE, AlloyingRecipeType.Type.ID, AlloyingRecipeType.Type.INSTANCE);
    }
}
