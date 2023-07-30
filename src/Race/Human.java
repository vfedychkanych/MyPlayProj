package Race;

public class Human implements Race{
    private String raceName = "Human";
    private String weaponForRace = "Sword";
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
}
