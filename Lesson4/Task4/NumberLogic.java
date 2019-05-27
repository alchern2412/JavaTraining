class NumberLogic {
    public static double geometricMean6(int number) {
        
		double n1 = number % 10;	// .....X
        number /= 10;

        double n2 = number % 10;	// ....X.
        number /= 10;

        double n3 = number % 10;	// ...X..
        number /= 10;

        double n4 = number % 10;	// ..X...
        number /= 10;

        double n5 = number % 10;	// .X....
        number /= 10;

        double n6 = number % 10;	// X.....
        return Math.pow((n1 * n2 * n3 * n4 * n5 * n6), 1.0/6);
    }

    public static double arithmeticMean6(int number) {
        double n1 = number % 10;
        number /= 10;

        double n2 = number % 10;
        number /= 10;

        double n3 = number % 10;
        number /= 10;

        double n4 = number % 10;
        number /= 10;

        double n5 = number % 10;
        number /= 10;

        double n6 = number % 10;
        return (n1 + n2 + n3 + n4 + n5 + n6)/6.0;
    }
}