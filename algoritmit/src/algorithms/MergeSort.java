package algorithms;

/**
 * Merge sort is an O(n log n) relatively efficient comparison-based sorting algorithm.
 * There's many ways to implement the algorithm and this is neither completely the original nor 
 * the most efficient, thought the difference in efficiency between (senceful) implementation is minimal.
 * 
 * It is a divide and conquer algorithm and against "more complex" algorithms like merges sort
 * itself it is usually slower and/or requires more auxiliary memory.
 * However it is usually the best choose for sorting linked lists (however the implementation should
 * be then different). (This is not the case in this project.)
 * 
 * It's idea is pretty simple:
 * (If the list's is empty or contains one element it is directly returned as it were at the method's call.) 
 * 1. Divide the unsorted list into two sublists.
 * 2. Recursively do this until the sublist's length is one.
 * 3. Repeatedly merge the created sublists (at the end of each recursive call) to produce new (bigger) sorted sublists.
 * 4. When all this have been done the call chain "has created" a sorted list to return. 
 * 
 * Note: I'm fairly sure that this is not the original/conventional implementation. But should perform the same.
 */
public class MergeSort {

	/**
	 * The method to be called for using the algorithm to order an array.
	 * 
	 * @param A an array containing the items to be ordered.
	 * @return an array containing the given items ordered.
	 */
	public static int[] sort(int[] A) {
		//if the array only contains one element or nothing it is already sorted.
		if (A.length <2) {
			return A;
		}
		
		//The below divides the array in two sub-arrays.
		//The sub-arrays' length may differ by one (in this case the R would be the bigger)
		int middle = A.length/2;
		int[] L = new int[middle];
		int[] R = new int[A.length - middle];
		//The fors below "divides" the array in two.
		for (int i = 0; i < middle; i++) {
			L[i] = A[i];
		}	
		for (int i = 0; i < middle; i++) {
			R[i] = A[i + middle];
		}
		
		//Sorts both the sub-arrays separately, and may divide them further.
	    L = sort(L);
	    R = sort(R);
			
	    //Merges this call's created sublists.
		return merge(L, R);
    }
	
	private static int[] merge(int[] L, int[] R) {
	    int[] M = new int[L.length+R.length]; //The merged array to return.
	    //The original sizes of the arrays. Used for keeping track of which elemets are in the merged array already.
	    int lengthL = L.length;
	    int lengthR = R.length;
	    
	    //Does move the elements to their corresponding sub-list.
	    //And "saves" which one shave been moved.
	    while (lengthL > 0 && lengthR > 0) {
	        if (L[L.length - lengthL] < R[R.length - lengthR]){
	            M[M.length -lengthL-lengthR] = L[L.length - lengthL];
	            lengthL--;
	        }
	        else{
	            M[M.length - lengthL-lengthR] = R[R.length - lengthR];
	            lengthR--;
	        }
	    }
	    
	    // Puts the rest of the elements (if any) in the left sub-array in the final one.
	    for (int i = lengthL; i > 0; i--) {
	        M[M.length - i] = L[L.length - i];
	    }
	    // Puts the rest of the elements (if any) in the right sub-array in the final one.
	    for (int i = lengthR; i > 0; i--) {
	        M[M.length - i] = R[R.length - i];
	    }
	    
	    return M;
	}
}
