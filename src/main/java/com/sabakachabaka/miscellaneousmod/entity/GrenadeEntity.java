package com.sabakachabaka.miscellaneousmod.entity;

import com.sabakachabaka.miscellaneousmod.items.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ProjectileItemEntity;
import net.minecraft.item.Item;
import net.minecraft.network.IPacket;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

public class GrenadeEntity extends ProjectileItemEntity {
    // 1. Для регистрации (обязательно!)
    public GrenadeEntity(EntityType<? extends GrenadeEntity> type, World world) {
        super(type, world);
    }

    // 2. Для броска из руки
    public GrenadeEntity(World world, LivingEntity owner) {
        super(ModEntities.GRENADE.get(), owner, world);
    }

    @Override
    protected Item getDefaultItem() {
        return ModItems.GRENADE_ITEM.get();
    }

    @Override
    public net.minecraft.network.IPacket<?> getAddEntityPacket() {
        return net.minecraftforge.fml.network.NetworkHooks.getEntitySpawningPacket(this);
    }



    @Override
    protected void onHit(RayTraceResult result) {
        super.onHit(result);
        if (!this.level.isClientSide) {
            this.level.explode(this, this.getX(), this.getY(), this.getZ(), 5.0F, Explosion.Mode.BREAK);
            this.remove();
        }
    }
}
