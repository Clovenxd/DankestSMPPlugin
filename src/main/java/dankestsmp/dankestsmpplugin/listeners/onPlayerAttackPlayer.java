package dankestsmp.dankestsmpplugin.listeners;

import dankestsmp.dankestsmpplugin.DankestSMPPlugin;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class onPlayerAttackPlayer implements Listener {

    //event called when entity damages another entity
    @EventHandler
    public void onEntityDamagedByEntity(EntityDamageByEntityEvent e){
        if(e.getEntity() instanceof Player && e.getDamager() instanceof Player){
            Player attacked = (Player) e.getEntity(); //entity being attacked
            Player attacker = (Player) e.getDamager(); //entity attacking

            //if the attacked has protection
            if(DankestSMPPlugin.protection.isPlayerProtected(attacked)){
                e.setCancelled(true); //cancel the event
                attacker.sendMessage(ChatColor.RED + "You can't attack this player, they recently joined the server for the first time and still have protection from PvP.");
            }
            //if the attacker has protection
            if(DankestSMPPlugin.protection.isPlayerProtected(attacker)){
                e.setCancelled(true); //cancel the vent
                attacker.sendMessage(ChatColor.RED + "You can't attack other players yet, you recently joined the server for the first time and still have protection from PvP.");
            }
        }
    }
}
