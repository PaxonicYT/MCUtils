@EventHandler
public void onJoin(PlayerJoinEvent e) {
    e.setJoinMessage("§a+ §e" + e.getPlayer().getName() + " §ahas joined the server!");
}
