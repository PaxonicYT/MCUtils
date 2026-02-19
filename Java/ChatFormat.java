// Formats chat messages with a custom prefix.
// Requires the player to have the "chat.color" permission to use color codes.
@EventHandler
public void onChat(AsyncPlayerChatEvent e) {
    Player player = e.getPlayer();
    String message = e.getMessage();

    if (player.hasPermission("chat.color")) {
        message = ChatColor.translateAlternateColorCodes('&', message);
    }

    e.setFormat("§7[§b" + player.getName() + "§7] §f" + message);
}
