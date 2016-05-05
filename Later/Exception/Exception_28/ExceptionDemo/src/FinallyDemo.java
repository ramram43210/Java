public class FinallyDemo
{

	public static void main(String[] args)
	{
		FinallyDemo finallyDemo = new FinallyDemo();
		boolean returnValue = finallyDemo.isHeOld(55);
		System.out.println("returnValue = "+returnValue);
	}

	public boolean isHeOld(int age)
	{
		try
		{
			if (age > 50)
			{
				System.out.println("yes he is old ");
				return true;
			}
		}
		finally
		{
			System.out.println("finally block is executed");
		}
		
		return false;
	}

}
