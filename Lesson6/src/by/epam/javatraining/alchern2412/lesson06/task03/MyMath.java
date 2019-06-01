package by.epam.javatraining.alchern2412.lesson06.task03;

/**
 *
 * @author Alex
 */
public class MyMath {
    public static int factorial(int number) throws Exception {
        if(number < 0) {
            throw new Exception("Number can't be negative");
        }
        int result = 1;
        
        while(number >= 1) {
            result *= number;
            number--;
        }
        
        return result;
    }
}
