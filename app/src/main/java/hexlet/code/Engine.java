package hexlet.code;

import hexlet.code.games.Progression;
import hexlet.code.games.GCD;
import hexlet.code.games.EvenGame;
import hexlet.code.games.Calc;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class Engine {
    public static final int WIN_CONDITION = 3;
    public static final int RANDOM_TO_INT = 100;
    public static final int LENGTH_OF_PROGRESSION = 10;
    public static void gameStarter(String choice) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String userName = scanner.next();

        if (choice.equals("1")) {
            System.out.println(Cli.greeting(userName));
        } else if (choice.equals("2")) {
            System.out.println(Cli.greeting(userName));
            EvenGame.startGame(userName);
            System.out.println("Congratulations, " + userName + "!");
        } else if (choice.equals("3")) {
            System.out.println(Cli.greeting(userName));
            Calc.startGame(userName);
            System.out.println("Congratulations, " + userName + "!");
        } else if (choice.equals("4")) {
            System.out.println(Cli.greeting(userName));
            GCD.startGame(userName);
            System.out.println("Congratulations, " + userName + "!");
        } else if (choice.equals("5")) {
            System.out.println(Cli.greeting(userName));
            Progression.startGame(userName);
            System.out.println("Congratulations, " + userName + "!");
        } else if (choice.equals("6")) {
            System.out.println(Cli.greeting(userName));
            Prime.startPrimeGame(userName);
            System.out.println("Congratulations, " + userName + "!");
        }
        scanner.close();
    }
}
