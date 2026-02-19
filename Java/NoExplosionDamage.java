@EventHandler
public void onExplosion(EntityDamageEvent e) {
    if (e.getCause() == EntityDamageEvent.DamageCause.ENTITY_EXPLOSION
            || e.getCause() == EntityDamageEvent.DamageCause.BLOCK_EXPLOSION) {
        e.setCancelled(true);
    }
}
