public class Vegeta implements Fighter {

    private int health = 140;
    private boolean transformed = false;

    public void attack(Fighter opponent) {
        System.out.println("Vegeta strikes!");
        opponent.takeDamage(14);
    }

    public void specialAttack(Fighter opponent) {
        System.out.println("Vegeta uses Final Flash!");
        opponent.takeDamage(33);
    }

    public void transform() {
        if (!transformed) {
            transformed = true;
            System.out.println("Vegeta transforms into Super Saiyan Blue!");
            health += 25;
        }
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println("Vegeta takes " + damage + " damage!");
    }

    public void speak() {
        System.out.println("Vegeta: I will surpass Kakarot!");
    }

    public String getName() { return "Vegeta"; }

    public int getHealth() { return health; }
}