package org.example.pluginname.command //Package

import org.bukkit.Bukkit
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

// Command: /heal [player]
class HealCommand : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        val target: Player = if (args.isEmpty()) {
            if (sender !is Player) {
                sender.sendMessage("§cUsage: /heal <player>")
                return true
            }
            sender
        } else {
            Bukkit.getPlayer(args[0]) ?: run {
                sender.sendMessage("§cPlayer not found!")
                return true
            }
        }

        target.health = target.maxHealth
        target.foodLevel = 20
        target.saturation = 20f
        target.sendMessage("§aYou have been healed!")
        return true
    }
}
