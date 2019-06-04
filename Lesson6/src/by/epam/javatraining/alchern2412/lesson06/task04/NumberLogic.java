package by.epam.javatraining.alchern2412.lesson06.task04;

/**
 *
 * @author Alex Chernyavsky
 */
public class NumberLogic {

    private static final int DIVIDER = 10;
    private static final int EVEN_DIVIDER = 2;

    public static boolean checkEvenOddDigits(int number) {
        number = number > 0 ? number : -number; // only positive :)

        if (number % DIVIDER == 0) {            // one digit number
            return true;
        }

        /*get last digit for understanding: Even or Odd digits? */
        int firstDigit = number % DIVIDER;
        number /= DIVIDER;

        boolean even = true; // EVEN all digits default or ..
        if (firstDigit % EVEN_DIVIDER != 0) {
            even = false;        // or all ODD digits
        }

        while (number > 0) {
            firstDigit = number % DIVIDER;
            if (even && firstDigit % EVEN_DIVIDER != 0
                    || !even && firstDigit % EVEN_DIVIDER == 0) {
                return false;
            }
            number /= DIVIDER;
        }
        return true;
    }

}
