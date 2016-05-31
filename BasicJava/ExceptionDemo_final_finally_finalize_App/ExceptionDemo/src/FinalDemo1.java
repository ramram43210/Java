public class FinalDemo1
{
	public static void main(String[] args)
	{
		/*
		 * If the final keyword is attached to a variable
		 * then the variable becomes constant i.e. its value
		 * cannot be changed in the program.
		 */
		final int intValue = 1000;
		intValue = 500;// Compile Time Error
	}

}