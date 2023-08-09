package Race;

public class Elf implements Race {
    private String raceName = "Elf";
    private String weaponForRace = "Baculus";

    private String defenceForRace = "Light Armor";
    private double hp = 70.00;
    private double hpForLvl = 1.7;
    private double attack = 2.0;
    private double attForLvl = 2.5;
    private double defense = 1.0;
    private double defForLvl = 2.0;

    private double CofForRace = 1.3;

    //--------------------------------------------------------------------------------------
    public Elf() {
    }

    //--------------------------------------------------------------------------------------
    public double getHp() {
        return hp;
    }

    public String getWeaponForRace() {
        return weaponForRace;
    }

    public double getCofForRace() {
        return CofForRace;
    }

    public String getDefenceForRace() {
        return defenceForRace;
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