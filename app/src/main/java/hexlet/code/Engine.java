package hexlet.code;

public class Engine {
    public static final int WIN_CONDITION = 3;
    public static final int RANDOM_TO_INT = 100;
    public static final int LENGTH_OF_PROGRESSION = 10;

    public static String createQuestion() {
        return "Question: ";
    }

    public static String createAnswer() {
        return "Your answer: ";
    }
    public static String createCorrect() {
        return "Correct!";
    }

    public static String createFalse(String answer, String correctAnswer, String userName) {
        return new StringBuilder().append("'").append(answer).append("'")
                .append(" is wrong answer ;(. Correct answer was ")
                .append("'").append(correctAnswer).append("'. ")
                .append("Let's try again, ").append(userName).append("!").toString();
    }

    public static int buildRandomNumber() {
        int randomNumber = (int) Math.round(Math.random() * Engine.RANDOM_TO_INT);
        return randomNumber;
    }
}
