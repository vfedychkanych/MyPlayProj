package Items.Weapon;

import java.util.ArrayList;

public class Baculus implements Weapon {
    private String name = "Baculus";
    private double attack;
    private int lvl;
    private double hp;
    private double attCof = 1.5;
    private double hpCof = 1.2;
    //--------------------------------------------------------------------------------------
    public Baculus(int level) {
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
    //--------------------------------------------------------------------------------------
    public double getHpCof() {
        return hpCof;
    }

    public String getName() {
        return name;
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

    @Override
    public String toString() {
        return "Baculus{" +
                "name=" + name +
                ", attack=" + attack +
                ", lvl=" + lvl +
                ", hp=" + hp +
                ", attCof=" + attCof +
                ", hpCof=" + hpCof +
                '}';
    }

    //--------------------------------------------------------------------------------------
    public void print(){
        ArrayList<String> res = new ArrayList<>();
        res.add(String.valueOf(this.name));
        res.add("level:" + this.lvl);
        res.add("hp:" + this.hp);
        res.add("hpCof:" + this.hpCof);
        res.add("Attack:" + this.attack);
        res.add("AtkCof:" + this.attCof);
        System.out.println(res);

    }
}