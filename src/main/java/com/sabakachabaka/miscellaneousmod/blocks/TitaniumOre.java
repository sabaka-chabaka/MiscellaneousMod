package com.sabakachabaka.miscellaneousmod.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TitaniumOre extends Block {
    public TitaniumOre() {
        super(AbstractBlock.Properties.of(Material.STONE).strength(3.0f, 3.0f).requiresCorrectToolForDrops());
    }
}
