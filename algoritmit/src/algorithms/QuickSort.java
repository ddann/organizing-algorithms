package algorithms;

public class QuickSort {

	/**
	 * Quicksort is an efficient sorting algorithm, being a comparison sort and using the "divide and conquer" principle.
	 * (The one implemented is done based in the most easy to understand that most likely is not the original.)
	 * 
	 * It first divides a large array into two smaller sub-arrays: the "low elements" and the "high elements".
	 * Then it can recursively sort the sub-arrays.
	 * 
	 * In short it is step by step:
	 * First it just pick a element of the array, called a "pivot".
	 * After this it orders the array in a way that all elements smaller than the "pivot" are left of it and the greater ones at the right.
	 * The one's that have the same value can be in either side and it is ONLY ordered in a way that is compared to the "pivot" the parts at left
	 * and right are nor ordered.
	 * Recursively it does the steps above to the sub-array of elements with smaller values and separately to the sub-array of elements with greater values.
	 * At each sub-array it finds the place (index) of the "pivot" in it and puts it at the end of the array so "it doesn't get in the way".
	 * Each sub-array has at least one element less than the original.
	 * And it orders the list actually by having parted the array in such a small sub-arrays that the order inside the sub-array is clear and it then
	 * ("remembering" the sub-arrays orders') merge it all into one.
	 * 
	 * 
	 * TODO NOT YET FINISHED. Use the tests to test after finishing if it is actually done correctly. choosePivot()... read somewhere how.
	 * 
	 * @param A an array containing the items to be ordered.
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
		return null; //TODO Some way to return a ordered array...
	}
	
	private static int partition(int[] A, int lo, int hi) {
	     int pivotIndex = 0;// choosePivot(A, lo, hi); ???! TODO <-
	     int pivotValue = A[pivotIndex];
	     
	     //swaps A[pivotIndex] and A[hi]
		 int a = A[pivotIndex];
	     A[pivotIndex] = A[hi];
	     A[hi] = a;
	     
	     int storeIndex = lo;
	     for (int i=lo; i == hi -1; i++) {
	         if (A[i] < pivotValue) {
	             //swaps A[i] and A[storeIndex]
	        	 a = A[storeIndex];
	        	 A[storeIndex] = A[i];
	        	 A[i] = a;
	    	     
	             storeIndex = storeIndex + 1;
	         }
	    }
	    //swaps A[storeIndex] and A[hi]
		 a = A[storeIndex];
	     A[storeIndex] = A[hi];
	     A[hi] = a;
	     
	    return storeIndex;
	}
	
}
