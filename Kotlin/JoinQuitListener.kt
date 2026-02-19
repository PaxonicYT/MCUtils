package org.example.pluginname.listener //Package

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.event.player.PlayerQuitEvent

// Custom join and quit messages.
class JoinQuitListener : Listener {
    @EventHandler
    fun onJoin(e: PlayerJoinEvent) {
        e.joinMessage = "§a+ §e${e.player.name} §ahas joined the server!"
    }

    @EventHandler
    fun onQuit(e: PlayerQuitEvent) {
        e.quitMessage = "§c- §e${e.player.name} §chas left the server!"
    }
}
