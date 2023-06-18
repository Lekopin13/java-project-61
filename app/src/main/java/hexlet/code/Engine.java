package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.EvenGame;

import java.util.Scanner;

public class Engine {
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
        }

        scanner.close();
    }
}
