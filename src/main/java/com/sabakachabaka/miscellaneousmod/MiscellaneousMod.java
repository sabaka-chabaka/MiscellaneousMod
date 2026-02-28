package com.sabakachabaka.miscellaneousmod;

import com.sabakachabaka.miscellaneousmod.blocks.ModBlocks;
import com.sabakachabaka.miscellaneousmod.enchantments.ModEnchantments;
import com.sabakachabaka.miscellaneousmod.entity.ModEntities;
import com.sabakachabaka.miscellaneousmod.items.ModItems;
import com.sabakachabaka.miscellaneousmod.world.ModOreGeneration;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.SpriteRenderer;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("miscellaneousmod")
public class MiscellaneousMod
{
    public static final String MOD_ID = "miscellaneousmod";
    public static final ItemGroup BUILDING_GROUP = new BuildingGroup("buildingtab");
    public static final ItemGroup FOOD_GROUP = new FoodGroup("foodtab");
    public static final ItemGroup ORE_GROUP = new OreGroup("oretab");
    public static final ItemGroup INGOT_GROUP = new IngotGroup("ingottab");
    public static final ItemGroup GRENADE_GROUP = new GrenadeGroup("grenadetab");
    public static final ItemGroup TOOLS_GROUP = new ToolsGroup("toolstab");
    public static final ItemGroup ARMOR_GROUP = new ArmorGroup("armortab");

    public MiscellaneousMod() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        ModEntities.register(eventBus);
        ModEnchantments.register(eventBus);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(ModOreGeneration::registerConfiguredFeatures);
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(ModEntities.GRENADE.get(),
                renderManager -> new SpriteRenderer<>(renderManager, Minecraft.getInstance().getItemRenderer()));
    }


    public static class BuildingGroup extends ItemGroup {
        public BuildingGroup(String label) {
            super(label);
        }

        @Override
        public ItemStack makeIcon() {
            return ModItems.BRICK_CONCRETE.get().getDefaultInstance();
        }
    }

    public static class FoodGroup extends ItemGroup {
        public FoodGroup(String label) { super(label); }

        @Override
        public ItemStack makeIcon(){
            return ModItems.BANANA_ICE_CREAM.get().getDefaultInstance();
        }
    }

    public static class OreGroup extends ItemGroup {
        public OreGroup(String label) { super(label); }

        @Override
        public ItemStack makeIcon(){
            return ModItems.STEEL_ORE.get().getDefaultInstance();
        }
    }

    public static class IngotGroup extends ItemGroup {
        public IngotGroup(String label) { super(label); }

        @Override
        public ItemStack makeIcon(){
            return ModItems.STEEL_INGOT.get().getDefaultInstance();
        }
    }

    public static class GrenadeGroup extends ItemGroup {
        public GrenadeGroup(String label) { super(label); }

        @Override
        public ItemStack makeIcon(){
            return ModItems.GRENADE_ITEM.get().getDefaultInstance();
        }
    }

    public static class ToolsGroup extends ItemGroup {
        public ToolsGroup(String label) { super(label); }

        @Override
        public ItemStack makeIcon(){
            return ModItems.STEEL_SWORD.get().getDefaultInstance();
        }
    }

    public static class ArmorGroup extends ItemGroup {
        public ArmorGroup(String label) { super(label); }

        @Override
        public ItemStack makeIcon(){
            return ModItems.STEEL_CHESTPLATE.get().getDefaultInstance();
        }
    }
}