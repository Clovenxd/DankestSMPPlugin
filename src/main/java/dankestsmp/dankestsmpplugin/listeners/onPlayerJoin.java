package dankestsmp.dankestsmpplugin.listeners;

import dankestsmp.dankestsmpplugin.DankestSMPPlugin;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;


public class onPlayerJoin implements Listener {

    //when a player joins
    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        if(!e.getPlayer().hasPlayedBefore()){ //if the player has not joined before
            DankestSMPPlugin.protection.addProtectionToPlayer(e.getPlayer()); //add protection to the player
        }
    }
}
