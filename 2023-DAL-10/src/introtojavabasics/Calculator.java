package introtojavabasics;

public class Calculator {

	public static void main(String[] args) {
		// TODO Calculator - Create a program that adds, subtract, 
		// divides and multiplies two integers and displays the numbers the those four results
		
		int num1;
		int num2;
		
		num1 = 9;
		num2 = 6;
		
		int sum;
		sum = num1 + num2;		
		
		int subtraction;
		subtraction = num1 - num2;
		
		int division;
		division = num1 / num2;
		
		int multiplication;
		multiplication = num1 * num2;
		
		System.out.println("Sum of num1 and num2 is " + sum + ".");
		
		System.out.println("Substraction of num1 and num2 is " + subtraction + ".");
		
		System.out.println("Division of num1 and num2 is " + division + ".");
		
		System.out.println("Multiplication of num1 and num2 is " + multiplication + ".");
	}

}
