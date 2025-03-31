package com.gotve.examplemod.block;


import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class EnderStoneOre extends BlockBase {

    public EnderStoneOre(Material material, String name) {
        super(material, name);
    }

    @Override
    public EnderStoneOre setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
}