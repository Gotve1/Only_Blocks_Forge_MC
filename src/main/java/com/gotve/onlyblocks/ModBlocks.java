package com.gotve.onlyblocks;

import com.gotve.onlyblocks.blocks.block.EnderStoneOre;

import com.gotve.onlyblocks.blocks.block.GreenBricks;
import com.gotve.onlyblocks.blocks.block.OrangeBricks;
import com.gotve.onlyblocks.blocks.slab.OrangeBrickSlab;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {

    public static EnderStoneOre enderStoneOre = new EnderStoneOre()
                      .setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

    public static OrangeBricks orangeBricks = new OrangeBricks()
                   .setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

    public static GreenBricks greenBricks = new GreenBricks()
                .setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

    public static OrangeBrickSlab orangeBrickSlab = (OrangeBrickSlab) new OrangeBrickSlab()
                                                              .setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

    public static void register(IForgeRegistry<Block> registry) {
        registry.registerAll(
                enderStoneOre,
                orangeBricks,
                orangeBrickSlab,
                greenBricks
        );
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.registerAll(
                enderStoneOre.createItemBlock(),
                orangeBricks.createItemBlock(),
                orangeBrickSlab.createItemBlock(),
                greenBricks.createItemBlock()
        );
    }

    public static void registerModels() {
        enderStoneOre.registerItemModel(Item.getItemFromBlock(enderStoneOre));
        orangeBricks.registerItemModel(Item.getItemFromBlock(orangeBricks));
        orangeBrickSlab.registerItemModel(Item.getItemFromBlock(orangeBrickSlab));
        greenBricks.registerItemModel(Item.getItemFromBlock(greenBricks));
    }
}