package Items.Weapon;

import Items.Inventory;

public interface Weapon extends Inventory {
    int indetifier = 0;
     String name = "";
    @Override
    void print();


}
