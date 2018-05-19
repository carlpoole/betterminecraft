package codes.carl.Better.events;

import org.bukkit.entity.Creeper;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Fireball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

public class MobGriefing implements Listener {

    @EventHandler
    public void onExplode(EntityExplodeEvent event) {
        Entity entity = event.getEntity();

        // Disable Ghast fireball damage
        if(entity instanceof Fireball) {
            Fireball fireball = (Fireball)entity;
            fireball.setIsIncendiary(false);
            fireball.setYield(0F);
            event.setCancelled(true);
        }

        // Disable creeper explosion damage
        if(entity instanceof Creeper) {
            event.blockList().clear();
        }

    }

}
