package algorithms;

/**
 * Selection sort is a sorting algorithm of in-place comparison sort by type.
 * It is inefficient for large inputs but, however, it is  simple and it has some performance advantages compared to more
 * complex algorithms in some certain situations, particularly if the amount of auxiliary memory is limited.
 * 
 * This is the original version of the algorithm. There doesn't exists just simple optimizations for it but only bigger variants.
 * 
 * For what comes to its performance it is always the same, e.g. the order of the numbers in the list does not affect it.
 * This is because of how it orders the list. (Description below)
 * 
 * The algorithm divides the input list into two parts: a sublist of items that has been already sorted and another sublist
 * of items remaining to be sorted.
 * At the beginning, the sorted sublist is empty and the unsorted sublist is the entire input list.
 * Then the algorithm proceeds by finding the smallest number in the unsorted sublist, swapping it with the leftmost unsorted
 * element and moving the sublists' "boundary-index" one to the right.
 */
public class SelectionSort {

	/**
	 * The method to be called for using the algorithm to order an array.
	 * 
	 * @param A an array containing the items to be ordered.
	 * @return an array containing the given items ordered.
	 */
	public static int[] sort(int[] A) {
		int i,j;
		int min;
		 
		for (j = 0; j < A.length-1; j++) {
		    min = j;
		    //Searches for the smallest element in this run.
		    for ( i = j+1; i < A.length; i++) {
		        if (A[i] < A[min]) {
		            min = i;
		        }
		    }
		    //If the first wasn't the smallest, it does swap the place of the run's smallest element found and the first.
		    if(min != j) {
				 int a = A[j];
			     A[j] = A[min];
			     A[min] = a;
		    }
		 
		}
		
		return A;
    }
	
}
