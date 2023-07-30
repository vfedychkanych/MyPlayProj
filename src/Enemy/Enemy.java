package Enemy;

import Items.Inventory;
import Items.UsableItem.AttackPoison;
import Items.UsableItem.DefencePoison;
import Items.UsableItem.HealPoison;
import Items.Weapon.Axe;
import Items.Weapon.Baculus;
import Items.Weapon.Hammer;
import Items.Weapon.Sword;
import Race.Race;
import Race.Elf;
import Race.Gnome;
import Race.Human;
import Race.Orc;

import java.util.ArrayList;
import java.util.Collection;

public class Enemy {
    private Race race;
    private int level;
    private double hp;
    private double attack;
    private double defense;

    private Collection<Inventory> inventory = new ArrayList<>();
    private Inventory inHands;

    public Enemy(int level) {
        autoRace();
        this.level = level;
        this.hp = race.getHp();
        this.attack = race.getAttack();
        this.defense = race.getDefense();
        generateInventory();
        generateInHands();

        for (int i = 0; i < level; i++) {
            this.hp *= race.getHpForLvl();
            this.attack *= race.getAttForLvl();
            this.defense *= race.getDefense();
        }


    }

    public void print(){
        System.out.println("======================================");
        System.out.println("Name : " + race.getRaceName());
        System.out.println("Race : " + race.getRaceName());
        System.out.println("Level : " + this.level);
        System.out.println("hp : " + this.hp);
        System.out.println("Attack : " + this.attack);
        System.out.println("Defence : " + this.defense);
        System.out.println("======================================");
        System.out.println("INVENTORY");
        for (Inventory i: inventory) {
            i.print();
        }
        System.out.println("======================================");
        System.out.println("IN HANDS");
        this.inHands.print();
        System.out.println("======================================");
    }

    private static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    private void autoRace(){
        int randomRace = getRandomNumber(1,4);
        if(randomRace == 1) { this.race = new Elf();}
        if(randomRace == 2) { this.race = new Gnome();}
        if(randomRace == 3) { this.race = new Human();}
        if(randomRace == 4) { this.race = new Orc();}
    }

    private void addToInventory(Inventory obj) {inventory.add(obj);}

    private void generateInventory() {
        int randomCountOfSlotsInInventory = getRandomNumber(0, 10);
        for (int i = 0; i <= randomCountOfSlotsInInventory; i++) {
            int randomItemGenerate = getRandomNumber(1, 7);
            switch (randomItemGenerate) {
                case 1 -> this.addToInventory(new Sword(getRandomNumber(this.level, this.level + 1)));
                case 2 -> this.addToInventory(new Axe(getRandomNumber(this.level, this.level + 1)));
                case 3 -> this.addToInventory(new Hammer(getRandomNumber(this.level, this.level + 1)));
                case 4 -> this.addToInventory(new Baculus(getRandomNumber(this.level, this.level + 1)));
                case 5 -> this.addToInventory(new HealPoison(getRandomNumber(15, 100)));
                case 6 -> this.addToInventory(new AttackPoison(getRandomNumber(1, 15)));
                case 7 -> this.addToInventory(new DefencePoison(getRandomNumber(1, 15)));
            }
        }
    }

    private void generateInHands(){
        int randomItemGenerate = getRandomNumber(1, 7);
        switch (randomItemGenerate) {
                case 1 -> this.inHands = new Sword(getRandomNumber(this.level, this.level + 1));
                case 2 -> this.inHands = new Axe(getRandomNumber(this.level, this.level + 1));
                case 3 -> this.inHands = new Hammer(getRandomNumber(this.level, this.level + 1));
                case 4 -> this.inHands = new Baculus(getRandomNumber(this.level, this.level + 1));
                case 5 -> this.inHands = new HealPoison(getRandomNumber(15, 100));
                case 6 -> this.inHands = new  AttackPoison(getRandomNumber(1, 15));
                case 7 -> this.inHands = new  DefencePoison(getRandomNumber(1, 15));
            }
        if (this.inHands.getIndetifier() == 0) {
            this.attack += this.inHands.getAttack();
            if (this.inHands.getName().equals(this.race.getWeaponForRace())) {
                this.attack *= this.race.getCofForRace();
            }
        }
    }



}
