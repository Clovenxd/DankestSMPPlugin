package dankestsmp.dankestsmpplugin.customEnchants;

import dankestsmp.dankestsmpplugin.utils.Debugger;
import dankestsmp.dankestsmpplugin.utils.RandomNumberGenerator;
import org.bukkit.Material;
import org.bukkit.enchantments.EnchantmentTarget;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddCustomEnchant{

    public final static ArrayList<CustomEnchant> customEnchants = new ArrayList<CustomEnchant>(Arrays.asList(new Jordans()));


    public static void addEnchant(ItemStack item, int expCost){
        List<String> lore;
        if(item.getItemMeta().hasLore()){
            lore = item.getItemMeta().getLore();
            Debugger.sendMessageToConsole("Item has lore.");
        }else{
            Debugger.sendMessageToConsole("Item has no lore. Creating lore.");
            lore = new ArrayList<>();
        }
        Debugger.sendMessageToConsole("Item being enchanted is of class " + itemBeingEnchanted(item));
        for (CustomEnchant enchant: customEnchants) {
            Debugger.sendMessageToConsole("Trying for: " + enchant.getName());
            if(itemBeingEnchanted(item).equalsIgnoreCase(enchant.getEnchantable()) && RandomNumberGenerator.percentChance(3, 1)){
                Debugger.sendMessageToConsole("Enchanter got lucky and got the enchant: " + enchant.getName());
                lore.add(enchant.getName() + ": " + calculateLevelOfEnchant(expCost, enchant.getMaxLevel()));
                Debugger.sendMessageToConsole("Adding enchant to item lore.");
            }
        }
        item.getItemMeta().setLore(lore);
        Debugger.sendMessageToConsole("set the item's new lore.");
    }

    private static String itemBeingEnchanted(ItemStack item){
        if(CustomEnchant.hats.contains(item.getType())){
            return "hat";
        }
        if(CustomEnchant.shirts.contains(item.getType())){
            return "shirt";
        }
        if(CustomEnchant.pants.contains(item.getType())){
            return "pants";
        }
        if(CustomEnchant.boots.contains(item.getType())){
            return "boots";
        }
        if(CustomEnchant.swords.contains(item.getType())){
            return "sword";
        }
        if(CustomEnchant.axes.contains(item.getType())){
            return "axe";
        }
        if(CustomEnchant.shovels.contains(item.getType())){
            return "shovel";
        }
        if(CustomEnchant.hoes.contains(item.getType())){
            return "hoe";
        }
        if(CustomEnchant.pickAxes.contains(item.getType())){
            return "pickaxe";
        }
        if(item.getType().equals(Material.BOW)){
            return "bow";
        }
        if(item.getType().equals(Material.CROSSBOW)){
            return "crossbow";
        }
        return "incorrect";
    }

    private static int calculateLevelOfEnchant(int xpCost, int maxLevel){
        if(maxLevel == 1 && xpCost > 24)
            return 1;
        if(xpCost <= 6)
            return 1;
        if(xpCost > 7 && xpCost <= 16)
            return 2;
        if(xpCost > 16 && xpCost < 30)
            return 3;
        if(xpCost == 30)
            return 4;
        return 0;
    }



}
