/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.javatraining.alchern2412.maintask01.model;

import by.epam.javatraining.alchern2412.maintask01.model.exceptions.VectorDoubleNullPointerException;
import java.util.Arrays;
import org.apache.log4j.Logger;

/**
 *
 * @author Alex
 */
public class VectorDoubleFunc {

    public static Logger logger = Logger.getRootLogger();

    private static final int NOT_FOUND_IND = -1;
    private static final int HALF_DIVIDER = 2;

    public static boolean isNull(VectorDouble vectorDouble) throws VectorDoubleNullPointerException {
        if (vectorDouble.getVector() == null) {
            throw new VectorDoubleNullPointerException();
        }
        return true;
    }

    public static double findMax(VectorDouble vectorDouble) throws Exception {
        logger.debug("Method findMax(double ... vectorDouble.getVector())");
        isNull(vectorDouble);
        double max = vectorDouble.getVector()[0];
        for (int i = 1; i < vectorDouble.getVector().length; i++) {
            if (max < vectorDouble.getVector()[i]) {
                max = vectorDouble.getVector()[i];
            }
        }
        return max;

    }

    public static double findMin(VectorDouble vectorDouble) throws Exception {
        logger.debug("Method findMin(double ... vector)");
        isNull(vectorDouble);
        double min = vectorDouble.getVector()[0];
        for (int i = 1; i < vectorDouble.getVector().length; i++) {
            if (min > vectorDouble.getVector()[i]) {
                min = vectorDouble.getVector()[i];
            }
        }
        return min;

    }

    public static double findArithmeticMean(VectorDouble vectorDouble) throws Exception {
        logger.debug("Method findArithmAverage(double... vectorDouble.getVector())");
        isNull(vectorDouble);
        double sum = 0;
        for (int i = 0; i < vectorDouble.getVector().length; i++) {
            sum += vectorDouble.getVector()[i];
        }
        return sum / vectorDouble.getVector().length;
    }

    public static double findGeometricMean(VectorDouble vectorDouble) throws Exception {
        logger.debug("Method findArithmAverage(double... vectorDouble.getVector())");
        isNull(vectorDouble);
        double mul = 1;
        for (int i = 0; i < vectorDouble.getVector().length; i++) {
            mul *= vectorDouble.getVector()[i];
        }
        return Math.pow(mul, 1.0 / vectorDouble.getVector().length);
    }

    /*check vector by asc/desc sorting */
    public static boolean isSorted(VectorDouble vectorDouble) {
        logger.debug("Method isSorted(double... vectorDouble.getVector())");
        try {
            isNull(vectorDouble);
        } catch (VectorDoubleNullPointerException exp) {
            return true;
        }

        if (vectorDouble.getVector().length == 1) {
            return true;
        } else {
            boolean asc = vectorDouble.getVector()[0] < vectorDouble.getVector()[1];
            for (int i = 0; i < vectorDouble.getVector().length - 1; i++) {
                if (asc && vectorDouble.getVector()[i] > vectorDouble.getVector()[i + 1]
                        || !asc && vectorDouble.getVector()[i] < vectorDouble.getVector()[i + 1]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static int findLocalMin(VectorDouble vectorDouble) {
        logger.debug("Method findLocalMin(double[] vectorDouble.getVector())");

        final int MIN_LENGTH = 3;

        int index = NOT_FOUND_IND;
        try {
            isNull(vectorDouble);
        } catch (VectorDoubleNullPointerException exp) {
            return index;
        }
        if (vectorDouble.getVector().length < MIN_LENGTH) {
            return index;
        }
        for (int i = 1; i < vectorDouble.getVector().length - 1; i++) {
            if (vectorDouble.getVector()[i] < vectorDouble.getVector()[i - 1] && vectorDouble.getVector()[i] < vectorDouble.getVector()[i + 1]) {
                index = i;
                break;
            }
        }

        return index;
    }

    public static int findLocalMax(VectorDouble vectorDouble) {
        logger.debug("Method findLocalMaxdouble[] vectorDouble.getVector())");
        final int MIN_LENGTH = 3;

        int index = NOT_FOUND_IND;
        try {
            isNull(vectorDouble);
        } catch (VectorDoubleNullPointerException exp) {
            return index;
        }
        if (vectorDouble.getVector().length < MIN_LENGTH) {
            return index;
        }
        for (int i = 1; i < vectorDouble.getVector().length - 1; i++) {
            if (vectorDouble.getVector()[i] > vectorDouble.getVector()[i - 1] && vectorDouble.getVector()[i] > vectorDouble.getVector()[i + 1]) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static int findElementLinear(VectorDouble vectorDouble, double element) {
        logger.debug("Method findLocalMaxdouble[] vectorDouble.getVector())");

        int index = NOT_FOUND_IND;
        try {
            isNull(vectorDouble);
        } catch (VectorDoubleNullPointerException exp) {
            return index;
        }
        for (int i = 0; i < vectorDouble.getVector().length; i++) {
            if (vectorDouble.getVector()[i] == element) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static int findElementBinary(VectorDouble vectorDouble, double element) {
        logger.debug("Method findElementBinary(vectorDouble.getVector()Double)");
        int index = NOT_FOUND_IND;
        try {
            isNull(vectorDouble);
        } catch (VectorDoubleNullPointerException exp) {
            return index;
        }
        Arrays.sort(vectorDouble.getVector());

        int first = 0;
        int last = vectorDouble.getVector().length - 1;
        int position = (last - first) / HALF_DIVIDER;

        logger.debug("start index:" + index);

        while (vectorDouble.getVector()[position] != element && first <= last) {
            logger.debug("position start:" + position);
            if (vectorDouble.getVector()[position] > element) {
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

    public static void reverse(VectorDouble vectorDouble) {
        logger.debug("Method reverse(vectorDouble.getVector()Double)");
        try {
            isNull(vectorDouble);
        } catch (VectorDoubleNullPointerException exp) {
            return;
        }

        for (int i = 0, j = vectorDouble.getVector().length - 1;
                i < vectorDouble.getVector().length / HALF_DIVIDER;
                i++, j--) {
            double tmp = vectorDouble.getVector()[i];
            vectorDouble.getVector()[i] = vectorDouble.getVector()[j];
            vectorDouble.getVector()[j] = tmp;
        }

    }

    // sort algorithms
    //bubble
    public static void sortBubble(VectorDouble vectorDouble) {
        logger.debug("Method sortBubble(vectorDouble.getVector()Double)");
        try {
            isNull(vectorDouble);
        } catch (VectorDoubleNullPointerException exp) {
            return;
        }

        boolean isSorted = false;
        double buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < vectorDouble.getVector().length - 1; i++) {
                if (vectorDouble.getVector()[i] > vectorDouble.getVector()[i + 1]) {
                    isSorted = false;
                    buf = vectorDouble.getVector()[i];
                    vectorDouble.getVector()[i] = vectorDouble.getVector()[i + 1];
                    vectorDouble.getVector()[i + 1] = buf;
                }
            }
        }

    }

    public static void sortBubbleDesc(VectorDouble vectorDouble) {
        logger.debug("Method sortBubbleDesc(vectorDouble.getVector()Double)");
        try {
            isNull(vectorDouble);
        } catch (VectorDoubleNullPointerException exp) {
            return;
        }

        boolean isSorted = false;
        double buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < vectorDouble.getVector().length - 1; i++) {
                if (vectorDouble.getVector()[i] < vectorDouble.getVector()[i + 1]) {
                    isSorted = false;
                    buf = vectorDouble.getVector()[i];
                    vectorDouble.getVector()[i] = vectorDouble.getVector()[i + 1];
                    vectorDouble.getVector()[i + 1] = buf;
                }
            }
        }

    }

    // insertion sort
    public static void sortInsertion(VectorDouble vectorDouble) {
        logger.debug("Method sortInsertion(vectorDouble.getVector()Double)");
        try {
            isNull(vectorDouble);
        } catch (VectorDoubleNullPointerException exp) {
            return;
        }

        double key;
        for (int i = 1; i < vectorDouble.getVector().length; i++) {
            key = vectorDouble.getVector()[i];
            int j = i - 1;
            while (j >= 0 && vectorDouble.getVector()[j] > key) {
                vectorDouble.getVector()[j + 1] = vectorDouble.getVector()[j];
                j = j - 1;
            }
            vectorDouble.getVector()[j + 1] = key;
        }

    }

    public static void sortInsertionDesc(VectorDouble vectorDouble) {
        logger.debug("Method sortInsertionDesc(vectorDouble.getVector()Double)");
        try {
            isNull(vectorDouble);
        } catch (VectorDoubleNullPointerException exp) {
            return;
        }

        double key;
        for (int i = 1; i < vectorDouble.getVector().length; i++) {
            key = vectorDouble.getVector()[i];
            int j = i - 1;
            while (j >= 0 && vectorDouble.getVector()[j] < key) {
                vectorDouble.getVector()[j + 1] = vectorDouble.getVector()[j];
                j = j - 1;
            }
            vectorDouble.getVector()[j + 1] = key;
        }

    }

    // selection sort
    public static void sortSelection(VectorDouble vectorDouble) {
        logger.debug("Method sortSelection(vectorDouble.getVector()Double)");
        try {
            isNull(vectorDouble);
        } catch (VectorDoubleNullPointerException exp) {
            return;
        }

        for (int i = 0; i < vectorDouble.getVector().length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < vectorDouble.getVector().length; j++) {
                if (vectorDouble.getVector()[j] < vectorDouble.getVector()[min]) {
                    min = j;
                }
            }
            if (min != i) {
                double tmp = vectorDouble.getVector()[min];
                vectorDouble.getVector()[min] = vectorDouble.getVector()[i];
                vectorDouble.getVector()[i] = tmp;
            }
        }

    }

    public static void sortSelectionDesc(VectorDouble vectorDouble) {
        logger.debug("Method sortSelectionDesc(vectorDouble.getVector()Double)");
        try {
            isNull(vectorDouble);
        } catch (VectorDoubleNullPointerException exp) {
            return;
        }

        for (int i = 0; i < vectorDouble.getVector().length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < vectorDouble.getVector().length; j++) {
                if (vectorDouble.getVector()[j] > vectorDouble.getVector()[max]) {
                    max = j;
                }
            }
            if (max != i) {
                double tmp = vectorDouble.getVector()[max];
                vectorDouble.getVector()[max] = vectorDouble.getVector()[i];
                vectorDouble.getVector()[i] = tmp;
            }
        }

    }

    // merge sort
    public static void sortMerge(VectorDouble vectorDouble) {
        logger.debug("Method sortMerge(vectorDouble.getVector()Double)");
        try {
            isNull(vectorDouble);
        } catch (VectorDoubleNullPointerException exp) {
            return;
        }
        double[] tmpArray = new double[vectorDouble.getVector().length];
        sortMerge(vectorDouble.getVector(), tmpArray, 0, vectorDouble.getVector().length - 1);

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

    public static void sortMergeDesc(VectorDouble vectorDouble) {
        logger.debug("Method sortMergeDesc(vectorDouble.getVector()Double)");
        try {
            isNull(vectorDouble);
        } catch (VectorDoubleNullPointerException exp) {
            return;
        }
        double[] tmpArray = new double[vectorDouble.getVector().length];
        sortMergeDesc(vectorDouble.getVector(), tmpArray, 0, vectorDouble.getVector().length - 1);

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
    public static void sortQuick(VectorDouble vectorDouble) {
        logger.debug("Method sortQuick(vectorDouble.getVector()Double)");
        try {
            isNull(vectorDouble);
        } catch (VectorDoubleNullPointerException exp) {
            return;
        }
        sortQuick(vectorDouble.getVector(), 0, vectorDouble.getVector().length - 1);

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

    public static void sortQuickDesc(VectorDouble vectorDouble) {
        logger.debug("Method sortQuickDescgit (vectorDouble.getVector()Double)");
        try {
            isNull(vectorDouble);
        } catch (VectorDoubleNullPointerException exp) {
            return;
        }
        sortQuickDesc(vectorDouble.getVector(), 0, vectorDouble.getVector().length - 1);

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
}
