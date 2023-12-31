package dankestsmp.dankestsmpplugin.functions;

import org.bukkit.entity.Player;

import java.util.*;

//if it's the players first time joining the server add their uuid to a protection list
// that cancels events where the player is damaged.
public class Protection {

    //hashmap with uuid as key and date as value, the date is to find out when 15 minutes has passed.
    private HashMap<UUID, Date> protect = new HashMap<>(); //Hashmap to map UUID of player with date added to

    //add player to protection hashmap
    public void addProtectionToPlayer(Player p){
        protect.put(p.getUniqueId(), new Date());
    }

    // add player to protection hashman with uuid param
    public void addProtectionToPlayer(UUID uuid){
        protect.put(uuid, new Date());
    }

    //removes player from protection hashmap
    public void removeProtectionFromPlayer(Player p){
        protect.remove(p.getUniqueId());
    }

    //remove player from protection hashmap with uuid param
    public void removeProtectionFromPlayer(UUID uuid){
        protect.remove(uuid);
    }

    //checks if hashmap is empty
    public boolean isProtectionHashMapEmpty(){
        return protect.isEmpty();
    }

    //checks if player is in hashmap
    public boolean isPlayerProtected(Player p){
        return protect.get(p.getUniqueId()) != null;
    }

    //return date that player was protected
    public Date whenWasPlayerProtected(Player p){
        return protect.get(p.getUniqueId());
    }

    //arraylist with uuids of players with expired protection
    public ArrayList<UUID> playersInListWithExpiredProtection(){
        ArrayList<UUID> expiredProtection = new ArrayList<>();

        for (Map.Entry<UUID, Date> playerBeingChecked: protect.entrySet()) { //traverse hashmap with foreach loop
            if(new Date().getTime() >= playerBeingChecked.getValue().getTime() + 1000*60*15){ //check if they've had protection for 15 mins or longer
                    expiredProtection.add(playerBeingChecked.getKey());
            }
        }
        return expiredProtection;
    }

}
