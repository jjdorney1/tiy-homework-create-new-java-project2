/**
 * Created by jeffreydorney on 8/11/16.
 */
public class Duel {

    public static int fightTime(String heroOne, int attackOne, int hpOne, String heroTwo, int attackTwo, int hpTwo) {
        if (attackOne > attackTwo) {
            hpTwo = hpTwo - attackOne;
            return hpTwo;
        } else if (attackTwo > attackOne) {
            hpOne = hpOne - attackTwo;
            return hpOne;
        } else {
            return 0;
        }
    }

    public static int fire(int heroOneAttack, int hpTwo) {
        hpTwo = hpTwo - heroOneAttack;
        return hpTwo;
    }

    public static int returnFire(int heroTwoAttack, int hpOne) {
        hpOne = hpOne - heroTwoAttack;
        return hpOne;
    }

    public static String heroDuel(String heroOne, int attackOne, int hpOne, String heroTwo, int attackTwo, int hpTwo) {
        if (attackOne > attackTwo) {
            int newHpTwo = fire(attackOne, hpTwo);
            int newHpOne = returnFire(attackTwo, hpOne);
            return heroTwo + " now has hp of " + String.valueOf(newHpTwo) + " out of " + hpTwo + ".\n" + heroOne + " now has hp of " + String.valueOf(newHpOne) + " out of " + hpOne + ".\n";
        } else if (attackTwo > attackOne) {
            int newHpOne = fire(attackTwo, hpOne);
            int newHpTwo = returnFire(attackOne, hpTwo);
            return heroOne + " now has hp of " + String.valueOf(newHpOne) + " out of " + hpOne + ".\n" + heroTwo + " now has hp of " + String.valueOf(newHpTwo) + " out of " + hpTwo + ".\n";
        } else {
            return "It's a tie between " + heroOne + " and " + heroTwo + ".\n";
        }
    }
}






        /*if(attackTwo > attackOne) {
            for (int leftOver = hpOne; leftOver > 0; leftOver = leftOver - attackTwo) {
                System.out.println(heroOne + " and " + heroTwo + " engage, " + heroOne + " gets taken out. " + heroTwo + " has " + hpTwo + " health left.");
                return heroTwo;
            }
        } else if(attackOne > attackTwo) {
            for (int leftOver = hpTwo; leftOver > 0; leftOver = leftOver - attackTwo) {
                System.out.println(heroTwo + " and " + heroOne + " engage, " + heroTwo + " gets taken out. " + heroOne + " has " + hpOne + " health left.");
                return heroOne;
            }
        } else {
            System.out.println(heroOne + " and " + heroTwo + " engage, but they are equally matched.");
            return "No one";  */

        /* if(attackOne > attackTwo) {
            hpTwo = hpTwo - attackOne;
            hpOne = hpOne - attackTwo;
            return hpTwo;
        } else if(attackTwo > attackOne){
            hpOne = hpOne - attackTwo;
            return hpOne;
        } else {
            return (heroOne + " and " + heroTwo + " duel, but it's too close to call who wins.");
        */




//                             int longRangeHeroOne, int mediumRangeHeroOne,
//                             int shortRangeHeroOne) {
//
/*
    public engage(String heroOne, int attackOne, String heroTwo, int attackTwo) {

    }
    }
    //public boolean whoWins(String heroFirst, String heroSecond);
    */

