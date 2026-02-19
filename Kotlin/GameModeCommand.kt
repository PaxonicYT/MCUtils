package org.example.pluginname.command //Package

import org.bukkit.Bukkit
import org.bukkit.GameMode
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

// Command: /gm <0|1|2|3> [player]
class GameModeCommand : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (args.isEmpty()) {
            sender.sendMessage("§cUsage: /gm <0|1|2|3> [player]")
            return true
        }

        val target: Player = if (args.size >= 2) {
            Bukkit.getPlayer(args[1]) ?: run {
                sender.sendMessage("§cPlayer not found!")
                return true
            }
        } else {
            if (sender !is Player) {
                sender.sendMessage("§cUsage: /gm <0|1|2|3> <player>")
                return true
            }
            sender
        }

        val mode = when (args[0]) {
            "0" -> GameMode.SURVIVAL
            "1" -> GameMode.CREATIVE
            "2" -> GameMode.ADVENTURE
            "3" -> GameMode.SPECTATOR
            else -> {
                sender.sendMessage("§cInvalid gamemode! Use 0, 1, 2, or 3.")
                return true
            }
        }

        target.gameMode = mode
        target.sendMessage("§aYour gamemode has been set to §e${mode.name}§a!")
        return true
    }
}
