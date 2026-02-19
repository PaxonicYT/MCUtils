// Example main class for a Bukkit/Spigot plugin.
public class MyPlugin extends JavaPlugin {

    private static MyPlugin instance;

    @Override
    public void onEnable() {
        instance = this;

        // Register commands
        getCommand("heal").setExecutor(new HealCommand());
        getCommand("fly").setExecutor(new FlyCommand());

        // Register listeners
        Bukkit.getPluginManager().registerEvents(new ChatFormat(), this);

        getLogger().info("MyPlugin has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("MyPlugin has been disabled!");
    }

    public static MyPlugin getInstance() {
        return instance;
    }
}
