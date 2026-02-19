package org.example.pluginname.listener //Package

import org.bukkit.event.EventHandler
import org.bukkit.event.EventPriority
import org.bukkit.event.Listener
import org.bukkit.event.player.AsyncPlayerChatEvent

// Filters swear words from the chat.
class AntiSwearListener : Listener {
    private val forbiddenWords = listOf("badword1", "badword2", "badword3")

    @EventHandler(priority = EventPriority.LOWEST)
    fun onChat(e: AsyncPlayerChatEvent) {
        val message = e.message.lowercase()
        for (word in forbiddenWords) {
            if (message.contains(word)) {
                e.isCancelled = true
                e.player.sendMessage("§cPlease keep the chat clean!")
                return
            }
        }
    }
}
