package org.example.pluginname.listener //Package

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.EntityDamageEvent

// Cancels all fall damage.
class NoFallDamageListener : Listener {
    @EventHandler
    fun onFallDamage(e: EntityDamageEvent) {
        if (e.cause == EntityDamageEvent.DamageCause.FALL) {
            e.isCancelled = true
        }
    }
}
