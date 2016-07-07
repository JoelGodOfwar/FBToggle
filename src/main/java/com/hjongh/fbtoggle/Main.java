package com.hjongh.fbtoggle;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * A lightweight, barebones Forge mod I created to allow easy switch between default
 * and fullbright gamma settings.
 * 
 * @author Jongh aka hjongh
 */
@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main {

    public static final String MODID = "fbtoggle";
    public static final String MODNAME = "FBToggle";
    public static final String VERSION = "1.0.0";
    
    @SidedProxy(clientSide="com.hjongh.fbtoggle.ClientProxy", serverSide="com.hjongh.fbtoggle.ServerProxy")
    public static CommonProxy proxy;
    
    @Instance
    public static Main instance = new Main();    
     
    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
                proxy.preInit(e);
    }
        
    @EventHandler
    public void init(FMLInitializationEvent e) {    	
        proxy.init(e);
    }
        
    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
                proxy.postInit(e);
    }
}