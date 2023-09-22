package Items.UsableItems;

import java.util.ArrayList;

public class DefencePoison implements UsableItems {
    private String name = "Defence";
    public double toDef;
    public int coolDown = 15;

    public int activeTime = 10;
    //--------------------------------------------------------------------------------------
    public DefencePoison(double toDef) {
        this.toDef = toDef;
    }
    //--------------------------------------------------------------------------------------
    public int getActiveTime() {
        return activeTime;
    }

    public int getCoolDown() {
        return coolDown;
    }

    public double getToDef() {
        return toDef;
    }

    @Override
    public String toString() {
        return "DefencePoison{" +
                "name='" + name +
                ", toDef=" + toDef +
                ", coolDown=" + coolDown +
                ", activeTime=" + activeTime +
                '}';
    }

    //--------------------------------------------------------------------------------------
    public void print(){
        ArrayList<String> res = new ArrayList<>();
        res.add(String.valueOf(this.name));
        res.add("Defence:" + this.toDef);
        res.add("CoolDown:" + this.coolDown);
        res.add("ActiveTime:" + this.activeTime);
        System.out.println(res);
    }
}