package com.sabakachabaka.miscellaneousmod.containers;

import com.sabakachabaka.miscellaneousmod.items.BackpackItem;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.SlotItemHandler;

public class BackpackContainer extends Container {

    private final ItemStack backpack;
    private final ItemStackHandler handler;

    public BackpackContainer(int id, PlayerInventory playerInv, ItemStack stack) {
        super(ModContainers.BACKPACK.get(), id);

        this.backpack = stack;
        this.handler = BackpackItem.getInventory(stack);

        // Слоты рюкзака (3x9)
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 9; col++) {
                this.addSlot(new SlotItemHandler(
                        handler,
                        col + row * 9,
                        8 + col * 18,
                        18 + row * 18
                ));
            }
        }

        // Инвентарь игрока
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 9; col++) {
                this.addSlot(new Slot(
                        playerInv,
                        col + row * 9 + 9,
                        8 + col * 18,
                        86 + row * 18
                ));
            }
        }

        // Хотбар
        for (int col = 0; col < 9; col++) {
            this.addSlot(new Slot(
                    playerInv,
                    col,
                    8 + col * 18,
                    144
            ));
        }
    }

    @Override
    public boolean stillValid(PlayerEntity player) {
        return player.getMainHandItem() == backpack ||
                player.getOffhandItem() == backpack;
    }
}