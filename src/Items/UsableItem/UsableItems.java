package Items.UsableItem;

import Items.Inventory;

public interface UsableItems extends Inventory {
    int indetifier = 1;

    @Override
    void print();
}
