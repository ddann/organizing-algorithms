 
package algorithms;

/**
 * Quicksort is an efficient sorting algorithm, being a comparison sort and using the "divide and conquer" principle.
 * The one implemented is done based in the most easy to understand and somehow efficient simple pivot choosing (the middle of the array)
 * that most likely is neither so close to the original and nor the most efficient.
 * 
 * It first divides a large array into two smaller sub-arrays: the "low elements" and the "high elements".
 * Then it can recursively sort the sub-arrays.
 * 
 * In short it is step by step:
 * First it just pick a element of the array, called a "pivot". It chooses the element at the middle of the array.
 * After this it orders the array in a way that all elements smaller than the "pivot" are left of it and the greater ones at the right.
 * The one's that have the same value can be in either side and it is ONLY ordered in a way that is compared to the "pivot" the parts at left
 * and right are nor ordered.
 * Recursively it does the steps above to the sub-array of elements with smaller values and separately to the sub-array of elements with greater values.
 * At each sub-array it finds the place (index) of the "pivot" in it and puts it at the end of the array so "it doesn't get in the way".
 * Each sub-array has at least one element less than the original.
 * And it orders the list actually by having parted the array in such a small sub-arrays that the order inside the sub-array is clear and it then
 * ("remembering" the sub-arrays orders') merge it all into one.
 * 
 * Note: It is not possible to use this algorithm with an empty array.
 */
public class QuickSort {

	/**
	 * The method to be called for using the algorithm to order an array.
	 * 
	 * @param A an array containing the items to be ordered. Cannot be empty.
	 * @param lo for sorting an array give 1. The index of the leftmost number of the sub-array at this recursive call.
	 * @param hi for sorting the array give the length/size of A. The index of the rightmost number of the sub-array at this recursive call.
	 * @return an array containing the given items ordered.
	 */
	public static int[] sort(int[] A, int lo, int hi) {
		if (lo < hi) {
		    int p =  partition(A, lo, hi);
		    sort(A, lo, p - 1);
		    sort(A, p + 1, hi);
		}
		return A;
	}
	
	private static int partition(int[] A, int lo, int hi) {
	     int pivotIndex = (lo +hi)/2; //The middle of the array
	     int pivotValue = A[pivotIndex]; //Choosing just the middle isn't the most efficient way but yet it is very simple.
	     
	     //swaps A[pivotIndex] and A[hi-1], after this it is possible to make right the sub-arrays.
		 int a = A[pivotIndex];
	     A[pivotIndex] = A[hi-1];
	     A[hi-1] = a;
	     
	     int storeIndex = lo-1;
	     // Compares each element against the pivotValue and change places accordingly.
	     for (int i=lo-1; i < hi-1; i++) {
	         if (A[i] <= pivotValue) {
	             //swaps A[i] and A[storeIndex]
	        	 a = A[storeIndex];
	        	 A[storeIndex] = A[i];
	        	 A[i] = a;
	    	     
	             storeIndex = storeIndex + 1;
	         }
	    }
	     
	    //swaps A[storeIndex] and A[hi-1] an the pivot is in it's right place.
		 a = A[storeIndex];
	     A[storeIndex] = A[hi-1];
	     A[hi-1] = a;
	     
	    return storeIndex;
	}
	
}
