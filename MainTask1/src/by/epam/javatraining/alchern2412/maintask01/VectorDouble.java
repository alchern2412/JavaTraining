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
        logger.debug("Method findMax(double ... vector)");
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
        logger.debug("Method findMin(double ... vector)");
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
        logger.debug("Method findArithmAverage(double... vector)");
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
        logger.debug("Method findArithmAverage(double... vector)");
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
    public boolean isSorted() {
        logger.debug("Method isSorted(double... vector)");
        if (vector == null) {
            logger.warn("vector can't be null");
            return false;
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

    public int findLocalMin() {
        logger.debug("Method findLocalMin(double[] vector)");

        final int MIN_LENGTH = 3;

        int index = NOT_FOUND_IND;
        if (vector == null) {
            logger.warn("vector can't be null");
            return index;
        }
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

    public int findLocalMax() {
        logger.debug("Method findLocalMaxdouble[] vector)");
        final int MIN_LENGTH = 3;

        int index = NOT_FOUND_IND;
        if (vector == null) {
            logger.warn("vector can't be null");
            return index;
        }
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

    public int findElementLinear(double element) {
        logger.debug("Method findLocalMaxdouble[] vector)");

        int index = NOT_FOUND_IND;
        if (vector == null) {
            logger.warn("vector can't be null");
            return index;
        }
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == element) {
                index = i;
                break;
            }
        }
        return index;
    }

    public int findElementBinary(double element) {
        logger.debug("Method findElementBinary()");
        int index = NOT_FOUND_IND;
        if (vector == null) {
            logger.warn("vector can't be null");
            return index;
        }
        Arrays.sort(vector);

        int first = 0;
        int last = vector.length - 1;
        int position = (last - first) / HALF_DIVIDER;
        

        logger.debug("start index:" + index);

        while (vector[position] != element && first <= last) {
            logger.debug("position start:" + position);
            if (vector[position] > element) {
                last = position - 1;
            } else {
                first = position + 1;
            }
            position = (first + last) / HALF_DIVIDER;
            logger.debug("position end:" + position);
        }
        logger.debug("position result:" + position);
        if (first <= last) {
            index = position;
        }
        return index;
    }

    public void reverse() {
        logger.debug("Method reverse()");
        if (vector == null) {
            logger.warn("vector can't be null");
            return;
        }

        for (int i = 0, j = vector.length - 1;
                i < vector.length / HALF_DIVIDER;
                i++, j--) {
            double tmp = vector[i];
            vector[i] = vector[j];
            vector[j] = tmp;
        }

    }

    // sort algorithms
    //bubble
    public void sortBubble() {
        logger.debug("Method sortBubble()");
        if (vector == null) {
            logger.warn("vector can't be null");
            return;
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

    }

    public void sortBubbleDesc() {
        logger.debug("Method sortBubbleDesc()");
        if (vector == null) {
            logger.warn("vector can't be null");
            return;
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

    }

    // insertion sort
    public void sortInsertion() {
        logger.debug("Method sortInsertion()");
        if (vector == null) {
            logger.warn("vector can't be null");
            return;
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

    }

    public void sortInsertionDesc() {
        logger.debug("Method sortInsertionDesc()");
        if (vector == null) {
            logger.warn("vector can't be null");
            return;
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

    }

    // selection sort
    public void sortSelection() {
        logger.debug("Method sortSelection()");
        if (vector == null) {
            logger.warn("vector can't be null");
            return;
        }

        for (int i = 0; i < vector.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < vector.length; j++) {
                if (vector[j] < vector[min]) {
                    min = j;
                }
            }
            if (min != i) {
                double tmp = vector[min];
                vector[min] = vector[i];
                vector[i] = tmp;
            }
        }

    }

    public void sortSelectionDesc() {
        logger.debug("Method sortSelectionDesc()");
        if (vector == null) {
            logger.warn("vector can't be null");
            return;
        }

        for (int i = 0; i < vector.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < vector.length; j++) {
                if (vector[j] > vector[max]) {
                    max = j;
                }
            }
            if (max != i) {
                double tmp = vector[max];
                vector[max] = vector[i];
                vector[i] = tmp;
            }
        }

    }

    // merge sort
    public void sortMerge() {
        double[] tmpArray = new double[vector.length];
        sortMerge(vector, tmpArray, 0, vector.length - 1);

    }

    private static void sortMerge(double[] a, double[] tmpArray,
            int left, int right) {
        if (left < right) {
            int center = (left + right) / 2;
            sortMerge(a, tmpArray, left, center);
            sortMerge(a, tmpArray, center + 1, right);
            merge(a, tmpArray, left, center + 1, right);
        }
    }

    private static void merge(double[] a, double[] tmpArray,
            int leftPos, int rightPos, int rightEnd) {
        int leftEnd = rightPos - 1;
        int tmpPos = leftPos;
        int numElements = rightEnd - leftPos + 1;
        // Main loop
        while (leftPos <= leftEnd && rightPos <= rightEnd) {
            if (a[leftPos] <= a[rightPos]) {
                tmpArray[ tmpPos++] = a[ leftPos++];
            } else {
                tmpArray[ tmpPos++] = a[ rightPos++];
            }
        }

        while (leftPos <= leftEnd) {
            tmpArray[ tmpPos++] = a[ leftPos++];
        }

        while (rightPos <= rightEnd) {
            tmpArray[ tmpPos++] = a[ rightPos++];
        }

        // Copy tmpArray back
        for (int i = 0; i < numElements; i++, rightEnd--) {
            a[ rightEnd] = tmpArray[ rightEnd];
        }

    }

    public void sortMergeDesc() {
        double[] tmpArray = new double[vector.length];
        sortMergeDesc(vector, tmpArray, 0, vector.length - 1);

    }

    private static void sortMergeDesc(double[] a, double[] tmpArray,
            int left, int right) {
        if (left < right) {
            int center = (left + right) / 2;
            sortMergeDesc(a, tmpArray, left, center);
            sortMergeDesc(a, tmpArray, center + 1, right);
            mergeDesc(a, tmpArray, left, center + 1, right);
        }
    }

    private static void mergeDesc(double[] a, double[] tmpArray,
            int leftPos, int rightPos, int rightEnd) {
        int leftEnd = rightPos - 1;
        int tmpPos = leftPos;
        int numElements = rightEnd - leftPos + 1;
        // Main loop
        while (leftPos <= leftEnd && rightPos <= rightEnd) {
            if (a[leftPos] >= a[rightPos]) {
                tmpArray[ tmpPos++] = a[ leftPos++];
            } else {
                tmpArray[ tmpPos++] = a[ rightPos++];
            }
        }

        while (leftPos <= leftEnd) {
            tmpArray[ tmpPos++] = a[ leftPos++];
        }

        while (rightPos <= rightEnd) {
            tmpArray[ tmpPos++] = a[ rightPos++];
        }

        // Copy tmpArray back
        for (int i = 0; i < numElements; i++, rightEnd--) {
            a[ rightEnd] = tmpArray[ rightEnd];
        }

    }

    // quick sort
    public void sortQuick() {
        sortQuick(vector, 0, vector.length - 1);

    }

    private static void sortQuick(double[] array, int low, int high) {
        if (array.length == 0) {
            return;
        }
        if (low >= high) {
            return;
        }
        // select flag element
        int middle = low + (high - low) / 2;
        double flag = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < flag) {
                i++;
            }

            while (array[j] > flag) {
                j--;
            }

            if (i <= j) {   //swap
                double temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j) {
            sortQuick(array, low, j);
        }

        if (high > i) {
            sortQuick(array, i, high);
        }
    }

    public void sortQuickDesc() {
        sortQuickDesc(vector, 0, vector.length - 1);

    }

    private static void sortQuickDesc(double[] array, int low, int high) {
        if (array.length == 0) {
            return;
        }
        if (low >= high) {
            return;
        }
        // select flag element
        int middle = low + (high - low) / 2;
        double flag = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] > flag) {
                i++;
            }

            while (array[j] < flag) {
                j--;
            }

            if (i <= j) {   //swap
                double temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j) {
            sortQuickDesc(array, low, j);
        }

        if (high > i) {
            sortQuickDesc(array, i, high);
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < vector.length; i++) {
            if (i == vector.length - 1) {
                result += vector[i];
                break;
            }
            result += vector[i] + ", ";
        }
        return result;
    }
}
