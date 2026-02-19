// Register this executor for the "tp" command in your plugin.yml.
// Command: /tp <player> [target]
public class TeleportCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 0) {
            sender.sendMessage("§cUsage: /tp <player> [target]");
            return true;
        }

        if (args.length == 1) {
            if (!(sender instanceof Player)) {
                sender.sendMessage("§cUsage: /tp <player> <target>");
                return true;
            }
            Player target = Bukkit.getPlayer(args[0]);
            if (target == null) {
                sender.sendMessage("§cPlayer not found!");
                return true;
            }
            ((Player) sender).teleport(target);
            sender.sendMessage("§aTeleported to §e" + target.getName() + "§a!");
        } else {
            Player player = Bukkit.getPlayer(args[0]);
            Player target = Bukkit.getPlayer(args[1]);
            if (player == null || target == null) {
                sender.sendMessage("§cOne or both players not found!");
                return true;
            }
            player.teleport(target);
            sender.sendMessage("§aTeleported §e" + player.getName() + " §ato §e" + target.getName() + "§a!");
        }

        return true;
    }
}
