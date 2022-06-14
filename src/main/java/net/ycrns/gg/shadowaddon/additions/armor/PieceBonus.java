package net.ycrns.gg.shadowaddon.additions.armor;
/**
import net.minecraft.server.commands.ExecuteCommand;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Abilities;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.living.LivingEquipmentChangeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.ycrns.gg.shadowaddon.Shadowaddon;

import java.util.Objects;

@Mod.EventBusSubscriber(modid = Shadowaddon.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class PieceBonus
{
    public static boolean isHelmetEquipped(ServerPlayer player)
    {
        return player.getItemBySlot(EquipmentSlot.HEAD).getItem() instanceof ShadowSteelArmor;
    }

    public static boolean isChestEquipped(ServerPlayer player)
    {
        return player.getItemBySlot(EquipmentSlot.CHEST).getItem() instanceof ShadowSteelArmor;
    }

    public static boolean isLegsEquipped(ServerPlayer player)
    {
        return player.getItemBySlot(EquipmentSlot.LEGS).getItem() instanceof ShadowSteelArmor;
    }

    public static boolean isFeetEquipped(ServerPlayer player)
    {
        return player.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof ShadowSteelArmor;
    }

     @SubscribeEvent
    public static void playerTickUpdate(LivingEquipmentChangeEvent event)
     {
        if(event.getEntity() instanceof Player player)
        {
            Abilities cap = player.getAbilities();
            if(!player.level.isClientSide)
            {
                if(!player.hasEffect(MobEffects.NIGHT_VISION) && PieceBonus.isHelmetEquipped((ServerPlayer) player))
                {
                    player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 20, 20 ));
                    player.onUpdateAbilities();
                }

                if(!player.hasEffect(MobEffects.DAMAGE_BOOST) && PieceBonus.isChestEquipped((ServerPlayer) player))
                {
                    player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1, 2 ));
                    player.onUpdateAbilities();
                }

                if(!player.hasEffect(MobEffects.MOVEMENT_SPEED) && PieceBonus.isLegsEquipped((ServerPlayer) player))
                {
                    player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1, 2 ));
                    player.onUpdateAbilities();
                }

                if(!player.hasEffect(MobEffects.JUMP) && PieceBonus.isFeetEquipped((ServerPlayer) player))
                {
                    player.addEffect(new MobEffectInstance(MobEffects.JUMP, 1, 2 ));
                    player.onUpdateAbilities();
                }

            }
        }
    }
}
 **/
 

