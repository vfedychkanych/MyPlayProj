package Race;

public class Orc implements Race{

    private String raceName = "Orc";
    private double hp = 150.00;
    private double hpForLvl = 1.0;
    private double attack = 5.0;
    private double attForLvl = 1.1;
    private double defense = 8.0;
    private double defForLvl = 1.1;

    public Orc() {
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
