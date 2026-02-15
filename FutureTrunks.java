public class FutureTrunks implements Fighter {

    private int health = 130;
    private boolean transformed = false;

    public void attack(Fighter opponent) {
        System.out.println("Future Trunks slashes with his sword!");
        opponent.takeDamage(17);
    }

    public void specialAttack(Fighter opponent) {
        System.out.println("Future Trunks uses Burning Attack!");
        opponent.takeDamage(32);
    }

    public void transform() {
        if (!transformed) {
            transformed = true;
            System.out.println("Future trunks transforms into Super Sayian Rage!");
            health += 25;
        } else {
            System.out.println("Trunks is already transformed!");
        }
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println("Future trunks takes " + damage + " damage!");
    }

    public void speak() {
        System.out.println("Trunks: I will protect my world at all costs!");
    }

    public String getName() {
        return "Future Trunks";
    }

    public int getHealth() {
        return health;
    }
}