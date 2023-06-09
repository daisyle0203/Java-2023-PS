package com.perscholas.java_basics;
import java.text.DecimalFormat;

public class JavaBasicsClass {

	public static void main(String[] args) {
		// TODO: Write a program that declares two integer variables, assigns an integer to each, and adds them together. 
		// Assign the sum to a variable. Print out the result.
		
		int num1;
		int num2;
		
		num1 = 300;
		num2 = 666;
		
		int sum;
		
		sum = num1 + num2;
		
		System.out.println("sum: " + sum);
		
		// TODO: Write a program that declares two double variables, assigns a number to each, and adds them together. 
		// Assign the sum to a variable. Print out the result.
		double decimalNum1;
		double decimalNum2;
		
		decimalNum1 = 1.4567;
		decimalNum2 = 1.6789;
		
		double doubleSum;
		
		doubleSum = decimalNum1 + decimalNum2;
		System.out.println("doubleSum: " +doubleSum);
		

		// TODO: Write a program that declares an integer variable and a double variable, assigns numbers to each, and adds them together. 
		// Assign the sum to a variable. Print out the result. What variable type must the sum be?
		
		int num3;
		double decimalNum3;
		
		num3 = 576;
		decimalNum3 = 3.452;
		
		double sum3;
		sum3 = num3 + decimalNum3;
		System.out.println("sum3: " +sum3);

		// TODO: Write a program that declares two integer variables, assigns an integer to each, and divides the larger number by the smaller number. 
		// Assign the result to a variable. Print out the result. Now change the larger number to a decimal. What happens? What corrections are needed?
		
		int num4;
		int num5;
		
		num4 = 6;
		num5 = 3;
		
		int largerNumDivison;
		
		largerNumDivison = num4 / num5;
		System.out.println("largerNumDivison: " + largerNumDivison);
		
		double decimalNum4;
		
		decimalNum4 = 9.5;
		
		double decimalDivison;
		
		decimalDivison = decimalNum4 / num3;
		System.out.println("decimalDivison: " + decimalDivison);
		
		// TODO: Write a program that declares two double variables, assigns a number to each, and divides the larger by the smaller number. 
		// Assign the result to a variable. Print out the result. Now, cast the result to an integer. Print out the result again.
		double decimalNum5;
		double decimalNum6;
		
		decimalNum5 = 4.4567;
		decimalNum6 = 2.6789;
		
		double doubleDivision;
		
		doubleDivision = decimalNum5 / decimalNum6;
		System.out.println("doubleDivision: " + doubleDivision);
		
		int intDivision = (int) doubleDivision;
		System.out.println("intDivision: " + intDivision);
		
		
		
		// TODO: Write a program that declares two integer variables, x and y, and assigns the number 5 to x and the number 6 to y. 
		// Declare a variable q and assign y/x to it and print q. Now, cast y to a double and assign it to q. Print q again.
		
		int x;
		int y;
		
		x = 5;
		y = 6;
		
		int q;
		
		q = y/x;
		System.out.println("q as int: " + q);
		
		q = (int) ((double) y / x);
		System.out.println("q as double cast to int: " + q);

		// TODO: Write a program that declares a named constant and uses it in a calculation. Print the result.
		final double PI = 3.14159;
        double radius = 5.0;
        double area = PI * radius * radius;

        System.out.println("The area of a circle with radius " + radius + " is " + area);

		// TODO: Write a program where you create three variables that represent products at a cafe. 
		// The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
		// Assign prices to each product. 
		// Create two more variables called subtotal and totalSale
        // Complete an “order” for three items of the first product, four items of the second product, and two items of the third product.
		// Add them all together to calculate the subtotal. Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount. 
		// Be sure to format the results to two decimal places.

        double coffee = 2.99;
        double cappuccino = 3.49;
        double espresso = 3.99;

        double subtotal = (coffee * 3) + (cappuccino * 4) + (espresso * 2);
        final double SALES_TAX = 0.07;
        double totalSale = subtotal + (subtotal * SALES_TAX);

        DecimalFormat df = new DecimalFormat("#.00");
 
        System.out.println("Subtotal: " + df.format(subtotal));
        System.out.println("Total Sale: " + df.format(totalSale));
	}

}
