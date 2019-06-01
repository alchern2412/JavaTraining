package by.epam.javatraining.alchern2412.lesson06.task02;

/**
 *
 * @author Alex
 */
public class NumberLogic {

    private static final int DIVIDER = 10;
    private static final int DIVIDER2 = 100;

    public static boolean checkAscDesc(int number) {

        number = number > 0 ? number : -number; // only positive :)

        if (number % DIVIDER == 0) {            // one digit number
            return true;
        }

        /*get two last digits for understanding: asc or desc digits*/
        int firstDigit = number % DIVIDER;
        number /= DIVIDER;
        int secondDigit = number % DIVIDER;

        number /= DIVIDER;

        // I want use arrayList this, but ...
        boolean asc = true; // ascending all digits default or ..
        if (firstDigit > secondDigit) {
            asc = false;        // or all descending digits
        }

        firstDigit = secondDigit;
        while (number > 0) {                // check two near digits
            secondDigit = number % DIVIDER;
            if (asc && firstDigit >= secondDigit    
                    || !asc && firstDigit <= secondDigit) {
                return false;
            }
            firstDigit = secondDigit;       // for the next checking
            number /= DIVIDER;
        }
        return true;
    }
}
