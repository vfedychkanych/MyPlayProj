import java.util.Scanner;

public class Hero {
    private double hp;
    private Armor armor;
    private Levels level;
    private Weapon weapon;
    private String name;
    private Species species;

    public Hero createMyPerson () {
        double hp = 100.00;
        Levels level = new Levels().setFirstLevel();
        System.out.println("Впишіть ім'я вашого персонажа: ");
        Scanner scannerForName = new Scanner(System.in);
        String name = scannerForName.nextLine();
        Species species = new Species().createSpeciesForHero();
        Armor armor = new Armor().notHaveArmor();
        Weapon weapon = new Weapon().notHaveWeapon();
        if (species.getSpecialName().equals(SpecialName.Dwarf)) {
            weapon.setCriticalAttackFactor(weapon.getCriticalAttackFactor() + 0.2);
        }
        if (species.getSpecialName().equals(SpecialName.Gnome)) {
            armor.setProtectionFactor(armor.getProtectionFactor() * 1.3);
        }
        return new Hero(hp, level, name, species, weapon, armor);
    }



    public Hero(double hp, Levels level, String name, Species species, Weapon weapon, Armor armor) {
        this.hp = hp;
        this.armor = armor;
        this.level = level;
        this.weapon = weapon;
        this.name = name;
        this.species = species;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Levels getLevel() {
        return level;
    }

    public void setLevel(Levels level) {
        this.level = level;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }
}
