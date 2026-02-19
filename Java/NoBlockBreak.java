// Prevents players without the "build.break" permission from breaking blocks.
@EventHandler
public void onBlockBreak(BlockBreakEvent e) {
    if (!e.getPlayer().hasPermission("build.break")) {
        e.setCancelled(true);
        e.getPlayer().sendMessage("§cYou don't have permission to break blocks here!");
    }
}
