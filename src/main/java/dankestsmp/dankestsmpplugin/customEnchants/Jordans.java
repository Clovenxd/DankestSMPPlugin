package dankestsmp.dankestsmpplugin.customEnchants;

import org.bukkit.Material;
import org.bukkit.enchantments.EnchantmentTarget;


import java.util.ArrayList;
import java.util.Arrays;

public class Jordans extends CustomEnchant{

    private final static String name = "Jordans";
    private final static int maxLevel = 4;

    public String getName() {
        return name;
    }

    public String getEnchantable() {
        return "boots";
    }

    public int getMaxLevel() {
        return maxLevel;
    }


}
