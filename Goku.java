public class Goku implements Fighter {

    private int health = 120;
    private boolean transformed = false;

    public void attack(Fighter opponent) {
        System.out.println("Goku punches");
        opponent.takeDamage(15);
    }

    public void specialAttack(Fighter opponent) {
        System.out.println("Goku uses Super Kamehameha!");
        opponent.takeDamage(35);
    }

    public void transform() {
        if (!transformed) {
            transformed = true;
            System.out.println("Goku transforms into Super Saiyan God Super Saiyan!");
            health += 30;
        }
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println("Goku takes " + damage + " damage!");
    }

    public void speak() {
        System.out.println("Goku: Lets do this!");
    }

    public String getName() {
        return "Goku";
    }

    public int getHealth() {
        return health;
    }
}