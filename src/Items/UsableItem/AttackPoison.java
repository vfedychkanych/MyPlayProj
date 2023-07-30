package Items.UsableItem;

import Items.Inventory;

import java.util.ArrayList;

public class AttackPoison implements UsableItems {
    private int indetifier = 1;
    private String name = "Attack";
    public double toAtk;
    public int coolDown = 20;

    public int activeTime = 15;
    //--------------------------------------------------------------------------------------

    public AttackPoison(double toAtk) {
        this.toAtk = toAtk;
    }
    //--------------------------------------------------------------------------------------

    public int getActiveTime() {
        return activeTime;
    }

    public int getCoolDown() {
        return coolDown;
    }

    public double getToAtk() {
        return toAtk;
    }
    public int getIndetifier() {
        return indetifier;
    }
    //--------------------------------------------------------------------------------------

    public void print(){
        ArrayList<String> res = new ArrayList<>();
        res.add(String.valueOf(this.name));
        res.add("Attacking:" + this.toAtk);
        res.add("CoolDown:" + this.coolDown);
        res.add("ActiveTime:" + this.activeTime);
        System.out.println(res);

    }
}
