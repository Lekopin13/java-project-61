package hexlet.code.games;

import java.util.Scanner;

public class Prime {

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void startPrimeGame(String userName) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        int rightAnswers = 0;
        int winCondition = 3;
        while (rightAnswers != winCondition) {
            int randomToInt = 100;
            int randomNumber = (int) Math.round(Math.random() * randomToInt);
            System.out.println("Question: " + randomNumber);

            System.out.println("Your answer: ");
            String answer = scanner.next();
            if (isPrime(randomNumber) && answer.equalsIgnoreCase("yes")) {
                System.out.println("Correct!");
                rightAnswers++;
            } else if (!isPrime(randomNumber) && answer.equalsIgnoreCase("no")) {
                System.out.println("Correct!");
                rightAnswers++;
            } else {
                if (isPrime(randomNumber)) {
                    System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was 'yes'.");
                    System.out.println("Let's try again, " + userName);
                } else {
                    String rightAnswer = "no";
                    System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was 'no'.");
                    System.out.println("Let's try again, " + userName);
                }
                rightAnswers = 0;
            }
        }
    }
}
