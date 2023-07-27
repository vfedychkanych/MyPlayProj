package Items.UsableItem;

public class AttackPoison {
    public double toAtk;
    public int coolDown = 20;

    public int activeTime = 15;

    public AttackPoison(double toHeal) {
        this.toAtk = toHeal;
    }

    public int getActiveTime() {
        return activeTime;
    }

    public int getCoolDown() {
        return coolDown;
    }

    public double getToAtk() {
        return toAtk;
    }
}
