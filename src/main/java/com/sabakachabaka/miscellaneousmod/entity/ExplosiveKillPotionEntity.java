package com.sabakachabaka.miscellaneousmod.entity;

import com.sabakachabaka.miscellaneousmod.effects.ModEffects;
import com.sabakachabaka.miscellaneousmod.items.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.projectile.ProjectileItemEntity;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

import java.util.List;

public class ExplosiveKillPotionEntity extends ProjectileItemEntity {

    public ExplosiveKillPotionEntity(EntityType<? extends ExplosiveKillPotionEntity> type, World world) {
        super(type, world);
    }

    public ExplosiveKillPotionEntity(World world, LivingEntity thrower) {
        super(ModEntities.EXPLOSIVE_POTION.get(), thrower.getX(), thrower.getEyeY() - 0.1, thrower.getZ(), world);
    }

    @Override
    public net.minecraft.network.IPacket<?> getAddEntityPacket() {
        return net.minecraftforge.fml.network.NetworkHooks.getEntitySpawningPacket(this);
    }

    @Override
    protected void onHit(RayTraceResult result) {
        super.onHit(result);

        if (!level.isClientSide) {

            level.explode(this, getX(), getY(), getZ(), 0.0F, Explosion.Mode.NONE);

            AxisAlignedBB box = this.getBoundingBox().inflate(5);

            List<MobEntity> mobs = level.getEntitiesOfClass(MobEntity.class, box);

            for (MobEntity mob : mobs) {
                if (mob != this.getOwner()) {
                    mob.addEffect(new EffectInstance(
                            ModEffects.KILL_EFFECT.get(),
                            1,
                            0
                    ));
                }
            }

            this.remove();
        }
    }

    @Override
    protected Item getDefaultItem() {
        return ModItems.HOLY_POTION.get();
    }
}