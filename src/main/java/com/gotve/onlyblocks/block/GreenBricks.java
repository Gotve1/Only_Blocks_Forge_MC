package com.gotve.onlyblocks.block;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class GreenBricks extends BlockBase{

    public GreenBricks (Material material, String name) {
        super(material, name);
    }

    @Override
    public GreenBricks setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

}
