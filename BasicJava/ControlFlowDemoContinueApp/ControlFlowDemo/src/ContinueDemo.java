public class ContinueDemo
{
	public static void main(String[] args)
	{

		/*
		 * The continue statement skips the current iteration of a for, while ,
		 * or do-while loop. The unlabeled form skips to the end of the
		 * innermost loop's body and evaluates the boolean expression that
		 * controls the loop.
		 */

		String searchMe = "Hello";
		int max = searchMe.length();
		int numls = 0;

		for (int i = 0; i < max; i++)
		{

			/*
			 * Steps through a String, counting the occurences of the letter
			 * "l". If the current character is not a l, the continue statement
			 * skips the rest of the loop and proceeds to the next character. If
			 * it is a "l", the program increments the letter count.
			 */

			char charValue = searchMe.charAt(i);
			
			// interested only in l's
			if (charValue != 'l')
			{
				continue;
			}

			System.out.println("charAt(i) : " + charValue);
			
			// process l's
			numls++;
		}
		System.out.println("Found " + numls + ", l's in the string.");

	}
}