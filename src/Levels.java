public class Levels {
    private int level;
    private int exp;

    public Levels() {

    }

    public Levels setFirstLevel() {
        return new Levels(1, 0);
    }

    public Hero charactersOfSecondLevel(Hero hero) throws LevelException {
        if (hero.getLevel().getLevel() == 2) {
            hero.setHp(hero.getHp() + 20);
            Weapon weapon = hero.getWeapon();
            Armor armor = hero.getArmor();

            hero.setWeapon(hero.getWeapon().notHaveWeapon());
            // зняти зброю і броню і після множення вдіти назад
            hero.getArmor().setProtectionFactor(hero.getArmor().getProtectionFactor() * 1.5);
            hero.getWeapon().setAttackFactor(hero.getWeapon().getAttackFactor() * 1.5);

            hero.setWeapon(hero.getWeapon().wearingWeaponToHero(hero, weapon));

        } else throw new LevelException("Персонаж не має 2-го рівня");
        return hero;
    }

    public Hero charactersOfThirdLevel(Hero hero) throws LevelException {
        if (hero.getLevel().getLevel() == 3) {
            hero.setHp(hero.getHp() + 20);
            Weapon weapon = hero.getWeapon();
            Armor armor = hero.getArmor();

            hero.setWeapon(hero.getWeapon().notHaveWeapon());
            hero.getArmor().setProtectionFactor(hero.getArmor().getProtectionFactor() * 2.5);
            hero.getWeapon().setAttackFactor(hero.getWeapon().getAttackFactor() * 2.5);

            hero.setWeapon(hero.getWeapon().wearingWeaponToHero(hero, weapon));
        } else throw new LevelException("Персонаж не має 3-го рівня");
        return hero;
    }

    public Hero charactersOfFoursLevel(Hero hero) throws LevelException {
        if (hero.getLevel().getLevel() == 4) {
            hero.setHp(hero.getHp() + 20);
            Weapon weapon = hero.getWeapon();
            Armor armor = hero.getArmor();

            hero.setWeapon(hero.getWeapon().notHaveWeapon());
            hero.getArmor().setProtectionFactor(hero.getArmor().getProtectionFactor() * 3.5);
            hero.getWeapon().setAttackFactor(hero.getWeapon().getAttackFactor() * 3.5);

            hero.setWeapon(hero.getWeapon().wearingWeaponToHero(hero, weapon));
        } else throw new LevelException("Персонаж не має 4-го рівня");
        return hero;
    }

    public Hero charactersOfFifthLevel(Hero hero) throws LevelException {
        if (hero.getLevel().getLevel() == 5) {
            hero.setHp(hero.getHp() + 20);
            Weapon weapon = hero.getWeapon();
            Armor armor = hero.getArmor();

            hero.setWeapon(hero.getWeapon().notHaveWeapon());
            hero.getArmor().setProtectionFactor(hero.getArmor().getProtectionFactor() * 5.0);
            hero.getWeapon().setAttackFactor(hero.getWeapon().getAttackFactor() * 5.0);

            hero.setWeapon(hero.getWeapon().wearingWeaponToHero(hero, weapon));
        } else throw new LevelException("Персонаж не має 5-го рівня");
        return hero;
    }

    public Hero charactersOfSixLevel(Hero hero) throws LevelException {
        if (hero.getLevel().getLevel() == 6) {
            hero.setHp(hero.getHp() + 20);
            Weapon weapon = hero.getWeapon();
            Armor armor = hero.getArmor();

            hero.setWeapon(hero.getWeapon().notHaveWeapon());
            hero.getArmor().setProtectionFactor(hero.getArmor().getProtectionFactor() * 10.0);
            hero.getWeapon().setAttackFactor(hero.getWeapon().getAttackFactor() * 10.0);

            hero.setWeapon(hero.getWeapon().wearingWeaponToHero(hero, weapon));
        } else throw new LevelException("Персонаж не має 6-го рівня");
        return hero;
    }

    public Hero upgradingHeroLevels(Hero hero) throws LevelException {
        if (hero.getLevel().getExp() >= 10) {
            hero.setLevel(new Levels(2,hero.getLevel().getExp()));
            hero.getLevel().charactersOfSecondLevel(hero);
        } else if (hero.getLevel().getExp() >= 30) {
            hero.setLevel(new Levels(3,hero.getLevel().getExp()));
            hero.getLevel().charactersOfThirdLevel(hero);
        } else if (hero.getLevel().getExp() >= 70) {
            hero.setLevel(new Levels(4, hero.getLevel().getExp()));
            hero.getLevel().charactersOfFoursLevel(hero);
        } else if (hero.getLevel().getExp() >= 120) {
            hero.setLevel(new Levels(5, hero.getLevel().getExp()));
            hero.getLevel().charactersOfFifthLevel(hero);
        } else if (hero.getLevel().getExp() >= 200) {
            hero.setLevel(new Levels(6, hero.getLevel().getExp()));
            hero.getLevel().charactersOfSixLevel(hero);
        }
        return hero;
    }


    public Levels(int level, int exp) {
        this.level = level;
        this.exp = exp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
}
