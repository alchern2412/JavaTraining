package by.epam.javatraining.alchern2412.lesson05.task01;

/**
 *
 * @author Alex
 */
public class DragonLogic {
    private static final int AGE_MARK_1 = 200;
    private static final int AGE_MARK_2 = 300;
    
    private static final int HEAD_COUNT_START = 3;
    private static final int HEAD_COUNT_SECOND = 2;
    private static final int HEAD_COUNT_THIRD = 1;
    
    private static final int HEAD_COUNT_OVER_MARK_1 = HEAD_COUNT_START
            * AGE_MARK_1;   // 600
    private static final int HEAD_COUNT_OVER_MARK_2 = HEAD_COUNT_OVER_MARK_1
            + HEAD_COUNT_SECOND * (AGE_MARK_2 - AGE_MARK_1); // 600 + 100 * 200
    
    
    /*return head count of dragon, depend from age*/
    public static int findHeadCount(int age) {
        
        
        if (age >= 0 && age < AGE_MARK_1) {                     // 0 <= x < 200
            return age * HEAD_COUNT_START + HEAD_COUNT_START;
        } else if (age >= AGE_MARK_1 && age < AGE_MARK_2) {    // 200 <= x < 300
            return HEAD_COUNT_OVER_MARK_1
                    + (age - AGE_MARK_1 + 1) * HEAD_COUNT_SECOND;   
        } else if (age >= AGE_MARK_2) {                         // x >= 300
            return HEAD_COUNT_OVER_MARK_2 
                    + (age - AGE_MARK_2 + 1) * HEAD_COUNT_THIRD;
        }
                    /*else return '-1' as error number */
        return -1;
    }
    
    public static int findEyesCount(int age) {
        /*if age < 0 => return -1*/
        return age >= 0 ? findHeadCount(age) * 2 : -1;
    }
}
