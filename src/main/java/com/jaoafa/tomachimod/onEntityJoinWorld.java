package com.jaoafa.tomachimod;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class onEntityJoinWorld {
	public static TimerTask task;
	@SubscribeEvent
    /*ワールドに入った時に呼ばれるイベント。*/
    public void onEntityJoinWorld_(EntityJoinWorldEvent event)  {
        if (event.world.isRemote && event.entity instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer)event.entity;
            if(Minecraft.getMinecraft().getCurrentServerData() == null) return;
            if(!Minecraft.getMinecraft().getCurrentServerData().serverIP.equalsIgnoreCase("jaoafa.com")){
            	player.addChatComponentMessage(new ChatComponentText("This Server is not jao Minecraft Server!"));
            	return;
            }
            player.addChatComponentMessage(new ChatComponentText("This Server is jao Minecraft Server!"));
            //System.out.println("test - Tomachi");
            Minecraft.getMinecraft().thePlayer.sendChatMessage("jao");
            task = new MyTask();
            Timer timer = new Timer(TomachiMod.MODID);
            timer.schedule(task, TimeUnit.SECONDS.toMillis(3));
        }
    }
}
