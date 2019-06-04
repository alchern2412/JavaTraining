package by.epam.javatraining.alchern2412.lesson06.task01;

import java.util.Random;

/**
 *
 * @author Alex Chernyavsky
 */
public class HeadsOrTails {

    private static final Random RND = new Random();
    private static final int SIDE_COUNT = 2;

    public static int headsCount(int shotsNumber) throws Exception {
        if(shotsNumber < 0) {
            throw new Exception("shotsNumber can't be 0");
        }
        int result = 0;
        for (int i = 0; i < shotsNumber; ++i) {
            if (RND.nextInt(SIDE_COUNT) == 0) {
                result++;
            }
        }
        return result;
    }
}
