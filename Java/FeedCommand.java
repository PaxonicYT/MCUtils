// Register this executor for the "feed" command in your plugin.yml.
// Command: /feed [player]
public class FeedCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player target;

        if (args.length == 0) {
            if (!(sender instanceof Player)) {
                sender.sendMessage("§cUsage: /feed <player>");
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

        target.setFoodLevel(20);
        target.setSaturation(20f);
        target.sendMessage("§aYou have been fed!");
        return true;
    }
}
