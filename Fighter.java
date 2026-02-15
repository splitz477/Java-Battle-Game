public interface Fighter {
    void attack(Fighter opponent);
    void specialAttack(Fighter opponent);
    void transform();
    void takeDamage(int damage);
    void speak();
    String getName();
    int getHealth();
}
