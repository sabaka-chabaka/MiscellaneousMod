package com.sabakachabaka.miscellaneousmod.items;

import com.sabakachabaka.miscellaneousmod.MiscellaneousMod;
import com.sabakachabaka.miscellaneousmod.blocks.ModBlocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MiscellaneousMod.MOD_ID);

    public static final RegistryObject<BlockItem> BRICK_CONCRETE = ITEMS.register("brick_concrete", () -> new BlockItem(ModBlocks.BRICK_CONCRETE.get(), new Item.Properties().fireResistant().tab(MiscellaneousMod.BUILDING_GROUP)));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}