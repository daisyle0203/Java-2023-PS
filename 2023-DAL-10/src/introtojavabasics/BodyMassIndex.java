/**
 * 
 */
package introtojavabasics;

import java.util.Scanner;

/**
 * @author DaisyLe
 *
 */
public class BodyMassIndex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    double bmi, heightInInches, weightInLbs;

	    System.out.println("Enter your height in inches: ");
	    heightInInches = input.nextDouble();

	    System.out.println("Enter your weight in pounds: ");
	    weightInLbs = input.nextDouble();
	    
	    input.close();

	    if (heightInInches == 0 || weightInLbs == 0) {
	        System.out.println("Invalid input. Height and weight must be non-zero.");
	        return;
	    }

	    bmi = (weightInLbs / (heightInInches * heightInInches)) * 703;
	    String bmiFormatted = String.format("%.2f", bmi);

	    String interpretation;

	    if (bmi < 16.0) {
	        interpretation = "Severely Underweight";
	    } else if (bmi >= 16.0 && bmi < 18.4) {
	        interpretation = "Underweight";
	    } else if (bmi >= 18.5 && bmi < 24.9) {
	        interpretation = "Normal";
	    } else if (bmi >= 25.0 && bmi < 29.9) {
	        interpretation = "Overweight";
	    } else if (bmi >= 30.0 && bmi < 34.9) {
	        interpretation = "Moderately Obese";
	    } else if (bmi >= 35.0 && bmi < 39.9) {
	        interpretation = "Severely Obese";
	    } else {
	        interpretation = "Morbidly Obese";
	    }
	   
	    System.out.println("Your BMI is " + bmiFormatted + ".");
	    System.out.println("You are " + interpretation + ".");
	}

}
