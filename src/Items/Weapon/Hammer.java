package Items.Weapon;

import java.util.ArrayList;

public class Hammer implements Weapon {
    private int indetifier = 0;
    private String name = "Hammer";
    private double attack;

    private int lvl;
    private double hp;
    private double attCof = 1.5;
    private double hpCof = 1.2;
    //--------------------------------------------------------------------------------------
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
    //--------------------------------------------------------------------------------------
    public void setHpCof(double hpCof) {
        this.hpCof = hpCof;
    }

    public void setName(String name) {
        this.name = name;
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
    //--------------------------------------------------------------------------------------
    public double getHpCof() {
        return hpCof;
    }

    @Override
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
    public int getIndetifier() {
        return indetifier;
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