public class Main {

    public static void main(String[] args) {

        System.out.println("ZAMASU SAGA RPG");

        // Create characters
        Goku goku = new Goku();
        GokuBlack black = new GokuBlack();
        Vegeta vegeta = new Vegeta();
        Zamasu zamasu = new Zamasu();
        FusionZamasu fusion = new FusionZamasu();
        VegitoBlue vegito = new VegitoBlue();

        // Dialogue
        goku.speak();
        black.speak();

        System.out.println("\n Battle 1 Begins!");
        BattleSystem.fight(goku, black);

        System.out.println("\n Battle 2 Begins!");
        BattleSystem.fight(vegeta, zamasu);

        System.out.println("\n Fusion Zamasu Appears!");
        fusion.speak();

        System.out.println("\n Final Battle!");
        BattleSystem.fight(vegito, fusion);
    }
}
