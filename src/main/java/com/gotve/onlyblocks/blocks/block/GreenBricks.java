package com.gotve.onlyblocks.blocks.block;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class GreenBricks extends BlockBase{

    public GreenBricks () {
        super(Material.ROCK, "green_bricks");
    }

    @Override
    public GreenBricks setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.CUTOUT;
    }

    @Override
    public boolean isTranslucent(IBlockState state) {
        return true;
    }

    @Override
    public float getAmbientOcclusionLightValue(IBlockState state) {
        return 1.0F;
    }

    // Override the getCollisionBoundingBox method used to disable collision of the block
    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState state,
                                                 IBlockAccess worldIn,
                                                 BlockPos pos) {
        return NULL_AABB;
    }

}
