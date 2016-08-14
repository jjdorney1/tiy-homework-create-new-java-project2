/**
 * Created by jeffreydorney on 8/11/16.
 */
public class Main {
    public static void main(String[] args) {

        Hero mcCree = new Hero();
        Hero soldier76 = new Hero();
        Hero widowMaker = new Hero();
        Hero dVa = new Hero();

        Duel duel = new Duel();

        mcCree.heroSet("McCree", false, 40, 10, 20, 35);
        soldier76.heroSet("Soldier 76", true, 30, 10, 25, 25);
        widowMaker.heroSet("Widowmaker", true, 45, 40, 30, 10);
        dVa.heroSet("D.Va", true, 90, 5, 10, 30);


        // Duels ran at long range
        System.out.println("\nLong Range Duels:\n**********************");
        System.out.println(Duel.fightTime(mcCree.heroName, mcCree.longRange, soldier76.heroName, soldier76.longRange));
        System.out.println(Duel.fightTime(mcCree.heroName, mcCree.longRange, widowMaker.heroName, widowMaker.longRange));
        System.out.println(Duel.fightTime(soldier76.heroName, soldier76.longRange, widowMaker.heroName, widowMaker.longRange));
        System.out.println(Duel.fightTime(dVa.heroName, dVa.longRange, mcCree.heroName, mcCree.longRange));
        System.out.println(Duel.fightTime(dVa.heroName, dVa.longRange, soldier76.heroName, soldier76.longRange));
        System.out.println(Duel.fightTime(dVa.heroName, dVa.longRange, widowMaker.heroName, widowMaker.longRange));

        // Duels ran at medium range
        System.out.println("\nMedium Range Duels: \n**********************");
        System.out.println(Duel.fightTime(mcCree.heroName, mcCree.mediumRange, soldier76.heroName, soldier76.mediumRange));
        System.out.println(Duel.fightTime(mcCree.heroName, mcCree.mediumRange, widowMaker.heroName, widowMaker.mediumRange));
        System.out.println(Duel.fightTime(soldier76.heroName, soldier76.mediumRange, widowMaker.heroName, widowMaker.mediumRange));

        // Duels ran at short range
        System.out.println("\nShort Range Duels: \n**********************");
        System.out.println(Duel.fightTime(mcCree.heroName, mcCree.shortRange, soldier76.heroName, soldier76.shortRange));
        System.out.println(Duel.fightTime(mcCree.heroName, mcCree.shortRange, widowMaker.heroName, widowMaker.shortRange));
        System.out.println(Duel.fightTime(soldier76.heroName, soldier76.shortRange, widowMaker.heroName, widowMaker.shortRange));

//        Code to print the basic string
//        System.out.println(mcCree.heroName + " " + mcCree.ultimateReady + " " + mcCree.longRange + " " + mcCree.mediumRange + " " + mcCree.shortRange + ".");
//        System.out.println(soldier76.heroName + " " + soldier76.ultimateReady + " " + soldier76.longRange + " " + soldier76.mediumRange + " " + soldier76.shortRange + ".");
//        System.out.println(widowMaker.heroName + " " + widowMaker.ultimateReady + " " + widowMaker.longRange + " " + widowMaker.mediumRange + " " + widowMaker.shortRange + ".");


    }

}
