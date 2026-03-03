package com.sabakachabaka.miscellaneousmod.client;

import com.sabakachabaka.miscellaneousmod.items.PistolItem;
import com.sabakachabaka.miscellaneousmod.network.NetworkHandler;
import com.sabakachabaka.miscellaneousmod.network.ShootPacket;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(
        modid = "miscellaneousmod",
        value = Dist.CLIENT
)
public class ClientAutoFire {

    private static int shootDelay = 0;

    @SubscribeEvent
    public static void onClientTick(TickEvent.ClientTickEvent event) {

        if (event.phase != TickEvent.Phase.END) return;

        Minecraft mc = Minecraft.getInstance();
        PlayerEntity player = mc.player;

        if (player == null) return;

        if (shootDelay > 0) shootDelay--;

        if (mc.options.keyAttack.isDown()) {

            ItemStack stack = player.getMainHandItem();

            if (stack.getItem() instanceof PistolItem) {

                if (shootDelay <= 0) {

                    NetworkHandler.INSTANCE.sendToServer(new ShootPacket());
                    applyRecoil();
                    shootDelay = 4;
                }
            }
        }
    }

    private static void applyRecoil() {

        Minecraft mc = Minecraft.getInstance();
        PlayerEntity player = mc.player;

        if (player == null) return;

        float verticalRecoil = 2.5f; // вверх
        float horizontalRecoil = (float)(Math.random() - 0.5f) * 1.5f;

        player.xRot -= verticalRecoil;
        player.yRot += horizontalRecoil;
    }
}