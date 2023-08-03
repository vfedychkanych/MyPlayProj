import Player.Player;
import UI.Game;
import UI.*;

public class Main {
    private static Player testPlayer;


    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static void main(String[] args) {
        new Game();

/*
Створити режим бою
Створити НПС вороги
Створити випадки негод або щастя
...
 */
        /*while (true) {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Create player (y/n): ");
            String answer = myObj.next();
            Race elf = new Elf();
            Race gnome = new Gnome();
            Race human = new Human();
            Race ork = new Orc();
            if (answer.equalsIgnoreCase("y")) {
                System.out.println("======================================");
                Scanner nameS = new Scanner(System.in);
                System.out.println("Enter name of your character: ");
                String name = myObj.next();
                System.out.println("======================================");
                elf.print();
                gnome.print();
                human.print();
                ork.print();
                Scanner raceS = new Scanner(System.in);
                System.out.println("Choose Race(Elf(E)/Gnome(G)/Human(H)/Orc(O)): ");
                String whatRase = myObj.next();

                if (whatRase.equalsIgnoreCase("e")) {
                    testPlayer = new Player(elf, name);
                    testPlayer.print();
                }
                if (whatRase.equalsIgnoreCase("g")) {
                    testPlayer = new Player(gnome, name);
                    testPlayer.print();
                }
                if (whatRase.equalsIgnoreCase("h")) {
                    testPlayer = new Player(human, name);
                    testPlayer.print();
                }
                if (whatRase.equalsIgnoreCase("o")) {
                    testPlayer = new Player(ork, name);
                    testPlayer.print();
                }
                for (int i = 1; i < 5; i++) {
                    switch (i) {
                        case 1 -> testPlayer.addToInventory(new Sword(getRandomNumber(1, 10)));
                        case 2 -> testPlayer.addToInventory(new Axe(testPlayer.getLevel()));
                        case 3 -> testPlayer.addToInventory(new Hammer(testPlayer.getLevel()));
                        case 4 -> testPlayer.addToInventory(new Baculus(testPlayer.getLevel()));
                    }
                }
                for (int i = 1; i < 4; i++) {
                    switch (i) {
                        case 1 -> testPlayer.addToInventory(new HealPoison(getRandomNumber(15, 100)));
                        case 2 -> testPlayer.addToInventory(new AttackPoison(getRandomNumber(1, 15)));
                        case 3 -> testPlayer.addToInventory(new DefencePoison(getRandomNumber(1, 15)));
                    }
                }
                testPlayer.printInventory();
                while (true) {
                    System.out.println("======================================");
                    Scanner weap = new Scanner(System.in);
                    System.out.println("Choose from inventory(y/n)");
                    String chooseWeapon = myObj.next();
                    if (chooseWeapon.equalsIgnoreCase("y")) {
                        System.out.println("======================================");
                        Scanner we = new Scanner(System.in);
                        System.out.println("Enter index from inventory");
                        String index = myObj.next();

                        testPlayer.takeInHands(Integer.parseInt(index));
                        testPlayer.showHands();
                        testPlayer.print();
                    }
                    if (chooseWeapon.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            }
            if (answer.equalsIgnoreCase("n")) {
                Scanner myObj1 = new Scanner(System.in);
                System.out.println("Create enemy (y/n): ");
                String answer1 = myObj.next();
                if (answer1.equalsIgnoreCase("y")) {
                    Enemy newEnemy = new Enemy(1);
                    newEnemy.print();
                }
                if (answer1.equalsIgnoreCase("n")){
                    Scanner end = new Scanner(System.in);
                    System.out.println("Restart?(y/n)");
                    String cont = myObj.next();
                    if (cont.equalsIgnoreCase("y")){
                        continue;
                    }
                    if (cont.equalsIgnoreCase("n")){
                        break;
                    }
                }
            }
        }
    }*/


    }
}