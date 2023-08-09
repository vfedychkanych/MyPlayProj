package Race;

public class Gnome implements Race{
    private String raceName = "Gnome";
    private String weaponForRace = "Axe";

    private String defenceForRace = "Heavy Armor";
    private double hp = 120.00;
    private double hpForLvl = 1.5;
    private double attack = 3.0;
    private double attForLvl = 1.5;
    private double defense = 2.0;
    private double defForLvl = 2.5;
    private double CofForRace = 1.3;
    //--------------------------------------------------------------------------------------
    public Gnome() {
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
        /*System.out.print("======================================\n" + this.raceName + "\n" + "Master Weapon " + this.weaponForRace + "\n" + "HP " + this.hp + "\n" + "HP cof " + this.hpForLvl +
                "\n" + "Atk " + this.attack + "\n" + "Atk cof " + this.attForLvl + "Def " + this.defense + "\n" + "Def cof " + this.defForLvl + "\n" + "Atk cof from race weapon " + this.CofForRace + "\n");
        */
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
