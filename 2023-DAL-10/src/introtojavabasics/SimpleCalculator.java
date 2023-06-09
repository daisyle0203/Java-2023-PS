package introtojavabasics;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// floating point values
		double num1,num2, result;
		System.out.print("Please enter the first number: ");
		num1 = input.nextDouble();
		System.out.print("Please enter the second number: ");
		num2 = input.nextDouble();
		// Addition
		result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
		// Subtractor
		result = num1 - num2;
		System.out.println(num1 + " - " + num2 + " = " + result);
		// Multiplication
		result = num1 * num2;
		System.out.println(num1 + " * " + num2 + " = " + result);
		// Division: ÷ Option /
		result = num1 / num2;
		System.out.println(num1 + " ÷ " + num2 + " = " + result);
		// Modulus
		result = num1 % num2;
		System.out.println(num1 + " % " + num2 + " = " + result);
		// close scanner
		input.close();
		
	}

}
