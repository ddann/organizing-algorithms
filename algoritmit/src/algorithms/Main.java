package algorithms;

import java.io.File;

import java.util.Scanner;


/**
* The main class of the project.
* It is used for using the different sorting/organizing algorithms in an easy way.
* It also handles the input reading.
* Note: It doesn't test whether an algorithm works or not.
* Ps. T-O-D-O's are just an extra. These features aren't needed for neither the project nor the course.
*/
public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	private static File input = null;
	private static int[] list = null;
	
	
	
	public static void main(String[] args) {
		while (true) {
		System.out.println("Which 'to be ordered_x' to use? (x is the input 'version')  0 for help.");
		int version =  scanner.nextInt(); //TODO react right if the user doesn't give a number.
		input = new File("to be ordered_" + version);
		
		
		//Cannot use for some reason "when static" the class' methods in Java.
		//list = new int[this.getAmmountOfNumbers(0)];
		//this.loadInput();
		if (version == 0) {
			System.out.println("0 for help. These lines are all the help you get..");
			System.out.println("1 for list with 10 random numbers in random order.");
			System.out.println("2 for list with 100 random numbers in random order.");
			System.out.println("3 for list with 1000 random numbers in random order.");
			System.out.println("4 for list with 10000 random numbers in random order.");
			System.out.println("5 for list with 100000 random numbers in random order.");
			System.out.println("6 for list with 1000000 random numbers in random order.");
			System.out.println("7 for list with 10000000 random numbers in random order.");
		}
		else if (version == 1) {
			list = new int[10];
			break;
		}
		else if (version == 2) {
			list = new int[100];
			break;
		}
		else if (version == 3) {
			list = new int[1000];
			break;
		}
		else if (version == 4) {
			list = new int[10000];
			break;
		}
		else if (version == 5) {
			list = new int[100000];
			break;
		}
		else if (version == 6) {
			list = new int[1000000];
			break;
		}
		else if (version == 7) {
			list = new int[10000000];
			break;
		}
		else System.out.println("Wrong number!");
		}
		
		try {
			Scanner fileScanner= new Scanner(input);
			for (int i = 0; i < list.length; i++) {
				list[i] = fileScanner.nextInt();
			}
			fileScanner.close();
		} catch (Exception e) {
			//TODO Maybe something. For now nothing.
		}
		
		//Still impossible to call methods...
		//Otherwise because that nextLine() only takes the integer part the "line change" would come automatically and the first run would end in "Wrong name!"
		scanner.nextLine();
		while (true) {
			//TODO TO BE DONE: Write the elapsed times down and make at least 3 runs consecutively (and skip at least the first).
			//Keep the printing to console thought.
			System.out.println("Which algorithm to test? 'help' for options and 'stop' for stopping.");
			String algorithm = scanner.nextLine();
			
			if (algorithm.equals("stop")) {
				System.out.println("This process is about to end. Indeed.");
				break;
			}
			else if (algorithm.equals("help")) {
				System.out.println("help for seeing these lines.");
				System.out.println("stop for stooping the testing.");
				System.out.println("bubble for BubbleSort.");
				System.out.println("selection for SelectionSort.");
				System.out.println("insertion for InsertionSort.");
				System.out.println("quick for QuickSort.");
				System.out.println("merge for MergeSort.");
				System.out.println("heap for HeapSort.");
			}
			else if (algorithm.equals("bubble")) {
				long timeAtStarting = System.nanoTime();
				BubbleSort.sort(list);
				long timeWhenEnded = System.nanoTime();
				
				System.out.println("The elapsed time was (in ns): " + (timeWhenEnded-timeAtStarting));
			}
			else if (algorithm.equals("selection")) {
				long timeAtStarting = System.nanoTime();
				SelectionSort.sort(list);
				long timeWhenEnded = System.nanoTime();
				
				System.out.println("The elapsed time was (in ns): " + (timeWhenEnded-timeAtStarting));
			}
			else if (algorithm.equals("insertion")) {
				long timeAtStarting = System.nanoTime();
				InsertionSort.sort(list);
				long timeWhenEnded = System.nanoTime();
				
				System.out.println("The elapsed time was (in ns): " + (timeWhenEnded-timeAtStarting));
			}
			else if (algorithm.equals("quick")) {
				long timeAtStarting = System.nanoTime();
				QuickSort.sort(list, 1, list.length);
				long timeWhenEnded = System.nanoTime();
				
				System.out.println("The elapsed time was (in ns): " + (timeWhenEnded-timeAtStarting));
			}
			else if (algorithm.equals("merge")) {
				long timeAtStarting = System.nanoTime();
				MergeSort.sort(list);
				long timeWhenEnded = System.nanoTime();
				
				System.out.println("The elapsed time was (in ns): " + (timeWhenEnded-timeAtStarting));
			}
			else if (algorithm.equals("heap")) {
				long timeAtStarting = System.nanoTime();
				HeapSort.sort(list, list.length);
				long timeWhenEnded = System.nanoTime();
				
				System.out.println("The elapsed time was (in ns): " + (timeWhenEnded-timeAtStarting));
			}
			else System.out.println("Wrong name!");
		}
	}

	/**
	 * Not in use
	 */
	/**
	private static void loadInput() {
		try {
			scanner= new Scanner(input);
			for (int i=0; i<0; i++) {
				list[i] = scanner.nextInt();
			}
		} catch (Exception e) {
			//TODO Maybe something. For now nothing.
		}
		scanner.close();
	}
	*/
	
	/**
	 * Not in use
	 */
	/**
	private static int getAmmountOfNumbers(int version) {
		if (version == 1) {
			return 10;
		}
		else if (version == 2) {
			return 100;
		}
		else return 0; //Actually there would be some kind of a problem instead...
		
	}
	*/
}
