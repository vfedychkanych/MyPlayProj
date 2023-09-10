package Items.UsableItems;

import java.util.ArrayList;

public class HealPoison implements UsableItems {
    private String name = "Heal";
    private double toHeal;
    private int coolDown = 10;
    //--------------------------------------------------------------------------------------

    public HealPoison(double toHeal) {
        this.toHeal = toHeal;
    }
    //--------------------------------------------------------------------------------------

    public double getToHeal() {
        return toHeal;
    }

    public int getCoolDown() {
        return coolDown;
    }

    @Override
    public String toString() {
        return "HealPoison{" +
                "name='" + name +
                ", toHeal=" + toHeal +
                ", coolDown=" + coolDown +
                '}';
    }

    //--------------------------------------------------------------------------------------
    public void print(){
        ArrayList<String> res = new ArrayList<>();
        res.add(String.valueOf(this.name));
        res.add("Healing:" + this.toHeal);
        res.add("CoolDown:" + this.coolDown);
        System.out.println(res);

    }
}
