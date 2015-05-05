package algorithms;

/**
 * IMPORTANT NOTE: There is code(well actually script) that hasn't been written by me.
 * These are a implementation of log and another of quicksort's partition because mine didn't work with introsort in any means.
 * (I have no idea why.)
 */
public class IntroSort {

	public static int [] sort(int[] A) {
		int maxdepth = log2(A.length) * 2;//let maxdepth = ⌊log(length(A))⌋ × 2
	    introsort(A, maxdepth);
	    System.out.println(A[0]+" "+ A[1]+" "+ A[2]+" " +A[3]);
	    return A;
	}

	private static void introsort(int[] A, int maxdepth) {
	    int n = A.length;
	    if (n <= 1) {
	        return;
	    }
	    else if (maxdepth == 0) {
	        HeapSort.sort(A, A.length);
	    }
	    else {
	    	//TODO something is wrong here!
	        int p = partition(A, 1, A.length);  //TODO Not sure about this.
	        
	        //The below makes two "sliced arrays" from the original.
	        int[] B = new int[p];
	        int[] C = new int[n-p];
			for (int i = 0; i < p; i++) {
				B[i] = A[i];
			}	
			for (int i = 0; i < p; i++) {
				C[i] = A[i + p];
			}
			
	        introsort(B, maxdepth - 1); //0:p
	        introsort(C, maxdepth - 1); //p+1:n
	    }
	}
	
	/**
	 * IMPORTANT NOTE: I haven't written this code. I copied it from:
	 * http://stackoverflow.com/questions/3305059
	 * (I just couldn't find a way to do it easily by myself, so I copied this.)
	 */
	private static int log2(int n){
	    if(n <= 0) throw new IllegalArgumentException();
	    return 31 - Integer.numberOfLeadingZeros(n);
	}
	
	/**
	 * IMPORTANT NOTE: I haven't written this code. I copied it from:
	 * stackoverflow.com/questions/26328296
	 * (My partition implementation didn't play nicely with introsort.)
	 */
	private static int partition(int[] array, int left, int right) {
		int pivotValue = array[(left + right) / 2]; //Value of middle element in array
		while (left <= right) {
			while (array[left] < pivotValue) {
				left++;
			}
			while (array[right] > pivotValue) {
				right++;
			}
			if (left <= right) {
				/* swap code */
				int temporary = array[left];
				array[left] = array[right];
				array[right] = temporary;

				left++;
				right--;
			}
		}
		return left;
	}

	
}
