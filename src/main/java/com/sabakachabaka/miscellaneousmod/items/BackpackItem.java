package com.sabakachabaka.miscellaneousmod.items;

import com.sabakachabaka.miscellaneousmod.MiscellaneousMod;
import com.sabakachabaka.miscellaneousmod.containers.BackpackContainer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.container.SimpleNamedContainerProvider;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.items.ItemStackHandler;

public class BackpackItem extends Item {

    public BackpackItem() {
        super(new Item.Properties()
                .stacksTo(1)
                .tab(MiscellaneousMod.BACKPACK_GROUP));
    }

    @Override
    public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        if (!world.isClientSide) {
            player.openMenu(new SimpleNamedContainerProvider(
                    (id, inv, p) -> new BackpackContainer(id, inv, player.getItemInHand(hand)),
                    new StringTextComponent("Backpack")
            ));
        }
        return ActionResult.success(player.getItemInHand(hand));
    }

    public static ItemStackHandler getInventory(ItemStack stack) {

        CompoundNBT tag = stack.getOrCreateTag();

        ItemStackHandler handler = new ItemStackHandler(27) {
            @Override
            protected void onContentsChanged(int slot) {
                tag.put("Inventory", this.serializeNBT());
            }
        };

        if (tag.contains("Inventory")) {
            handler.deserializeNBT(tag.getCompound("Inventory"));
        }

        return handler;
    }
}