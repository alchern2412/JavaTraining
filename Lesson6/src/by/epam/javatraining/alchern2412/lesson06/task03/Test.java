package by.epam.javatraining.alchern2412.lesson06.task03;

import by.epam.javatraining.alchern2412.lesson06.View;

/**
 *
 * @author Alex
 */
public class Test {

    public static void main(String[] args) {
        try {
            int number = 5;
            int factorial = MyMath.factorial(number);
            View.print(number + " -> factorial: " + factorial);

            number = 0;
            factorial = MyMath.factorial(number);
            View.print(number + " -> factorial: " + factorial);

            number = 1;
            factorial = MyMath.factorial(number);
            View.print(number + " -> factorial: " + factorial);

            number = -4;        // Exc: "Number can't be negative"
            factorial = MyMath.factorial(number);
            View.print(number + " -> factorial: " + factorial);

        } catch (Exception ex) {
            View.print(ex.getMessage());
        }
    }

}
