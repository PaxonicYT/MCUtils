package org.example.pluginname.command //Package

import org.bukkit.Bukkit
import org.bukkit.ChatColor
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender

// Command: /broadcast <message>
class BroadcastCommand : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (args.isEmpty()) {
            sender.sendMessage("§cUsage: /broadcast <message>")
            return true
        }

        val message = ChatColor.translateAlternateColorCodes('&', args.joinToString(" "))
        Bukkit.broadcastMessage("§6[§eBroadcast§6] §f$message")
        return true
    }
}
