package hexlet.code;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");

        Scanner scanner = new Scanner(System.in);

        String choice = scanner.next();
        System.out.println("Your choice: " + choice + "\n");

        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String userName = scanner.next();

        if (choice.equals("1")) {
            System.out.println(Cli.greeting(userName));
        } else if (choice.equals("2")) {
            System.out.println(Cli.greeting(userName));
            EvenGame.startGame(userName);
            System.out.println("Congratulations, " + userName + "!");
        }

        scanner.close();
    }
}
