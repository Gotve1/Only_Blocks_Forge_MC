package com.gotve.examplemod;

import com.gotve.examplemod.block.EnderStoneOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {

    public static EnderStoneOre enderStoneOre = new EnderStoneOre(Material.ROCK, "enderstone_ore").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

    public static void register(IForgeRegistry<Block> registry) {
        registry.registerAll(
                enderStoneOre
        );
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.registerAll(
                enderStoneOre.createItemBlock()
        );
    }

    public static void registerModels() {
        enderStoneOre.registerItemModel(Item.getItemFromBlock(enderStoneOre));
    }
}