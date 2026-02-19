// Gives players a permanent speed and regeneration effect when they join.
@EventHandler
public void onJoin(PlayerJoinEvent e) {
    Player player = e.getPlayer();
    // Duration: Integer.MAX_VALUE = virtually permanent
    player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0, false, false));
    player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, Integer.MAX_VALUE, 0, false, false));
}
