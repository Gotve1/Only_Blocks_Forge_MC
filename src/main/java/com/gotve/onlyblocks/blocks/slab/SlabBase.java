package com.gotve.onlyblocks.blocks.slab;

import com.gotve.onlyblocks.Main;
import com.gotve.onlyblocks.ModBlocks;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class SlabBase extends BlockSlab {

    protected String name;

    public SlabBase(Material material, String name) {
        super(material);

        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);

        IBlockState state = this.blockState.getBaseState();

        if (!isDouble()) {
            state = state.withProperty(HALF, BlockSlab.EnumBlockHalf.BOTTOM);
        }

        setDefaultState(state);
        this.useNeighborBrightness = true;

    }

    public void registerItemModel(Item itemBlock) {
        Main.proxy.registerItemRenderer(itemBlock, 0, name);
    }

    @Override
    public IBlockState getStateForPlacement(World world, BlockPos pos, EnumFacing facing,
                                            float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
        IBlockState state = super.getStateForPlacement(world, pos, facing, hitX, hitY, hitZ, meta, placer);
        if (!this.isDouble()) {
            IBlockState blockState = world.getBlockState(pos);
            if (blockState.getBlock() == this) {
                // Convert to full orange brick block if placing on another slab
                world.setBlockState(pos, ModBlocks.orangeBricks.getDefaultState());
                return null;
            }
            
            // Check the block we're placing against
            BlockPos offsetPos = pos.offset(facing.getOpposite());
            IBlockState targetState = world.getBlockState(offsetPos);
            if (targetState.getBlock() == this && !((SlabBase)targetState.getBlock()).isDouble()) {
                // Convert target block to full orange brick block
                world.setBlockState(offsetPos, ModBlocks.orangeBricks.getDefaultState());
                // Prevent placing the new slab
                return null;
            }
            
            // Normal placement logic
            return facing != EnumFacing.DOWN && (facing == EnumFacing.UP || hitY <= 0.5D) 
                    ? this.getDefaultState().withProperty(HALF, EnumBlockHalf.BOTTOM)
                    : this.getDefaultState().withProperty(HALF, EnumBlockHalf.TOP);
        }
        return state;
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
                                    EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        ItemStack heldItem = playerIn.getHeldItem(hand);
        if (!this.isDouble() && heldItem.getItem() == Item.getItemFromBlock(this)) {
            // Convert to double slab when right-clicking with another slab
            if (!playerIn.capabilities.isCreativeMode) {
                heldItem.shrink(1);
            }
            worldIn.setBlockState(pos, ModBlocks.orangeBricks.getDefaultState());
            return true;
        }
        return super.onBlockActivated(worldIn, pos, state, playerIn, hand, facing, hitX, hitY, hitZ);
    }

    public Item createItemBlock() {
        return new ItemBlock(this).setRegistryName(getRegistryName());
    }

    @Override
    public String getUnlocalizedName(int meta) {
        return this.getUnlocalizedName();
    }

/*    @Override
    public boolean isDouble() {
        return false;
    }*/

    @Override
    public IProperty<?> getVariantProperty() {
        return HALF;
    }

    @Override
    public Comparable<?> getTypeForItem(ItemStack stack) {
        return EnumBlockHalf.BOTTOM;
    }

    @Override
    public int damageDropped(IBlockState state) {
        return 0;
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        if (!this.isDouble()) {
            return this.getDefaultState().withProperty(HALF, meta == 0 ? EnumBlockHalf.BOTTOM : EnumBlockHalf.TOP);
        }
        return this.getDefaultState();
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        if (this.isDouble()) {
            return 0;
        }
        return state.getValue(HALF) == EnumBlockHalf.BOTTOM ? 0 : 1;
    }

    @Override
    protected BlockStateContainer createBlockState(){
        return new BlockStateContainer(this, new IProperty[] {HALF});
    }

}
