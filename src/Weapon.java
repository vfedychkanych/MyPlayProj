public class Weapon {
    private TypesOfWeapon name;
    private double attackFactor;
    private double criticalAttackFactor;
    private double chanceCriticalAttackFactor;
    private int level;
    private double hp;

    public Weapon notHaveWeapon() {
        return new Weapon(TypesOfWeapon.NOTHING, 3.0, 0.1, 0.1, 0, 1);
    }

    public Weapon() {
    }

    public Weapon(TypesOfWeapon name, double attackFactor, double criticalAttackFactor, double chanceCriticalAttackFactor, int level, double hp) {
        this.name = name;
        this.attackFactor = attackFactor;
        this.criticalAttackFactor = criticalAttackFactor;
        this.chanceCriticalAttackFactor = chanceCriticalAttackFactor;
        this.level = level;
        this.hp = hp;
    }

    public TypesOfWeapon getName() {
        return name;
    }

    public void setName(TypesOfWeapon name) {
        this.name = name;
    }

    public double getAttackFactor() {
        return attackFactor;
    }

    public void setAttackFactor(double attackFactor) {
        this.attackFactor = attackFactor;
    }

    public double getCriticalAttackFactor() {
        return criticalAttackFactor;
    }

    public void setCriticalAttackFactor(double criticalAttackFactor) {
        this.criticalAttackFactor = criticalAttackFactor;
    }

    public double getChanceCriticalAttackFactor() {
        return chanceCriticalAttackFactor;
    }

    public void setChanceCriticalAttackFactor(double chanceCriticalAttackFactor) {
        this.chanceCriticalAttackFactor = chanceCriticalAttackFactor;
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
