package dankestsmp.dankestsmpplugin.customEnchants;

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
