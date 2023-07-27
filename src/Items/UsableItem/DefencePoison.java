package Items.UsableItem;

public class DefencePoison {
    public double toDef;

    public int getActiveTime() {
        return activeTime;
    }

    public int getCoolDown() {
        return coolDown;
    }

    public double getToDef() {
        return toDef;
    }

    public int coolDown = 15;

    public int activeTime = 10;

    public DefencePoison(double toHeal) {
        this.toDef = toHeal;
    }
}