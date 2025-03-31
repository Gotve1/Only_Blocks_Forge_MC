package com.gotve.onlyblocks.block;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EnderStoneOre extends BlockBase {

    public EnderStoneOre(Material material, String name, float hardness, float resistance) {
        super(material, name);
        setHardness(hardness);
    }

    @Override
    public EnderStoneOre setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

    @Override
    public void onBlockClicked(World world, BlockPos pos, EntityPlayer player) {
        System.out.println("Block clicked by: " + player.getName());
        setHardness(2.0F);
    }
}