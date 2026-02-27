package com.sabakachabaka.miscellaneousmod.entity;

import com.sabakachabaka.miscellaneousmod.MiscellaneousMod;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, MiscellaneousMod.MOD_ID);

    public static final RegistryObject<EntityType<GrenadeEntity>> GRENADE = ENTITIES.register("grenade",
            () -> EntityType.Builder.<GrenadeEntity>of(GrenadeEntity::new, EntityClassification.MISC)
                    .sized(0.25F, 0.25F)
                    .build(MiscellaneousMod.MOD_ID + ":grenade"));


    public static void register(IEventBus eventBus) {
        ENTITIES.register(eventBus);
    }

}