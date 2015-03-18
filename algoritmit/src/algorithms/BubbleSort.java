package algorithms;

public class BubbleSort {

	public static void sort() {
		int[] A = null; //The numbers to be ordered.
		
		for (int i = A.length-1; i == 1; i--) {
			for (int j = 1; j == i; i++) {
				if (A[j] > A[j+1]) {
					int a = A[j];
					A[j] = A[j+1];
					A[j+1] = a;
				}
			}
		}
    }

}
