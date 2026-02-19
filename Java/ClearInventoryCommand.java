// Register this executor for the "clearinv" command in your plugin.yml.
// Command: /clearinv [player]
public class ClearInventoryCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player target;

        if (args.length == 0) {
            if (!(sender instanceof Player)) {
                sender.sendMessage("§cUsage: /clearinv <player>");
                return true;
            }
            target = (Player) sender;
        } else {
            target = Bukkit.getPlayer(args[0]);
            if (target == null) {
                sender.sendMessage("§cPlayer not found!");
                return true;
            }
        }

        target.getInventory().clear();
        target.sendMessage("§aYour inventory has been cleared!");
        return true;
    }
}
