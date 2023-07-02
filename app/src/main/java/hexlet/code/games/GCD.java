package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class GCD {

    public static int findGCD(int randomFirstNumber, int randomSecondNumber) {
        while (randomFirstNumber != 0 && randomSecondNumber != 0) {
            if (randomFirstNumber > randomSecondNumber) {
                randomFirstNumber = randomFirstNumber % randomSecondNumber;
            } else if (randomFirstNumber < randomSecondNumber) {
                randomSecondNumber = randomSecondNumber % randomFirstNumber;
            }
        }
        int rightAnswer = (randomFirstNumber + randomSecondNumber);
        return rightAnswer;
    }

    public static String buildQuestion(int randomFirstNumber, int randomSecondNumber) {
        return Engine.createQuestion() + randomFirstNumber + " " + randomSecondNumber;
    }

    public static void startGame(String userName) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Find the greatest common divisor of given numbers.");

        int rightAnswers = 0;
        while (rightAnswers != Engine.WIN_CONDITION) {
            int randomFirstNumber = Engine.buildRandomNumber();
            int randomSecondNumber = Engine.buildRandomNumber();
            System.out.println(buildQuestion(randomFirstNumber, randomSecondNumber));

            System.out.println(Engine.createAnswer());
            String answer = scanner.next();
            int answerToInteger = Integer.parseInt(answer);

            int rightAnswer = findGCD(randomFirstNumber, randomSecondNumber);

            if (rightAnswer == answerToInteger) {
                System.out.println(Engine.createCorrect());
                rightAnswers++;
            } else {
                System.out.println(Engine.createFalse(answer, Integer.toString(rightAnswer), userName));
                break;
            }
        }
    }
}
