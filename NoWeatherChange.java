//If you want only the weather in a world not to be changed you can easily do that with an if-query.
//Example: if(e.getWorld().getName().equals("WorldName")) {}

@EventHandler
	public void onWeather(WeatherChangeEvent e) {
		e.setCancelled(true);
	}