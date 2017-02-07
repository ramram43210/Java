class BankAccount
{
	private int amount = 10000;

	synchronized void withdraw(int amount)
	{
		System.out.println("Going to withdraw...");

		if (this.amount < amount)
		{
			System.out.println("Less balance; waiting for deposit...");
			try
			{
				wait();
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		this.amount -= amount;
		System.out.println("Withdraw completed...");
	}

	synchronized void deposit(int amount)
	{
		System.out.println("Going to deposit...");
		this.amount += amount;
		System.out.println("Deposit completed... ");
		notify();
	}
}