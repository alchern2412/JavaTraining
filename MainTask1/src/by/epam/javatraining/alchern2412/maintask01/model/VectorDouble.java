package by.epam.javatraining.alchern2412.maintask01.model;

import java.util.Arrays;
import org.apache.log4j.Logger;

/**
 *
 * @author Alex Chernyavsky
 */
public class VectorDouble {

    public static Logger logger = Logger.getRootLogger();

    private double[] vector;

    public double[] getVector() {
        return vector;
    }

    public void setVector(double... vector) {
        this.vector = vector;
    }

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

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < vector.length; i++) {
            if (i == vector.length - 1) {
                result.append(vector[i]);
                break;
            }
            result.append(vector[i]);
            result.append(", ");
        }
        return result.toString();
    }
}
