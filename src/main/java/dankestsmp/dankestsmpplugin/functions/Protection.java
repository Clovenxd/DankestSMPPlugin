package dankestsmp.dankestsmpplugin.functions;

import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

//if it's the players first time joining the server add their uuid to a protection list
// that cancels events where the player is damaged.
public class Protection {

    private HashMap<UUID, Date> protect = new HashMap<>(); //Hashmap to map UUID of player with date added to
    private Player player;

    public void addPlayerToProtectionHashMap(Player p){
        protect.put(p.getUniqueId(), new Date());
    }

    public void removePlayerFromProtectionHashMap(Player p){
        protect.remove(p.getUniqueId());
    }

    public boolean isProtectionHashMapEmpty



}
