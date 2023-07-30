package Race;

public class Gnome implements Race{
    private String raceName = "Gnome";
    private double hp = 120.00;
    private double hpForLvl = 1.5;
    private double attack = 3.0;
    private double attForLvl = 1.5;
    private double defense = 2.0;
    private double defForLvl = 2.5;

    public Gnome() {
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
