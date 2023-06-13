package dankestsmp.dankestsmpplugin.Utils;

import dankestsmp.dankestsmpplugin.DankestSMPPlugin;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.ArrayList;
import java.util.UUID;

//class to keep tasks organised using BukkitRunnable()
public class Tasks {

    public void startTasks(){
        new BukkitRunnable(){
            @Override
            public void run(){ //task to remove players with expired protection.
                DankestSMPPlugin.debugger.sendMessageToConsole("Starting task to remove Players protection that expired.");
                ArrayList<UUID> playersWithExpiredProtection = DankestSMPPlugin.protection.playersInListWithExpiredProtection();
                if(!playersWithExpiredProtection.isEmpty()){
                    DankestSMPPlugin.debugger.sendMessageToConsole("ArrayList is not empty");
                    for (UUID player: playersWithExpiredProtection) {
                        DankestSMPPlugin.protection.removeProtectionFromPlayer(player);
                    }
                }else{
                    DankestSMPPlugin.debugger.sendMessageToConsole("ArrayList is empty");
                }
                DankestSMPPlugin.debugger.sendMessageToConsole("Finished removing expired protection from players."); //startup logic finished
            }
        }.runTaskTimerAsynchronously(DankestSMPPlugin.plugin, 20*60*2, 20*60*15); //run task every 15 minutes
    }
}
