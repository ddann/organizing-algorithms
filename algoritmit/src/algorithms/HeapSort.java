package algorithms;

/**
 * Heapsort is a in-place comparison-based sorting algorithm.
 * It is one of the most efficient (simple) algorithms for sorting, but somewhat slower in practice on most machines than a
 * well-implemented quicksort, thought it has the advantage of a more favorable worst-case O(n log n) runtime. 
 * Because of this it is usually used for big data inputs for efficiency and security as well as because for being an in-place
 * algorithm in embedded systems with real-time constraints or systems concerned with security.
 * 
 * 
 * Shortly it works as follows;
 * It divides the input into a sorted and an unsorted region, and it iteratively shrinks the unsorted region
 * by extracting the largest element and moving that to the sorted region. The heap data structure improves its efficiency.
 * 
 * And step by step:
 * It can be divided into two parts:
 * WIKIPEDIA KOPIOO PITKÄLTI!:
 * In the first step, a heap is built out of the data. The heap is placed in an array with the layout of a complete binary tree.
 * The complete binary tree maps the binary tree structure into the array indices; each array index represents a node; the index of the
 * node's parent, left child branch, or right child branch are simple expressions. The root node is stored at index 0;
 * i is here the index of the current node:
 *   iParent     = floor((i-1) / 2)
 *   iLeftChild  = 2*i + 1
 *   iRightChild = 2*i + 2
 * In the second step, a sorted array is created by repeatedly removing the largest element from the heap (the root of the heap), and inserting it
 * into the final sorted array to be returned. The heap is updated after each removal to maintain the heap correct.
 * Once all objects have been removed from the heap, the array to be returned is sorted.
 * 
 */
public class HeapSort {
	
	/**
	 * The method to be called for using the algorithm to order an array.
	 * 
	 * @param A an array containing the items to be ordered.
	 * @param count the length of the array.
	 * @return an array containing the given items ordered.
	 */
	public static int[] sort(int[] A, int count) {
	    heapify(A, count);
	    int end = count - 1;
	    
	    while (end > 0) {
	        //swap(a[end], a[0])
     	    int a = A[end];
            A[end] = A[0];
            A[0] = a;
           
	        end = end - 1;
	        siftDown(A, 0, end);
	    }
	    
		return A;
    }


	private static void heapify(int[] A, int count) {
	    int start = ((count - 2) / 2);
	    
	    while (start >= 0) {
	        siftDown(A, start, count - 1);
	        start = start - 1;
	    }
	}
	
	private static void siftDown(int[] A, int start, int end) {
		int root = start;

	    while (root * 2 + 1 <= end) {
	        int child = root * 2 + 1;
	        int swap = root;

	        if (A[swap] < A[child]) {
	            swap = child;
	        }
	        if (child+1 <= end && A[swap] < A[child+1]) {
	            swap = child + 1;
	        }
	        if (swap == root) {
	        	return;
	        }
	        else {
	            //swap(a[root], a[swap])
	        	int a = A[root];
	            A[root] = A[swap];
	            A[swap] = a;
	            
	            root = swap;
	        }
	    }
	}
}
