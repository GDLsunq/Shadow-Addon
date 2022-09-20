package net.ycrns.gg.shadowaddon.event.additions.recipes;

import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ycrns.gg.shadowaddon.Shadowaddon;

public class ModRecipes
{
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, Shadowaddon.MODID);

    public static final RegistryObject<RecipeSerializer<AlloyingRecipeType>> ALLOYING_SERIALIZER =
            SERIALIZERS.register("alloying", () -> AlloyingRecipeType.Serializer.INSTANCE);

    public static void register(IEventBus bus)
    {
        SERIALIZERS.register(bus);
    }
}
