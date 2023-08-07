package dankestsmp.dankestsmpplugin.customEnchants;

import org.bukkit.Material;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class CustomEnchant {

    public static ArrayList<Material> boots = new ArrayList<>(Arrays.asList(Material.DIAMOND_BOOTS, Material.IRON_BOOTS, Material.GOLDEN_BOOTS, Material.LEATHER_BOOTS, Material.CHAINMAIL_BOOTS, Material.NETHERITE_BOOTS));
    public static ArrayList<Material> pants = new ArrayList<>(Arrays.asList(Material.LEATHER_LEGGINGS, Material.CHAINMAIL_LEGGINGS, Material.IRON_LEGGINGS, Material.GOLDEN_LEGGINGS, Material.DIAMOND_LEGGINGS, Material.LEATHER_LEGGINGS));
    public static ArrayList<Material> shirts = new ArrayList<>(Arrays.asList(Material.LEATHER_CHESTPLATE, Material.CHAINMAIL_CHESTPLATE, Material.GOLDEN_CHESTPLATE, Material.IRON_CHESTPLATE, Material.DIAMOND_CHESTPLATE, Material.NETHERITE_CHESTPLATE));
    public static ArrayList<Material> hats = new ArrayList<>(Arrays.asList(Material.LEATHER_HELMET, Material.CHAINMAIL_HELMET, Material.GOLDEN_HELMET, Material.IRON_HELMET, Material.DIAMOND_HELMET, Material.NETHERITE_HELMET));
    public static ArrayList<Material> swords = new ArrayList<>(Arrays.asList(Material.WOODEN_SWORD, Material.STONE_SWORD, Material.GOLDEN_SWORD, Material.IRON_SWORD, Material.DIAMOND_SWORD, Material.NETHERITE_SWORD));
    public static ArrayList<Material> pickAxes = new ArrayList<>(Arrays.asList(Material.WOODEN_PICKAXE, Material.STONE_PICKAXE, Material.GOLDEN_PICKAXE, Material.IRON_PICKAXE, Material.DIAMOND_PICKAXE, Material.NETHERITE_PICKAXE));
    public static ArrayList<Material> axes = new ArrayList<>(Arrays.asList(Material.WOODEN_AXE, Material.STONE_AXE, Material.GOLDEN_AXE, Material.IRON_AXE, Material.DIAMOND_AXE, Material.NETHERITE_AXE));
    public static ArrayList<Material> shovels = new ArrayList<>(Arrays.asList(Material.WOODEN_SHOVEL, Material.STONE_SHOVEL, Material.GOLDEN_SHOVEL, Material.IRON_SHOVEL, Material.DIAMOND_SHOVEL, Material.NETHERITE_SHOVEL));
    public static ArrayList<Material> hoes = new ArrayList<>(Arrays.asList(Material.WOODEN_HOE, Material.STONE_HOE, Material.IRON_HOE, Material.GOLDEN_HOE, Material.DIAMOND_HOE, Material.NETHERITE_HOE));

    public abstract String getName();
    public abstract int getMaxLevel();
    public abstract String getEnchantable();


}
