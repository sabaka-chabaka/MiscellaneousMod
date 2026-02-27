package com.sabakachabaka.miscellaneousmod.items;

import com.sabakachabaka.miscellaneousmod.entity.GrenadeEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class GrenadeItem extends Item {
    public GrenadeItem(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack stack = player.getItemInHand(hand);

        world.playSound(null, player.getX(), player.getY(), player.getZ(),
                SoundEvents.SNOWBALL_THROW, SoundCategory.NEUTRAL, 0.5F, 0.4F);

        if (!world.isClientSide) {
            GrenadeEntity grenade = new GrenadeEntity(world, player);
            grenade.shootFromRotation(player, player.xRot, player.yRot, 0.0F, 1.5F, 1.0F);
            world.addFreshEntity(grenade);
        }

        if (!player.abilities.instabuild) {
            stack.shrink(1);
        }

        return ActionResult.sidedSuccess(stack, world.isClientSide());
    }
}
