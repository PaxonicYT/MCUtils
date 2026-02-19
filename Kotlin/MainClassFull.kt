package org.example.pluginname //Package

import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin

// Example main class for a Bukkit/Spigot plugin.
class MyPlugin : JavaPlugin() {

    companion object {
        lateinit var instance: MyPlugin
            private set
    }

    override fun onEnable() {
        instance = this

        // Register commands
        getCommand("heal")!!.setExecutor(HealCommand())
        getCommand("fly")!!.setExecutor(FlyCommand())
        getCommand("gm")!!.setExecutor(GameModeCommand())
        getCommand("broadcast")!!.setExecutor(BroadcastCommand())

        // Register listeners
        Bukkit.getPluginManager().registerEvents(JoinQuitListener(), this)
        Bukkit.getPluginManager().registerEvents(AntiSwearListener(), this)
        Bukkit.getPluginManager().registerEvents(BuildPermissionListener(), this)
        Bukkit.getPluginManager().registerEvents(NoFallDamageListener(), this)

        logger.info("MyPlugin has been enabled!")
    }

    override fun onDisable() {
        logger.info("MyPlugin has been disabled!")
    }
}
