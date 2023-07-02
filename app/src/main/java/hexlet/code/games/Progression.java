package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Progression {

    public static void startGame(String userName) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What number is missing in the progression?");

        int rightAnswers = 0;
        while (rightAnswers != Engine.WIN_CONDITION) {
            int startProgression = (int) Math.round(Math.random() * Engine.RANDOM_TO_INT);
            int counterOfProgression = (int) Math.round(Math.random() * Engine.RANDOM_TO_INT);
            int randomNumber = new Random().nextInt(Engine.LENGTH_OF_PROGRESSION);

            int[] progressionArr = new int[Engine.LENGTH_OF_PROGRESSION];

            for (int i = 0; i < progressionArr.length; i++) {
                progressionArr[i] = startProgression;
                startProgression = startProgression + counterOfProgression;
            }

            int rightAnswer = progressionArr[randomNumber];
            String rigthString = Integer.toString(rightAnswer);
            String progressionString = java.util.Arrays.toString(progressionArr)
                    .replaceAll(",", "")
                    .replaceAll("]", "")
                    .replaceAll("\\[", "");
            System.out.println("Question: " + progressionString.replaceFirst(rigthString, ".."));


            System.out.println("Your answer: ");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase(rigthString)) {
                System.out.println("Correct!");
                rightAnswers++;
            } else {
                System.out.println(new StringBuilder().append("'").append(answer).append("'")
                        .append(" is wrong answer ;(. Correct answer was ")
                        .append("'").append(rigthString).append("'.").toString());
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }
    }
}
