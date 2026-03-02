package com.sabakachabaka.miscellaneousmod.effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.potion.EffectType;
import net.minecraft.util.DamageSource;
import net.minecraft.potion.Effect;

public class KillEffect extends Effect {

    public KillEffect() {
        super(EffectType.HARMFUL, 0xFF0000); // красный цвет
    }

    @Override
    public void applyEffectTick(LivingEntity entity, int amplifier) {
        if (entity instanceof MobEntity) {
            entity.hurt(DamageSource.MAGIC, Float.MAX_VALUE);
        }
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }
}