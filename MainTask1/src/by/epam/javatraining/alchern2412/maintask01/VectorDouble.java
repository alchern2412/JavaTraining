package by.epam.javatraining.alchern2412.maintask01;

import java.util.Arrays;
import org.apache.log4j.Logger;

/**
 *
 * @author Alex Chernyavsky
 */
public class VectorDouble {

    public static Logger logger = Logger.getRootLogger();

    private static final int NOT_FOUND_IND = -1;
    private static final int HALF_DIVIDER = 2;

    private double[] vector;

    // constructors
    public VectorDouble(int length) {
        vector = new double[length];
    }

    public VectorDouble(double... vector) {
        this.vector = vector;
    }

    public void add(double element) {
        double[] tmp = new double[vector.length + 1];
        for (int i = 0; i < vector.length; i++) {
            tmp[i] = vector[i];
        }
        tmp[tmp.length - 1] = element;
        vector = tmp;
    }

    public int getLength() {
        return vector.length;
    }

    public double get(int index) throws Exception {
        if (index < 0 || index >= vector.length) {
            throw new Exception("Array bound exception");
        }
        return vector[index];
    }

    public void set(double element, int index) throws Exception {
        if (index < 0 || index >= vector.length) {
            throw new Exception("Array bound exception");
        }
        vector[index] = element;
    }

    public double findMax() throws Exception {
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

    public double findMin() throws Exception {
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

    public double findArithmeticMean() throws Exception {
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

    public double findGeometricMean() throws Exception {
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
    public boolean isSorted() throws Exception {
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

    public int findLocalMin() throws Exception {
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

    public int findLocalMax() throws Exception {
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

    public int findElementLinear(double element) throws Exception {
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

    public int findElementBinary(double element) throws Exception {
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
        if (first <= last) {
            index = position;
        }
        return index;
    }

    public VectorDouble reverse() throws Exception {
        logger.info("Method reverse(double[] vector)");
        if (vector == null) {
            logger.error("vector can't be null");
            throw new Exception("vector can't be null");
        }

        for (int i = 0, j = vector.length - 1;
                i < vector.length / HALF_DIVIDER;
                i++, j--) {
            double tmp = vector[i];
            vector[i] = vector[j];
            vector[j] = tmp;
        }

        return this;
    }

    // sort algorithms
    
    //bubble
    
    public VectorDouble sortBubble() throws Exception {
        logger.info("Method sortBubble()");
        if (vector == null) {
            logger.error("vector can't be null");
            throw new Exception("vector can't be null");
        }   
        
        boolean isSorted = false;
        double buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < vector.length - 1; i++) {
                if (vector[i] > vector[i + 1]) {
                    isSorted = false;
                    buf = vector[i];
                    vector[i] = vector[i + 1];
                    vector[i + 1] = buf;
                }
            }
        }
        return this;
    }

    public VectorDouble sortBubbleDesc() throws Exception {
        logger.info("Method sortBubbleDesc()");
        if (vector == null) {
            logger.error("vector can't be null");
            throw new Exception("vector can't be null");
        } 
        
        boolean isSorted = false;
        double buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < vector.length - 1; i++) {
                if (vector[i] < vector[i + 1]) {
                    isSorted = false;
                    buf = vector[i];
                    vector[i] = vector[i + 1];
                    vector[i + 1] = buf;
                }
            }
        }
        return this;
    }
    
    // insertion sort
    public VectorDouble sortInsertion() throws Exception {
        logger.info("Method sortBubbleDesc()");
        if (vector == null) {
            logger.error("vector can't be null");
            throw new Exception("vector can't be null");
        } 
        
        double key;
        for (int i = 1; i < vector.length; i++) {
            key = vector[i];
            int j = i - 1;
            while (j >= 0 && vector[j] > key) {
                vector[j + 1] = vector[j];
                j = j - 1;
            }
            vector[j + 1] = key;
        }
        return this;
    }    
    
    public VectorDouble sortInsertionDesc() throws Exception {
        logger.info("Method sortBubbleDesc()");
        if (vector == null) {
            logger.error("vector can't be null");
            throw new Exception("vector can't be null");
        } 
        
        double key;
        for (int i = 1; i < vector.length; i++) {
            key = vector[i];
            int j = i - 1;
            while (j >= 0 && vector[j] < key) {
                vector[j + 1] = vector[j];
                j = j - 1;
            }
            vector[j + 1] = key;
        }
        return this;
    }    
    
    
    
    
    

}
