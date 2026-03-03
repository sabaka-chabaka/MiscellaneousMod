package com.sabakachabaka.miscellaneousmod.client;

import com.sabakachabaka.miscellaneousmod.MiscellaneousMod;
import com.sabakachabaka.miscellaneousmod.items.PistolItem;
import com.sabakachabaka.miscellaneousmod.network.NetworkHandler;
import com.sabakachabaka.miscellaneousmod.network.ShootPacket;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(
        modid = MiscellaneousMod.MOD_ID,
        value = Dist.CLIENT
)
public class ClientGunEvents {

    @SubscribeEvent
    public static void onClick(InputEvent.ClickInputEvent event) {

        if (!event.isAttack()) return;

        System.out.println("LMB detected");

        Minecraft mc = Minecraft.getInstance();
        PlayerEntity player = mc.player;

        if (player == null) return;

        ItemStack stack = player.getMainHandItem();

        if (stack.getItem() instanceof PistolItem) {

            event.setCanceled(true);
            event.setSwingHand(false);

            NetworkHandler.INSTANCE.sendToServer(new ShootPacket());
        }
    }
}