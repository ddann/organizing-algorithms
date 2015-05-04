package listGenerator;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		while (true) {
			System.out.println("Amount of numers in the list. Don't overdo it!");
			int amount =  scanner.nextInt(); //TODO react right if the user doesn't give a number.
			scanner.nextLine(); //Otherwise because that nextLine() only takes the integer part the "line change" would come automatically next.
			
			System.out.println("Number of 'x' for the file's name (to be ordered_x). I'm not checking which already exist for you, "
					+ "if a file's name to be written in is the same that an existent, the existent will be overwritten.)");
			int version =  scanner.nextInt(); //TODO react right if the user doesn't give a number.
			scanner.nextLine(); //Otherwise because that nextLine() only takes the integer part the "line change" would come automatically next.
			
			
			try {
				PrintWriter writer = new PrintWriter("to be ordered_" + version);
				for (int i = 0; i < amount; i++) {
					writer.write(random.nextInt() +"");
					writer.write(" ");
				}
				writer.close();
			} catch (FileNotFoundException e) {}
			
			System.out.println("Created list with ramdom numbers with " + amount + " elements. By name: 'to be ordered_" + version +"'");
			System.out.println("Do you wish to create another one? 'yes' for yes and everything else for no.");
			if (!scanner.nextLine().equals("yes")) break;
		}
		
		scanner.close();
	}

}
