/**
 * 
 */
package introtojavabasics;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author DaisyLe
 *
 */
public class PA_303_5_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Write a program that uses nested for loops to print a multiplication table.

//		for (int i = 1; i <= 12; i++) {
//			for (int j = 1; j <= 12; j++) {
//				System.out.print(i*j +"\t");
//			}
//			System.out.println();
//		}

		/*
		 * Write a program that prompts the user to enter two positive integers, and
		 * find their greatest common divisor (GCD). Examples: Enter 2 and 4. The gcd is
		 * 2. Enter 16 and 24. The gcd is 8. How do you find the gcd? Name the two input
		 * integers n1 and n2. You know number 1 is a common divisor, but it may not be
		 * the gcd. Check whether k (for k = 2, 3, 4, and so on) is a common divisor for
		 * n1 and n2, until k is greater than n1 or n2.
		 */

		Scanner input = new Scanner(System.in);

		// Prompt the user to enter two positive integers
//        System.out.print("Enter the first positive integer: ");
//        int n1 = input.nextInt();
//
//        System.out.print("Enter the second positive integer: ");
//        int n2 = input.nextInt();
//
//        // Find the GCD
//        int gcd = 1; // Initial assumption
//
//        // Check for common divisors from 2 to the smaller of the two numbers
//        int k = 2;
//        while (k <= n1 && k <= n2) {
//            if (n1 % k == 0 && n2 % k == 0) {
//                gcd = k; // Update the GCD
//            }
//            k++;
//        }
//
//        // Display the result
//        System.out.println("The greatest common divisor (GCD) of " + n1 + " and " + n2 + " is: " + gcd);

		/*
		 * Suppose the tuition for a university is $10,000 for the current year and
		 * increases by 7 percent every year. In how many years will the tuition be
		 * doubled?
		 */

		double currentTuition = 10000;
		double doubledTuition = currentTuition * 2.0;
		int year = 0;

		while (currentTuition < doubledTuition) {
			currentTuition += currentTuition * 0.07; // Increase tuition by 7 percent each year
			year++;
		}

		System.out.println("The tuition will be doubled in " + year + " years.");
	}

}
