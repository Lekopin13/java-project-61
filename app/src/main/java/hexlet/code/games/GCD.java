package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class GCD {
    public static void startGame(String userName) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Find the greatest common divisor of given numbers.");

        int rightAnswers = 0;
        while (rightAnswers != Engine.WIN_CONDITION) {
            int randomFirstNumber = (int) Math.round(Math.random() * Engine.RANDOM_TO_INT);
            int randomSecondNumber = (int) Math.round(Math.random() * Engine.RANDOM_TO_INT);
            System.out.println("Question: " + randomFirstNumber + " " + randomSecondNumber);
            System.out.println("Your answer: ");
            String answer = scanner.next();
            int answerToInteger = Integer.parseInt(answer);

            while (randomFirstNumber != 0 && randomSecondNumber != 0) {
                if (randomFirstNumber > randomSecondNumber) {
                    randomFirstNumber = randomFirstNumber % randomSecondNumber;
                } else if (randomFirstNumber < randomSecondNumber) {
                    randomSecondNumber = randomSecondNumber % randomFirstNumber;
                }
            }
            int rightAnswer = (randomFirstNumber + randomSecondNumber);

            if (rightAnswer == answerToInteger) {
                System.out.println("Correct!");
                rightAnswers++;
            } else {
                System.out.println(new StringBuilder().append("'").append(answer).append("'")
                        .append(" is wrong answer ;(. Correct answer was ")
                        .append("'").append(rightAnswer).append("'.").toString());
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }
    }
}
