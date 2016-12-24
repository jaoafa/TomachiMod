package com.jaoafa.tomachimod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;


@Mod(modid = TomachiMod.MODID, version = TomachiMod.VERSION)
public class TomachiMod
{
    public static final String MODID = "tomachimod";
    public static final String VERSION = "1.0";

    private static int w;
	private static int h;
	private static int i;
	private static int l;
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	MinecraftForge.EVENT_BUS.register(new onEntityJoinWorld());

    }

}
