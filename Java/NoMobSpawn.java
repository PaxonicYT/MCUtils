// Prevents hostile mobs from spawning naturally.
@EventHandler
public void onCreatureSpawn(CreatureSpawnEvent e) {
    if (e.getSpawnReason() == CreatureSpawnEvent.SpawnReason.NATURAL
            && e.getEntity() instanceof Monster) {
        e.setCancelled(true);
    }
}
