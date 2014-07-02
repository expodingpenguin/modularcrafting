package com.expoding.modularcrafting;

import com.expoding.modularcrafting.config.confighandler;
import com.expoding.modularcrafting.proxy.IProxy;
import com.expoding.modularcrafting.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;

@Mod(modid= Reference.MOD_ID, name= Reference.MOD_NAME, version= Reference.VERSION)
public class ModularCrafting
{

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static IProxy proxy;

    @Mod.Instance(Reference.MOD_ID)
    public static ModularCrafting instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        confighandler.init(event.getSuggestedConfigurationFile());
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }

}
