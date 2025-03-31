package com.gotve.onlyblocks.blocks.block;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class OrangeBricks extends BlockBase {

    public OrangeBricks() {
        super(Material.ROCK, "orange_bricks");
    }

    @Override
    public OrangeBricks setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
}
