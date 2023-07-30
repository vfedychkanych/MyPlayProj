import Items.UsableItem.AttackPoison;
import Items.UsableItem.DefencePoison;
import Items.UsableItem.HealPoison;
import Items.Weapon.Axe;
import Items.Weapon.Baculus;
import Items.Weapon.Hammer;
import Items.Weapon.Sword;
import Perso.Player.Player;
import Race.Elf;
import Race.Gnome;
import Race.Human;
import Race.Orc;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    private static Player testPlayer;
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    public static void main(String[] args){
/*
Створити режим бою
Створити НПС вороги
Створити випадки негод або щастя
...
 */

        while (true){
            Scanner myObj = new Scanner(System.in);
            System.out.println("Create player (y/n): ");
            String answer = myObj.next();

            if (answer.equals("y")) {
                System.out.println("======================================");
                Scanner nameS = new Scanner(System.in);
                System.out.println("Enter name of your character: ");
                String name = myObj.next();
                System.out.println("======================================");
                Scanner raceS = new Scanner(System.in);
                System.out.println("Choose Race(Elf(E)/Gnome(G)/Human(H)/Orc(O)): ");
                String whatRase = myObj.next();
                if (whatRase.equals("E") || whatRase.equals("e")) {
                    testPlayer = new Player(new Elf(), name);
                    testPlayer.print();
                }
                if (whatRase.equals("G") || whatRase.equals("g")) {
                    testPlayer = new Player(new Gnome(), name);
                    testPlayer.print();
                }
                if (whatRase.equals("H") || whatRase.equals("h")) {
                    testPlayer = new Player(new Human(), name);
                    testPlayer.print();
                }
                if (whatRase.equals("O") || whatRase.equals("o")) {
                    testPlayer = new Player(new Orc(), name);
                    testPlayer.print();
                }

                for (int i = 0; i < 3; i++) {
                    switch (getRandomNumber(1,4)){
                        case 1:
                            testPlayer.addToInventory(new Sword(getRandomNumber(1, 10)));
                            break;
                        case 2:
                            testPlayer.addToInventory(new Axe(testPlayer.getLevel()));
                            break;
                        case 3:
                            testPlayer.addToInventory(new Hammer(testPlayer.getLevel()));
                            break;
                        case 4:
                            testPlayer.addToInventory(new Baculus(testPlayer.getLevel()));
                            break;
                    }
                }

                for (int i = 0; i < 3; i++) {
                    switch (getRandomNumber(1,3)){
                        case 1:
                            testPlayer.addToInventory(new HealPoison(getRandomNumber(15, 100)));
                            break;
                        case 2:
                            testPlayer.addToInventory(new AttackPoison(getRandomNumber(1, 15)));
                            break;
                        case 3:
                            testPlayer.addToInventory(new DefencePoison(getRandomNumber(1, 15)));
                            break;
                    }
                }
                testPlayer.printInventory();

            }
            if (answer.equals("n")) {
                break;
            }

        }
    }
}