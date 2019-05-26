package com.alchern.task4;

public class RingLogic {
	/*R1 - first radius, R2 - second radius*/
    public static double findRingSquare(double R1, double R2) {
        return Math.PI * (R1 * R1 - R2 * R2);	// first circle square - second square = ring square (easy :) )
    }
}
