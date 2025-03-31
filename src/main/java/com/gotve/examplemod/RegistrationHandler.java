package com.gotve.examplemod;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber()
public class RegistrationHandler
{
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> e) {
        ModBlocks.registerItemBlocks(e.getRegistry());
    }

    @SubscribeEvent
    public static void registerItems(ModelRegistryEvent e) {
        ModBlocks.registerModels();
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> e) {
        ModBlocks.register(e.getRegistry());
    }
}
