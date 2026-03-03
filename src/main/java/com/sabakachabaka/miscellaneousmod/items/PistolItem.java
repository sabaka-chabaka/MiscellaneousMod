package com.sabakachabaka.miscellaneousmod.items;

import com.sabakachabaka.miscellaneousmod.entity.BulletEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class PistolItem extends Item {

    public PistolItem() {
        super(new Item.Properties()
                .stacksTo(1)
                .durability(500)
                .tab(ItemGroup.TAB_COMBAT));
    }

    @Override
    public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack stack = player.getItemInHand(hand);

        if (!world.isClientSide) {
            BulletEntity bullet = new BulletEntity(world, player);
            bullet.shootFromRotation(player, player.xRot, player.yRot, 0.0F, 3.0F, 1.0F);
            world.addFreshEntity(bullet);

            stack.hurtAndBreak(1, player, p ->
                    p.broadcastBreakEvent(hand)
            );
        }

        player.getCooldowns().addCooldown(this, 10);
        return ActionResult.success(stack);
    }
}