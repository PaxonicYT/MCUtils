// Register this executor for the "gm" command in your plugin.yml.
// Command: /gm <0|1|2|3> [player]
public class GameModeCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 0) {
            sender.sendMessage("§cUsage: /gm <0|1|2|3> [player]");
            return true;
        }

        Player target;
        if (args.length >= 2) {
            target = Bukkit.getPlayer(args[1]);
            if (target == null) {
                sender.sendMessage("§cPlayer not found!");
                return true;
            }
        } else {
            if (!(sender instanceof Player)) {
                sender.sendMessage("§cUsage: /gm <0|1|2|3> <player>");
                return true;
            }
            target = (Player) sender;
        }

        GameMode mode;
        switch (args[0]) {
            case "0": mode = GameMode.SURVIVAL; break;
            case "1": mode = GameMode.CREATIVE; break;
            case "2": mode = GameMode.ADVENTURE; break;
            case "3": mode = GameMode.SPECTATOR; break;
            default:
                sender.sendMessage("§cInvalid gamemode! Use 0, 1, 2, or 3.");
                return true;
        }

        target.setGameMode(mode);
        target.sendMessage("§aYour gamemode has been set to §e" + mode.name() + "§a!");
        return true;
    }
}
