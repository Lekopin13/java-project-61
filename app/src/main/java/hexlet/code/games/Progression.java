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
            int startProgression = Engine.buildRandomNumber();
            int counterOfProgression = Engine.buildRandomNumber();
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


            System.out.println(Engine.createAnswer());
            String answer = scanner.next();

            if (answer.equalsIgnoreCase(rigthString)) {
                System.out.println(Engine.createCorrect());
                rightAnswers++;
            } else {
                System.out.println(Engine.createFalse(answer, Integer.toString(rightAnswer), userName));
                break;
            }
        }
    }
}
