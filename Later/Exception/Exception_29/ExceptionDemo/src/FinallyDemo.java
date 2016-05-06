public class FinallyDemo
{

	public static void main(String[] args)
	{
		FinallyDemo finallyDemo = new FinallyDemo();
		int returnValue = finallyDemo.calculateSum(2,4);
		System.out.println("returnValue = " + returnValue);
	}

	public int calculateSum(int a, int b)
	{
		try
		{
			int sum = a + b;
			System.out.println(sum);
			return sum;
		}
		finally
		{
			System.out.println("finally block is executed");
			return 100;
		}

	}

}
