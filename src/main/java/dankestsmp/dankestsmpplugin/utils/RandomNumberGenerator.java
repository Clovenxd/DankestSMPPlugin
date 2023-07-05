package dankestsmp.dankestsmpplugin.utils;

import java.util.Random;
import java.util.SplittableRandom;

//class for probability
public class RandomNumberGenerator {

    //supply max number, and number to hit, the lowest number is zero if. For example for a 5% chance set max number to 20 number to hit being 0-19
    public static boolean percentChance(int maxNumber, int numberToHit){
        Random ran = new Random();
        Debugger.sendMessageToConsole("Number to hit is: " + numberToHit);
        int rolledDice = ran.nextInt(maxNumber-1);
        Debugger.sendMessageToConsole("Number got " + rolledDice);
        return rolledDice == numberToHit;
    }


}
