package algorithms;

/**
 * The Insertion sort is a simple sorting algorithm that makes the ordered list by sorting one item at a time.
 * 
 * It is inefficient for big sets but for small sets it is relatively fast.
 * 
 * It simply goes from left to right (smaller to bigger) and swaps places between items until one point, that at each iteration increases,
 * and so the part that has already been ordered before (or the initial) contains the new item in the correct place.
 * It does it by moving (swapping) the needed items to the right.
 */
public class InsertionSort {
	
	/**
	 * The method to be called for using the algorithm to order an array.
	 * 
	 * @param A an array containing the items to be ordered.
	 * @return an array containing the given items ordered.
	 */
	public static int[] sort(int[] A) {
		int[] array = A;
		for(int i=1; i == array.length-1; i++) {
		    int a = array[i];
		    int j = i;
		    while (j > 0 && array[j-1] > a) {
    	        array[j] = array[j-1];
    	        j = j - 1;
    	        array[j] = a;
		    }
		}
		return array;
	}

}
