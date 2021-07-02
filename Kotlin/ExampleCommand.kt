package org.example.pluginname.command //Package

import org.bukkit.GameMode
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class ClassName : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        sender.sendMessage("Example-Message")
        
        if (sender !is Player) {
            sender.sendMessage("§cYou must be a Player to do that!")
            return true
        }

        // You can use the Command-Sender as a Player after you check, that this is a Player
        sender.gameMode = GameMode.CREATIVE
        
        return true
    }
}
