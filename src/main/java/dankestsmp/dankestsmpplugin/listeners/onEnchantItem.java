package dankestsmp.dankestsmpplugin.listeners;

import dankestsmp.dankestsmpplugin.customEnchants.AddCustomEnchant;
import dankestsmp.dankestsmpplugin.utils.Debugger;
import dankestsmp.dankestsmpplugin.utils.RandomNumberGenerator;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.enchantment.EnchantItemEvent;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class onEnchantItem implements Listener {


    @EventHandler
    public void onItemEnchant(EnchantItemEvent e){

        ItemStack enchantedItem = e.getItem();
        int xpCost = e.getExpLevelCost();

        Debugger.sendMessageToConsole("Enchanting: " + enchantedItem.getType().toString() + " with level cost: " + xpCost);
        AddCustomEnchant.addEnchant(enchantedItem, xpCost);



    }


}
