class InterthreadCommunitcationDemo
{
	public static void main(String args[])
	{
		final BankAccount c = new BankAccount();
		
		new Thread()
		{
			public void run()
			{
				c.withdraw(50000);
			}
		}.start();
		
		new Thread()
		{
			public void run()
			{
				c.deposit(80000);
			}
		}.start();

	}
}