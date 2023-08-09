package Race;

public class Orc implements Race{

    private String raceName = "Orc";
    private String weaponForRace = "Hammer";

    private String defenceForRace = "Heavy Armor";
    private double hp = 150.00;
    private double hpForLvl = 1.0;
    private double attack = 5.0;
    private double attForLvl = 1.1;
    private double defense = 8.0;
    private double defForLvl = 1.1;
    private double CofForRace = 1.3;
    //--------------------------------------------------------------------------------------
    public Orc() {
    }
    //--------------------------------------------------------------------------------------

    public String getDefenceForRace() {
        return defenceForRace;
    }

    public double getHp() {
        return hp;
    }

    public double getHpForLvl() {
        return hpForLvl;
    }

    public double getAttack() {
        return attack;
    }

    public double getAttForLvl() {
        return attForLvl;
    }

    public double getDefense() {
        return defense;
    }

    public double getDefForLvl() {
        return defForLvl;
    }

    public String getRaceName() {
        return raceName;
    }
    public String getWeaponForRace() {
        return weaponForRace;
    }
    public double getCofForRace() {
        return CofForRace;
    }

    public void print(){
        System.out.println("======================================");
        System.out.println(this.raceName);
        System.out.println("Master Weapon " + this.weaponForRace);
        System.out.println("HP " + this.hp);
        System.out.println("HP cof " + this.hpForLvl);
        System.out.println("Atk " + this.attack);
        System.out.println("Atk cof " + this.attForLvl);
        System.out.println("Def " + this.defense);
        System.out.println("Def cof " + this.defForLvl);
        System.out.println("Atk cof from race weapon " + this.CofForRace);
        System.out.println("======================================");

    }
}
