package com.elduin.butt_cheeks.event;

import com.elduin.butt_cheeks.ModTemplate;
import net.minecraft.server.level.ServerPlayer;

public class ExampleEventHandler {

	public static void onPlayerHurt(ServerPlayer player) {
		ModTemplate.LOGGER.info("{} took damage.", player.getDisplayName());
	}
}
