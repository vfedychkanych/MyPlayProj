package Player;
import Enemy.Enemy;
import Items.Armor.Armor;
import Items.Inventory;
import Items.UsableItem.UsableItems;
import Items.Weapon.Weapon;
import Race.Race;

import java.util.*;

public class Player<T extends Inventory>{
    private String name;
    private Race race;
    private String raceName;
    private int level;
    private double hp;
    private double hpForLvl;
    private double attackWithOutWeap;

    private double defenseWithOutWeap;
    private double attack;
    private double attCof;
    private double defense;
    private double defCof;

    protected List<T> inventory = new ArrayList<>();
    protected T inHands;

    protected T activeArmor;

    public Player(Race race, String name) {
        this.name = name;
        this.race = race;
        this.raceName = race.getRaceName();
        this.level = 1;
        this.hp = race.getHp();
        this.hpForLvl = race.getHpForLvl();
        this.attackWithOutWeap =  race.getAttack();
        this.defenseWithOutWeap = race.getDefense();
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

    public void addToInventory(T obj){
        inventory.add(obj);
    }

    public void printInventory(){
        for (Inventory i: inventory) {
            i.print();
        }
    }

   public void takeInHands(int index){
       if(!inventory.isEmpty()) {
           if (inventory.get(index) instanceof Armor) {
               this.defense = this.defenseWithOutWeap;
               this.activeArmor = inventory.get(index);
               this.defense += this.activeArmor.getDefence();
               if (this.activeArmor.getName().equals(this.race.getDefenseForRace())) {this.defense *= this.race.getCofForRace();}
           }
           if (inventory.get(index) instanceof Weapon) {
               this.attack = this.attackWithOutWeap;
               this.inHands = inventory.get(index);
               this.attack += this.inHands.getAttack();
               if (this.inHands.getName().equals(this.race.getWeaponForRace())) {this.attack *= this.race.getCofForRace();}
           }
           if (inventory.get(index) instanceof UsableItems){this.inHands = inventory.get(index);}
       } else {
            System.out.println("NOTHING TO TAKE");
        }
    }

    public void getDropFromEnemy(Enemy enemy) {
        if (enemy.getHp() <= 0.0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Підібрати це спорядження(y/n)?" + enemy.dropEnemyInventory(enemy));
            if (scanner.nextLine().equalsIgnoreCase("y")) {
                this.inventory.add((T) enemy.dropEnemyInventory(enemy));
            } else{
                System.out.println("Спорядження не підібрано");
            }
            enemy.enemiesDie();
        }
    }

    public void showHands(){
        this.inHands.print();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
