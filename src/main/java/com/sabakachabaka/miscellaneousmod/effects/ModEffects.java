package com.sabakachabaka.miscellaneousmod.effects;

import com.sabakachabaka.miscellaneousmod.MiscellaneousMod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.potion.Effect;

public class ModEffects {
    public static final DeferredRegister<Effect> EFFECTS =
            DeferredRegister.create(ForgeRegistries.POTIONS, MiscellaneousMod.MOD_ID);

    public static final RegistryObject<Effect> KILL_EFFECT =
            EFFECTS.register("kill_effect", KillEffect::new);

    public static void register(IEventBus eventBus) {
        EFFECTS.register(eventBus);
    }
}