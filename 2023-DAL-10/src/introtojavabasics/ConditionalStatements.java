/**
 * 
 */
package introtojavabasics;

import java.util.Scanner;

/**
 * @author DaisyLe
 *
 */
public class ConditionalStatements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Write a program that declares 1 integer variable x, and then assigns 7 to it.
		 * Write an if statement to print out “Less than 10” if x is less than 10.
		 * Change x to equal 15, and notice the result (console should not display
		 * anything).
		 */

//		int x = 15;
//		if (x < 10) {
//			System.out.println("Less than 10");
//		}

		/*
		 * Write a program that declares 1 integer variable x, and then assigns 7 to it.
		 * Write an if-else statement that prints out “Less than 10” if x is less than
		 * 10, and “Greater than 10” if x is greater than 10. Change x to 15 and notice
		 * the result.
		 */

//		int x = 15;
//		if (x < 10) {
//			System.out.println("Less than 10");
//		} else {
//			System.out.println("Greater than 10");
//		}

		/*
		 * Write a program that declares 1 integer variable x, and then assigns 15 to
		 * it. Write an if-else-if statement that prints out “Less than 10” if x is less
		 * than 10; “Between 10 and 20” if x is greater than 10 but less than 20, and
		 * “Greater than or equal to 20” if x is greater than or equal to 20. Change x
		 * to 50 and notice the result.
		 */

//		int x = 50;
//		if (x < 10) {
//			System.out.println("Less than 10");
//		} else if (x >= 10 && x < 20){
//			System.out.println("Between 10 and 20");
//		} else {
//			System.out.println("Greater than or equal to 20");
//		}

		/*
		 * Write a program that declares 1 integer variable x, and then assigns 15 to
		 * it. Write an if-else statement that prints “Out of range” if the number is
		 * less than 10 or greater than 20 and prints “In range” if the number is
		 * between 10 and 20 (including equal to 10 or 20). Change x to 5 and notice the
		 * result.
		 */

//		int x = 5;
//		if (x < 10 || x > 20) {
//			System.out.println("Out of range");
//		} else {
//			System.out.println("In range");
//		}

		/*
		 * Write a program that uses if-else-if statements to print out grades A, B, C,
		 * D, F, according to the following criteria: A: 90-100 B: 80-89 C: 70-79 D:
		 * 60-69 F: <60 Use the Scanner class to accept a number score from the user to
		 * determine the letter grade. Print out “Score out of range” if the score is
		 * less than 0 or greater than 100.
		 */

//		Scanner input = new Scanner(System.in);
//		int score;
//		System.out.print("Enter a number score: ");
//		score = input.nextInt();
//		input.close();
//		
//		if (score  < 0 || score > 100) {
//			System.out.println("Score out of range");
//			return;
//		}
//		
//		if (score >= 90 && score < 100) {
//			System.out.println("A");
//		} else if (score >= 80 && score < 89){
//			System.out.println("B");
//		} else if (score >= 70 && score < 79){
//			System.out.println("C");
//		} else if (score >= 60 && score < 69){
//			System.out.println("D");
//		} else {
//			System.out.println("F");
//		}

		/*
		 * Write a program that accepts an integer between 1 and 7 from the user. Use a
		 * switch statement to print out the corresponding weekday. Print “Out of range”
		 * if the number is less than 1 or greater than 7. Do not forget to include
		 * “break” statements in each of your cases.
		 */
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter a number between 1 and 7: ");
//		int dayOfWeek = input.nextInt();
//
//		switch (dayOfWeek) {
//		case 1:
//			System.out.println("Monday");
//			break;
//		case 2:
//			System.out.println("Tuesday");
//			break;
//		case 3:
//			System.out.println("Wednesday");
//			break;
//		case 4:
//			System.out.println("Thursday");
//			break;
//		case 5:
//			System.out.println("Friday");
//			break;
//		case 6:
//			System.out.println("Saturday");
//			break;
//		case 7:
//			System.out.println("Sunday");
//			break;
//		default:
//			System.out.println("Out of range");
//			break;
//		}

		/*
		 * Create a program that lets the users input their filing status and income.
		 * Display how much tax the user would have to pay according to status and
		 * income. The U.S. federal personal income tax is calculated based on the
		 * filing status and taxable income. There are four filing statuses: Single,
		 * Married Filing Jointly, Married Filing Separately, and Head of Household. The
		 * tax rates for 2009 are shown below.
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your filing status: ");
		System.out.println("1 - Single");
		System.out.println("2 - Married Filing Jointly or Qualifying Window(er)");
		System.out.println("3 - Married Filing Separately");
		System.out.println("4 - Head of Household");
		int filingStatus = input.nextInt();

		System.out.println("Enter your taxable income: ");
		double taxableIncome = input.nextDouble();

		double tax = 0;
		switch (filingStatus) {
		case 1: // Single
			if (taxableIncome <= 8350) {
				tax = taxableIncome * 0.10;
			} else if (taxableIncome >= 8351 && taxableIncome < 33950) {
				tax = taxableIncome * 0.15;
			} else if (taxableIncome >= 33951 && taxableIncome < 82250) {
				tax = taxableIncome * 0.25;
			} else if (taxableIncome >= 82251 && taxableIncome < 171550) {
				tax = taxableIncome * 0.28;
			} else if (taxableIncome >= 171551 && taxableIncome < 372950) {
				tax = taxableIncome * 0.33;
			} else {
				tax = taxableIncome * 0.35;
			}
			break;
		case 2: // Married Filing Jointly
			if (taxableIncome <= 16700) {
				tax = taxableIncome * 0.10;
			} else if (taxableIncome >= 16701 && taxableIncome < 67900) {
				tax = taxableIncome * 0.15;
			} else if (taxableIncome >= 67901 && taxableIncome < 137050) {
				tax = taxableIncome * 0.25;
			} else if (taxableIncome >= 137501 && taxableIncome < 208850) {
				tax = taxableIncome * 0.28;
			} else if (taxableIncome >= 208851 && taxableIncome < 372950) {
				tax = taxableIncome * 0.33;
			} else {
				tax = taxableIncome * 0.35;
			}
			break;
		case 3: // Married Filing Separately
			if (taxableIncome <= 8350) {
				tax = taxableIncome * 0.10;
			} else if (taxableIncome >= 8351 && taxableIncome < 33950) {
				tax = taxableIncome * 0.15;
			} else if (taxableIncome >= 33951 && taxableIncome < 68525) {
				tax = taxableIncome * 0.25;
			} else if (taxableIncome >= 68526 && taxableIncome < 104425) {
				tax = taxableIncome * 0.28;
			} else if (taxableIncome >= 104426 && taxableIncome < 186475) {
				tax = taxableIncome * 0.33;
			} else {
				tax = taxableIncome * 0.35;
			}
			break;
		case 4: // Head of Household
			if (taxableIncome <= 11950) {
				tax = taxableIncome * 0.10;
			} else if (taxableIncome >= 11951 && taxableIncome < 45500) {
				tax = taxableIncome * 0.15;
			} else if (taxableIncome >= 45501 && taxableIncome < 117450) {
				tax = taxableIncome * 0.25;
			} else if (taxableIncome >= 117451 && taxableIncome < 190200) {
				tax = taxableIncome * 0.28;
			} else if (taxableIncome >= 190201 && taxableIncome < 372950) {
				tax = taxableIncome * 0.33;
			} else {
				tax = taxableIncome * 0.35;
			}
			break;
		default:
			System.out.println("Out of range");
		}

		System.out.printf("Your federal income tax is $%.2f", tax);

	}

}
