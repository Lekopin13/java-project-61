package hexlet.code.games;

import hexlet.code.Engine;

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

    public static String buildQuestion(int randomNumber) {
        return Engine.createQuestion() + randomNumber;
    }

    public static void startPrimeGame(String userName) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        int rightAnswers = 0;
        while (rightAnswers != Engine.WIN_CONDITION) {

            int question = Engine.buildRandomNumber();
            System.out.println(buildQuestion(question));

            System.out.println(Engine.createAnswer());
            String answer = scanner.next();

            if (isPrime(question) && answer.equalsIgnoreCase("yes")) {
                System.out.println(Engine.createCorrect());
                rightAnswers++;
            } else if (!isPrime(question) && answer.equalsIgnoreCase("no")) {
                System.out.println(Engine.createCorrect());
                rightAnswers++;
            } else {
                if (isPrime(question)) {
                    System.out.println(Engine.createFalse(answer, "yes", userName));
                } else {
                    System.out.println(Engine.createFalse(answer, "no", userName));
                }
                break;
            }
        }
    }
}
