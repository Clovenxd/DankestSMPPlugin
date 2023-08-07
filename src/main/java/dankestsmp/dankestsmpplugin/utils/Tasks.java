package dankestsmp.dankestsmpplugin.utils;

import dankestsmp.dankestsmpplugin.DankestSMPPlugin;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.ArrayList;
import java.util.UUID;

//class to keep tasks organised using BukkitRunnable()
public final class Tasks {

    public void startTasks(){
        new BukkitRunnable(){
            @Override
            public void run(){ //task to remove players with expired protection.
                ArrayList<UUID> playersWithExpiredProtection = DankestSMPPlugin.protection.playersInListWithExpiredProtection();
                if(!playersWithExpiredProtection.isEmpty()){
                    for (UUID player: playersWithExpiredProtection) {
                        DankestSMPPlugin.protection.removeProtectionFromPlayer(player);
                    }
                }
            }
        }.runTaskTimerAsynchronously(DankestSMPPlugin.plugin, 0, 20*60*15); //run task every 15 minutes
    }
}
