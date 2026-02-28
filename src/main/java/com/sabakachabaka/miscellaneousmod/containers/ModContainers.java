package com.sabakachabaka.miscellaneousmod.containers;

import com.sabakachabaka.miscellaneousmod.MiscellaneousMod;
import com.sabakachabaka.miscellaneousmod.items.BackpackContainer;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModContainers {
    public static final DeferredRegister<ContainerType<?>> CONTAINERS =
            DeferredRegister.create(ForgeRegistries.CONTAINERS, MiscellaneousMod.MOD_ID);

    public static final RegistryObject<ContainerType<BackpackContainer>> BACKPACK =
            CONTAINERS.register("backpack",
                    () -> IForgeContainerType.create(
                            (windowId, inv, data) -> {
                                ItemStack stack = inv.player.getMainHandItem();
                                return new BackpackContainer(windowId, inv, stack);
                            }
                    ));

    public static void register(IEventBus eventBus) {
        CONTAINERS.register(eventBus);
    }
}
