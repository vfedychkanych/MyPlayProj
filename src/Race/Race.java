package Race;

public interface Race {
    String raceName = "";
    String weaponForRace = "";
    String defenseForRace = "";
    double hp = 0.00;
    double hpForLvl = 0.0;
    double attack = 0.0;
    double attForLvl = 0.0;
    double defense = 0.0;
    double defForLvl = 0.0;
    double CofForRace = 0.0;

    default double getHp() {
        return hp;
    }
    default String getDefenseForRace() {
        return defenseForRace;
    }

    default double getHpForLvl() {
        return hpForLvl;
    }

    default double getAttack() {
        return attack;
    }

    default double getAttForLvl() {
        return attForLvl;
    }

    default double getDefense() {
        return defense;
    }

    default double getDefForLvl() {
        return defForLvl;
    }

    default String getRaceName() {
        return raceName;
    }

    default String getWeaponForRace() {
        return weaponForRace;
    }

    default double getCofForRace() {
        return CofForRace;
    }

    default void print(){
    };
}