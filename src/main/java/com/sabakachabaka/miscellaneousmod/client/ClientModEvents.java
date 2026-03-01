package com.sabakachabaka.miscellaneousmod.client;

import com.sabakachabaka.miscellaneousmod.MiscellaneousMod;
import com.sabakachabaka.miscellaneousmod.containers.ModContainers;
import com.sabakachabaka.miscellaneousmod.entity.ModEntities;
import com.sabakachabaka.miscellaneousmod.screens.BackpackScreen;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.client.renderer.entity.SpriteRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(
        modid = MiscellaneousMod.MOD_ID,
        bus = Mod.EventBusSubscriber.Bus.MOD,
        value = Dist.CLIENT
)
public class ClientModEvents {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {

        RenderingRegistry.registerEntityRenderingHandler(
                ModEntities.GRENADE.get(),
                renderManager -> new SpriteRenderer<>(
                        renderManager,
                        Minecraft.getInstance().getItemRenderer()
                )
        );

        ScreenManager.register(
                ModContainers.BACKPACK.get(),
                BackpackScreen::new
        );
    }
}