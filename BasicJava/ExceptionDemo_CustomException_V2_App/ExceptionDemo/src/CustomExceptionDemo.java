public class CustomExceptionDemo
{

	public static void main(String[] args)
	{
		try
		{
			CustomExceptionDemo customExceptionDemo = new CustomExceptionDemo();
			customExceptionDemo.withdrawMoney(20000);
		}
		catch (InsufficientBalanceException insufficientBalanceException)
		{
			insufficientBalanceException.printStackTrace();
			System.out.println("message = "
					+ insufficientBalanceException.getMessage());
		}

	}

	public void withdrawMoney(int amount)
			throws InsufficientBalanceException
	{
		if (amount > 10000)
		{
			throw new InsufficientBalanceException(
					"Your account does not have enough money to withdraw.");
		}
		else
		{
			System.out.println("Successfully withdrawn.");
		}

	}
}
