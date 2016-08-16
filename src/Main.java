/**
 * Created by jeffreydorney on 8/11/16.
 */
public class Main {
    public static void main(String[] args) {

        // add health modifier for duels
        int fightCheck = 0;

        Hero mcCree = new Hero("McCree", false, 150, 10, 20, 35, false);
        Hero soldier76 = new Hero("Soldier 76", true, 150, 10, 25, 25, true);
        Hero zenyatta = new Hero("Zenyatta", false, 100, 20, 20, 20, true);
        //Hero dVa = new Hero("D.Va", true, 250, 5, 10, 30, false);

        Duel duel = new Duel();

        //fightCheck = Duel.fightTime(mcCree.heroName, mcCree.longRange, mcCree.hitPoints, soldier76.heroName, soldier76.longRange, soldier76.hitPoints);



        /* mcCree("McCree", false, 40, 10, 20, 35);
        soldier76.heroSet("Soldier 76", true, 30, 10, 25, 25);
        widowMaker.heroSet("Widowmaker", true, 45, 40, 30, 10);
        dVa.heroSet("D.Va", true, 90, 5, 10, 30); */

        // for(int leftOver = )

        System.out.println("Hero Stats:\n**********************");
        System.out.println(mcCree.toString());
        System.out.println(soldier76.toString());
        System.out.println(zenyatta.toString());


        // Duels ran at long range
        System.out.println("\nLong Range Encounter:\n**********************");
        System.out.println("When " + mcCree.heroName + " and " + soldier76.heroName + " enage at long range: ");
        System.out.println(Duel.heroDuel(mcCree.heroName, mcCree.longRange, mcCree.hitPoints, soldier76.heroName, soldier76.longRange, soldier76.hitPoints));

        System.out.println("When " + mcCree.heroName + " and " + zenyatta.heroName + " enage at long range: ");
        System.out.println(Duel.heroDuel(mcCree.heroName, mcCree.longRange, mcCree.hitPoints, zenyatta.heroName, zenyatta.longRange, zenyatta.hitPoints));

        System.out.println("When " + soldier76.heroName + " and " + zenyatta.heroName + " enage at long range: ");
        System.out.println(Duel.heroDuel(soldier76.heroName, soldier76.longRange, soldier76.hitPoints, zenyatta.heroName, zenyatta.longRange, zenyatta.hitPoints));
        /* System.out.println(Duel.fightTime(dVa.heroName, dVa.longRange, mcCree.heroName, mcCree.longRange));
        System.out.println(Duel.fightTime(dVa.heroName, dVa.longRange, soldier76.heroName, soldier76.longRange));
        System.out.println(Duel.fightTime(dVa.heroName, dVa.longRange, zenyatta.heroName, zenyatta.longRange));*/

        // Duels ran at medium range
        System.out.println("\nMedium Range Encounter: \n**********************");
        System.out.println("When " + mcCree.heroName + " and " + soldier76.heroName + " enage at medium range: ");
        System.out.println(Duel.heroDuel(mcCree.heroName, mcCree.mediumRange, mcCree.hitPoints, soldier76.heroName, soldier76.mediumRange, soldier76.hitPoints));

        System.out.println("When " + mcCree.heroName + " and " + zenyatta.heroName + " enage at medium range: ");
        System.out.println(Duel.heroDuel(mcCree.heroName, mcCree.mediumRange, mcCree.hitPoints, zenyatta.heroName, zenyatta.mediumRange, zenyatta.hitPoints));

        System.out.println("When " + soldier76.heroName + " and " + zenyatta.heroName + " enage at medium range: ");
        System.out.println(Duel.heroDuel(soldier76.heroName, soldier76.mediumRange, soldier76.hitPoints, zenyatta.heroName, zenyatta.mediumRange, zenyatta.hitPoints));

        // Duels ran at short range
        System.out.println("\nShort Range Encounter: \n**********************");
        System.out.println("When " + mcCree.heroName + " and " + soldier76.heroName + " enage at short range: ");
        System.out.println(Duel.heroDuel(mcCree.heroName, mcCree.shortRange, mcCree.hitPoints, soldier76.heroName, soldier76.shortRange, soldier76.hitPoints));

        System.out.println("When " + mcCree.heroName + " and " + zenyatta.heroName + " enage at short range: ");
        System.out.println(Duel.heroDuel(mcCree.heroName, mcCree.shortRange, mcCree.hitPoints, zenyatta.heroName, zenyatta.shortRange, zenyatta.hitPoints));

        System.out.println("When " + soldier76.heroName + " and " + zenyatta.heroName + " enage at short range: ");
        System.out.println(Duel.heroDuel(soldier76.heroName, soldier76.shortRange, soldier76.hitPoints, zenyatta.heroName, zenyatta.shortRange, zenyatta.hitPoints));

//        Code to print the basic string
//        System.out.println(mcCree.heroName + " " + mcCree.ultimateReady + " " + mcCree.longRange + " " + mcCree.mediumRange + " " + mcCree.shortRange + ".");
//        System.out.println(soldier76.heroName + " " + soldier76.ultimateReady + " " + soldier76.longRange + " " + soldier76.mediumRange + " " + soldier76.shortRange + ".");
//        System.out.println(widowMaker.heroName + " " + widowMaker.ultimateReady + " " + widowMaker.longRange + " " + widowMaker.mediumRange + " " + widowMaker.shortRange + ".");


    }

}
