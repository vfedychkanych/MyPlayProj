package Perso.Player;
import Items.Inventory;
import Perso.Perso;
import Race.Race;

import java.util.*;

public class Player extends Perso {
    private String name;
    private Race race;
    private String raceName;
    private int level;
    private double hp;
    private double hpForLvl;
    private double attack;
    private double attCof;
    private double defense;
    private double defCof;
    protected Collection<Inventory> inventory = new ArrayList<>();

    public Player(Race race, String name) {
        this.name = name;
        this.race = race;
        this.raceName = race.getRaceName();
        this.level = 0;
        this.hp = race.getHp();
        this.hpForLvl = race.getHpForLvl();
        this.attack = race.getAttack();
        this.attCof = race.getAttForLvl();
        this.defense = race.getDefense();
        this.defCof = race.getDefForLvl();
    }
    public int getLevel() {
        return level;
    }
    public void print(){
        System.out.println("======================================");
        System.out.println("Name : " + this.name);
        System.out.println("Race : " + this.raceName);
        System.out.println("Level : " + this.level);
        System.out.println("hp : " + this.hp);
        System.out.println("Attack : " + this.attack);
        System.out.println("Defence : " + this.defense);
        System.out.println("HPCof : " + this.hpForLvl);
        System.out.println("AtkCof : " + this.attCof);
        System.out.println("DefCof : " + this.defCof);
        System.out.println("======================================");

    }

    public void addToInventory(Inventory obj){
        inventory.add(obj);
    }

    public void printInventory(){
        for (Inventory i: inventory) {
            i.print();
        }
    }
}
