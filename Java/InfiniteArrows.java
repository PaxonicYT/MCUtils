// Prevents arrows from being consumed when shooting a bow.
@EventHandler
public void onShoot(EntityShootBowEvent e) {
    if (e.getEntity() instanceof Player) {
        e.setConsumeArrow(false);
    }
}
