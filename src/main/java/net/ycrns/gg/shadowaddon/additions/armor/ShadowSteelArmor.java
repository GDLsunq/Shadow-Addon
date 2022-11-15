package net.ycrns.gg.shadowaddon.additions.armor;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.ForgeRegistries;
import net.ycrns.gg.shadowaddon.additions.CreativeTab;
import net.ycrns.gg.shadowaddon.additions.items.ItemLoader;


public abstract class ShadowSteelArmor extends ArmorItem
{
    public ShadowSteelArmor(EquipmentSlot slot, Item.Properties properties)
    {

        super(new ArmorMaterial()
        {
            @Override
            public int getDurabilityForSlot(EquipmentSlot slot)
            {
                return new int[]{693,748,841,638}[slot.getIndex()];
            }

            @Override
            public int getDefenseForSlot(EquipmentSlot slot)
            {
                return new int[]{4, 5, 7, 4}[slot.getIndex()];
            }

            @Override
            public int getEnchantmentValue()
            {
                return 30;
            }

            @Override
            public SoundEvent getEquipSound()
            {
                return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_diamond"));
            }

            @Override
            public Ingredient getRepairIngredient()
            {
                return Ingredient.of(new ItemStack((ItemLoader.SHADOW_STEEL_PLATE.get())));
            }

            @Override
            public String getName()
            {
                return "shadow_steel_armor";
            }

            @Override
            public float getToughness()
            {
                return 4;
            }

            @Override
            public float getKnockbackResistance()
            {
                return 0.1f;
            }
        }, slot, properties);

    }
    public static class Helmet extends ShadowSteelArmor {
        public Helmet() {
            super(EquipmentSlot.HEAD, new Item.Properties().tab(CreativeTab.TAB_SHADOWADDON).fireResistant().rarity(Rarity.RARE));
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "shadowaddon:textures/models/armor/shadow_steel_armor_layer_1.png";
        }

        public void onArmorTick(ItemStack stack, Level world, Player player) {
            if (!world.isClientSide()) {
                player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 400));
            }
        }
    }

    public static class Chestplate extends ShadowSteelArmor {
        public Chestplate() {
            super(EquipmentSlot.CHEST, new Item.Properties().tab(CreativeTab.TAB_SHADOWADDON).fireResistant().rarity(Rarity.RARE));
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "shadowaddon:textures/models/armor/shadow_steel_armor_layer_1.png";
        }

        public void onArmorTick(ItemStack stack, Level world, Player player) {
            if (!world.isClientSide()) {
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 100,1));
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 100,1));
            }
        }
    }

    public static class Leggings extends ShadowSteelArmor {
        public Leggings() {
            super(EquipmentSlot.LEGS, new Item.Properties().tab(CreativeTab.TAB_SHADOWADDON).fireResistant().rarity(Rarity.RARE));
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "shadowaddon:textures/models/armor/shadow_steel_armor_layer_2.png";
        }

        public void onArmorTick(ItemStack stack, Level world, Player player) {
            if (!world.isClientSide()) {
                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100,2));
            }
        }


    }

    public static class Boots extends ShadowSteelArmor {
        public Boots() {
            super(EquipmentSlot.FEET, new Item.Properties().tab(CreativeTab.TAB_SHADOWADDON).fireResistant().rarity(Rarity.RARE));
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "shadowaddon:textures/models/armor/shadow_steel_armor_layer_1.png";
        }

        public void onArmorTick(ItemStack stack, Level world, Player player) {
            if (!world.isClientSide()) {
                player.addEffect(new MobEffectInstance(MobEffects.JUMP, 100, 1));
            }
        }
    }


    @Override
    public boolean makesPiglinsNeutral(ItemStack stack, LivingEntity wearer)
    {
        return true;
    }

}



