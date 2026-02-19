@EventHandler
public void onFireDamage(EntityDamageEvent e) {
    if (e.getCause() == EntityDamageEvent.DamageCause.FIRE
            || e.getCause() == EntityDamageEvent.DamageCause.FIRE_TICK
            || e.getCause() == EntityDamageEvent.DamageCause.LAVA) {
        e.setCancelled(true);
    }
}
