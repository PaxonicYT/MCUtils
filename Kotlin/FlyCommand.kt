package org.example.pluginname.command //Package

import org.bukkit.Bukkit
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

// Command: /fly [player]
class FlyCommand : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        val target: Player = if (args.isEmpty()) {
            if (sender !is Player) {
                sender.sendMessage("§cUsage: /fly <player>")
                return true
            }
            sender
        } else {
            Bukkit.getPlayer(args[0]) ?: run {
                sender.sendMessage("§cPlayer not found!")
                return true
            }
        }

        target.allowFlight = !target.allowFlight
        val status = if (target.allowFlight) "§aenabled" else "§cdisabled"
        target.sendMessage("§aFly mode has been $status§a!")
        return true
    }
}
