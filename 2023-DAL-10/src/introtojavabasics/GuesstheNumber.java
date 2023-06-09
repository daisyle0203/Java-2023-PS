/**
 * 
 */
package introtojavabasics;

import java.util.Scanner;

/**
 * @author DaisyLe
 *
 */
public class GuesstheNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Write a program that randomly generates an integer between 0 and 100,
		 * inclusive. The program should prompt the user to enter a number repeatedly
		 * until the number matches the randomly generated number. For each user input,
		 * the program tells the user whether the input is too low or too high. When the
		 * user discovers the correct answer, the program outputs a congratulatory
		 * message, and then provides the user with the opportunity to play again.
		 */

		int randomNum = (int) (Math.random() * 101);
		Scanner input = new Scanner(System.in);
		System.out.println("Guess a magic number between 0 and 100");
		int guess = -1;
		while (guess != randomNum) {
			System.out.println("Enter your guess: ");
			guess = input.nextInt();
			if (guess == randomNum) {
				System.out.println("You guessed it right! The number is " + randomNum);
			} else if (guess > randomNum) {
				System.out.println("Your guess is too high");
			} else {
				System.out.println("Your guess is too low");
			}

		}

	}

}
