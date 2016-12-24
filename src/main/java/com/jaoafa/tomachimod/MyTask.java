package com.jaoafa.tomachimod;

import java.util.TimerTask;

import net.minecraft.client.Minecraft;

public class MyTask extends TimerTask {

	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ
		Minecraft.getMinecraft().thePlayer.sendChatMessage("afa");
		onEntityJoinWorld.task.cancel();
	}

}
