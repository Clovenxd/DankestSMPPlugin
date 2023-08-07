package dankestsmp.dankestsmpplugin;
import dankestsmp.dankestsmpplugin.listeners.*;
import org.bukkit.configuration.file.FileConfiguration;
import dankestsmp.dankestsmpplugin.utils.Debugger;
import dankestsmp.dankestsmpplugin.utils.Tasks;
import org.bukkit.plugin.java.JavaPlugin;

public final class DankestSMPPlugin extends JavaPlugin {

    //Instances of none static objects.
    public static DankestSMPPlugin plugin;
    private final static Tasks tasks = new Tasks();
    
    
    // Testing spigot config api to be used for future
    FileConfiguration CONFIG = getConfig();

    @Override
    public void onEnable() {
        // Plugin startup logic
    	// - Tony likes dick in his ass on a daily yuh
    	/* ----------------------------------------------
    	 * Testing spigot config api to be used for future
    	 * (If we need more control I can write a JSON solution)
    	 * ----------------------------------------------
    	 */
    	CONFIG.addDefault("unused_val", true);
    	CONFIG.options().copyDefaults(true);
    	saveConfig();

        //registering listeners
        getServer().getPluginManager().registerEvents(new OnPlayerJoin(),this);
        getServer().getPluginManager().registerEvents(new OnPlayerAttackPlayer(), this);
        getServer().getPluginManager().registerEvents(new onEnchantItem(), this);
        
        // Register Commands

        plugin = this; //setting plugin to this instance.

        tasks.startTasks(); //starting schedules tasks

        Debugger.sendMessageToConsole("Started DankestSMPPlugin."); //startup logic finished
    }

    @Override
    public void onDisable() {
        Debugger.sendMessageToConsole("Shutting down DankestSMPPlugin.");
    }

}
