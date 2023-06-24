package hexlet.code.games;

import java.util.Scanner;

public class GCD {
    public static void startGame(String userName) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Find the greatest common divisor of given numbers.");

        int rightAnswers = 0;
        int winCondition = 3;
        while (rightAnswers != winCondition) {
            int randomToInt = 100;
            int randomFirstNumber = (int) Math.round(Math.random() * randomToInt);
            int randomSecondNumber = (int) Math.round(Math.random() * randomToInt);
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
                rightAnswers = 0;
            }
        }
    }
}
