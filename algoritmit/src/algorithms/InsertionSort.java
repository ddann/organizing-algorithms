package algorithms;

/**
 * The Insertion sort is a simple sorting algorithm that makes the ordered list by sorting one item at a time.
 * 
 * It is inefficient for big sets but for small sets it is relatively fast.
 * This is the optimized version that is slightly faster than the original.
 * 
 * It simply goes from left to right (smaller to bigger) and swaps places between items until one point, that at each iteration increases,
 * and so the part that has already been ordered before (or the initial) contains the new item in the correct place.
 * It does it by moving (swapping) the needed items to the right.
 * 
 * This is a slightly faster version than the original.
 */
public class InsertionSort {
	
	/**
	 * The method to be called for using the algorithm to order an array.
	 * 
	 * @param A an array containing the items to be ordered.
	 * @return an array containing the given items ordered.
	 */
	public static int[] sort(int[] A) {
		for(int i = 1; i < A.length; i++) {
		    int a = A[i]; //This is the value that the run's rest elements are compared against.
		    int j = i; //Index from where to start this run.
		    
		    //The below shifts positions so that the smallest element of this run ends up being at it's corresponding place.
		    while (j > 0 && A[j-1] > a) {
    	        A[j] = A[j-1];
    	        j = j - 1;
		    }
		    A[j] =a;
		}
		return A;
	}

}
