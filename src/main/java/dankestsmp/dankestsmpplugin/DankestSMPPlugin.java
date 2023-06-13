package dankestsmp.dankestsmpplugin;

import dankestsmp.dankestsmpplugin.functions.Protection;
import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.generator.WorldInfo;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.List;

public final class DankestSMPPlugin extends JavaPlugin {


    public static Server server = Bukkit.getServer();
    public static DankestSMPPlugin plugin;
    public static Protection protection;

    @Override
    public void onEnable() {
        getLogger().info("Starting DankestSMPPlugin.");
        plugin = this;

        new BukkitRunnable(){
            @Override
            public void run(){

            }
        }


    }

    @Override
    public void onDisable() {
        getLogger().info("Shutting down DankestSMPPlugin.");
    }

    public World getWorld(String s){
        return server.getWorld(s);
    }
    public static List<World> getWorlds(){
        return server.getWorlds();
    }
}
