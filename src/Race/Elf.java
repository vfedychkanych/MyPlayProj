package Race;

public class Elf implements Race{
    private String raceName = "Elf";
    private double hp = 70.00;
    private double hpForLvl = 1.7;
    private double attack = 2.0;
    private double attForLvl = 2.5;
    private double defense = 1.0;
    private double defForLvl = 2.0;

    public Elf() {
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
}