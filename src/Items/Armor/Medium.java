package Items.Armor;

import java.util.ArrayList;

public class Medium implements Armor{
    private String name = "Medium Armor";
    private double defence;
    private int lvl;
    private double hp;
    private double defCof = 1.5;
    private double hpCof = 1.2;

    public Medium (int level) {
        this.lvl = level;
        if (level == 0) {
            this.hp = 100;
            this.defence = 15.0;
        }
        else {
            this.hp = 100;
            this.defence = 15.0;
            for (int i = 0; i < level; i++) {
                this.hp = this.hp * this.hpCof;
                this.defence = this.defence * this.defCof;
            }
        }
    }


    @Override
    public double getDefence() {
        return defence;
    }
    public int getLvl() {
        return lvl;
    }
    public double getHp() {
        return hp;
    }
    public double getDefCof() {
        return defCof;
    }
    public double getHpCof() {
        return hpCof;
    }
    @Override
    public String getName() {
        return name;
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
