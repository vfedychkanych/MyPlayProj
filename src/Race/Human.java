package Race;

public class Human implements Race{
    private String raceName = "Human";
    private String weaponForRace = "Sword";

    private String defenceForRace = "Medium Armor";
    private double hp = 100.00;
    private double hpForLvl = 1.1;
    private double attack = 1.0;
    private double attForLvl = 2.0;
    private double defense = 5.0;
    private double defForLvl = 1.5;
    private double CofForRace = 1.3;
    //--------------------------------------------------------------------------------------
    public Human() {
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
