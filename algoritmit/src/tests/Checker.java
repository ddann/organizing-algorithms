package tests;

/**
 * A class for being used by the algorithms' test classes.
 * Actually it is somehow strange to it to be in the "tests" package, but is only used by the test classes and for testing. (It is part of the tests)
 */
public class Checker {

	/**
	 * Test whether the given arrays are the same, that is they contain exactly the same values at the same places.
	 * @param A an integer Array.
	 * @param B an integer Array.
	 * @return whether the arrays' contents are exactly the same.
	 */
	public static boolean same(int[] A, int[] B) {
		if (A.length != B.length) return false;
		for (int i = 0; i < A.length; i++) {
			if (A[i] != B[i]) return false;
		}
		return true;
	}
	
}
