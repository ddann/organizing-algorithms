package algorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


/**
* This is the class used for testing the algorithms' efficiency.
* It is used for using the different sorting/organizing algorithms in an easy way.
* It also handles the input reading.
* Note: It doesn't test whether an algorithm works or not.
*/
public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	
	private static File input = null;
	
	private static Scanner info = null;
	private static Scanner size = null;
	
	private static int[] list = null;
	private static String version =  null;
	
	
	private static boolean automatic =false;
	private static int[] list1, list2, list3, list4, list5, list6, list7, list8, list9, list10, list11, list12, list13, list14, list15, list16 = null;
	private static PrintWriter bubble= null;
	private static PrintWriter selection = null;
	private static PrintWriter insertion = null;
	private static PrintWriter quick = null;
	private static PrintWriter merge = null;
	private static PrintWriter heap = null;
	private static PrintWriter intro = null;
	
	
	/**
	 * The method to be called to use the class.
	 * Note: it is labeled main and has String[] args, but this is because of for being able to use the class directly.
	 * @param args call with 'null' (actually any String[] is fine too)
	 */
	public static void main(String[] args) {
		getInfo();
		askIfAutomatic();
		if (automatic) {
			automaticTest();
		}
		else {
			askFile();
			createArray();
			askAlgorithm();
		}
	}
	
	
	
	private static void getInfo() {
		try {
			info = new Scanner(new File("lists/list-info"));
		} catch (FileNotFoundException e) {
			System.out.println("Fatal error");
			System.out.println("The file containing the information about lists is missing or is damaged.");
			System.out.println("Check the file 'list-info' in ~/lists/.");
			return;
		}
		
		try {
			size= new Scanner(new File("lists/list-size"));
		} catch (FileNotFoundException e) {
			System.out.println("Fatal error");
			System.out.println("The file containing the information about the size of the lists is missing or is damaged.");
			System.out.println("Check the file 'list-size' in ~/lists/.");
			return;
		}
	}
	
	
	private static void askIfAutomatic() {
		System.out.println("Do you wish to test manually or to run the automatic predefined tests for the algortithms?");
		while (true) {
			System.out.println("'manual' for manual and 'automatic' for automatic.");
			version =  scanner.nextLine();
			if (version.equals("manual")) {
				break;
			}
			else if (version.equals("automatic")) {
				automatic = true;
				break;
			}
		}
	}
	
	
	
	private static void automaticTest() {
		//Important note this only works if the files that are supposed to exist exists.
		//I couldn't figure a cleaner way to do this.
		//There isn't a way to point towards a variable with "something" + "something". This is the reason for all this...
		//Note quick will make stack overflow if there is not enough memory for use.
		//(I mean for what the called methods does)
		intializationOfFiles();
		System.out.println("Loading the testing arrays.");
		createArrays();
		System.out.println("The automatic tests are now going on.");
		testAlgorithms();
		closeThem();
		System.out.println("The automatic testing has finished.");
	}
	
	private static void intializationOfFiles() {
		try {
			bubble = new PrintWriter(new File("results/Bubble sort"));
			selection = new PrintWriter(new File("results/Selection sort"));
			insertion = new PrintWriter(new File("results/Insertion sort"));
			quick = new PrintWriter(new File("results/Quicksort"));
			merge = new PrintWriter(new File("results/Merge sort"));
			heap = new PrintWriter(new File("results/Heapsort"));
			intro = new PrintWriter(new File("results/Introsort"));
		} catch (FileNotFoundException e) {
			System.out.println("ERROR\nA file(s) to write the test data is(are) missing (most likely this is the reason).");
		}
	}
	private static void closeThem() {
		bubble.close();
		selection.close();
		insertion.close();
		quick.close();
		merge.close();
		heap.close();
		intro.close();
	}
	
	
	private static void createArrays() {
		for (int i = 1; i < 17; i++) {
			input = new File("lists/to be ordered_" + i);
			version = String.valueOf(i);
			createArray();
			if (i==1) list1 = list;
			else if (i==2) list2 =list;
			else if (i==3) list3 =list;
			else if (i==4) list4 =list;
			else if (i==5) list5 =list;
			else if (i==6) list6 =list;
			else if (i==7) list7 =list;
			else if (i==8) list8 =list;
			else if (i==9) list9 =list;
			else if (i==10) list10 =list;
			else if (i==11) list11 =list;
			else if (i==12) list12 =list;
			else if (i==13) list13 =list;
			else if (i==14) list14 =list;
			else if (i==15) list15 =list;
			else if (i==16) list16 =list;
		}
	}
	
	private static void testAlgorithms() {
		testBubble();
		System.out.println("The testing of Bubble sort has finished.");
		
		testSelection();
		System.out.println("The testing of Selection sort has finished.");
		
		testInsertion();
		System.out.println("The testing of Insertion sort has finished.");
		
		testQuick();
		System.out.println("The testing of Quicksort has finished.");
		
		testMerge();
		System.out.println("The testing of Merge sort has finished.");
		
		testHeap();
		System.out.println("The testing of Heapsort has finished.");
		
		testIntro();
		System.out.println("The testing of Introsort has finished.");
	}
	
	private static void testBubble() {
		BubbleSort.sort(new int[]{2,8,4,3}); //Otherwise the JVM doesn't translate the javacode.
		for (int i = 1; i < 17; i++) {
			if (i==1) testBubble2(list1);
			else if (i==2) testBubble2(list2);
			else if (i==3) testBubble2(list3);
			else if (i==4) testBubble2(list4);
			else if (i==5) testBubble2(list5); //Takes quite a long time.
			else if (i==6) bubble.println();//testBubble2(list6);  Better to not even brother to try.
			else if (i==7) bubble.println();//testBubble2(list7);  Better to not even brother to try.
			else if (i==8) testBubble2(list8);
			else if (i==9) testBubble2(list9);
			else if (i==10) testBubble2(list10);
			else if (i==11) testBubble2(list11);
			else if (i==12) testBubble2(list12);
			else if (i==13) testBubble2(list13);
			else if (i==14) testBubble2(list14);
			else if (i==15) testBubble2(list15);
			else if (i==16) testBubble2(list16);
		}
	}
	private static void testBubble2(int[] tList) {
		long timeAtStarting = System.nanoTime();
		BubbleSort.sort(tList);
		long timeWhenEnded = System.nanoTime();
		bubble.println(timeWhenEnded-timeAtStarting);
	}
	private static void testSelection() {
		SelectionSort.sort(new int[]{2,8,4,3}); //Otherwise the JVM doesn't translate the javacode.
		for (int i = 1; i < 17; i++) {
			if (i==1) testSelection2(list1);
			else if (i==2) testSelection2(list2);
			else if (i==3) testSelection2(list3);
			else if (i==4) testSelection2(list4);
			else if (i==5) testSelection2(list5);
			else if (i==6) selection.println(); //testSelection2(list6); Takes a looong time. Too long.
			else if (i==7) selection.println();//testSelection2(list7); Better to not even brother to try.
			else if (i==8) testSelection2(list8);
			else if (i==9) testSelection2(list9);
			else if (i==10) testSelection2(list10);
			else if (i==11) testSelection2(list11);
			else if (i==12) testSelection2(list12);
			else if (i==13) testSelection2(list13);
			else if (i==14) testSelection2(list14);
			else if (i==15) testSelection2(list15);
			else if (i==16) testSelection2(list16);
		}
	}
	private static void testSelection2(int[] tList) {
		long timeAtStarting = System.nanoTime();
		SelectionSort.sort(tList);
		long timeWhenEnded = System.nanoTime();
		selection.println(timeWhenEnded-timeAtStarting);
	}
	private static void testInsertion() {
		InsertionSort.sort(new int[]{2,8,4,3}); //Otherwise the JVM doesn't translate the javacode.
		for (int i = 1; i < 17; i++) {
			if (i==1) testInsertion2(list1);
			else if (i==2) testInsertion2(list2);
			else if (i==3) testInsertion2(list3);
			else if (i==4) testInsertion2(list4);
			else if (i==5) testInsertion2(list5);
			else if (i==6) insertion.println();//testInsertion2(list6); Takes way too much time.
			else if (i==7) insertion.println();//testInsertion2(list7); Better to not even brother to try.
			else if (i==8) testInsertion2(list8);
			else if (i==9) testInsertion2(list9);
			else if (i==10) testInsertion2(list10);
			else if (i==11) testInsertion2(list11);
			else if (i==12) testInsertion2(list12);
			else if (i==13) testInsertion2(list13);
			else if (i==14) testInsertion2(list14);
			else if (i==15) testInsertion2(list15);
			else if (i==16) testInsertion2(list16);
		}
	}
	private static void testInsertion2(int[] tList) {
		long timeAtStarting = System.nanoTime();
		InsertionSort.sort(tList);
		long timeWhenEnded = System.nanoTime();
		insertion.println(timeWhenEnded-timeAtStarting);
	}
	private static void testQuick() {
		QuickSort.sort(new int[]{2,8,4,3}, 1, 4); //Otherwise the JVM doesn't translate the javacode.
		for (int i = 1; i < 17; i++) {
			if (i==1) testQuick2(list1);
			else if (i==2) testQuick2(list2);
			else if (i==3) testQuick2(list3);
			else if (i==4) testQuick2(list4);
			else if (i==5) testQuick2(list5);
			else if (i==6) testQuick2(list6); //May cause stack overflow (in the netbeans IDE At university it did due to less memory allocated).
			else if (i==7) quick.println();// testQuick2(list7); Would cause stack overflow for sure, needs about 4GBi (I guess). (JVM allocates to the program only a part of the total usable memory.)
			else if (i==8) testQuick2(list8);
			else if (i==9) testQuick2(list9);
			else if (i==10) testQuick2(list10);
			else if (i==11) testQuick2(list11);
			else if (i==12) testQuick2(list12);
			else if (i==13) testQuick2(list13);
			else if (i==14) testQuick2(list14);
			else if (i==15) testQuick2(list15);
			else if (i==16) testQuick2(list16);
		}
	}
	private static void testQuick2(int[] tList) {;
		try {
			long timeAtStarting = System.nanoTime();
			QuickSort.sort(tList, 1, tList.length); //May cause stack overflow, only with list6 (in the netbeans IDE At university it did due to less memory allocated).
			long timeWhenEnded = System.nanoTime();
			quick.println(timeWhenEnded-timeAtStarting);
		}
		catch (StackOverflowError e) {
			quick.println();
		}
	}
	private static void testMerge() {
		MergeSort.sort(new int[]{2,8,4,3}); //Otherwise the JVM doesn't translate the javacode.
		for (int i = 1; i < 17; i++) {
			if (i==1) testMerge2(list1);
			else if (i==2) testMerge2(list2);
			else if (i==3) testMerge2(list3);
			else if (i==4) testMerge2(list4);
			else if (i==5) testMerge2(list5);
			else if (i==6) testMerge2(list6);
			else if (i==7) testMerge2(list7);
			else if (i==8) testMerge2(list8);
			else if (i==9) testMerge2(list9);
			else if (i==10) testMerge2(list10);
			else if (i==11) testMerge2(list11);
			else if (i==12) testMerge2(list12);
			else if (i==13) testMerge2(list13);
			else if (i==14) testMerge2(list14);
			else if (i==15) testMerge2(list15);
			else if (i==16) testMerge2(list16);
		}
	}
	private static void testMerge2(int[] tList) {
		long timeAtStarting = System.nanoTime();
		MergeSort.sort(tList);
		long timeWhenEnded = System.nanoTime();
		merge.println(timeWhenEnded-timeAtStarting);
	}
	private static void testHeap() {
		HeapSort.sort(new int[]{2,8,4,3}, 4); //Otherwise the JVM doesn't translate the javacode.
		for (int i = 1; i < 17; i++) {
			if (i==1) testHeap2(list1);
			else if (i==2) testHeap2(list2);
			else if (i==3) testHeap2(list3);
			else if (i==4) testHeap2(list4);
			else if (i==5) testHeap2(list5);
			else if (i==6) testHeap2(list6);
			else if (i==7) testHeap2(list7);
			else if (i==8) testHeap2(list8);
			else if (i==9) testHeap2(list9);
			else if (i==10) testHeap2(list10);
			else if (i==11) testHeap2(list11);
			else if (i==12) testHeap2(list12);
			else if (i==13) testHeap2(list13);
			else if (i==14) testHeap2(list14);
			else if (i==15) testHeap2(list15);
			else if (i==16) testHeap2(list16);
		}
	}
	private static void testHeap2(int[] tList) {
		long timeAtStarting = System.nanoTime();
		HeapSort.sort(tList, tList.length);
		long timeWhenEnded = System.nanoTime();
		heap.println(timeWhenEnded-timeAtStarting);
	}
	private static void testIntro() {
		IntroSort.sort(new int[]{2,8,4,3}); //Otherwise the JVM doesn't translate the javacode.
		for (int i = 1; i < 17; i++) {
			if (i==1) testIntro2(list1);
			else if (i==2) testIntro2(list2);
			else if (i==3) testIntro2(list3);
			else if (i==4) testIntro2(list4);
			else if (i==5) testIntro2(list5);
			else if (i==6) testIntro2(list6);
			else if (i==7) testIntro2(list7);
			else if (i==8) testIntro2(list8);
			else if (i==9) testIntro2(list9);
			else if (i==10) testIntro2(list10);
			else if (i==11) testIntro2(list11);
			else if (i==12) testIntro2(list12);
			else if (i==13) testIntro2(list13);
			else if (i==14) testIntro2(list14);
			else if (i==15) testIntro2(list15);
			else if (i==16) testIntro2(list16);
		}
	}
	private static void testIntro2(int[] tList) {
		long timeAtStarting = System.nanoTime();
		IntroSort.sort(tList);
		long timeWhenEnded = System.nanoTime();
		intro.println(timeWhenEnded-timeAtStarting);
	}
	
	
	
	private static void askFile() {
		while (true) {
			System.out.println("Which 'to be ordered_x' to use? (x is the input 'version') 'help' for help.");
			version =  scanner.nextLine();
			input = new File("lists/to be ordered_" + version);
			
			
			if (version.equals("help")) {
				System.out.println("Options:");
				System.out.println("	'help' for help. These lines are all the help you get.");
				while (info.hasNextLine()) {
					System.out.println("	" + info.nextLine());
				}
			}
			else if (input.exists()) {
				break;
			}
			else System.out.println("Wrong 'x, there doesn't exists any file like that!\n");
		}
	}
	
	private static void createArray() {
		int amount = 0;
		while (size.hasNextInt()) {
			if (version.equals(String.valueOf(size.nextInt()))) {
				amount = size.nextInt();
				break;
			}
		}
		list = new int[amount];
		
		try {
			Scanner fileScanner= new Scanner(input);
			for (int i = 0; i < amount; i++) {
				list[i] = fileScanner.nextInt();
			}
			fileScanner.close();
		} catch (Exception e) {
			//TODO Maybe something. For now nothing because the file 7 doesn't exist by default.
		}
	}
	
	private static void askAlgorithm() {
		while (true) {
			System.out.println("Which algorithm to test?\n'help' for options and 'stop' for stopping.");
			String algorithm = scanner.nextLine();
			
			if (algorithm.equals("stop")) {
				System.out.println("This process is about to end. Indeed.");
				break;
			}
			else if (algorithm.equals("help")) {
				System.out.println("The different options:");
				System.out.println("	'help' for seeing these lines.");
				System.out.println("	'stop' for stooping the testing.");
				System.out.println("	'bubble' for BubbleSort.");
				System.out.println("	'selection 'for SelectionSort.");
				System.out.println("	'insertion' for InsertionSort.");
				System.out.println("	'quick' for QuickSort.");
				System.out.println("	'merge' for MergeSort.");
				System.out.println("	'heap' for HeapSort.");
				System.out.println("	'intro' for IntroSort.");
			}
			else if (algorithm.equals("bubble")) {
				long timeAtStarting = System.nanoTime();
				BubbleSort.sort(list);
				long timeWhenEnded = System.nanoTime();
				
				System.out.println("The elapsed time was (in ns): " + (timeWhenEnded-timeAtStarting) +"\n");
			}
			else if (algorithm.equals("selection")) {
				long timeAtStarting = System.nanoTime();
				SelectionSort.sort(list);
				long timeWhenEnded = System.nanoTime();
				
				System.out.println("The elapsed time was (in ns): " + (timeWhenEnded-timeAtStarting) +"\n");
			}
			else if (algorithm.equals("insertion")) {
				long timeAtStarting = System.nanoTime();
				InsertionSort.sort(list);
				long timeWhenEnded = System.nanoTime();
				
				System.out.println("The elapsed time was (in ns): " + (timeWhenEnded-timeAtStarting) +"\n");
			}
			else if (algorithm.equals("quick")) {
				long timeAtStarting = System.nanoTime();
				QuickSort.sort(list, 1, list.length);
				long timeWhenEnded = System.nanoTime();
				
				System.out.println("The elapsed time was (in ns): " + (timeWhenEnded-timeAtStarting) +"\n");
			}
			else if (algorithm.equals("merge")) {
				long timeAtStarting = System.nanoTime();
				MergeSort.sort(list);
				long timeWhenEnded = System.nanoTime();
				
				System.out.println("The elapsed time was (in ns): " + (timeWhenEnded-timeAtStarting) +"\n");
			}
			else if (algorithm.equals("heap")) {
				long timeAtStarting = System.nanoTime();
				HeapSort.sort(list, list.length);
				long timeWhenEnded = System.nanoTime();
				
				System.out.println("The elapsed time was (in ns): " + (timeWhenEnded-timeAtStarting) +"\n");
			}
			else if (algorithm.equals("intro")) {
				long timeAtStarting = System.nanoTime();
				IntroSort.sort(list);
				long timeWhenEnded = System.nanoTime();
				
				System.out.println("The elapsed time was (in ns): " + (timeWhenEnded-timeAtStarting) +"\n");
			}
			else System.out.println("Wrong name!");
		}
	}

}
