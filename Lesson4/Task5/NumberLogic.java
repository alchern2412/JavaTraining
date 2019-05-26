class NumberLogic {
	
	// reverse numbers of 7 digit number
    public static int reverseNumber7(int number) {
        int n1, n2, n3, n4, n5, n6, n7;

        n1 = (number % 10);	// ......X
        number /= 10;

        n2 = (number % 10);	// .....X.
        number /= 10;

        n3 = (number % 10);	// ....X..
        number /= 10;

        n4 = (number % 10);	// ...X...
        number /= 10;

        n5 = (number % 10);	// ..X....
        number /= 10;

        n6 = (number % 10);	// .X.....
        number /= 10;

        n7 = (number % 10);	// X......
        return n7 + n6 * 10 + n5 * 100 + n4 * 1000 + n3 * 10000 + n2 * 100000 + n1 * 1000000;
    }
}