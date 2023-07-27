package Items.UsableItem;

public class HealPoison {
    public double toHeal;
    public int coolDown = 10;

    public HealPoison(double toHeal) {
        this.toHeal = toHeal;
    }

    public double getToHeal() {
        return toHeal;
    }

    public int getCoolDown() {
        return coolDown;
    }
}
