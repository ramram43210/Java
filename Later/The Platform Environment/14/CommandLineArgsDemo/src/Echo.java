public class Echo
{
	public static void main(String[] args)
	{
		int value;
		try
		{
			/*
			 * Converts a command-line argument to an int.
			 * 
			 * All of the Number classes — Integer, Float,
			 * Double, and so on — have parseXXX methods
			 * that convert a String representing a number
			 * to an object of their type.
			 */
			value = Integer.parseInt(args[0]);
			System.out.println(value);
		}
		catch (NumberFormatException e)
		{
			System.err.println("Argument " + args[0] + " must be an integer.");
		}
	}
}