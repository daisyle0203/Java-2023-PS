/**
 * 
 */
package introtojavabasics;

import java.util.*;

/**
 * @author DaisyLe
 *
 */
public class MoneytaryUnits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double num;
		System.out.print("Input: ");
		num = keyboard.nextDouble();
		// convert to int:
		int dollars = (int) num;
		int cents = (int) ((num * 100) % 100);
		int quarters = cents / 25;
		int remainder = cents % 25;
		int dimes = remainder / 10;
		remainder = remainder % 10;
		int nickels = remainder / 5;
		int pennies = remainder % 5;
		System.out.printf("Output:\t%d dollars%n \t%d quarters%n" + "\t%d dimes%n \t%d nickels%n \t%d pennies", dollars,
				quarters, dimes, nickels, pennies);

	}

}
