public class BankAccount
{

	private int accountNumber;
	private double accountBalance;
	
	private AccountDAO dao;

	public synchronized boolean deposit(double amount)
	{
		double newAccountBalance;
		/*
		 * Get the current balance from DB table.
		 */
		accountBalance = dao.getCurrentAccountBalance(accountNumber);
		
		if (amount < 0.0)
		{
			/*
			 * Can not deposit a negative amount.
			 */
			return false; 
		}

		else
		{
			newAccountBalance = accountBalance + amount;
			/*
			 * Update the new balance in the DB table.
			 */			
			dao.updateAccountBalance(newAccountBalance);
			return true;
		}

	}
}