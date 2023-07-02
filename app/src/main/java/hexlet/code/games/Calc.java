package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Calc {

    public static void startGame(String userName) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the result of the expression?");

        int rightAnswers = 0;
        final String[] operators = {"+", "-", "*"};
        while (rightAnswers != Engine.WIN_CONDITION) {
            int randomFirstNumber = (int) Math.round(Math.random() * Engine.RANDOM_TO_INT);
            int randomSecondNumber = (int) Math.round(Math.random() * Engine.RANDOM_TO_INT);
            Random random = new Random();
            int index = random.nextInt(operators.length);
            System.out.println("Question: " + randomFirstNumber + " " + operators[index] + " " + randomSecondNumber);
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
                if (index == 0) {
                    int rightNumber = (randomFirstNumber + randomSecondNumber);
                    System.out.println(new StringBuilder().append("'").append(answer).append("'")
                            .append(" is wrong answer ;(. Correct answer was '")
                            .append(rightNumber).append("'.").toString());
                    System.out.println("Let's try again, " + userName + "!");
                } else if (index == 1) {
                    int rightNumber = (randomFirstNumber - randomSecondNumber);
                    System.out.println(new StringBuilder().append("'").append(answer).append("'")
                            .append(" is wrong answer ;(. Correct answer was '")
                            .append(rightNumber).append("'.").toString());
                    System.out.println("Let's try again, " + userName + "!");
                } else {
                    int rightNumber = (randomFirstNumber * randomSecondNumber);
                    System.out.println(new StringBuilder().append("'").append(answer).append("'")
                            .append(" is wrong answer ;(. Correct answer was '")
                            .append(rightNumber).append("'.").toString());
                    System.out.println("Let's try again, " + userName + "!");
                }
                break;
            }
        }
    }
}
