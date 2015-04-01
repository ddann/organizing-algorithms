package algorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


/**
* The main class of the project.
* It is used for using the different sorting/organizing algorithms in an easy way.
* It also handles the input reading and writing the output.
*/
public class Main {
	
	private File input = new File("to be ordered");

	
	
	public static void main(String[] args) {
		//TODO Implementation to be able to use the classes + read the data (just calling loadInput).
	}

	
	private void loadInput() {
		//TODO Some way of storing the input in a rational way.
		Scanner scanner = null;
		
		if (!input.exists()) {
			try {
				scanner= new Scanner(input);
			} catch (Exception e) {
				//TODO Maybe something.
			}
		}
		
		scanner.close();
	}
	
	private void saveOutput(int[] output) {
		try {
			PrintWriter writer = new PrintWriter(input);
			//TODO Write the output
			writer.close();
		} catch (FileNotFoundException e) {}
	}
}
