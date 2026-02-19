@EventHandler
public void onFallDamage(EntityDamageEvent e) {
    if (e.getCause() == EntityDamageEvent.DamageCause.FALL) {
        e.setCancelled(true);
    }
}
