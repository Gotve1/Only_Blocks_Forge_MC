package com.gotve.onlyblocks.blocks.block;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EnderStoneOre extends BlockBase {

    public EnderStoneOre() {
        super(Material.ROCK, "enderstone_ore");
        setHardness(2.0F);
        setResistance(100.0F);
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