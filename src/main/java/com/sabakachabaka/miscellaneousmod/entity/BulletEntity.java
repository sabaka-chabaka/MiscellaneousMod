package com.sabakachabaka.miscellaneousmod.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ThrowableEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class BulletEntity extends ThrowableEntity {

    public BulletEntity(EntityType<? extends BulletEntity> type, World world) {
        super(type, world);
    }

    public BulletEntity(World world, LivingEntity shooter) {
        super(ModEntities.BULLET.get(), shooter, world);
    }

    @Override
    protected void onHitEntity(EntityRayTraceResult result) {
        super.onHitEntity(result);
        result.getEntity().hurt(DamageSource.thrown(this, this.getOwner()), 8.0F);
        this.remove();
    }

    @Override
    protected void onHit(RayTraceResult result) {
        super.onHit(result);
        this.remove();
    }

    @Override
    protected void defineSynchedData() { }
}