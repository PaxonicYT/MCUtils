@EventHandler
public void onDeath(PlayerDeathEvent e) {
    e.getDrops().clear();
    e.setDroppedExp(0);
}
