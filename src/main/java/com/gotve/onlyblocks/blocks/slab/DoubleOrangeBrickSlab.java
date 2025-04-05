package com.gotve.onlyblocks.blocks.slab;

import net.minecraft.block.material.Material;

public class DoubleOrangeBrickSlab extends SlabBase {

    public DoubleOrangeBrickSlab() {
        super(Material.ROCK, "double_orange_brick_slab");
        setHardness(2.0F);
        setResistance(100.0F);
    }

    @Override
    public boolean isDouble() {
        return true;
    }
}
