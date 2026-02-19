// Prevents players without the "build.place" permission from placing blocks.
@EventHandler
public void onBlockPlace(BlockPlaceEvent e) {
    if (!e.getPlayer().hasPermission("build.place")) {
        e.setCancelled(true);
        e.getPlayer().sendMessage("§cYou don't have permission to place blocks here!");
    }
}
