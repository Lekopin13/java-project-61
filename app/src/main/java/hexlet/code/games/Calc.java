package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Calc {

    public static String buildQuestion(int randomFirstNumber, int randomSecondNumber, String operator) {
        return Engine.createQuestion() + randomFirstNumber + " " + operator + " " + randomSecondNumber;
    }

    public static void startGame(String userName) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the result of the expression?");

        int rightAnswers = 0;
        final String[] operators = {"+", "-", "*"};
        while (rightAnswers != Engine.WIN_CONDITION) {
            int randomFirstNumber = Engine.buildRandomNumber();
            int randomSecondNumber = Engine.buildRandomNumber();
            Random random = new Random();
            int index = random.nextInt(operators.length);
            System.out.println(buildQuestion(randomFirstNumber, randomSecondNumber, operators[index]));

            System.out.println(Engine.createAnswer());
            String answer = scanner.next();
            int answerToInteger = Integer.parseInt(answer);

            if (index == 0 && answerToInteger == (randomFirstNumber + randomSecondNumber)) {
                System.out.println(Engine.createCorrect());
                rightAnswers++;
            } else if (index == 1 && answerToInteger == (randomFirstNumber - randomSecondNumber)) {
                System.out.println(Engine.createCorrect());
                rightAnswers++;
            } else if (index == 2 && answerToInteger == (randomFirstNumber * randomSecondNumber)) {
                System.out.println(Engine.createCorrect());
                rightAnswers++;
            } else {
                if (index == 0) {
                    int rightAnswer = (randomFirstNumber + randomSecondNumber);
                    System.out.println(Engine.createFalse(answer, Integer.toString(rightAnswer), userName));
                } else if (index == 1) {
                    int rightAnswer = (randomFirstNumber - randomSecondNumber);
                    System.out.println(Engine.createFalse(answer, Integer.toString(rightAnswer), userName));
                } else {
                    int rightAnswer = (randomFirstNumber * randomSecondNumber);
                    System.out.println(Engine.createFalse(answer, Integer.toString(rightAnswer), userName));
                }
                break;
            }
        }
    }
}
