package by.epam.javatraining.alchern2412.lesson06.task03;

/**
 *
 * @author Alex
 */
public class MyMath {

    public static int factorial(int number) {
        final int ERROR_CODE = -1;
        final int START_NUM = 1;

        if (number < 0) {
            return ERROR_CODE;
        }

        int result = START_NUM;

        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
