package dankestsmp.dankestsmpplugin.listeners;

import dankestsmp.dankestsmpplugin.DankestSMPPlugin;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scheduler.BukkitRunnable;


public class onPlayerJoin {

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        if(!e.getPlayer().hasPlayedBefore()){
            DankestSMPPlugin.protection.addPlayerToProtectArrayList(e.getPlayer());
        }
    }
}
