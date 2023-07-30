package Items;

public interface Inventory {
    int indetifier = 0;
    String name = "";
    double attack = 0.0;
    void print();

    default String getName() {
        return name;
    }
    default double getAttack() {
        return attack;
    }

    default int getIndetifier(){return indetifier;}
}
