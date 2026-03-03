package com.sabakachabaka.miscellaneousmod.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class PistolItem extends Item {

    public PistolItem() {
        super(new Item.Properties()
                .stacksTo(1)
                .durability(500)
                .tab(ItemGroup.TAB_COMBAT));
    }
}