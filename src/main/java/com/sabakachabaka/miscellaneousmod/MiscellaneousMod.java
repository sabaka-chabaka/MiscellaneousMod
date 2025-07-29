package com.sabakachabaka.miscellaneousmod;

import com.sabakachabaka.miscellaneousmod.blocks.ModBlocks;
import com.sabakachabaka.miscellaneousmod.items.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("miscellaneousmod")
public class MiscellaneousMod {
    public static final String MOD_ID = "miscellaneousmod";

    public MiscellaneousMod() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        eventBus.addListener(this::setup);
        eventBus.addListener(this::enqueueIMC);
        eventBus.addListener(this::processIMC);
        eventBus.addListener(this::processClient);

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
    private void setup(final FMLCommonSetupEvent event) {

    }
    private void enqueueIMC(final FMLCommonSetupEvent event) {

    }
    private void processIMC(final FMLCommonSetupEvent event) {

    }
    private void processClient(final FMLCommonSetupEvent event) {

    }
}