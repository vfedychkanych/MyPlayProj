public class Armor {
    private ArmorNames name;
    private double protectionFactor;
    private int level;
    private double hp;

    public Armor notHaveArmor() {
        return new Armor(ArmorNames.NOTHING, 1.0, 0, 1);
    }
//    public Armor wearingArmorToHero(Hero hero) {
//
//    }

    public Armor() {
    }

    public Armor(ArmorNames name, double protectionFactor, int level, double hp) {
        this.name = name;
        this.protectionFactor = protectionFactor;
        this.level = level;
        this.hp = hp;
    }

    public ArmorNames getName() {
        return name;
    }

    public void setName(ArmorNames name) {
        this.name = name;
    }

    public double getProtectionFactor() {
        return protectionFactor;
    }

    public void setProtectionFactor(double protectionFactor) {
        this.protectionFactor = protectionFactor;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }
}
