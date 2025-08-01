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

    public static final RegistryObject<BlockItem> ASPHALT = ITEMS.register("asphalt", () -> new BlockItem(ModBlocks.ASPHALT.get(), new Item.Properties().fireResistant().tab(MiscellaneousMod.BUILDING_GROUP)));
    public static final RegistryObject<BlockItem> BRICK_CONCRETE = ITEMS.register("brick_concrete", () -> new BlockItem(ModBlocks.BRICK_CONCRETE.get(), new Item.Properties().fireResistant().tab(MiscellaneousMod.BUILDING_GROUP)));
    public static final RegistryObject<BlockItem> BRICK_CONCRETE_MOSSY = ITEMS.register("brick_concrete_mossy", () -> new BlockItem(ModBlocks.BRICK_CONCRETE_MOSSY.get(), new Item.Properties().fireResistant().tab(MiscellaneousMod.BUILDING_GROUP)));
    public static final RegistryObject<BlockItem> BRICK_CONCRETE_CRACKED = ITEMS.register("brick_concrete_cracked", () -> new BlockItem(ModBlocks.BRICK_CONCRETE_CRACKED.get(), new Item.Properties().fireResistant().tab(MiscellaneousMod.BUILDING_GROUP)));
    public static final RegistryObject<BlockItem> BRICK_FIRE = ITEMS.register("brick_fire", () -> new BlockItem(ModBlocks.BRICK_FIRE.get(), new Item.Properties().fireResistant().tab(MiscellaneousMod.BUILDING_GROUP)));
    public static final RegistryObject<BlockItem> BRICK_LIGHT = ITEMS.register("brick_light", () -> new BlockItem(ModBlocks.BRICK_LIGHT.get(), new Item.Properties().fireResistant().tab(MiscellaneousMod.BUILDING_GROUP)));
    public static final RegistryObject<BlockItem> CONCRETE = ITEMS.register("concrete", () -> new BlockItem(ModBlocks.CONCRETE.get(), new Item.Properties().fireResistant().tab(MiscellaneousMod.BUILDING_GROUP)));
    public static final RegistryObject<BlockItem> CONCRETE_ASBESTOS = ITEMS.register("concrete_asbestos", () -> new BlockItem(ModBlocks.CONCRETE_ASBESTOS.get(), new Item.Properties().fireResistant().tab(MiscellaneousMod.BUILDING_GROUP)));
    public static final RegistryObject<BlockItem> CONCRETE_BLACK = ITEMS.register("concrete_black", () -> new BlockItem(ModBlocks.CONCRETE_BLACK.get(), new Item.Properties().fireResistant().tab(MiscellaneousMod.BUILDING_GROUP)));
    public static final RegistryObject<BlockItem> CONCRETE_HAZARD = ITEMS.register("concrete_hazard", () -> new BlockItem(ModBlocks.CONCRETE_HAZARD.get(), new Item.Properties().fireResistant().tab(MiscellaneousMod.BUILDING_GROUP)));
    public static final RegistryObject<BlockItem> CONCRETE_TILE = ITEMS.register("concrete_tile", () -> new BlockItem(ModBlocks.CONCRETE_TILE.get(), new Item.Properties().fireResistant().tab(MiscellaneousMod.BUILDING_GROUP)));
    public static final RegistryObject<BlockItem> CONCRETE_WHITE = ITEMS.register("concrete_white", () -> new BlockItem(ModBlocks.CONCRETE_WHITE.get(), new Item.Properties().fireResistant().tab(MiscellaneousMod.BUILDING_GROUP)));
    public static final RegistryObject<BlockItem> DECO_BLOCK = ITEMS.register("deco_block", () -> new BlockItem(ModBlocks.DECO_BLOCK.get(), new Item.Properties().fireResistant().tab(MiscellaneousMod.BUILDING_GROUP)));
    public static final RegistryObject<BlockItem> SMALL_TILES = ITEMS.register("small_tiles", () -> new BlockItem(ModBlocks.SMALL_TILES.get(), new Item.Properties().fireResistant().tab(MiscellaneousMod.BUILDING_GROUP)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}