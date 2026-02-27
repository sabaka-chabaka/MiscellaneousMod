package com.sabakachabaka.miscellaneousmod.world;

import com.sabakachabaka.miscellaneousmod.MiscellaneousMod;
import com.sabakachabaka.miscellaneousmod.blocks.ModBlocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MiscellaneousMod.MOD_ID)
public class ModOreGeneration {
    public static ConfiguredFeature<?, ?> STEEL_ORE_GEN;

    public static void registerConfiguredFeatures() {
        OreFeatureConfig oreFeatureConfig = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.STEEL_ORE.get().defaultBlockState(), 9);
        STEEL_ORE_GEN = Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(MiscellaneousMod.MOD_ID, "steel_ore"), Feature.ORE.configured(oreFeatureConfig).range(64).squared().count(20));
    }

    @SubscribeEvent
    public static void onBiomeLoading(BiomeLoadingEvent event) {
        if (STEEL_ORE_GEN != null && event.getCategory() != Biome.Category.NETHER && event.getCategory() != Biome.Category.THEEND) {
            event.getGeneration().addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, STEEL_ORE_GEN);
        }
    }
}