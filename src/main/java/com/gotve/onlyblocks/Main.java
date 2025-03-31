package com.gotve.onlyblocks;

import com.gotve.onlyblocks.proxy.CommonProxy;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Main.MODID, name = Main.NAME, version = Main.VERSION)
public class Main
{
    public static final String MODID = "onlyblocks";
    public static final String NAME = "Only Blocks";
    public static final String VERSION = "1.1.5";

    private static Logger logger;

    @Mod.Instance(MODID)
    public static Main instance;

    @SidedProxy(clientSide = "com.gotve.onlyblocks.proxy.ClientProxy",
                serverSide = "com.gotve.onlyblocks.proxy.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        logger.info("Only Blocks preparing for initialization");
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
        logger.info("Only Blocks initialized");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
        logger.info("Only Blocks disabled");
    }
}

