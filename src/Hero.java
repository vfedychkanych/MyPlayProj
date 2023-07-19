import java.util.Random;
import java.util.Scanner;

public class Hero {
    private double hp;
    private Armor armor;
    private int level;
    private Weapon weapon;
    private String name;
    private Species species;

    public Hero createMyPerson () {
        double hp = 100.00;
        int level = 1;
        System.out.println("Впишіть ім'я вашого персонажа: ");
        Scanner scannerForName = new Scanner(System.in);
        String name = scannerForName.nextLine();
        Species species = new Species().createSpeciesForHero();
        Armor armor = new Armor().notHaveArmor();
        Weapon weapon = new Weapon().notHaveWeapon();
        if (species.getSpecialName().equals(SpecialName.Dwarf)) {
            weapon.setAttackFactor(weapon.getAttackFactor() + 0.2);
        }
        if (species.getSpecialName().equals(SpecialName.Gnome)) {
            armor.setProtectionFactor(armor.getProtectionFactor() * 0.3);
        }
        return new Hero(hp, level, name, species, weapon, armor);
    }

    public Hero(double hp, int level, String name, Species species, Weapon weapon, Armor armor) {
        this.hp = hp;
        this.armor = armor;
        this.level = level;
        this.weapon = weapon;
        this.name = name;
        this.species = species;
    }
}
