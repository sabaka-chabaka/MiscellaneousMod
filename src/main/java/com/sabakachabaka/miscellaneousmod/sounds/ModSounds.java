package com.sabakachabaka.miscellaneousmod.sounds;

import com.sabakachabaka.miscellaneousmod.MiscellaneousMod;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MiscellaneousMod.MOD_ID);

    public static final RegistryObject<SoundEvent> PISTOL_SOUND = SOUND_EVENTS.register("pistols", () -> new SoundEvent(new ResourceLocation("miscellaneousmod", "pistols.ogg")));

    public static void register(IEventBus bus){
        SOUND_EVENTS.register(bus);
    }
}