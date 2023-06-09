/**
 * 
 */
package introtojavabasics;

/**
 * @author DaisyLe
 *
 */
public class SavingAccountDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SavingsAccount saver1 = new SavingsAccount(2000.00);
		SavingsAccount saver2 = new SavingsAccount(3000.00);
		
		// set the annualInterest to 3 percent
		SavingsAccount.modifyInterestRate(0.03);
		
		// calculate the monthlyinterest and print the new balances for each of the savers.	
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.println("New balances with 3% interest:");
		System.out.println("Saver 1 saves $" + saver1.getSavingsBalance() + " and Saver 2 saves $" + saver2.getSavingsBalance());
		
		// set the annualInterestRate to 4 percent
		SavingsAccount.modifyInterestRate(0.04);
		
		//calculate the next month's interest, and print the new balances for each of the savers.
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.println("New balances with 4% interest:");
		System.out.println("Saver 1 saves $" + saver1.getSavingsBalance() + " and Saver 2 saves $" + saver2.getSavingsBalance());
	}

}
