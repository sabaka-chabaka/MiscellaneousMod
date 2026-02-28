package com.sabakachabaka.miscellaneousmod.items;

import com.sabakachabaka.miscellaneousmod.MiscellaneousMod;
import com.sabakachabaka.miscellaneousmod.ModArmorMaterial;
import com.sabakachabaka.miscellaneousmod.ModItemTier;
import com.sabakachabaka.miscellaneousmod.blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MiscellaneousMod.MOD_ID);

    // Block Items
    public static final RegistryObject<BlockItem> ASPHALT = ITEMS.register("asphalt", () -> new BlockItem(ModBlocks.ASPHALT.get(), new Item.Properties().fireResistant().tab(MiscellaneousMod.BUILDING_GROUP)));
    public static final RegistryObject<BlockItem> BLUE_STEEL = ITEMS.register("blue_steel", () -> new BlockItem(ModBlocks.BLUE_STEEL.get(), new Item.Properties().fireResistant().tab(MiscellaneousMod.BUILDING_GROUP)));
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
    public static final RegistryObject<BlockItem> DANGER_METAL = ITEMS.register("danger_metal", () -> new BlockItem(ModBlocks.DANGER_METAL.get(), new Item.Properties().fireResistant().tab(MiscellaneousMod.BUILDING_GROUP)));
    public static final RegistryObject<BlockItem> DECO_BLOCK = ITEMS.register("deco_block", () -> new BlockItem(ModBlocks.DECO_BLOCK.get(), new Item.Properties().fireResistant().tab(MiscellaneousMod.BUILDING_GROUP)));
    public static final RegistryObject<BlockItem> DECO_STEEL = ITEMS.register("deco_steel", () -> new BlockItem(ModBlocks.DECO_STEEL.get(), new Item.Properties().fireResistant().tab(MiscellaneousMod.BUILDING_GROUP)));
    public static final RegistryObject<BlockItem> DECO_STEEL_ALT = ITEMS.register("deco_steel_alt", () -> new BlockItem(ModBlocks.DECO_STEEL_ALT.get(), new Item.Properties().fireResistant().tab(MiscellaneousMod.BUILDING_GROUP)));
    public static final RegistryObject<BlockItem> DUCRETE = ITEMS.register("ducrete", () -> new BlockItem(ModBlocks.DUCRETE.get(), new Item.Properties().fireResistant().tab(MiscellaneousMod.BUILDING_GROUP)));
    public static final RegistryObject<BlockItem> DUCRETE_TILE = ITEMS.register("ducrete_tile", () -> new BlockItem(ModBlocks.DUCRETE_TILE.get(), new Item.Properties().fireResistant().tab(MiscellaneousMod.BUILDING_GROUP)));
    public static final RegistryObject<BlockItem> LEAD = ITEMS.register("lead", () -> new BlockItem(ModBlocks.LEAD.get(), new Item.Properties().fireResistant().tab(MiscellaneousMod.BUILDING_GROUP)));
    public static final RegistryObject<BlockItem> OLD_ASPHALT = ITEMS.register("old_asphalt", () -> new BlockItem(ModBlocks.OLD_ASPHALT.get(), new Item.Properties().fireResistant().tab(MiscellaneousMod.BUILDING_GROUP)));
    public static final RegistryObject<BlockItem> PARQUET = ITEMS.register("parquet", () -> new BlockItem(ModBlocks.PARQUET.get(), new Item.Properties().fireResistant().tab(MiscellaneousMod.BUILDING_GROUP)));
    public static final RegistryObject<BlockItem> REINFORCED_STONE = ITEMS.register("reinforced_stone", () -> new BlockItem(ModBlocks.REINFORCED_STONE.get(), new Item.Properties().fireResistant().tab(MiscellaneousMod.BUILDING_GROUP)));
    public static final RegistryObject<BlockItem> RUSTY_STEEL = ITEMS.register("rusty_steel", () -> new BlockItem(ModBlocks.RUSTY_STEEL.get(), new Item.Properties().fireResistant().tab(MiscellaneousMod.BUILDING_GROUP)));
    public static final RegistryObject<BlockItem> SMALL_TILES = ITEMS.register("small_tiles", () -> new BlockItem(ModBlocks.SMALL_TILES.get(), new Item.Properties().fireResistant().tab(MiscellaneousMod.BUILDING_GROUP)));

    public static final RegistryObject<BlockItem> STEEL_ORE = ITEMS.register("steel_ore", () -> new BlockItem(ModBlocks.STEEL_ORE.get(), new Item.Properties().fireResistant().tab(MiscellaneousMod.ORE_GROUP)));

    // Food Items
    public static final RegistryObject<Item> BANANA_ICE_CREAM = ITEMS.register("banana_ice_cream", () -> new Item(new Item.Properties().tab(MiscellaneousMod.FOOD_GROUP).food(new Food.Builder().nutrition(1).saturationMod(0.2f).build())));
    public static final RegistryObject<Item> CHOCOLATE_ICE_CREAM = ITEMS.register("chocolate_ice_cream", () -> new Item(new Item.Properties().tab(MiscellaneousMod.FOOD_GROUP).food(new Food.Builder().nutrition(1).saturationMod(0.2f).build())));
    public static final RegistryObject<Item> ICE_CREAM_BOWL = ITEMS.register("ice_cream_bowl", () -> new Item(new Item.Properties().tab(MiscellaneousMod.FOOD_GROUP).food(new Food.Builder().nutrition(1).saturationMod(0.2f).build())));
    public static final RegistryObject<Item> ICE_CREAM_CONE = ITEMS.register("ice_cream_cone", () -> new Item(new Item.Properties().tab(MiscellaneousMod.FOOD_GROUP).food(new Food.Builder().nutrition(1).saturationMod(0.2f).build())));
    public static final RegistryObject<Item> STRAWBERRY_ICE_CREAM = ITEMS.register("strawberry_ice_cream", () -> new Item(new Item.Properties().tab(MiscellaneousMod.FOOD_GROUP).food(new Food.Builder().nutrition(1).saturationMod(0.2f).build())));
    public static final RegistryObject<Item> TOFFEE_ICE_CREAM = ITEMS.register("toffee_ice_cream", () -> new Item(new Item.Properties().tab(MiscellaneousMod.FOOD_GROUP).food(new Food.Builder().nutrition(1).saturationMod(0.2f).build())));
    public static final RegistryObject<Item> VANILLA_ICE_CREAM = ITEMS.register("vanilla_ice_cream", () -> new Item(new Item.Properties().tab(MiscellaneousMod.FOOD_GROUP).food(new Food.Builder().nutrition(1).saturationMod(0.2f).build())));

    // Ingots
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties().tab(
                    MiscellaneousMod.INGOT_GROUP).fireResistant()));

    // Customs
    public static final RegistryObject<Item> GRENADE_ITEM = ITEMS.register("grenade",
            () -> new GrenadeItem(new Item.Properties().tab(MiscellaneousMod.GRENADE_GROUP)));

    // Tools
    public static final RegistryObject<Item> STEEL_SWORD = ITEMS.register("steel_sword", () -> new SwordItem(ModItemTier.STEEL, 3, 1, new Item.Properties().tab(MiscellaneousMod.TOOLS_GROUP)));
    public static final RegistryObject<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe", () -> new PickaxeItem(ModItemTier.STEEL, 3, 1, new Item.Properties().tab(MiscellaneousMod.TOOLS_GROUP)));
    public static final RegistryObject<Item> STEEL_AXE = ITEMS.register("steel_axe", () -> new AxeItem(ModItemTier.STEEL, 3, 1, new Item.Properties().tab(MiscellaneousMod.TOOLS_GROUP)));
    public static final RegistryObject<Item> STEEL_SHOVEL = ITEMS.register("steel_shovel", () -> new ShovelItem(ModItemTier.STEEL, 3, 1, new Item.Properties().tab(MiscellaneousMod.TOOLS_GROUP)));
    public static final RegistryObject<Item> STEEL_HOE = ITEMS.register("steel_hoe", () -> new HoeItem(ModItemTier.STEEL, 3, 1, new Item.Properties().tab(MiscellaneousMod.TOOLS_GROUP)));

    // Armor
    public static final RegistryObject<Item> STEEL_HELMET = ITEMS.register("steel_helmet",
            () -> new ArmorItem(ModArmorMaterial.STEEL, EquipmentSlotType.HEAD, new Item.Properties().tab(MiscellaneousMod.ARMOR_GROUP)));

    public static final RegistryObject<Item> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate",
            () -> new ArmorItem(ModArmorMaterial.STEEL, EquipmentSlotType.CHEST, new Item.Properties().tab(MiscellaneousMod.ARMOR_GROUP)));

    public static final RegistryObject<Item> STEEL_LEGGINGS = ITEMS.register("steel_leggings",
            () -> new ArmorItem(ModArmorMaterial.STEEL, EquipmentSlotType.LEGS, new Item.Properties().tab(MiscellaneousMod.ARMOR_GROUP)));

    public static final RegistryObject<Item> STEEL_BOOTS = ITEMS.register("steel_boots",
            () -> new ArmorItem(ModArmorMaterial.STEEL, EquipmentSlotType.FEET, new Item.Properties().tab(MiscellaneousMod.ARMOR_GROUP)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
