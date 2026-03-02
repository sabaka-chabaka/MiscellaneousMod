package com.sabakachabaka.miscellaneousmod.items;

import com.sabakachabaka.miscellaneousmod.entity.ExplosiveKillPotionEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class HolyPotion extends Item {

    public HolyPotion(Properties props) {
        super(props.stacksTo(16));
    }

    @Override
    public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack stack = player.getItemInHand(hand);

        if (!world.isClientSide()) {
            ExplosiveKillPotionEntity entity =
                    new ExplosiveKillPotionEntity(world, player);

            entity.setItem(stack);
            entity.shootFromRotation(player, player.xRot, player.yRot, -20.0F, 0.5F, 1.0F);
            world.addFreshEntity(entity);
        }

        if (!player.abilities.instabuild) {
            stack.shrink(1);
        }

        return ActionResult.sidedSuccess(stack, world.isClientSide());
    }
}