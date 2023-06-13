package dankestsmp.dankestsmpplugin;

import dankestsmp.dankestsmpplugin.functions.Protection;
import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class DankestSMPPlugin extends JavaPlugin {

    //variables and other classes for other classes to access through main plugin instance.
    public static Server server = Bukkit.getServer();
    public static DankestSMPPlugin plugin;
    public final static Protection protection = new Protection();
    
    // Testing spigot config api to be used for future
    FileConfiguration CONFIG = getConfig();

    @Override
    public void onEnable() {
    	/* ----------------------------------------------
    	 * Testing spigot config api to be used for future
    	 * (If we need more control I can write a JSON solution)
    	 * ----------------------------------------------
    	 */
    	CONFIG.addDefault("unused_val", true);
    	CONFIG.options().copyDefaults(true);
    	saveConfig();
    	

    	
        getLogger().info("Started DankestSMPPlugin.");
        plugin = this; //setting plugin to this instance.

        new BukkitRunnable(){
            @Override
            public void run(){ //task to remove players with expired protection.
                plugin.getLogger().info("[Debugger] Starting task to remove Players protection that expired.");
                ArrayList<UUID> playersWithExpiredProtection = protection.playersInListWithExpiredProtection();
                if(!playersWithExpiredProtection.isEmpty()){
                    for (UUID player: playersWithExpiredProtection) {
                        protection.removeProtectionFromPlayer(player);
                    }
                }
            }
        }.runTaskTimerAsynchronously(plugin, 0, 20*60*15); //run task every 15 mins


    }

    @Override
    public void onDisable() {
        getLogger().info("Shutting down DankestSMPPlugin.");
    }

}
