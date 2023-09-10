package Enemy;

import Items.Inventory;
import Items.UsableItems.AttackPoison;
import Items.UsableItems.DefencePoison;
import Items.UsableItems.HealPoison;
import Items.Weapon.*;
import Race.*;

public class Enemy {
    private Race race;
    private int level;
    private double hp;
    private double attack;
    private double defense;
    private Inventory inHands;

    public Enemy(int level) {
        autoRace();
        this.level = level;
        this.hp = race.getHp();
        this.attack = race.getAttack();
        this.defense = race.getDefense();
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
        System.out.println("IN HANDS");
        this.inHands.print();
        System.out.println("======================================");
    }

    private static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    private void autoRace(){
        int randomRace = getRandomNumber(1,4);
        switch (randomRace) {
            case 1 -> {
                this.race = new Elf();
            }
            case 2 -> {
                this.race = new Gnome();;
            }
            case 3 -> {
                this.race = new Human();;
            }
            case 4 -> {
                this.race = new Orc();;
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
        if (this.inHands instanceof Weapon) {
            this.attack += this.inHands.getAttack();
            if (this.inHands.getName().equals(this.race.getWeaponForRace())) {
                this.attack *= this.race.getCofForRace();
            }
        }
    }

    public void enemiesDie(){
        this.hp = 0.0;
        this.inHands = null;
    }

    public Inventory dropEnemyInventory(Enemy enemy) {
        int randomItemGenerate = getRandomNumber(1, 7);
        switch (randomItemGenerate) {
            case 1 -> {
                return  new Sword(getRandomNumber(this.level, this.level + 1));
            }
            case 2 -> {
                return  new Axe(getRandomNumber(this.level, this.level + 1));
            }
            case 3 -> {
                return  new Hammer(getRandomNumber(this.level, this.level + 1));
            }
            case 4 -> {
                return new Baculus(getRandomNumber(this.level, this.level + 1));
            }
            case 5 -> {
                return new HealPoison(getRandomNumber(15, 100));
            }
            case 6 -> {
                return new AttackPoison(getRandomNumber(1, 15));
            }
            case 7 -> {
                return new DefencePoison(getRandomNumber(1, 15));
            }
        }
        return null;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
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

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }



    public Inventory getInHands() {
        return inHands;
    }

    public void setInHands(Inventory inHands) {
        this.inHands = inHands;
    }
}
