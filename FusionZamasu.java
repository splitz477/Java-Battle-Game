public class FusionZamasu implements Fighter {

    private int health = 250;

    public void attack(Fighter opponent) {
        System.out.println("Fusion Zamassu blasts divine energy");
        opponent.takeDamage(28);
    }

    public void specialAttack(Fighter opponent) {
        System.out.println("Fusion Zamasu uses Divine Wraith!");
        opponent.takeDamage(45);
    }

    public void transform() {
        System.out.println("Fusion Zamasu becomes Courupted!");
        health += 40;
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println("Fusion Zamasu laughs at the damage!");
    }

    public void speak() {
        System.out.println("Fusion Zamasu: I am justice incarnate!");
    }

    public String getName() {
        return "Fusion Zamasu";
    }

    public int getHealth() {
        return health;
    }
}


