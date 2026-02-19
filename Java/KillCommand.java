// Register this executor for the "kill" command in your plugin.yml.
// Command: /kill [player]
public class KillCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player target;

        if (args.length == 0) {
            if (!(sender instanceof Player)) {
                sender.sendMessage("§cUsage: /kill <player>");
                return true;
            }
            target = (Player) sender;
        } else {
            if (!sender.hasPermission("myplugin.kill.others")) {
                sender.sendMessage("§cYou don't have permission to kill other players!");
                return true;
            }
            target = Bukkit.getPlayer(args[0]);
            if (target == null) {
                sender.sendMessage("§cPlayer not found!");
                return true;
            }
        }

        target.setHealth(0);
        return true;
    }
}
