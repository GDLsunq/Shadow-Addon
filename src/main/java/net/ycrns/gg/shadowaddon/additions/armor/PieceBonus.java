package net.ycrns.gg.shadowaddon.additions.armor;

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
public class PieceBonus {
    public static boolean isHelmetEquipped(ServerPlayer player) {
        return player.getItemBySlot(EquipmentSlot.HEAD).getItem() instanceof ShadowSteelArmor;
    }

    /* @SubscribeEvent
    public static void playerTickUpdate(LivingEquipmentChangeEvent event) {
        if(event.getEntity() instanceof Player player) {
            Abilities cap = player.getAbilities();
            if(!player.level.isClientSide) {
                if(!player.hasEffect(MobEffects.NIGHT_VISION) && PieceBonus.isHelmetEquipped((ServerPlayer) player)) {
                    player.addEffect;
                    player.onUpdateAbilities();
                }

                if(!ShadowSteelArmor.isArmorEquipped((ServerPlayer) player) && cap.mayfly && !player.isSpectator() && !player.isCreative()) {
                    cap.mayfly = false;
                    cap.flying = false;
                    player.onUpdateAbilities();
                }
            }
        }
    }*/
}

