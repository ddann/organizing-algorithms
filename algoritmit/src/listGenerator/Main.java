package listGenerator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that provides a textual interface and the functions with to be able to create test-lists to test the algorithms of the project.
 */
public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	private static Random random = new Random();
	
	private  static int amount =  0;
	private static String version =  null;
	
	private static PrintWriter info = null;
	private static PrintWriter size = null;
	private static Scanner infoR = null;
	private static Scanner sizeR = null;

	
	/**
	 * The method to be called to use the class.
	 * Note: it is labeled main and has String[] args, but this is because of for being able to use the class directly.
	 * @param args call with 'null' (actually any String[] is fine too)
	 */
	public static void main(String[] args) {
		intializationOfFiles();
		createLists();
		end();
	}
	
	
	
	private static void intializationOfFiles() {
		try {
			info = new PrintWriter(new File("lists/list-info"));
		} catch (FileNotFoundException e) {
			System.out.println("Fatal error");
			System.out.println("The file containing the information about lists is missing or is damaged.");
			System.out.println("Check the file 'list-info' in ~/lists/.");
			scanner.close();
			return;
		}
		try {
			size= new PrintWriter(new File("lists/list-size"));
		} catch (FileNotFoundException e) {
			System.out.println("Fatal error");
			System.out.println("The file containing the information about the size of the lists is missing or is damaged.");
			System.out.println("Check the file 'list-size' in ~/lists/.");
			scanner.close();
			return;
		}
		try {
			infoR = new Scanner(new File("lists/list-info"));
		} catch (FileNotFoundException e) {
			System.out.println("Fatal error");
			System.out.println("The file containing the information about lists is missing or is damaged.");
			System.out.println("Check the file 'list-info' in ~/lists/.");
			scanner.close();
			return;
		}
		try {
			sizeR = new Scanner(new File("lists/list-size"));
		} catch (FileNotFoundException e) {
			System.out.println("Fatal error");
			System.out.println("The file containing the information about the size of the lists is missing or is damaged.");
			System.out.println("Check the file 'list-size' in ~/lists/.");
			infoR.close();
			scanner.close();
			return;
		}
	}
	
	
	private static void createLists() {
		while (true) {
			askAmountOfNumbers();
			askFilename();
			askTypeAndCreate();
			
			System.out.println("Do you wish to create another one? 'yes' for yes and everything else for no.\n");
			if (!scanner.nextLine().equals("yes")) break;
		}
	}
	
	private static void askAmountOfNumbers() {
		while (true) {
			System.out.println("Amount of numbers in the list. Don't overdo it!");
			String t = scanner.nextLine();
			try {
				if (Long.valueOf(t) < 1 ||Long.valueOf(t) > Integer.MAX_VALUE) {
					System.out.println("You must give a number, and one that is within the 32-bit integer range and is positive.");
					System.out.println("Thought keep in mind that still a large list may be of a huge size.\n");
				}
				else {
					amount =  Integer.valueOf(t);
					break;
				}
			}
			catch (NumberFormatException e) {
				System.out.println("Good job giving something not even close to an 32-bit integer!\n");
			}
		}
	}
	
	private static void askFilename() {
		while (true) {
			System.out.println("Number (or non-number string if desired) of 'x' for the file's name 'to be ordered_x'. I'm not checking which already exist for you."
					+ "\nIf a file's name to be written in is the same that an existent, the existent will be overwritten.");
			version = scanner.nextLine();
			if (version.length() >10) {
				System.out.println("Are you sure you wish to name it so long? Do you wish rename? 'yes' for yes");
				if (!scanner.nextLine().equals("yes")) break;
			}
			else if (version.contains("!") || version.contains("?") || version.contains("/") || version.contains("*")) {
				System.out.println("Your input has special elemnts that may be problematic in at least some operating systems: Do you wish rename? 'yes' for yes");
				if (!scanner.nextLine().equals("yes")) break;
			}
			else break;
		}
	}
	
	private static void askTypeAndCreate() {
		String type = null;
		while (true) {
			System.out.println("What kind of type of list would you wish to create.\n 'help' for listing possible types.");
			type =  scanner.nextLine();
			if (type.equals("help")) {
				System.out.println("Possible types:");
				System.out.println("	'random' for a list with random numbers in a random order. Values within the full range of a 32-bit Integer.");
				System.out.println("	'ordered' for a list with an already ordered set of numbers. The numbers are from 0 to 'the given amount'-1.");
				System.out.println("	'reverse' for a list with for a set of numbers in a reverse order. The numbers are from 0 to '-the given amount'+1.");
				System.out.println("	'same' for a list in which all elements are the same. The used number is 100.");
				System.out.println("");
			}
			else if (type.equals("random")) {
				try {
					PrintWriter writer = new PrintWriter("/lists/to be ordered_" + version);
					for (int i = 0; i < amount; i++) {
						writer.write(random.nextInt() +"");
						writer.write(" ");
					}
					writer.close();
				} catch (FileNotFoundException e) {}
				infoWriting(" random numbers in random order.");
				System.out.println("Created list with ramdom numbers with a total of " + amount + " elements. By name: 'to be ordered_" + version +"'");
				break;
			}
			else if (type.equals("ordered")) {
				try {
					PrintWriter writer = new PrintWriter("to be ordered_" + version);
					for (int i = 0; i < amount; i++) {
						writer.write(i +"");
						writer.write(" ");
					}
					writer.close();
				} catch (FileNotFoundException e) {}
				infoWriting(" numbers already ordered. Values from 0 to " + (amount-1) +".");
				System.out.println("Created a list with already ordered elements with a total of " + amount + " elements. By name: 'to be ordered_" + version +"'");
				break;
			}
			else if (type.equals("reverse")) {
				try {
					PrintWriter writer = new PrintWriter("to be ordered_" + version);
					for (int i = 0; i > -amount; i--) {
						writer.write(i +"");
						writer.write(" ");
					}
					writer.close();
				} catch (FileNotFoundException e) {}
				infoWriting(" numbers in a reverse order. Values from 0 to -" + (amount-1) +".");
				System.out.println("Created list with the numbers in a reverse order with a total of " + amount + " elements. By name: 'to be ordered_" + version +"'");
				break;
			}
			else if (type.equals("same")) {
				try {
					PrintWriter writer = new PrintWriter("to be ordered_" + version);
					for (int i = 0; i < amount; i++) {
						writer.write("100 ");
					}
					writer.close();
				} catch (FileNotFoundException e) {}
				infoWriting(" numers that all are the same. The number is '100'.");
				System.out.println("Created a list in wich all elemets are '100' with a total of " + amount + " elements. By name: 'to be ordered_" + version +"'");
				break;
			}
			else System.out.println("That is not a type fo a list!\n");
		}
	}
	
	private static void infoWriting(String inf) {
		while (infoR.hasNextLine()) {
			info.println(infoR.nextLine());
		}
		info.println("'" + version + "' for list with " + amount + inf);
		
		while (sizeR.hasNextLine()) {
			size.println(sizeR.nextLine());
		}
		size.println(version + " " + amount);
	}
	
	
	private static void end() {
		scanner.close();
		info.close();
		size.close();
		infoR.close();
		sizeR.close();
		System.out.println("End of 'list-creating process'.");
	}

}
