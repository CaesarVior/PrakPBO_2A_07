public class WalkingZombie extends Zombie {

    int health = 100;

    public WalkingZombie(int health, int level) {
        super(health, level);
    }

    public void heal() {
        if (level == 1) {
            health = health + (health * 10 / 100);
        } else if (level == 2) {
            health = health + (health * 30 / 100);
        } else if (level == 3) {
            health = health + (health * 40 / 100);
        }
    }

    @Override
    public void destroyed() {
        health = health - (health * 2 / 100);
    }

     public String getZombieInfo(){
        return  "Walking Zombie data" + 
        "\nHealth = " + health + "\nLevel = " + level;
    }
}