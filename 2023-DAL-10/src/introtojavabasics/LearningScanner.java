package introtojavabasics;
import java.util.Scanner;

public class LearningScanner {

	public static void main(String[] args) {
		// How to create a Scanner object
		Scanner input = new Scanner(System.in);
		int userNumber;
		// Ask the user to enter a decimal value
		// Please note that we are using "print"
		System.out.print("Please enter a decimal: ");
		//Then, we will take that decimal from the console and assign it to userNumber
		userNumber = input.nextInt();
		// Print something to the console
		System.out.println("Your number is: " + userNumber);
		//do a dummy return
		input.nextLine();
		System.out.print("Enter your name: ");
		// read input from the keyboard
		String name = input.nextLine();
		// print the name
		System.out.print("My name is: " + name);
		// close the scanner
		input.close();
	}

}
