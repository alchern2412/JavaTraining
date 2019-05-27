class NumberLogic {
	
	// reverse numbers of 7 digit number
    public static int reverseNumber7(int number) {
        int n1 = number % 10;	// ......X
        number /= 10;

        int n2 = number % 10;	// .....X.
        number /= 10;

        int n3 = number % 10;	// ....X..
        number /= 10;

        int n4 = number % 10;	// ...X...
        number /= 10;

        int n5 = number % 10;	// ..X....
        number /= 10;

        int n6 = number % 10;	// .X.....
        number /= 10;

        int n7 = number % 10;	// X......
        return n7 + n6 * 10 + n5 * 100 + n4 * 1000 + n3 * 10000 + n2 * 100000 + n1 * 1000000;
    }
}