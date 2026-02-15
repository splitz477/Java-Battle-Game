import java.util.Scanner;

    public class BattleSystem {

    public static void fight(Fighter hero, Fighter villain) {

        Scanner input = new Scanner(System.in);

        while (hero.getHealth() > 0 && villain.getHealth() > 0) {

            System.out.println("\n--- " + hero.getName() + " Turn ---");
            System.out.println("1. Attack");
            System.out.println("2. Special");
            System.out.println("3. Transform");

            int choice = input.nextInt();

            if (choice == 1) hero.attack(villain);
            else if (choice == 2) hero.specialAttack(villain);
            else hero.transform();

            if (villain.getHealth() > 0) {
                System.out.println("\n--- Villain Turn ---");
                villain.attack(hero);
            }
        }

        if (hero.getHealth() > 0)
            System.out.println("\n HEROES WIN!");
        else
            System.out.println("\n VILLAINS WIN!");
    }
}
