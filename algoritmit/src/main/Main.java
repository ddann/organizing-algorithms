package main;

import java.util.Scanner;

/**
 * The main class of the project.
 * This is used for accessing to the other two "Main-classes"; the one to test the algorithms and the one to create lists.
 * Thought as long as one has the original src with the project configuration the other "Main-classes" can be used directly.
 */
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What would you wish to do?\nYou can test the algorithms' efficiency or create a list for testing.");
		
		String operation = null;
		while (true) {
			System.out.println("Please answer 'test' for the testing or 'create' for creating arrays.");
			operation = scanner.nextLine();
			if (operation.equals("test")) {
				System.out.println("Starting the algorithms test 'process'.");
				algorithms.Main.main(null);
				break;
			}
			else if (operation.equals("create")) {
				System.out.println("Starting the list creating 'process'.");
				listGenerator.Main.main(null);
				break;
			}
		}
		scanner.close();
	}

}
