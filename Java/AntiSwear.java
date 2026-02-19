// Add your forbidden words to the list below.
private static final List<String> FORBIDDEN_WORDS = Arrays.asList("badword1", "badword2", "badword3");

@EventHandler(priority = EventPriority.LOWEST)
public void onChat(AsyncPlayerChatEvent e) {
    String message = e.getMessage().toLowerCase();
    for (String word : FORBIDDEN_WORDS) {
        if (message.contains(word)) {
            e.setCancelled(true);
            e.getPlayer().sendMessage("§cPlease keep the chat clean!");
            return;
        }
    }
}
