package by.epam.javatraining.alchern2412.maintask01.model;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Alex
 */
public class VectorDoubleFuncTest {

    VectorDouble vectorDouble;

    //1 max
    @Test
    public void testFindMax() throws Exception {
        double[] vector = {1.0, 4.0, 10.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        double expResult = 10;
        double result = VectorDoubleFunc.findMax(vectorDouble);
        assertEquals(expResult, result, .0);
    }

    @Test(expected = Exception.class)
    public void testFindMaxNullCheck() throws Exception {
        double[] vector = null;
        vectorDouble = new VectorDouble(vector);
        VectorDoubleFunc.findMax(vectorDouble);
    }

    //1 min
    @Test
    public void testFindMin() throws Exception {
        double[] vector = {1.0, 4.0, 10.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        double expResult = 1;
        double result = VectorDoubleFunc.findMin(vectorDouble);
        assertEquals(expResult, result, .0);
    }

    @Test(expected = Exception.class)
    public void testFindMinNullCheck() throws Exception {
        double[] vector = null;
        vectorDouble = new VectorDouble(vector);
        VectorDoubleFunc.findMin(vectorDouble);
    }

    //2 arithm mean
    @Test
    public void testFindArithmeticMean() throws Exception {
        double[] vector = {1.0, 4.0, 10.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        double expResult = 4.25;
        double result = VectorDoubleFunc.findArithmeticMean(vectorDouble);
        assertEquals(expResult, result, .000001);
    }

    @Test(expected = Exception.class)
    public void testFindArithmeticMeanNullCheck() throws Exception {
        double[] vector = null;
        vectorDouble = new VectorDouble(vector);
        VectorDoubleFunc.findArithmeticMean(vectorDouble);
    }

    //2 geometr. mean
    @Test
    public void testFindGeometricMean() throws Exception {
        double[] vector = {1.0, 4.0, 10.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        double expResult = 2.990697562442;
        double result = VectorDoubleFunc.findGeometricMean(vectorDouble);
        assertEquals(expResult, result, .000001);
    }

    @Test(expected = Exception.class)
    public void testFindGeometricMeanNullCheck() throws Exception {
        double[] vector = null;
        vectorDouble = new VectorDouble(vector);
        VectorDoubleFunc.findGeometricMean(vectorDouble);
    }

    //3 is sorted?
    @Test
    public void testIsSortedAsc() {
        double[] vector = {1.0, 4.0, 6.0, 22.0};
        vectorDouble = new VectorDouble(vector);
        boolean expResult = true;
        boolean result = VectorDoubleFunc.isSorted(vectorDouble);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsSortedDesc() {
        double[] vector = {100.0, 40.0, 6.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        boolean expResult = true;
        boolean result = VectorDoubleFunc.isSorted(vectorDouble);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsSortedFalse() {
        double[] vector = {1.0, 14.0, 6.0, 22.0};
        vectorDouble = new VectorDouble(vector);
        boolean expResult = false;
        boolean result = VectorDoubleFunc.isSorted(vectorDouble);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsSortedOneNumber() {
        double[] vector = {10.0};
        vectorDouble = new VectorDouble(vector);
        boolean expResult = true;
        boolean result = VectorDoubleFunc.isSorted(vectorDouble);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsSortedNullCheck() {
        double[] vector = null;
        vectorDouble = new VectorDouble(vector);
        boolean expResult = true;
        boolean result = VectorDoubleFunc.isSorted(vectorDouble);
        assertEquals(expResult, result);
    }

    // 4. find local min/max
    @Test
    public void testFindLocalMin() {
        double[] vector = {1.0, 4.0, 3.0, 10.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        int expResult = 2;
        int result = VectorDoubleFunc.findLocalMin(vectorDouble);
        assertEquals(expResult, result);
    }

    @Test
    public void testFindLocalMinNotFound() {
        double[] vector = {1.0, 4.0, 6.0, 10.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        int expResult = -1;
        int result = VectorDoubleFunc.findLocalMin(vectorDouble);
        assertEquals(expResult, result);
    }

    @Test
    public void testFindLocalMinNullCheck() {
        double[] vector = null;
        vectorDouble = new VectorDouble(vector);
        int expResult = -1;
        int result = VectorDoubleFunc.findLocalMin(vectorDouble);
        assertEquals(expResult, result);
    }

    @Test
    public void testFindLocalMax() {
        double[] vector = {1.0, 4.0, 3.0, 10.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        int expResult = 1;
        int result = VectorDoubleFunc.findLocalMax(vectorDouble);
        assertEquals(expResult, result);
    }

    @Test
    public void testFindLocalMaxNotFound() {
        double[] vector = {1.0, 4.0, 6.0, 10.0, 20.0};
        vectorDouble = new VectorDouble(vector);
        int expResult = -1;
        int result = VectorDoubleFunc.findLocalMax(vectorDouble);
        assertEquals(expResult, result);
    }

    @Test
    public void testFindLocalMaxNullCheck() {
        double[] vector = null;
        vectorDouble = new VectorDouble(vector);
        int expResult = -1;
        int result = VectorDoubleFunc.findLocalMax(vectorDouble);
        assertEquals(expResult, result);
    }

    // linear search
    @Test
    public void testFindElementLinear() {
        double[] vector = {1.0, 4.0, 3.0, 10.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        double element = 3.0;
        int expResult = 2;
        int result = VectorDoubleFunc.findElementLinear(vectorDouble, element);
        assertEquals(expResult, result);
    }

    @Test
    public void testFindElementLinearNotFound() {
        double[] vector = {1.0, 4.0, 3.0, 10.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        double element = 111;
        int expResult = -1;
        int result = VectorDoubleFunc.findElementLinear(vectorDouble, element);
        assertEquals(expResult, result);
    }

    @Test
    public void testFindElementLinearNullCheck() {
        double[] vector = null;
        vectorDouble = new VectorDouble(vector);
        double element = 111;
        int expResult = -1;
        int result = VectorDoubleFunc.findElementLinear(vectorDouble, element);
        assertEquals(expResult, result);
    }

    // binary search
    @Test
    public void testFindElementBinary() {
        double[] vector = {1.0, 4.0, 3.0, 10.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        double element = 3.0;
        int expResult = 2;
        int result = VectorDoubleFunc.findElementBinary(vectorDouble, element);
        assertEquals(expResult, result);
    }

    @Test
    public void testFindElementBinaryNotFound() {
        double[] vector = {1.0, 4.0, 3.0, 10.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        double element = 111;
        int expResult = -1;
        int result = VectorDoubleFunc.findElementBinary(vectorDouble, element);
        assertEquals(expResult, result);
    }

    @Test
    public void testFindElementBinaryNullCheck() {
        double[] vector = null;
        vectorDouble = new VectorDouble(vector);
        double element = 111;
        int expResult = -1;
        int result = VectorDoubleFunc.findElementBinary(vectorDouble, element);
        assertEquals(expResult, result);
    }

    // . reverse
    @Test
    public void testReverseEven() throws Exception {
        double[] vector = {1.0, 4.0, 10.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        double[] expResult = {2.0, 10.0, 4.0, 1.0};
        VectorDoubleFunc.reverse(vectorDouble);
        for (int i = 0; i < vectorDouble.getLength(); i++) {
            assertEquals(expResult[i], vectorDouble.get(i), 0.000000001);
        }
    }

    @Test
    public void testReverseOdd() throws Exception {
        double[] vector = {1.0, 4.0, 15.0, 10.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        double[] expResult = {2.0, 10.0, 15.0, 4.0, 1.0};
        VectorDoubleFunc.reverse(vectorDouble);
        for (int i = 0; i < vectorDouble.getLength(); i++) {
            assertEquals(expResult[i], vectorDouble.get(i), 0.000000001);
        }
    }

    @Test
    public void testReverseNullCheck() {
        double[] vector = null;
        vectorDouble = new VectorDouble(vector);
        VectorDoubleFunc.reverse(vectorDouble);
    }

    // sorts
    //bubble
    @Test
    public void testSortBubble() throws Exception {
        double[] vector = {1.0, 4.0, 10.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        double[] expResult = {1.0, 2.0, 4.0, 10.0};
        VectorDoubleFunc.sortBubble(vectorDouble);
        for (int i = 0; i < vectorDouble.getLength(); i++) {
            assertEquals(expResult[i], vectorDouble.get(i), 0.000000001);
        }
    }

    @Test
    public void testSortBubbleDesc() throws Exception {
        double[] vector = {1.0, 4.0, 10.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        double[] expResult = {10.0, 4.0, 2.0, 1.0};
        VectorDoubleFunc.sortBubbleDesc(vectorDouble);
        for (int i = 0; i < vectorDouble.getLength(); i++) {
            assertEquals(expResult[i], vectorDouble.get(i), 0.000000001);
        }
    }

    //insertion
    @Test
    public void testSortInsertion() throws Exception {
        double[] vector = {1.0, 4.0, 10.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        double[] expResult = {1.0, 2.0, 4.0, 10.0};
        VectorDoubleFunc.sortInsertion(vectorDouble);
        for (int i = 0; i < vectorDouble.getLength(); i++) {
            assertEquals(expResult[i], vectorDouble.get(i), 0.000000001);
        }
    }

    @Test
    public void testSortInsertionDesc() throws Exception {
        double[] vector = {1.0, 4.0, 10.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        double[] expResult = {10.0, 4.0, 2.0, 1.0};
        VectorDoubleFunc.sortInsertionDesc(vectorDouble);
        for (int i = 0; i < vectorDouble.getLength(); i++) {
            assertEquals(expResult[i], vectorDouble.get(i), 0.000000001);
        }
    }

    //selection
    @Test
    public void testSortSelection() throws Exception {
        double[] vector = {1.0, 4.0, 10.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        double[] expResult = {1.0, 2.0, 4.0, 10.0};
        VectorDoubleFunc.sortSelection(vectorDouble);
        for (int i = 0; i < vectorDouble.getLength(); i++) {
            assertEquals(expResult[i], vectorDouble.get(i), 0.000000001);
        }
    }

    @Test
    public void testSortSelectionDesc() throws Exception {
        double[] vector = {1.0, 4.0, 10.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        double[] expResult = {10.0, 4.0, 2.0, 1.0};
        VectorDoubleFunc.sortSelectionDesc(vectorDouble);
        for (int i = 0; i < vectorDouble.getLength(); i++) {
            assertEquals(expResult[i], vectorDouble.get(i), 0.000000001);
        }
    }

    //merge
    @Test
    public void testSortMerge() throws Exception {
        double[] vector = {1.0, 4.0, 10.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        double[] expResult = {1.0, 2.0, 4.0, 10.0};
        VectorDoubleFunc.sortMerge(vectorDouble);
        for (int i = 0; i < vectorDouble.getLength(); i++) {
            assertEquals(expResult[i], vectorDouble.get(i), 0.000000001);
        }
    }

    @Test
    public void testSortMergeDesc() throws Exception {
        double[] vector = {1.0, 4.0, 10.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        double[] expResult = {10.0, 4.0, 2.0, 1.0};
        VectorDoubleFunc.sortMergeDesc(vectorDouble);
        for (int i = 0; i < vectorDouble.getLength(); i++) {
            assertEquals(expResult[i], vectorDouble.get(i), 0.000000001);
        }
    }

    //quick
    @Test
    public void testSortQuick() throws Exception {
        double[] vector = {1.0, 4.0, 10.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        double[] expResult = {1.0, 2.0, 4.0, 10.0};
        VectorDoubleFunc.sortQuick(vectorDouble);
        for (int i = 0; i < vectorDouble.getLength(); i++) {
            assertEquals(expResult[i], vectorDouble.get(i), 0.000000001);
        }
    }

    @Test
    public void testSortQuickDesc() throws Exception {
        double[] vector = {1.0, 4.0, 10.0, 2.0};
        vectorDouble = new VectorDouble(vector);
        double[] expResult = {10.0, 4.0, 2.0, 1.0};
        VectorDoubleFunc.sortQuickDesc(vectorDouble);
        for (int i = 0; i < vectorDouble.getLength(); i++) {
            assertEquals(expResult[i], vectorDouble.get(i), 0.000000001);
        }
    }
}
