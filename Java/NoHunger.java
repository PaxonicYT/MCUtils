@EventHandler
	public void onFood(FoodLevelChangeEvent e) {
		if(e.getEntity() instanceof Player) {
			e.setCancelled(true);
		}
	}