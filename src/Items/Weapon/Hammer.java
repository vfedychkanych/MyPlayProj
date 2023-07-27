package Items.Weapon;

public class Hammer implements Weapon {
    public double attack;
    public int lvl;
    public double hp;
    public double attCof = 1.5;
    public double hpCof = 1.2;

    public Hammer(int level) {
        this.lvl = level;
        if (level == 0) {
            this.hp = 100;
            this.attack = 3.0;
        }
        else {
            this.hp = 100;
            this.attack = 3.0;
            for (int i = 0; i < level; i++) {
                this.hp = this.hp * this.hpCof;
                this.attack = this.attack * this.attCof;
            }
        }
    }

    public void setHpCof(double hpCof) {
        this.hpCof = hpCof;
    }

    public void setAttCof(double attCof) {
        this.attCof = attCof;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getHpCof() {
        return hpCof;
    }

    public double getAttCof() {
        return attCof;
    }

    public int getLvl() {
        return lvl;
    }

    public double getHp() {
        return hp;
    }

    public double getAttack() {
        return attack;
    }
}