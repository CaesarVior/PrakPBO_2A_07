public class Barrier implements Destroyable {
    private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void destroyed() {
        strength -= 1;

        if (strength < 0) {
            strength = 0;
        }
    }

    public String getBarrierInfo() {
        return "Barrier-Strength:" + strength;
    }
}
