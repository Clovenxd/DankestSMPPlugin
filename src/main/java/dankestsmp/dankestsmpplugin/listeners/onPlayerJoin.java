package dankestsmp.dankestsmpplugin.listeners;

import dankestsmp.dankestsmpplugin.DankestSMPPlugin;
import dankestsmp.dankestsmpplugin.functions.Protection;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scheduler.BukkitRunnable;


public class onPlayerJoin {

    //when a player joins
    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        if(!e.getPlayer().hasPlayedBefore()){ //if the player has not joined before
            DankestSMPPlugin.protection.addProtectionToPlayer(e.getPlayer()); //add protection to the player
            DankestSMPPlugin.plugin.getLogger().info("Giving " + e.getPlayer().getName() + " protection."); //debugging purposes
        }
    }
}
