package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static void startGame(String userName) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What number is missing in the progression?");

        int rightAnswers = 0;
        int winCondition = 3;
        while (rightAnswers != winCondition) {
            int randomToInt = 100;
            int startProgression = (int) Math.round(Math.random() * randomToInt);
            int counterOfProgression = (int) Math.round(Math.random() * randomToInt);
            int randomNumber = (int) Math.round(Math.random() * randomToInt);
            int min = 5;
            int max = 10;
            int lengthOfProgression = new Random().nextInt(max - min) + min;

            System.out.print("Question: ");
            for (int i = 0; i < lengthOfProgression; i++) {
                System.out.print(startProgression + " ");
                startProgression = startProgression + counterOfProgression;
            }

            System.out.println("Your answer: ");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("Correct!");
                rightAnswers++;
            } else if (answer.equalsIgnoreCase("no")) {
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
