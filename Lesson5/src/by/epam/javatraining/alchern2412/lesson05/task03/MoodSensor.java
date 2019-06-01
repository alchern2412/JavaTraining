package by.epam.javatraining.alchern2412.lesson05.task03;

import java.util.Random;

/**
 *
 * @author Alex
 */
public class MoodSensor {
    private static Random rand = new Random();
    
    private static final int MARK_1 = 100;
    private static final int MARK_2 = 200;
    private static final int MARK_3 = 300;
    private static final int MARK_4 = 400;
    
    /*hight intellij smart logic, AI, find number of your mood*/
    private static int myMoodNumber() {
        return rand.nextInt(MARK_4);
    }
    
    
    
    public static String myMood() {      
        int number = myMoodNumber();    // number[0,400]
        String mood;
        if (number <= MARK_1) {
            mood = "Bad";
        } else if (number <= MARK_2) {
            mood = "Moderate";
        } else if (number <= MARK_3) {
            mood = "Good";
        } else {
            mood = "Great";
        }
        return mood;
    }
}
