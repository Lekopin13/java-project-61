package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class EvenGame {

    public static boolean  isEven(int n) {
        return n % 2 == 0;
    }

    public static String buildQuestion(int randomNumber) {
        return Engine.createQuestion() + randomNumber;
    }
    public static void startGame(String userName) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int rightAnswers = 0;
        while (rightAnswers != Engine.WIN_CONDITION) {

            int question = Engine.buildRandomNumber();
            System.out.println(buildQuestion(question));

            Scanner scanner = new Scanner(System.in);
            System.out.println(Engine.createAnswer());
            String answer = scanner.next();

            if (isEven(question) && answer.equalsIgnoreCase("yes")) {
                System.out.println(Engine.createCorrect());
                rightAnswers++;
            } else if (!isEven(question) && answer.equalsIgnoreCase("no")) {
                System.out.println(Engine.createCorrect());
                rightAnswers++;
            } else {
                if (question % 2 == 0) {
                    System.out.println(Engine.createFalse(answer, "yes", userName));
                } else if (question % 2 != 0) {
                    System.out.println(Engine.createFalse(answer, "no", userName));
                }
                break;
            }
        }
    }
}
