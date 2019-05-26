class NumberLogic {
    // 3. Ascending numbers?
    public static boolean checkNumber4(int number) {
        int n1, n2, n3, n4;

        n1 = (number % 10);	// ...X
        number /= 10;

        n2 = (number % 10); // ..X.
        number /= 10;

        n3 = (number % 10);	// .X..
        number /= 10;

        n4 = (number % 10);	// X...
        number /= 10;
			
        return n1 > n2 && n2 > n3 && n3 > n4;	// check and return result
    }
}