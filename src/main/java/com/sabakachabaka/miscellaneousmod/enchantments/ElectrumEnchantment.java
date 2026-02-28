package com.sabakachabaka.miscellaneousmod.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.server.ServerWorld;

public class ElectrumEnchantment extends Enchantment {
    public ElectrumEnchantment() {
        super(Rarity.RARE, EnchantmentType.WEAPON, new EquipmentSlotType[]{EquipmentSlotType.MAINHAND});
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }

    @Override
    public void doPostAttack(LivingEntity attacker, Entity target, int level) {
        if (!attacker.level.isClientSide && target instanceof LivingEntity) {
            ServerWorld world = (ServerWorld) attacker.level;
            LivingEntity victim = (LivingEntity) target;

            if (attacker.getRandom().nextFloat() < (0.15F * level)) {
                EntityType.LIGHTNING_BOLT.spawn(world, null, null, null,
                        victim.blockPosition(), SpawnReason.TRIGGERED, true, true);

                victim.addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 40, level));
            }
        }
    }
}