package com.gotve.onlyblocks.block;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class OrangeBricks extends BlockBase {

    public OrangeBricks(Material material, String name) {
        super(material, name);
    }

    @Override
    public OrangeBricks setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
}
