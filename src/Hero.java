/**
 * Created by jeffreydorney on 8/11/16.
 */
public class Hero {

    public String heroName;         //created string name variable
    public boolean ultimateReady;   //created ultimate attack int
    public int ultimateDamage;      //created ultimate damage int
    public int longRange;           //created long attack int
    public int mediumRange;         //created medium attack int
    public int shortRange;          //created short attack int

    public void heroSet(String heroName, boolean ultimateReady,int ultimateDamage, int longRange, int mediumRange, int shortRange) {
        this.heroName = heroName;           //sets this hero name property
        this.ultimateReady = ultimateReady; //sets this hero ultimate property
        this.ultimateDamage = ultimateDamage; //sets this hero ultimate damage
        this.longRange = longRange;         //sets this hero long attack property
        this.mediumRange = mediumRange;     //sets this hero medium attack property
        this.shortRange = shortRange;       //sets this hero short attack property

    }


    //public boolean heroDuel(String heroOne, boolean attackUsed, );

}
