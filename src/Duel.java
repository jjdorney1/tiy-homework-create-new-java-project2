/**
 * Created by jeffreydorney on 8/11/16.
 */
public class Duel {

    public static String fightTime(String heroOne, int attackOne, String heroTwo, int attackTwo) {
        if(attackOne > attackTwo) {
            return (heroOne + " wins the duel against " + heroTwo + ".");
        } else if(attackTwo > attackOne){
            return (heroTwo + " wins the duel against " + heroOne + ".");
        } else {
            return (heroOne + " and " + heroTwo + " duel, but it's too close to call who wins.");
        }

    }
//                             int longRangeHeroOne, int mediumRangeHeroOne,
//                             int shortRangeHeroOne) {
//
    }
    //public boolean whoWins(String heroFirst, String heroSecond);

