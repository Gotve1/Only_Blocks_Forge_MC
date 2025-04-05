package com.gotve.onlyblocks;

import com.gotve.onlyblocks.blocks.block.EnderStoneOre;

import com.gotve.onlyblocks.blocks.block.GreenBricks;
import com.gotve.onlyblocks.blocks.block.OrangeBricks;
import com.gotve.onlyblocks.blocks.slab.HalfOrangeBrickSlab;
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

    public static HalfOrangeBrickSlab halfOrangeBrickSlab = (HalfOrangeBrickSlab) new HalfOrangeBrickSlab()
                                              .setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

    public static void register(IForgeRegistry<Block> registry) {
        registry.registerAll(
                enderStoneOre,
                orangeBricks,
                halfOrangeBrickSlab,
                greenBricks
        );
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.registerAll(
                enderStoneOre.createItemBlock(),
                orangeBricks.createItemBlock(),
                halfOrangeBrickSlab.createItemBlock(),
                greenBricks.createItemBlock()
        );
    }

    public static void registerModels() {
        enderStoneOre.registerItemModel(Item.getItemFromBlock(enderStoneOre));
        orangeBricks.registerItemModel(Item.getItemFromBlock(orangeBricks));
        halfOrangeBrickSlab.registerItemModel(Item.getItemFromBlock(halfOrangeBrickSlab));
        greenBricks.registerItemModel(Item.getItemFromBlock(greenBricks));
    }
}