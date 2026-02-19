// Register this executor for the "broadcast" command in your plugin.yml.
// Command: /broadcast <message>
public class BroadcastCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 0) {
            sender.sendMessage("§cUsage: /broadcast <message>");
            return true;
        }

        String message = String.join(" ", args);
        message = ChatColor.translateAlternateColorCodes('&', message);
        Bukkit.broadcastMessage("§6[§eBroadcast§6] §f" + message);
        return true;
    }
}
