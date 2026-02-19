package org.example.pluginname.listener //Package

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockBreakEvent
import org.bukkit.event.block.BlockPlaceEvent

// Restricts block breaking and placing to players with the correct permissions.
class BuildPermissionListener : Listener {
    @EventHandler
    fun onBlockBreak(e: BlockBreakEvent) {
        if (!e.player.hasPermission("build.break")) {
            e.isCancelled = true
            e.player.sendMessage("§cYou don't have permission to break blocks here!")
        }
    }

    @EventHandler
    fun onBlockPlace(e: BlockPlaceEvent) {
        if (!e.player.hasPermission("build.place")) {
            e.isCancelled = true
            e.player.sendMessage("§cYou don't have permission to place blocks here!")
        }
    }
}
