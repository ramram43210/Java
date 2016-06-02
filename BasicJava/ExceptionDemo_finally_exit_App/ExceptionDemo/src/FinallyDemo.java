public class FinallyDemo
{

	public static void main(String[] args)
	{
		FinallyDemo finallyDemo = new FinallyDemo();
		finallyDemo.displayName("Peter");
	}

	public void displayName(String name)
	{
		try
		{
			System.out.println("Before exit,Name = " + name);
			/*
			 * Terminates the currently running Java Virtual
			 * Machine. The argument serves as a status
			 * code; by convention, a nonzero status code
			 * indicates abnormal termination.
			 */
			System.exit(1);
			System.out.println("After exit,Name = " + name);
		}
		finally
		{
			System.out.println("finally block is executed");
		}

	}

}
