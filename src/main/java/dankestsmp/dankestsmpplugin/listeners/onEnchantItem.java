package dankestsmp.dankestsmpplugin.listeners;

import dankestsmp.dankestsmpplugin.customEnchants.AddCustomEnchant;
import dankestsmp.dankestsmpplugin.utils.Debugger;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.enchantment.EnchantItemEvent;
import org.bukkit.inventory.ItemStack;

public class onEnchantItem implements Listener {


    @EventHandler
    public void onItemEnchant(EnchantItemEvent e){

        ItemStack enchantedItem = e.getItem();
        int xpCost = e.getExpLevelCost();

        Debugger.sendMessageToConsole("Enchanting: " + enchantedItem.getType().toString() + " with level cost: " + xpCost);
        AddCustomEnchant.addEnchant(enchantedItem, xpCost);



    }


}
