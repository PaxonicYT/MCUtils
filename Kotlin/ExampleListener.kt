package org.example.pluginname.Listener //Package

import org.bukkit.event.Listener
import org.bukkit.event.block.BlockBreakEvent

class ClassName : Listener {
    @EventHandler
    fun onBlockBreak(e: BlockBreakEvent) {
        e.player.sendMessage("Example-Message")
    }
}
