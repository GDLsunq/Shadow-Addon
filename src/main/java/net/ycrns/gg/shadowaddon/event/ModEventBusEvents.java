package net.ycrns.gg.shadowaddon.event;

import net.minecraft.core.Registry;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.ycrns.gg.shadowaddon.additions.recipes.AlloyingRecipeType;


public class ModEventBusEvents
{
    @SubscribeEvent
    public static void registerRecipeTypes(final RegistryEvent.Register<RecipeSerializer<?>> event)
    {
        Registry.register(Registry.RECIPE_TYPE, AlloyingRecipeType.Type.ID, AlloyingRecipeType.Type.INSTANCE);
    }
}
