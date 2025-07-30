package com.sabakachabaka.miscellaneousmod.blocks;

import com.sabakachabaka.miscellaneousmod.MiscellaneousMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MiscellaneousMod.MOD_ID);

    public static final RegistryObject<Block> BRICK_CONCRETE = BLOCKS.register("brick_concrete", () -> new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY).strength(200, 400).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}