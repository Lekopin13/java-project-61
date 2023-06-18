package hexlet.code.games;

import java.util.Scanner;

public class EvenGame {
    public static void startGame(String userName) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int rightAnswers = 0;
        int winCondition = 3;
        while (rightAnswers != winCondition) {
            int randomToInt = 100;
            int randomNumber = (int) Math.round(Math.random() * randomToInt);
            System.out.println("Question: " + randomNumber);
            System.out.println("Your answer: ");
            String answer = scanner.next();
            if (randomNumber % 2 == 0 && answer.equalsIgnoreCase("yes")) {
                System.out.println("Correct!");
                rightAnswers++;
            } else if (randomNumber % 2 != 0 && answer.equalsIgnoreCase("no")) {
                System.out.println("Correct!");
                rightAnswers++;
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + userName);
                rightAnswers = 0;
            }
        }
    }
}
