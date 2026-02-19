@EventHandler
public void onQuit(PlayerQuitEvent e) {
    e.setQuitMessage("§c- §e" + e.getPlayer().getName() + " §chas left the server!");
}
