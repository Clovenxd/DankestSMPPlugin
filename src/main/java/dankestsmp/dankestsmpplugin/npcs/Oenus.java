package dankestsmp.dankestsmpplugin.npcs;

import org.bukkit.Location;

import static org.bukkit.Bukkit.getServer;

//Oenus the NPC that will  be given 1 nether star and 4 diamonds in order to spawn the Ender Dragon in the end.
//location 92, 58, -3
public class Oenus extends CustomVillagers {



    //location of Oenus
    Location spawnLocation = new Location(getServer().getWorld("world_the_end"), 92, 58, -3);


    public Oenus(String name, Location location) {
        super(name, location);
    }
}
