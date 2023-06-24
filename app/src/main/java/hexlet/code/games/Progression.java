package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static void startGame(String userName) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What number is missing in the progression?");

        int rightAnswers = 0;
        int winCondition = 3;
        while (rightAnswers != winCondition) {
            int randomToInt = 10;
            int startProgression = (int) Math.round(Math.random() * randomToInt);
            int counterOfProgression = (int) Math.round(Math.random() * randomToInt);
            //int minLength = 5; (for random length)
            //int maxLength = 10; (for random length)
            int lengthOfProgression = 10;
            //new Random().nextInt(maxLength - minLength) + minLength; (random length)
            int randomNumber = new Random().nextInt(lengthOfProgression);

            int[] progressionArr = new int[lengthOfProgression];

            for (int i = 0; i < progressionArr.length; i++) {
                progressionArr[i] = startProgression;
                startProgression = startProgression + counterOfProgression;
            }

            int rightAnswer = progressionArr[randomNumber];
            String rigthString = Integer.toString(rightAnswer);
            String progressionString = java.util.Arrays.toString(progressionArr)
                    .replaceAll("[\\,\\[\\]\\ ]", " ")
                    .replaceAll(rigthString, "..");
            System.out.println("Question: " + progressionString);


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
                //rightAnswers = 0;
            }
        }
    }
}
