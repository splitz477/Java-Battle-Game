public class GokuBlack implements Fighter {

    private int health = 160;

    public void attack(Fighter opponent) {
        System.out.println("Goku black slashes!");
        opponent.takeDamage(18);
    }

    public void specialAttack(Fighter opponent) {
        System.out.println("Goku Black uses Divine Kamahameha!");
        opponent.takeDamage(36);
    }

    public void transform() {
        System.out.println("Goku Black transforms into Super Sayian Rose!");
        health += 20;
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println("Goku black takes " + damage + " damage!");
    }

    public void speak() {
        System.out.println("Goku Black: Mortals are filth.");
    }

    public String getName() {
        return "Goku Black";
    }

    public int getHealth() {
        return health;
    }
}