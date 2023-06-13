package dankestsmp.dankestsmpplugin;

import dankestsmp.dankestsmpplugin.Utils.Debugger;
import dankestsmp.dankestsmpplugin.Utils.Tasks;
import dankestsmp.dankestsmpplugin.functions.Protection;
import dankestsmp.dankestsmpplugin.listeners.*;
import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;
import java.util.ArrayList;
import java.util.UUID;

public final class DankestSMPPlugin extends JavaPlugin {

    //variables and other classes for other classes to access through main plugin instance.
    public static DankestSMPPlugin plugin;
    public static Protection protection = new Protection();
    public final static Debugger debugger = new Debugger();
    private final static Tasks tasks = new Tasks();
    
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

        //registering listeners
        getServer().getPluginManager().registerEvents(new onPlayerJoin(),this);
        getServer().getPluginManager().registerEvents(new onPlayerAttackPlayer(), this);

        plugin = this; //setting plugin to this instance.

        tasks.startTasks(); //starting schedules tasks

        getLogger().info("Started DankestSMPPlugin."); //startup logic finished
    }

    @Override
    public void onDisable() {
        getLogger().info("Shutting down DankestSMPPlugin.");
    }

}
