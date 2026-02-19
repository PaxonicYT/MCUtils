// Register this executor for the "speed" command in your plugin.yml.
// Command: /speed <1-10> [player]
public class SpeedCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 0) {
            sender.sendMessage("§cUsage: /speed <1-10> [player]");
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
                sender.sendMessage("§cUsage: /speed <1-10> <player>");
                return true;
            }
            target = (Player) sender;
        }

        int speed;
        try {
            speed = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            sender.sendMessage("§cInvalid speed value!");
            return true;
        }

        if (speed < 1 || speed > 10) {
            sender.sendMessage("§cSpeed must be between 1 and 10!");
            return true;
        }

        float flySpeed = speed / 10.0f;
        float walkSpeed = speed / 10.0f;
        target.setFlySpeed(flySpeed);
        target.setWalkSpeed(walkSpeed);
        target.sendMessage("§aYour speed has been set to §e" + speed + "§a!");
        return true;
    }
}
