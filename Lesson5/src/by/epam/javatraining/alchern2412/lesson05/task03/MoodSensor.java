package by.epam.javatraining.alchern2412.lesson05.task03;

import java.util.Random;

/**
 *
 * @author Alex
 */
public class MoodSensor {

    private static Random rand = new Random();

    private static final int BAD        = 1;
    private static final int MODERATE   = 2;
    private static final int GOOD       = 3;
    private static final int MARK_COUNT = 4;

    /*hight intellij smart logic, AI, find number of your mood*/
    private static int myMoodNumber() {
        return rand.nextInt(MARK_COUNT);
    }

    public static String myMood() {
        int number = myMoodNumber();    // number[0,4]
        String mood = "Great";          // if 0 -> "Great"
        if (number == BAD) {
            mood = "Bad";
        } else if (number == MODERATE) {
            mood = "Moderate";
        } else if (number == GOOD) {
            mood = "Good";
        }
        return mood;
    }
}
