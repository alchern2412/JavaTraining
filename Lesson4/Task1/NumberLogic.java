class NumberLogic {
    /*compares three integers for equality*/
    public static boolean equalsThreeNumbers(int a, int b, int c) {
        return a == b && a == c;
    }
	
    public static boolean notEqualsThreeNumbers(int a, int b, int c) {
        return a != b && a != c && b != c;
    }
}