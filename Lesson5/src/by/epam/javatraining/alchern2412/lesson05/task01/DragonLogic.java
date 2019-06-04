package by.epam.javatraining.alchern2412.lesson05.task01;

/**
 *
 * @author Alex Chernyavsky
 */
public class DragonLogic {

    private static final int AGE_MARK_FIRST = 200;
    private static final int AGE_MARK_SECOND = 300;

    private static final int HEAD_COUNT_FIRST = 3;
    private static final int HEAD_COUNT_SECOND = 2;
    private static final int HEAD_COUNT_THIRD = 1;
    
    private static final int EYES_COUNT = 2;

    /*return head count of dragon, depend from age*/
    public static int findHeadCount(int age) {

        final int HEAD_COUNT_OVER_MARK_FIRST = HEAD_COUNT_FIRST
                * AGE_MARK_FIRST;   // 600
        final int HEAD_COUNT_OVER_MARK_SECOND = HEAD_COUNT_OVER_MARK_FIRST
                + HEAD_COUNT_SECOND * (AGE_MARK_SECOND - AGE_MARK_FIRST); // 600 + 100 * 200

        if (age >= 0 && age < AGE_MARK_FIRST) {                     // 0 <= x < 200
            return age * HEAD_COUNT_FIRST + HEAD_COUNT_FIRST;
        } else if (age >= AGE_MARK_FIRST && age < AGE_MARK_SECOND) {    // 200 <= x < 300
            return HEAD_COUNT_OVER_MARK_FIRST
                    + (age - AGE_MARK_FIRST + 1) * HEAD_COUNT_SECOND;
        } else if (age >= AGE_MARK_SECOND) {                         // x >= 300
            return HEAD_COUNT_OVER_MARK_SECOND
                    + (age - AGE_MARK_SECOND + 1) * HEAD_COUNT_THIRD;
        }
        /*else return '-1' as error number */
        return -1;
    }

    public static int findEyesCount(int age) {
        /*if age < 0 => return -1*/
        return age >= 0 ? findHeadCount(age) * EYES_COUNT : -1; // -1 - ERROR CODE
    }
}
