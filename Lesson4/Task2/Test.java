package com.alchern.task4;

public class Test {

    public static void main(String[] args) {
        // 2
		
        double R1;	
        double R2;
        R1 = 10;
        R2 = 5;
        System.out.println("Ring square: " + RingLogic.findRingSquare(R1, R2));
		
        // check square (testing)
        double MyRingSquare;
        MyRingSquare = R1 * R1 * Math.PI - R2 * R2 * Math.PI;
        System.out.println("My Ring Square: " + MyRingSquare);

    }


}
