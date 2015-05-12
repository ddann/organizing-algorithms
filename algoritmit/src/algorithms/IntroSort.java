package algorithms;

/**
 * Introsort is a very efficient hybrid algorithm that uses both heapsort and quicksort.
 * It is widely used and performs quite well in all situations. It has a specially a very good worst-case perfomance.
 * Is is a comparison sort (since the two it uses are too).
 * 
 * This is the original version; actually there doesn't exists any optimized versions of it.
 * 
 * It begins with quicksort and switches to heapsort when the recursion depth exceeds a level based on (the logarithm of)
 * the number of elements being sorted. Whether witch it uses for a certain call depends of the length of the list and the depth of the stack trace.
 * This way it can combine the pros of both algorithms, the practical performance of quicksort on typical data sets and
 * the worst-case O(n log n) runtime of to the heap sort.
 * 
 * In some cases because of the use of heapsort it performs in about 1/200 of the time compared to the optimal version of
 * quicksort in certain lists (these are usually crafted intentionally for e.g. DoS attacks).
 * 
 * 
 * How the algorithm works step by step (shortly and for this implementation):
 * 1. It calculates the "initial" value for "maxdepth" that is the variable that when reaching zero it starts using heapsort (see above).
 * 2. It starts sorting the list using quicksort.
 * 3. At a certain point in as stack trace it switches to use heapsort.
 * 4. Once all the stack trace in the thread for what concerns this algorithm's calculations has been computed it returns the given array sorted.
 * 
 * 
 * Note: It is not possible to use this algorithm with an empty array.
 * 
 * IMPORTANT NOTE: There is code(well actually script) that hasn't been written by me.
 * This is the implementation of log.
 * 
 * 
 * For information about the algorithms this uses, read their documentation:
 * @see algorithms.QuickSort
 * @see algorithms.HeapSort
 */
public class IntroSort {

	/**
	 * The method to be called for using the algorithm to order an array. Cannot be empty.
	 * 
	 * @param A an array containing the items to be ordered.
	 * @return an array containing the given items ordered.
	 */
	public static int [] sort(int[] A) {
	    int maxdepth = log2(A.length) * 2;
	    introsort(A, maxdepth);
	    return A;
	}

	private static void introsort(int[] A, int maxdepth) {
	    int n = A.length;
	    if (n <= 1) {
	        return;
	    }
	    else if (maxdepth == 0) {
	    	//If the recursion depth is big enough it start using heapsort.
	        HeapSort.sort(A, A.length);
	    }
	    else {
	        int p = partition(A, 1, A.length);
	        
	        //The below makes two "sliced arrays" from the original.
	        int[] B = new int[p];
	        int[] C = new int[n-p];
			for (int i = 0; i < p; i++) {
				B[i] = A[i];
			}	
			for (int i = p; i < A.length; i++) {
				C[i-p] = A[i];
			}
			
	        introsort(B, maxdepth - 1);
	        introsort(C, maxdepth - 1);
	    }
	}
	
	/**
	 * IMPORTANT NOTE: I haven't written this code. I copied it from:
	 * http://stackoverflow.com/questions/3305059
	 * (I just couldn't find a way to implement it easily by myself (from scratch without using as a source javacode), so I copied this.)
	 */
	private static int log2(int n){
	    if(n <= 0) throw new IllegalArgumentException();
	    return 31 - Integer.numberOfLeadingZeros(n);
	}
	
	private static int partition(int[] A, int lo, int hi) {
	     int pivotIndex = (lo +hi)/2; //The middle of the array
	     int pivotValue = A[pivotIndex]; //Choosing just the middle isn't the most efficient way but yet it is very simple.
	     
	     //swaps A[pivotIndex] and A[hi], after this it is possible to make right the sub-arrays.
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
