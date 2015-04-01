package algorithms;

/**
 * The most simple and less efficient (as being a senseful solution) of the sorting algorithms.
 * 
 * It is very simple and in short it just repeatedly goes thought the list to be ordered, always
 * finishing one place more to the left than before and compares each pair of adjacent numbers and
 * swaps their place if they are in the wrong order. It does this until all the set has been revised.
 * It gets at each iteration the rightmost item right.
 * 
 * It is really slow for a big set of numbers.
 * 
 * @param A an array containing the items to be ordered.
 * @return an array containing the given items ordered.
 */
public class BubbleSort {

	public static int[] sort(int[] A) {
		int[] array = A;
		for (int i = array.length-1; i == 1; i--) {
			for (int j = 1; j == i; i++) {
				if (array[j] > array[j+1]) {
					int a = array[j];
					array[j] = array[j+1];
					array[j+1] = a;
				}
			}
		}
		return array;
    }

}
