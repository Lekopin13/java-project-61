package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static void startGame(String userName) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the result of the expression?");

        int rightAnswers = 0;
        int winCondition = 3;
        final String[] operators = {"+", "-", "*"};
        while (rightAnswers != winCondition) {
            int randomFirstNumber = (int) Math.round(Math.random() * 100);
            int randomSecondNumber = (int) Math.round(Math.random() * 100);
            Random random = new Random();
            int index = random.nextInt(operators.length);
            System.out.println("Question: " + randomFirstNumber + operators[index] + randomSecondNumber);
            System.out.println("Your answer: ");
            String answer = scanner.next();
            int answerToInteger = Integer.parseInt(answer);

            if (index == 0 && answerToInteger == (randomFirstNumber + randomSecondNumber)) {
                System.out.println("Correct!");
                rightAnswers++;
            } else if (index == 1 && answerToInteger == (randomFirstNumber - randomSecondNumber)) {
                System.out.println("Correct!");
                rightAnswers++;
            } else if (index == 2 && answerToInteger == (randomFirstNumber * randomSecondNumber)) {
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
