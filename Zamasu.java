public class Zamasu implements Fighter {

    private int health = 170;

    public void attack(Fighter opponent) {
        System.out.println("Zamasu strikes!");
        opponent.takeDamage(16);
    }

    public void specialAttack(Fighter opponent) {
        System.out.println("Zamasu uses God Split Cut!");
        opponent.takeDamage(30);
    }

    public void transform() {
        System.out.println("Zamasu prepares for fusion...");
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println("Zamasu regenerates but takes " + damage);
    }

    public void speak() {
        System.out.println("Zamasu: Justice shall prevail.");
    }

    public String getName() { return "Zamasu"; }

    public int getHealth() { return health; }
}