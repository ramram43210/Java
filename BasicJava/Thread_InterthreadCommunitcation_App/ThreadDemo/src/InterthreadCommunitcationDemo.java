class InterthreadCommunitcationDemo
{
	public static void main(String args[])
	{
		final BankAccount bankAccount = new BankAccount();
		
		new Thread("Thread 1")
		{
			public void run()
			{
				bankAccount.withdraw(50000);
			}
		}.start();
		
		new Thread("Thread 2")
		{
			public void run()
			{
				bankAccount.deposit(80000);
			}
		}.start();

	}
}