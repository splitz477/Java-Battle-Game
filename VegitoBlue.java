public class VegitoBlue implements Fighter {

    private int health = 220;

    public void attack(Fighter opponent) {
        System.out.println("Vegito Blue punches fiercely!");
        opponent.takeDamage(26);
    }

    public void specialAttack(Fighter opponent) {
        System.out.println("Vegito uses Final Kamehameha!");
        opponent.takeDamage(50);
    }

    public void transform() {
        System.out.println("Vegito goes Super Sayian God Super Sayian!");
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println("Vegito takes " + damage);
    }

    public void speak() {
        System.out.println("Vegito: Let's finish this!");
    }

    public String getName() { return "Vegito Blue"; }

    public int getHealth() { return health; }
}

