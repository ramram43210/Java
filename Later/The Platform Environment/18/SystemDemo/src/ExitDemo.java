/*
 * public static void exit(int status)
 * 
 * Parameters: 
 * -----------
 * 
 * status - exit status.
 */

public class ExitDemo
{

	public static void main(String[] args)
	{
		try
		{
			int num1 = 30, num2 = 0;
			int output = num1 / num2;
			System.out.println("Result = " + output);
		}
		catch (ArithmeticException e)
		{
			System.out
					.println("Arithmetic Exception: You can't divide an integer by 0");

			/*
			 * Terminates the currently running Java Virtual
			 * Machine.The argument serves as a status code;
			 * by convention, a nonzero status code
			 * indicates abnormal termination.
			 * 
			 * This method calls the exit method in class
			 * Runtime. This method never returns normally.
			 * 
			 * The call System.exit(n) is effectively
			 * equivalent to the call:
			 * Runtime.getRuntime().exit(n)
			 */
			System.exit(0);
		}

		System.out.println("Welcome to india..");

	}
}