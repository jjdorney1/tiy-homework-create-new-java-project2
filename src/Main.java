/**
 * Created by jeffreydorney on 8/11/16.
 */
public class Main {
    public static void main(String[] args) {

        // creates instances of heroes
        Hero mcCree = new Hero("McCree", 150, 20, 40, 55, false);
        Hero soldier76 = new Hero("Soldier 76", 150, 25, 30, 30, true);

        // output starting stats
        System.out.println("Hero Stats Before Round 1:\n**********************");
        System.out.println(mcCree.toString());
        System.out.println(soldier76.toString());

        System.out.println("\n**********************\nHeroes Enage In Round 1 Combat: Long Range\n**********************\n\n");
        // damage round
        mcCree.readyUltimateCheck(mcCree.longRange);
        soldier76.readyUltimateCheck(soldier76.longRange);
        // checks for ultimate
        mcCree.combatRound(soldier76.longRange, mcCree.hitPoints);
        soldier76.combatRound(mcCree.longRange, soldier76.hitPoints);
        // checks if can heal
        mcCree.activeHeal();
        soldier76.activeHeal();

        // output changed stats
        System.out.println("Hero Stats After Round 1:\n**********************");
        System.out.println(mcCree.toString());
        System.out.println(soldier76.toString());

        System.out.println("\n**********************\nHeroes Enage In Round 2 Combat: Medium Range\n**********************\n\n");
        // damage round
        mcCree.readyUltimateCheck(mcCree.mediumRange);
        soldier76.readyUltimateCheck(soldier76.mediumRange);
        // checks for ultimate
        mcCree.combatRound(soldier76.mediumRange, mcCree.hitPoints);
        soldier76.combatRound(mcCree.mediumRange, soldier76.hitPoints);
        // checks if can heal
        mcCree.activeHeal();
        soldier76.activeHeal();
        // checks if alive
        mcCree.aliveCheck();
        soldier76.aliveCheck();

        // output changed stats
        System.out.println("Hero Stats After Round 2:\n**********************");
        System.out.println(mcCree.toString());
        System.out.println(soldier76.toString());

        System.out.println("\n**********************\nHeroes Enage In Round 3 Combat: Short Range\n**********************\n\n");
        // damage round
        mcCree.readyUltimateCheck(mcCree.shortRange);
        soldier76.readyUltimateCheck(soldier76.shortRange);
        // checks for ultimate
        mcCree.combatRound(soldier76.shortRange, mcCree.hitPoints);
        soldier76.combatRound(mcCree.shortRange, soldier76.hitPoints);
        // checks if can heal
        mcCree.activeHeal();
        soldier76.activeHeal();
        // checks if alive
        mcCree.aliveCheck();
        soldier76.aliveCheck();

        // output changed stats
        System.out.println("Hero Stats After Round 3:\n**********************");
        System.out.println(mcCree.toString());
        System.out.println(soldier76.toString());

    }

}
