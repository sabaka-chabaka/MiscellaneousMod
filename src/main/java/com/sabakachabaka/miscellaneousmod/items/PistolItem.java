package com.sabakachabaka.miscellaneousmod.items;

import com.sabakachabaka.miscellaneousmod.MiscellaneousMod;
import net.minecraft.item.Item;

public class PistolItem extends Item {

    public PistolItem() {
        super(new Item.Properties()
                .stacksTo(1)
                .durability(500)
                .tab(MiscellaneousMod.WEAPON_GROUP));
    }
}