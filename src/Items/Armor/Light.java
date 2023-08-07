package Items.Armor;

import java.util.ArrayList;

public class Light implements Armor{
    private int indetifier = 0;
    private String name = "Light Armor";
    private double defence;
    private int lvl;
    private double hp;
    private double defCof = 1.5;
    private double hpCof = 1.2;

    public Light (int level) {
        this.lvl = level;
        if (level == 0) {
            this.hp = 100;
            this.defence = 6.0;
        }
        else {
            this.hp = 100;
            this.defence = 6.0;
            for (int i = 0; i < level; i++) {
                this.hp = this.hp * this.hpCof;
                this.defence = this.defence * this.defCof;
            }
        }
    }

    public void setIndetifier(int indetifier) {
        this.indetifier = indetifier;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getDefence() {
        return defence;
    }

    public void setDefence(double defence) {
        this.defence = defence;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getDefCof() {
        return defCof;
    }

    public void setDefCof(double defCof) {
        this.defCof = defCof;
    }

    public double getHpCof() {
        return hpCof;
    }

    public void setHpCof(double hpCof) {
        this.hpCof = hpCof;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getIndetifier() {
        return indetifier;
    }

    @Override
    public void print() {
        ArrayList<String> res = new ArrayList<>();
        res.add(String.valueOf(this.name));
        res.add("level:" + this.lvl);
        res.add("hp:" + this.hp);
        res.add("hpCof:" + this.hpCof);
        res.add("Attack:" + this.defence);
        res.add("AtkCof:" + this.defCof);
        System.out.println(res);
    }
}