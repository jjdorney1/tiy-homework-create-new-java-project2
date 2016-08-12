/**
 * Created by jeffreydorney on 8/11/16.
 */
public class Main {
    public static void main(String[] args) {

        Hero mcCree = new Hero();
        Hero soldier76 = new Hero();
        Hero widowMaker = new Hero();

        Duel duel = new Duel();

        mcCree.heroSet("McCree", false, 40, 10, 20, 35);
        soldier76.heroSet("Soldier 76", true, 30, 10, 25, 25);
        widowMaker.heroSet("Widowmaker", true, 45, 40, 30, 10);


        System.out.println("\nLong Range Duels:");
        System.out.println(Duel.fightTime(mcCree.heroName, mcCree.longRange, soldier76.heroName, soldier76.longRange));
        System.out.println(Duel.fightTime(mcCree.heroName, mcCree.longRange, widowMaker.heroName, widowMaker.longRange));
        System.out.println(Duel.fightTime(soldier76.heroName, soldier76.longRange, widowMaker.heroName, widowMaker.longRange));

        System.out.println("\nMedium Range Duels:");
        System.out.println(Duel.fightTime(mcCree.heroName, mcCree.mediumRange, soldier76.heroName, soldier76.mediumRange));
        System.out.println(Duel.fightTime(mcCree.heroName, mcCree.mediumRange, widowMaker.heroName, widowMaker.mediumRange));
        System.out.println(Duel.fightTime(soldier76.heroName, soldier76.mediumRange, widowMaker.heroName, widowMaker.mediumRange));


        System.out.println("\nShort Range Duels:");
        System.out.println(Duel.fightTime(mcCree.heroName, mcCree.shortRange, soldier76.heroName, soldier76.shortRange));
        System.out.println(Duel.fightTime(mcCree.heroName, mcCree.shortRange, widowMaker.heroName, widowMaker.shortRange));
        System.out.println(Duel.fightTime(soldier76.heroName, soldier76.shortRange, widowMaker.heroName, widowMaker.shortRange));

//        Code to print the basic string commented out
//        System.out.println(mcCree.heroName + " " + mcCree.ultimateReady + " " + mcCree.longRange + " " + mcCree.mediumRange + " " + mcCree.shortRange + ".");
//        System.out.println(soldier76.heroName + " " + soldier76.ultimateReady + " " + soldier76.longRange + " " + soldier76.mediumRange + " " + soldier76.shortRange + ".");
//        System.out.println(widowMaker.heroName + " " + widowMaker.ultimateReady + " " + widowMaker.longRange + " " + widowMaker.mediumRange + " " + widowMaker.shortRange + ".");


    }

}
