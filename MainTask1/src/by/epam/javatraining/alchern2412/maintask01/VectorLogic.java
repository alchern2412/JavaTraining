package by.epam.javatraining.alchern2412.maintask01;

import java.util.Arrays;
import org.apache.log4j.Logger;

/**
 *
 * @author Alex Chernyavsky
 */
public class VectorLogic {

    public static Logger logger = Logger.getRootLogger();

    private static final int NOT_FOUND_IND = -1;
    private static final int HALF_DIVIDER = 2;

    public static double findMax(double... vector) throws Exception {
        logger.info("Method findMax(double ... vector)");
        if (vector == null) {
            logger.error("vector can't be null");
            throw new Exception("vector can't be null");
        }
        double max = vector[0];
        for (int i = 1; i < vector.length; i++) {
            if (max < vector[i]) {
                max = vector[i];
            }
        }
        return max;

    }

    public static double findMin(double... vector) throws Exception {
        logger.info("Method findMin(double ... vector)");
        if (vector == null) {
            logger.error("vector can't be null");
            throw new Exception("vector can't be null");
        }
        double min = vector[0];
        for (int i = 1; i < vector.length; i++) {
            if (min > vector[i]) {
                min = vector[i];
            }
        }
        return min;

    }

    public static double findArithmeticMean(double... vector) throws Exception {
        logger.info("Method findArithmAverage(double... vector)");
        if (vector == null) {
            logger.error("vector can't be null");
            throw new Exception("vector can't be null");
        }
        double sum = 0;
        for (int i = 0; i < vector.length; i++) {
            sum += vector[i];
        }
        return sum / vector.length;
    }

    public static double findGeometricMean(double... vector) throws Exception {
        logger.info("Method findArithmAverage(double... vector)");
        if (vector == null) {
            logger.error("vector can't be null");
            throw new Exception("vector can't be null");
        }
        double mul = 1;
        for (int i = 0; i < vector.length; i++) {
            mul *= vector[i];
        }
        return Math.pow(mul, 1.0 / vector.length);
    }

    /*check vector by asc/desc sorting */
    public static boolean isSorted(double... vector) throws Exception {
        logger.info("Method isSorted(double... vector)");
        if (vector == null) {
            logger.error("vector can't be null");
            throw new Exception("vector can't be null");
        }

        if (vector.length == 1) {
            return true;
        } else {
            boolean asc = vector[0] < vector[1];
            for (int i = 0; i < vector.length - 1; i++) {
                if (asc && vector[i] > vector[i + 1]
                        || !asc && vector[i] < vector[i + 1]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static int findLocalMin(double[] vector) throws Exception {
        logger.info("Method findLocalMin(double[] vector)");
        if (vector == null) {
            logger.error("vector can't be null");
            throw new Exception("vector can't be null");
        }
        final int MIN_LENGTH = 3;

        int index = NOT_FOUND_IND;
        if (vector.length < MIN_LENGTH) {
            return index;
        }
        for (int i = 1; i < vector.length - 1; i++) {
            if (vector[i] < vector[i - 1] && vector[i] < vector[i + 1]) {
                index = i;
                break;
            }
        }

        return index;
    }

    public static int findLocalMax(double[] vector) throws Exception {
        logger.info("Method findLocalMaxdouble[] vector)");
        if (vector == null) {
            logger.error("vector can't be null");
            throw new Exception("vector can't be null");
        }
        final int MIN_LENGTH = 3;

        int index = NOT_FOUND_IND;
        if (vector.length < MIN_LENGTH) {
            return index;
        }
        for (int i = 1; i < vector.length - 1; i++) {
            if (vector[i] > vector[i - 1] && vector[i] > vector[i + 1]) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static int findElementLinear(double element, double[] vector) throws Exception {
        logger.info("Method findLocalMaxdouble[] vector)");
        if (vector == null) {
            logger.error("vector can't be null");
            throw new Exception("vector can't be null");
        }

        int index = NOT_FOUND_IND;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == element) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static int findElementBinary(double element, double[] vector) throws Exception {
        logger.info("Method findLocalMaxdouble[] vector)");
        if (vector == null) {
            logger.error("vector can't be null");
            throw new Exception("vector can't be null");
        }
        Arrays.sort(vector);

        int first = 0;
        int last = vector.length - 1;
        int position = (last - first) / HALF_DIVIDER;
        int index = NOT_FOUND_IND;
        
        logger.debug("start index:" + index);
       
        while (vector[position] != element && first <= last) {
            logger.info("position start:" + position);
            if (vector[position] > element) {
                last = position - 1;
            } else {
                first = position + 1;
            }
            position = (first + last) / HALF_DIVIDER;
            logger.info("position end:" + position);
        }
        logger.info("position result:" + position);
        if(first <= last) {
            index = position;
        }
        return index;
    }

    public static double[] reverse(double[] vector) throws Exception {
        logger.info("Method reverse(double[] vector)");
        if (vector == null) {
            logger.error("vector can't be null");
            throw new Exception("vector can't be null");
        }

        for (int i = 0, j = vector.length - 1; i < vector.length / HALF_DIVIDER; i++, j--) {
            double tmp = vector[i];
            vector[i] = vector[j];
            vector[j] = tmp;
        }

        return vector;
    }
    
    // sort algorithms
    
    
}
