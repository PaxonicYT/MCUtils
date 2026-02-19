// Register this executor for the "fly" command in your plugin.yml.
// Command: /fly [player]
public class FlyCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player target;

        if (args.length == 0) {
            if (!(sender instanceof Player)) {
                sender.sendMessage("§cUsage: /fly <player>");
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

        target.setAllowFlight(!target.getAllowFlight());
        String status = target.getAllowFlight() ? "§aenabled" : "§cdisabled";
        target.sendMessage("§aFly mode has been " + status + "§a!");
        return true;
    }
}
