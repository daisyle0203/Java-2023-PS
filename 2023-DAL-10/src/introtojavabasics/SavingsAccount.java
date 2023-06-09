/**
 * 
 */
package introtojavabasics;

/**
 * @author DaisyLe
 *
 */
public class SavingsAccount {
	// Static data member annualInterestRate to store the annual interest rate for each of the savers
	private static double annualInterestRate;
	// Each member of the class contains a private data member savingsBalance 
	// indicating the amount the saver currently has on deposit
	private double savingsBalance;
	
	public SavingsAccount(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	
	// function calculateMonthlyInterest that calculates the monthlyinterest 
	public void calculateMonthlyInterest() {
		double monthlyInterest = (savingsBalance * annualInterestRate) / 12 ;
		savingsBalance += monthlyInterest;
	}
	
	// this method belong to SavingsAccount
	public static void modifyInterestRate(double newInterestRate) {
		annualInterestRate = newInterestRate;
	}
	// this method belong to instances of SavingsAccount
	public double getSavingsBalance() {
		return savingsBalance;
	}
	
	// this method belong to SavingsAccount
	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}

}
