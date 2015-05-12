package algorithms;

/**
 * The most simple and less efficient (as being a senseful solution) of the sorting algorithms.
 * 
 * This is the unoptimized version (Optimizing adds a "n = n-1;" after "swapped =true;" and the 
 * difference is about less than half in efficiency.)
 * 
 * It is very simple and in short it just repeatedly goes thought the list to be ordered, always
 * finishing one place more to the left than before and compares each pair of adjacent numbers and
 * swaps their place if they are in the wrong order. It does this until all the set has been revised.
 * It gets at each iteration the rightmost item right.
 * 
 * It is really slow for a big set of numbers.
 */
public class BubbleSort {

	/**
	 * The method to be called for using the algorithm to order an array.
	 * 
	 * @param A an array containing the items to be ordered.
	 * @return an array containing the given items ordered.
	 */
	public static int[] sort(int[] A) {
	    boolean swapped = true;
	    //Keeps sorting the list until no swaps have been done which means that the list is already sorted.
	    while (swapped) {
	       swapped = false;
	       for(int i=1; i< A.length; i++) {
	           if(A[i-1] > A[i]) {
	        	   int a = A[i-1];
	               A[i-1] = A[i];
	               A[i] = a;
	               swapped = true;
	            }
	        }
	    }
		return A;
    }

}