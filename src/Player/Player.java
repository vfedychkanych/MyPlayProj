package Player;
import Enemy.Enemy;
import Items.Inventory;
import Race.Race;

import java.util.*;

public class Player{
    private String name;
    private Race race;
    private String raceName;
    private int level;
    private double hp;
    private double hpForLvl;
    private double attackWithOutWeap;
    private double attack;
    private double attCof;
    private double defense;
    private double defCof;

    protected List<Inventory> inventory = new ArrayList<>();
    protected Inventory inHands;

    public Player(Race race, String name) {
        this.name = name;
        this.race = race;
        this.raceName = race.getRaceName();
        this.level = 1;
        this.hp = race.getHp();
        this.hpForLvl = race.getHpForLvl();
        this.attackWithOutWeap =  race.getAttack();
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

    public void takeInHands(int index){
        if(!inventory.isEmpty()){
            this.attack = this.attackWithOutWeap;
            this.inHands = inventory.get(index);
            if (this.inHands.getIndetifier() == 0) {
                this.attack += this.inHands.getAttack();
                if (this.inHands.getName().equals(this.race.getWeaponForRace())) {
                    this.attack *= this.race.getCofForRace();
                }
            }
        }
        else {
            System.out.println("NOTHING TO TAKE");
        }
    }

    public void getDropFromEnemy(Enemy enemy) {
        if (enemy.getHp() <= 0.0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Підібрати це спорядження(y/n)?" + enemy.dropEnemyInventory(enemy));
            if (scanner.nextLine().equalsIgnoreCase("y")) {
                this.inventory.add(enemy.dropEnemyInventory(enemy));
            } else{
                System.out.println("Спорядження не підібрано");
            }
            enemy.enemiesDie();
        }
    }

    public void showHands(){
        this.inHands.print();
    }



}
