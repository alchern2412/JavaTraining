package by.epam.javatraining.alchern2412.lesson06.task01;

import java.util.Random;

/**
 *
 * @author Alex Chernyavsky
 */
public class HeadsOrTails {

    private static Random rand = new Random();

    public static int headsCount(int shotsNumber) throws Exception {
        if(shotsNumber < 0) {
            throw new Exception("shotsNumber can't be 0");
        }
        int result = 0;
        for (int i = 0; i < shotsNumber; ++i) {
            if (rand.nextInt(2) == 0) {
                result++;
            }
        }
        return result;
    }
}
