import org.jetbrains.annotations.NotNull;

public class Weapon {
    private TypesOfWeapon name;
    private double attackFactor;
    private double criticalAttackFactor;
    private double chanceCriticalAttackFactor;
    private int level;
    private double hp;

    public Weapon notHaveWeapon() {
        return new Weapon(TypesOfWeapon.NOTHING, 3.0, 0.1, 0.1, 0, 1);
    }

    public Weapon wearingWeaponToHero(@NotNull Hero hero, Weapon weapon) throws LevelException {
        if (level > hero.getLevel().getLevel()) {
            throw new LevelException("Твій рівень недостатньо високий для цього предмету" + "\n" +
                    "Твій рівень: " + hero.getLevel() + " Рівень предмету: " + level);
        }
        hero.setWeapon(new Weapon(weapon.getName(), weapon.getAttackFactor() + hero.getWeapon().getAttackFactor(), weapon.getCriticalAttackFactor(),
                weapon.getChanceCriticalAttackFactor(), weapon.getLevel(), weapon.getHp()));
        return hero.getWeapon();
    }
    public void wearingWeaponToHero(@NotNull Hero hero, TypesOfWeapon typesOfWeapon, int level) throws LevelException {
        if (level > hero.getLevel().getLevel()) {
            throw new LevelException("Твій рівень недостатньо високий для цього предмету" + "\n" +
                    "Твій рівень: " + hero.getLevel() + " Рівень предмету: " + level);
        }
        switch (level){
            case 1 -> {
                switch (typesOfWeapon){
                    case Ax -> {
                        if (hero.getSpecies().getSpecialName().equals(SpecialName.Orc)){
                            hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 12.0, hero.getWeapon().getCriticalAttackFactor() + 0.35,
                                    hero.getWeapon().getChanceCriticalAttackFactor() + 0.45, 1, 10));
                            break;
                        }
                        hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 10.0, hero.getWeapon().getCriticalAttackFactor() + 0.3,
                                hero.getWeapon().getChanceCriticalAttackFactor() + 0.4, 1, 10));
                    }
                    case Foil -> {
                        if (hero.getSpecies().getSpecialName().equals(SpecialName.Elf)){
                            hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 7.0, hero.getWeapon().getCriticalAttackFactor() + 0.3,
                                    hero.getWeapon().getChanceCriticalAttackFactor() + 0.4, 1, 15));
                            break;
                        }
                        hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 5.0, hero.getWeapon().getCriticalAttackFactor() + 0.2,
                                hero.getWeapon().getChanceCriticalAttackFactor() + 0.3, 1, 15));
                    }
                    case Mace -> {
                        if (hero.getSpecies().getSpecialName().equals(SpecialName.Orc)){
                            hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 16.0, hero.getWeapon().getCriticalAttackFactor() + 0.35,
                                    hero.getWeapon().getChanceCriticalAttackFactor() + 0.45, 1, 7));
                            break;
                        }
                        hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 14.0, hero.getWeapon().getCriticalAttackFactor() + 0.3,
                                hero.getWeapon().getChanceCriticalAttackFactor() + 0.4, 1, 7));
                    }
                    case Spear -> {
                        if (hero.getSpecies().getSpecialName().equals(SpecialName.Orc)){
                            hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 22.0, hero.getWeapon().getCriticalAttackFactor() + 0.15,
                                    hero.getWeapon().getChanceCriticalAttackFactor() + 0.25, 1, 15));
                            break;
                        }
                        hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 20.0, hero.getWeapon().getCriticalAttackFactor() + 0.1,
                                hero.getWeapon().getChanceCriticalAttackFactor() + 0.2, 1, 15));
                    }
                    case Than -> {
                        if (hero.getSpecies().getSpecialName().equals(SpecialName.Elf)){
                            hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 9.0, hero.getWeapon().getCriticalAttackFactor() + 0.6,
                                    hero.getWeapon().getChanceCriticalAttackFactor() + 0.7, 1, 8));
                            break;
                        }
                        hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 7.0, hero.getWeapon().getCriticalAttackFactor() + 0.5,
                                hero.getWeapon().getChanceCriticalAttackFactor() + 0.6, 1, 8));
                    }
                    case Sword -> {
                        if (hero.getSpecies().getSpecialName().equals(SpecialName.Elf) || hero.getSpecies().getSpecialName().equals(SpecialName.Orc)){
                            hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 14.0, hero.getWeapon().getCriticalAttackFactor() + 0.35,
                                    hero.getWeapon().getChanceCriticalAttackFactor() + 0.45, 1, 10));
                            break;
                        }
                        hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 12.0, hero.getWeapon().getCriticalAttackFactor() + 0.3,
                                hero.getWeapon().getChanceCriticalAttackFactor() + 0.4, 1, 10));
                    }
                }
            }
            case 2 -> {
                switch (typesOfWeapon){
                    case Ax -> {
                        if (hero.getSpecies().getSpecialName().equals(SpecialName.Orc)){
                            hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 22.0, hero.getWeapon().getCriticalAttackFactor() + 0.35,
                                    hero.getWeapon().getChanceCriticalAttackFactor() + 0.45, 2, 20));
                            break;
                        }
                        hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 20.0, hero.getWeapon().getCriticalAttackFactor() + 0.3,
                                hero.getWeapon().getChanceCriticalAttackFactor() + 0.4, 2, 20));
                    }
                    case Foil -> {
                        if (hero.getSpecies().getSpecialName().equals(SpecialName.Elf)){
                            hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 17.0, hero.getWeapon().getCriticalAttackFactor() + 0.3,
                                    hero.getWeapon().getChanceCriticalAttackFactor() + 0.4, 2, 25));
                            break;
                        }
                        hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 15.0, hero.getWeapon().getCriticalAttackFactor() + 0.2,
                                hero.getWeapon().getChanceCriticalAttackFactor() + 0.3, 2, 25));
                    }
                    case Mace -> {
                        if (hero.getSpecies().getSpecialName().equals(SpecialName.Orc)){
                            hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 26.0, hero.getWeapon().getCriticalAttackFactor() + 0.35,
                                    hero.getWeapon().getChanceCriticalAttackFactor() + 0.45, 2, 17));
                            break;
                        }
                        hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 24.0, hero.getWeapon().getCriticalAttackFactor() + 0.3,
                                hero.getWeapon().getChanceCriticalAttackFactor() + 0.4, 2, 17));
                    }
                    case Spear -> {
                        if (hero.getSpecies().getSpecialName().equals(SpecialName.Orc)){
                            hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 28.0, hero.getWeapon().getCriticalAttackFactor() + 0.15,
                                    hero.getWeapon().getChanceCriticalAttackFactor() + 0.25, 2, 25));
                            break;
                        }
                        hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 24.0, hero.getWeapon().getCriticalAttackFactor() + 0.1,
                                hero.getWeapon().getChanceCriticalAttackFactor() + 0.2, 2, 25));
                    }
                    case Than -> {
                        if (hero.getSpecies().getSpecialName().equals(SpecialName.Elf)){
                            hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 17.0, hero.getWeapon().getCriticalAttackFactor() + 0.6,
                                    hero.getWeapon().getChanceCriticalAttackFactor() + 0.7, 2, 18));
                            break;
                        }
                        hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 15.0, hero.getWeapon().getCriticalAttackFactor() + 0.5,
                                hero.getWeapon().getChanceCriticalAttackFactor() + 0.6, 2, 18));
                    }
                    case Sword -> {
                        if (hero.getSpecies().getSpecialName().equals(SpecialName.Elf) || hero.getSpecies().getSpecialName().equals(SpecialName.Orc)){
                            hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 22.0, hero.getWeapon().getCriticalAttackFactor() + 0.35,
                                    hero.getWeapon().getChanceCriticalAttackFactor() + 0.45, 2, 20));
                            break;
                        }
                        hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 19.0, hero.getWeapon().getCriticalAttackFactor() + 0.3,
                                hero.getWeapon().getChanceCriticalAttackFactor() + 0.4, 2, 20));
                    }
                }

            }
            case 3 -> {
                switch (typesOfWeapon){
                    case Ax -> {
                        if (hero.getSpecies().getSpecialName().equals(SpecialName.Orc)){
                            hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 32.0, hero.getWeapon().getCriticalAttackFactor() + 0.35,
                                    hero.getWeapon().getChanceCriticalAttackFactor() + 0.45, 3, 25));
                            break;
                        }
                        hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 30.0, hero.getWeapon().getCriticalAttackFactor() + 0.3,
                                hero.getWeapon().getChanceCriticalAttackFactor() + 0.4, 3, 25));
                    }
                    case Foil -> {
                        if (hero.getSpecies().getSpecialName().equals(SpecialName.Elf)){
                            hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 27.0, hero.getWeapon().getCriticalAttackFactor() + 0.3,
                                    hero.getWeapon().getChanceCriticalAttackFactor() + 0.4, 3, 30));
                            break;
                        }
                        hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 25.0, hero.getWeapon().getCriticalAttackFactor() + 0.2,
                                hero.getWeapon().getChanceCriticalAttackFactor() + 0.3, 3, 30));
                    }
                    case Mace -> {
                        if (hero.getSpecies().getSpecialName().equals(SpecialName.Orc)){
                            hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 36.0, hero.getWeapon().getCriticalAttackFactor() + 0.35,
                                    hero.getWeapon().getChanceCriticalAttackFactor() + 0.45, 3, 27));
                            break;
                        }
                        hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 34.0, hero.getWeapon().getCriticalAttackFactor() + 0.3,
                                hero.getWeapon().getChanceCriticalAttackFactor() + 0.4, 3, 27));
                    }
                    case Spear -> {
                        if (hero.getSpecies().getSpecialName().equals(SpecialName.Orc)){
                            hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 38.0, hero.getWeapon().getCriticalAttackFactor() + 0.15,
                                    hero.getWeapon().getChanceCriticalAttackFactor() + 0.25, 3, 35));
                            break;
                        }
                        hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 34.0, hero.getWeapon().getCriticalAttackFactor() + 0.1,
                                hero.getWeapon().getChanceCriticalAttackFactor() + 0.2, 3, 35));
                    }
                    case Than -> {
                        if (hero.getSpecies().getSpecialName().equals(SpecialName.Elf)){
                            hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 27.0, hero.getWeapon().getCriticalAttackFactor() + 0.6,
                                    hero.getWeapon().getChanceCriticalAttackFactor() + 0.7, 3, 28));
                            break;
                        }
                        hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 25.0, hero.getWeapon().getCriticalAttackFactor() + 0.5,
                                hero.getWeapon().getChanceCriticalAttackFactor() + 0.6, 3, 28));
                    }
                    case Sword -> {
                        if (hero.getSpecies().getSpecialName().equals(SpecialName.Elf) || hero.getSpecies().getSpecialName().equals(SpecialName.Orc)){
                            hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 32.0, hero.getWeapon().getCriticalAttackFactor() + 0.35,
                                    hero.getWeapon().getChanceCriticalAttackFactor() + 0.45, 3, 30));
                            break;
                        }
                        hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 29.0, hero.getWeapon().getCriticalAttackFactor() + 0.3,
                                hero.getWeapon().getChanceCriticalAttackFactor() + 0.4, 3, 30));
                    }
                }
            }
            case 4 -> {
                switch (typesOfWeapon){
                    case Ax -> {
                        if (hero.getSpecies().getSpecialName().equals(SpecialName.Orc)){
                            hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 42.0, hero.getWeapon().getCriticalAttackFactor() + 0.35,
                                    hero.getWeapon().getChanceCriticalAttackFactor() + 0.45, 4, 35));
                            break;
                        }
                        hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 40.0, hero.getWeapon().getCriticalAttackFactor() + 0.3,
                                hero.getWeapon().getChanceCriticalAttackFactor() + 0.4, 4, 35));
                    }
                    case Foil -> {
                        if (hero.getSpecies().getSpecialName().equals(SpecialName.Elf)){
                            hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 37.0, hero.getWeapon().getCriticalAttackFactor() + 0.3,
                                    hero.getWeapon().getChanceCriticalAttackFactor() + 0.4, 4, 40));
                            break;
                        }
                        hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 35.0, hero.getWeapon().getCriticalAttackFactor() + 0.2,
                                hero.getWeapon().getChanceCriticalAttackFactor() + 0.3, 4, 40));
                    }
                    case Mace -> {
                        if (hero.getSpecies().getSpecialName().equals(SpecialName.Orc)){
                            hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 46.0, hero.getWeapon().getCriticalAttackFactor() + 0.35,
                                    hero.getWeapon().getChanceCriticalAttackFactor() + 0.45, 4, 37));
                            break;
                        }
                        hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 44.0, hero.getWeapon().getCriticalAttackFactor() + 0.3,
                                hero.getWeapon().getChanceCriticalAttackFactor() + 0.4, 4, 37));
                    }
                    case Spear -> {
                        if (hero.getSpecies().getSpecialName().equals(SpecialName.Orc)){
                            hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 48.0, hero.getWeapon().getCriticalAttackFactor() + 0.15,
                                    hero.getWeapon().getChanceCriticalAttackFactor() + 0.25, 4, 45));
                            break;
                        }
                        hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 44.0, hero.getWeapon().getCriticalAttackFactor() + 0.1,
                                hero.getWeapon().getChanceCriticalAttackFactor() + 0.2, 4, 45));
                    }
                    case Than -> {
                        if (hero.getSpecies().getSpecialName().equals(SpecialName.Elf)){
                            hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 37.0, hero.getWeapon().getCriticalAttackFactor() + 0.6,
                                    hero.getWeapon().getChanceCriticalAttackFactor() + 0.7, 4, 38));
                            break;
                        }
                        hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 35.0, hero.getWeapon().getCriticalAttackFactor() + 0.5,
                                hero.getWeapon().getChanceCriticalAttackFactor() + 0.6, 4, 38));
                    }
                    case Sword -> {
                        if (hero.getSpecies().getSpecialName().equals(SpecialName.Elf) || hero.getSpecies().getSpecialName().equals(SpecialName.Orc)){
                            hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 42.0, hero.getWeapon().getCriticalAttackFactor() + 0.35,
                                    hero.getWeapon().getChanceCriticalAttackFactor() + 0.45, 4, 40));
                            break;
                        }
                        hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 39.0, hero.getWeapon().getCriticalAttackFactor() + 0.3,
                                hero.getWeapon().getChanceCriticalAttackFactor() + 0.4, 4, 40));
                    }
                }
            }
            case 5 -> {
                switch (typesOfWeapon){
                    case Ax -> {
                        if (hero.getSpecies().getSpecialName().equals(SpecialName.Orc)){
                            hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 52.0, hero.getWeapon().getCriticalAttackFactor() + 0.35,
                                    hero.getWeapon().getChanceCriticalAttackFactor() + 0.45, 5, 45));
                            break;
                        }
                        hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 50.0, hero.getWeapon().getCriticalAttackFactor() + 0.3,
                                hero.getWeapon().getChanceCriticalAttackFactor() + 0.4, 5, 45));
                    }
                    case Foil -> {
                        if (hero.getSpecies().getSpecialName().equals(SpecialName.Elf)){
                            hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 47.0, hero.getWeapon().getCriticalAttackFactor() + 0.3,
                                    hero.getWeapon().getChanceCriticalAttackFactor() + 0.4, 5, 50));
                            break;
                        }
                        hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 45.0, hero.getWeapon().getCriticalAttackFactor() + 0.2,
                                hero.getWeapon().getChanceCriticalAttackFactor() + 0.3, 5, 50));
                    }
                    case Mace -> {
                        if (hero.getSpecies().getSpecialName().equals(SpecialName.Orc)){
                            hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 56.0, hero.getWeapon().getCriticalAttackFactor() + 0.35,
                                    hero.getWeapon().getChanceCriticalAttackFactor() + 0.45, 5, 47));
                            break;
                        }
                        hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 54.0, hero.getWeapon().getCriticalAttackFactor() + 0.3,
                                hero.getWeapon().getChanceCriticalAttackFactor() + 0.4, 5, 47));
                    }
                    case Spear -> {
                        if (hero.getSpecies().getSpecialName().equals(SpecialName.Orc)){
                            hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 58.0, hero.getWeapon().getCriticalAttackFactor() + 0.15,
                                    hero.getWeapon().getChanceCriticalAttackFactor() + 0.25, 5, 55));
                            break;
                        }
                        hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 54.0, hero.getWeapon().getCriticalAttackFactor() + 0.1,
                                hero.getWeapon().getChanceCriticalAttackFactor() + 0.2, 5, 55));
                    }
                    case Than -> {
                        if (hero.getSpecies().getSpecialName().equals(SpecialName.Elf)){
                            hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 47.0, hero.getWeapon().getCriticalAttackFactor() + 0.6,
                                    hero.getWeapon().getChanceCriticalAttackFactor() + 0.7, 5, 48));
                            break;
                        }
                        hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 45.0, hero.getWeapon().getCriticalAttackFactor() + 0.5,
                                hero.getWeapon().getChanceCriticalAttackFactor() + 0.6, 5, 48));
                    }
                    case Sword -> {
                        if (hero.getSpecies().getSpecialName().equals(SpecialName.Elf) || hero.getSpecies().getSpecialName().equals(SpecialName.Orc)){
                            hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 52.0, hero.getWeapon().getCriticalAttackFactor() + 0.35,
                                    hero.getWeapon().getChanceCriticalAttackFactor() + 0.45, 5, 50));
                            break;
                        }
                        hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 49.0, hero.getWeapon().getCriticalAttackFactor() + 0.3,
                                hero.getWeapon().getChanceCriticalAttackFactor() + 0.4, 5, 50));
                    }
                }
            }
            case 6 -> {
                switch (typesOfWeapon){
                    case Ax -> {
                        if (hero.getSpecies().getSpecialName().equals(SpecialName.Orc)){
                            hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 62.0, hero.getWeapon().getCriticalAttackFactor() + 0.35,
                                    hero.getWeapon().getChanceCriticalAttackFactor() + 0.45, 6, 55));
                            break;
                        }
                        hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 60.0, hero.getWeapon().getCriticalAttackFactor() + 0.3,
                                hero.getWeapon().getChanceCriticalAttackFactor() + 0.4, 6, 55));
                    }
                    case Foil -> {
                        if (hero.getSpecies().getSpecialName().equals(SpecialName.Elf)){
                            hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 57.0, hero.getWeapon().getCriticalAttackFactor() + 0.3,
                                    hero.getWeapon().getChanceCriticalAttackFactor() + 0.4, 6, 60));
                            break;
                        }
                        hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 55.0, hero.getWeapon().getCriticalAttackFactor() + 0.2,
                                hero.getWeapon().getChanceCriticalAttackFactor() + 0.3, 6, 60));
                    }
                    case Mace -> {
                        if (hero.getSpecies().getSpecialName().equals(SpecialName.Orc)){
                            hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 66.0, hero.getWeapon().getCriticalAttackFactor() + 0.35,
                                    hero.getWeapon().getChanceCriticalAttackFactor() + 0.45, 6, 57));
                            break;
                        }
                        hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 64.0, hero.getWeapon().getCriticalAttackFactor() + 0.3,
                                hero.getWeapon().getChanceCriticalAttackFactor() + 0.4, 6, 57));
                    }
                    case Spear -> {
                        if (hero.getSpecies().getSpecialName().equals(SpecialName.Orc)){
                            hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 68.0, hero.getWeapon().getCriticalAttackFactor() + 0.15,
                                    hero.getWeapon().getChanceCriticalAttackFactor() + 0.25, 6, 65));
                            break;
                        }
                        hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 64.0, hero.getWeapon().getCriticalAttackFactor() + 0.1,
                                hero.getWeapon().getChanceCriticalAttackFactor() + 0.2, 6, 65));
                    }
                    case Than -> {
                        if (hero.getSpecies().getSpecialName().equals(SpecialName.Elf)){
                            hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 57.0, hero.getWeapon().getCriticalAttackFactor() + 0.6,
                                    hero.getWeapon().getChanceCriticalAttackFactor() + 0.7, 6, 58));
                            break;
                        }
                        hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 55.0, hero.getWeapon().getCriticalAttackFactor() + 0.5,
                                hero.getWeapon().getChanceCriticalAttackFactor() + 0.6, 6, 58));
                    }
                    case Sword -> {
                        if (hero.getSpecies().getSpecialName().equals(SpecialName.Elf) || hero.getSpecies().getSpecialName().equals(SpecialName.Orc)){
                            hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 62.0, hero.getWeapon().getCriticalAttackFactor() + 0.35,
                                    hero.getWeapon().getChanceCriticalAttackFactor() + 0.45, 6, 60));
                            break;
                        }
                        hero.setWeapon(new Weapon(typesOfWeapon, hero.getWeapon().getAttackFactor() + 59.0, hero.getWeapon().getCriticalAttackFactor() + 0.3,
                                hero.getWeapon().getChanceCriticalAttackFactor() + 0.4, 6, 60));
                    }
                }
            }
        }
    }

    public void brokenWeapon(@NotNull Hero hero) {
        if (hero.getWeapon().getHp() == 0) {
            hero.setWeapon(hero.getWeapon().notHaveWeapon());
        }
    }
    public Weapon() {
    }

    public Weapon(TypesOfWeapon name, double attackFactor, double criticalAttackFactor, double chanceCriticalAttackFactor, int level, double hp) {
        this.name = name;
        this.attackFactor = attackFactor;
        this.criticalAttackFactor = criticalAttackFactor;
        this.chanceCriticalAttackFactor = chanceCriticalAttackFactor;
        this.level = level;
        this.hp = hp;
    }

    public TypesOfWeapon getName() {
        return name;
    }

    public void setName(TypesOfWeapon name) {
        this.name = name;
    }

    public double getAttackFactor() {
        return attackFactor;
    }

    public void setAttackFactor(double attackFactor) {
        this.attackFactor = attackFactor;
    }

    public double getCriticalAttackFactor() {
        return criticalAttackFactor;
    }

    public void setCriticalAttackFactor(double criticalAttackFactor) {
        this.criticalAttackFactor = criticalAttackFactor;
    }

    public double getChanceCriticalAttackFactor() {
        return chanceCriticalAttackFactor;
    }

    public void setChanceCriticalAttackFactor(double chanceCriticalAttackFactor) {
        this.chanceCriticalAttackFactor = chanceCriticalAttackFactor;
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
}
