package com.sabakachabaka.miscellaneousmod.network;

import com.sabakachabaka.miscellaneousmod.entity.BulletEntity;
import com.sabakachabaka.miscellaneousmod.items.PistolItem;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;
import net.minecraftforge.fml.network.NetworkEvent;

import java.util.function.Supplier;

public class ShootPacket {

    public ShootPacket() {}

    public static void encode(ShootPacket msg, PacketBuffer buf) {}

    public static ShootPacket decode(PacketBuffer buf) {
        return new ShootPacket();
    }

    public static void handle(ShootPacket msg, Supplier<NetworkEvent.Context> ctx) {
        ctx.get().enqueueWork(() -> {

            ServerPlayerEntity player = ctx.get().getSender();
            if (player == null) return;

            ItemStack stack = player.getMainHandItem();

            if (stack.getItem() instanceof PistolItem) {

                BulletEntity bullet = new BulletEntity(player.level, player);
                bullet.shootFromRotation(
                        player,
                        player.xRot,
                        player.yRot,
                        0.0F,
                        3.5F,
                        0.5F
                );

                player.level.addFreshEntity(bullet);
                player.getCooldowns().addCooldown(stack.getItem(), 5);
            }
        });

        ctx.get().setPacketHandled(true);
    }
}