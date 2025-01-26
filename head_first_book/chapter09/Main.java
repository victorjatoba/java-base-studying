public class Main {
    public static void main(String args[]) {
        int counter = 0;

        RacingGame game = new RacingGame();

        Car peogeut2008 = new Car(210);
        Car daciaDuster = new Car(120);

        game.cars.add(peogeut2008);
        game.cars.add(daciaDuster);

        System.out.println(game.cars);
    }
}
