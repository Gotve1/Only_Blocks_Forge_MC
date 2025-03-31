package com.gotve.onlyblocks;

import com.gotve.onlyblocks.block.EnderStoneOre;

import com.gotve.onlyblocks.block.GreenBricks;
import com.gotve.onlyblocks.block.OrangeBricks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {

    public static EnderStoneOre enderStoneOre = new EnderStoneOre(
                                            Material.ROCK,
                                            "enderstone_ore",
                                            2.0F,
                                            1.0F)
                                            .setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

    public static OrangeBricks orangeBricks = new OrangeBricks(
                                            Material.ROCK,
                                            "orange_bricks")
                                            .setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

    public static GreenBricks greenBricks = new GreenBricks(
                                            Material.ROCK,
                                            "green_bricks")
                                            .setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

    public static void register(IForgeRegistry<Block> registry) {
        registry.registerAll(
                enderStoneOre,
                orangeBricks,
                greenBricks
        );
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.registerAll(
                enderStoneOre.createItemBlock(),
                orangeBricks.createItemBlock(),
                greenBricks.createItemBlock()
        );
    }

    public static void registerModels() {
        enderStoneOre.registerItemModel(Item.getItemFromBlock(enderStoneOre));
        orangeBricks.registerItemModel(Item.getItemFromBlock(orangeBricks));
        greenBricks.registerItemModel(Item.getItemFromBlock(greenBricks));
    }
}