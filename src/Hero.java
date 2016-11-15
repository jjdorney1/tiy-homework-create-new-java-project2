/**
 * Created by jeffreydorney on 8/11/16.
 */
public class Hero {

    public String heroName;         //created string name variable
    public boolean ultimateReady;   //created ultimate attack int
    public int hitPoints;           //created hit points int
    public int longRange;           //created long attack int
    public int mediumRange;         //created medium attack int
    public int shortRange;          //created short attack int
    public boolean canHeal;         //created healing boolean

    public Hero(String heroName,int hitPoints, int longRange, int mediumRange, int shortRange, boolean canHeal) {
        this.heroName = heroName;           //sets this hero name property
        this.ultimateReady = false;         //sets default value to false
        this.hitPoints = hitPoints;         //sets this hero ultimate damage
        this.longRange = longRange;         //sets this hero long attack property
        this.mediumRange = mediumRange;     //sets this hero medium attack property
        this.shortRange = shortRange;       //sets this hero short attack property
        this.canHeal = canHeal;             //sets this hero heal ability

    }

    public String toString(){
        return this.heroName + ": Long Range - " + this.longRange + "; Medium Range - " + this.mediumRange +
                "; Short Range - " + this.shortRange + ";\n   Hit Points - " + this.hitPoints + "; This Hero Can Heal: " +
                this.canHeal + ".\n   Ultimate Ready: " + this.ultimateReady + ".\n";
    }
    //public boolean heroDuel(String heroOne, boolean attackUsed, );

    public void readyUltimateCheck(int damageDone){
        if(damageDone > 45){
            this.ultimateReady = true;
        } else {
            this.ultimateReady = false;
        }
    }

    public void combatRound(int damageDone, int hitPoints){
        this.hitPoints = hitPoints - damageDone;
    }

    public boolean aliveCheck(){
        if(this.hitPoints <= 0){
            // if they die they loose their ultimate
            this.ultimateReady = false;
            return false;
        } else {
            return true;
        }
    }

    public void activeHeal(){
        if(this.canHeal){
            this.hitPoints = this.hitPoints + 50;
            this.canHeal = false;
        }
    }



}
