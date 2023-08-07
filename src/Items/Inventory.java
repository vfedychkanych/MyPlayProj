package Items;

public interface Inventory {
    int indetifier = 0;
    String name = "";
    double attack = 0.0;
    double defence = 0.0;
    void print();

    default String getName() {
        return name;
    }
    default double getAttack() {
        return attack;
    }

    default double getDefence() {
        return defence;
    }

    default int getIndetifier(){return indetifier;}
}
