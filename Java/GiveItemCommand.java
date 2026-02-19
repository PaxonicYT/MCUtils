// Register this executor for the "give" command in your plugin.yml.
// Command: /give <player> <material> [amount]
public class GiveItemCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length < 2) {
            sender.sendMessage("§cUsage: /give <player> <material> [amount]");
            return true;
        }

        Player target = Bukkit.getPlayer(args[0]);
        if (target == null) {
            sender.sendMessage("§cPlayer not found!");
            return true;
        }

        Material material = Material.getMaterial(args[1].toUpperCase());
        if (material == null) {
            sender.sendMessage("§cInvalid material!");
            return true;
        }

        int amount = 1;
        if (args.length >= 3) {
            try {
                amount = Integer.parseInt(args[2]);
            } catch (NumberFormatException ex) {
                sender.sendMessage("§cInvalid amount!");
                return true;
            }
        }

        target.getInventory().addItem(new ItemStack(material, amount));
        target.sendMessage("§aYou received §e" + amount + "x " + material.name() + "§a!");
        return true;
    }
}
