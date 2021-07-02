// Register Command
getCommand("example")!!.setExecutor(CommandClass())

// Register Listener
Bukkit.getPluginManager().registerEvents(RegisterClass(), this)