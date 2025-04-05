package com.gotve.onlyblocks.blocks.slab;

import net.minecraft.block.material.Material;

public class HalfOrangeBrickSlab extends SlabBase {

    public HalfOrangeBrickSlab() {
        super(Material.ROCK, "orange_brick_slab");
        setHardness(2.0F);
        setResistance(100.0F);
    }

    @Override
    public boolean isDouble() {
        return false;
    }
}