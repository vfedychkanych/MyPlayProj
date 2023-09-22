package Items.UsableItems;

import java.util.ArrayList;

public class AttackPoison implements UsableItems {
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

    @Override
    public String toString() {
        return "AttackPoison{" +
                "name='" + name +
                ", toAtk=" + toAtk +
                ", coolDown=" + coolDown +
                ", activeTime=" + activeTime +
                '}';
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
